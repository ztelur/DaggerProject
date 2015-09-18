package com.carpediem.randy.daggerproject.component;

import android.content.Context;

import com.carpediem.randy.daggerproject.MainActivity;
import com.carpediem.randy.daggerproject.base.ComputerManager;
import com.carpediem.randy.daggerproject.base.DbService;
import com.carpediem.randy.daggerproject.module.ApplicationModule;
import com.carpediem.randy.daggerproject.base.BaseActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by randy on 15-9-17.
 */

/**
 *  a componet whose lifetime is the life of the application
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    void injectBaseActivity(BaseActivity activity);
    void injectMainActivity(MainActivity activity);
    // Exposed to sub-graphs
    Context context();
    DbService dbService();
    ComputerManager computerManager();
}