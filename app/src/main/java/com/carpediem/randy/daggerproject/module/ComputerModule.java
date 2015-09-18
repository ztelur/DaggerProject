package com.carpediem.randy.daggerproject.module;

import com.carpediem.randy.daggerproject.annotation.IActivity;
import com.carpediem.randy.daggerproject.ui.ComputerDetailFragment;
import com.carpediem.randy.daggerproject.ui.ComputerListFragment;

import dagger.Module;
import dagger.Provides;

/**
 * Created by randy on 15-9-17.
 */
@Module
public class ComputerModule {
    @Provides @IActivity
    ComputerListFragment  providesComputerListFragment(ComputerListFragment computerListFragment) {
        return computerListFragment;
    }

    @Provides @IActivity
    ComputerDetailFragment providesComputerDetailFragment(ComputerDetailFragment fragment) {
        return fragment;
    }
}
