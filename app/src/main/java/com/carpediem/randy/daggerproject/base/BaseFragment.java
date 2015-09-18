package com.carpediem.randy.daggerproject.base;

import android.support.v4.app.Fragment;

/**
 * Created by randy on 15-9-17.
 */
public class BaseFragment extends Fragment{
    protected <C> C getComponent(Class<C> componentType) {
        return componentType.cast(((HasComponent<C>)getActivity()).getComponent());
    }
}
