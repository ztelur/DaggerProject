package com.carpediem.randy.daggerproject.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.carpediem.randy.daggerproject.base.BaseFragment;
import com.carpediem.randy.daggerproject.component.ComputerComponent;

/**
 * Created by randy on 15-9-17.
 */
public class ComputerDetailFragment extends BaseFragment{
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        this.getComponent(ComputerComponent.class).inject(this);
    }



}
