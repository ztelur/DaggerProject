package com.carpediem.randy.daggerproject.component;

import com.carpediem.randy.daggerproject.annotation.IActivity;
import com.carpediem.randy.daggerproject.module.ActivityModule;
import com.carpediem.randy.daggerproject.module.ComputerModule;
import com.carpediem.randy.daggerproject.ui.ComputerDetailFragment;
import com.carpediem.randy.daggerproject.ui.ComputerListFragment;

import dagger.Component;

/**
 * Created by randy on 15-9-17.
 */
@IActivity
@Component(dependencies = ApplicationComponent.class,
        modules = {ActivityModule.class, ComputerModule.class})
public interface ComputerComponent {
    void inject(ComputerListFragment computerListFragment);
    void inject(ComputerDetailFragment computerDetailFragment);
}
