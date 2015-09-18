package com.carpediem.randy.daggerproject.module;

import android.content.Context;

import com.carpediem.randy.daggerproject.MainApplication;
import com.carpediem.randy.daggerproject.base.ComputerManager;
import com.carpediem.randy.daggerproject.base.DbService;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by randy on 15-9-17.
 */
@Module
public class ApplicationModule {
    private final MainApplication application;
    private  DbService dbService;
    private  ComputerManager computerManager;
    @Inject
    public ApplicationModule(MainApplication application) {
        this.application = application;
    }
    @Provides @Singleton
    Context providesApplicationContext() {
        return this.application;
    }
    @Provides @Singleton
    DbService providesDbService() {
        return new DbService();
    }
    @Provides @Singleton
    ComputerManager providesComputerManager() {
        return new ComputerManager();
    }
}
