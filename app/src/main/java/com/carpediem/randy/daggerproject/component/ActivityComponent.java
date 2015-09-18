package com.carpediem.randy.daggerproject.component;

import android.app.Activity;

import com.carpediem.randy.daggerproject.annotation.IActivity;
import com.carpediem.randy.daggerproject.module.ActivityModule;

import dagger.Component;

/**
 * Created by randy on 15-9-17.
 */
@IActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    // exposed to child-graphic
    Activity activity();
}
