package com.carpediem.randy.daggerproject.module;

import android.app.Activity;

import com.carpediem.randy.daggerproject.annotation.IActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by randy on 15-9-17.
 */
@Module
public class ActivityModule {
    private final Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }
    @Provides @IActivity Activity activity() {
        return this.activity;
    }
}
