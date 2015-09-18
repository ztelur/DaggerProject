package com.carpediem.randy.daggerproject.base;

import android.app.Activity;
import android.os.Bundle;

import com.carpediem.randy.daggerproject.MainApplication;
import com.carpediem.randy.daggerproject.component.ApplicationComponent;
import com.carpediem.randy.daggerproject.module.ActivityModule;

import javax.inject.Inject;

/**
 * Created by randy on 15-9-17.
 */
public class BaseActivity extends Activity{
    @Inject DbService mDbService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getApplicationComponent().injectBaseActivity(this);
    }

    protected ApplicationComponent getApplicationComponent() {
        return ((MainApplication)getApplication()).getComponent();
    }

    protected ActivityModule getActivityModule() {
        return new ActivityModule(this);
    }
}
