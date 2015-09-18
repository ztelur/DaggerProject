package com.carpediem.randy.daggerproject;

import android.app.Application;

import com.carpediem.randy.daggerproject.base.HasComponent;
import com.carpediem.randy.daggerproject.module.ApplicationModule;
import com.carpediem.randy.daggerproject.component.*;
/**
 * Created by randy on 15-9-17.
 */
public class MainApplication extends Application implements HasComponent<ApplicationComponent>{
    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        initComponent();
    }

    private  void initComponent() {
        this.component = DaggerApplicationComponent.builder()
                        .applicationModule(new ApplicationModule(this))
                        .build();
    }
    @Override
    public ApplicationComponent getComponent() {
        return component;
    }
}
