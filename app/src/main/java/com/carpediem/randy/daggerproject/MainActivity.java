package com.carpediem.randy.daggerproject;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.carpediem.randy.daggerproject.base.BaseActivity;
import com.carpediem.randy.daggerproject.base.ComputerManager;
import com.carpediem.randy.daggerproject.base.DbService;
import com.carpediem.randy.daggerproject.base.HasComponent;
import com.carpediem.randy.daggerproject.module.ComputerModule;
import com.carpediem.randy.daggerproject.component.*;

import javax.inject.Inject;

public class MainActivity extends BaseActivity implements HasComponent<ComputerComponent>{
    private final static String TAG = "MainActivity";
    protected ComputerComponent mComponent;
    @Inject
    protected DbService mDbService;
    @Inject
    protected ComputerManager mManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initInjector();

        if (mDbService != null) {
            Log.i(TAG,"mDbService is not null dagger success");
        } else {
            Log.i(TAG,"mDbService is null dagger failed");
        }

        if (mManager != null) {
            Log.i(TAG,"mManager is not null dagger success");
        } else {
            Log.i(TAG,"mManager is null dagger failed");
        }

    }

    private void initInjector() {
        this.mComponent = DaggerComputerComponent.builder()
                    .applicationComponent(getApplicationComponent())
                    .activityModule(getActivityModule())
                    .computerModule(new ComputerModule())
                    .build();
        getApplicationComponent().injectMainActivity(this);
    }


    public ComputerComponent getComponent() {
        return mComponent;
    }






    // ========================= default ===========================================


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
