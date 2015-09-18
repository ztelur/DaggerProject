package com.carpediem.randy.daggerproject.base;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

/**
 * Created by randy on 15-9-17.
 *
 * mock database
 */
public class DbService {
    private final static String TAG = "DbService";
    private List<String> list = new ArrayList<String>();
    @Inject
    public DbService() {
        super();
    }

    /**
     * add list of string into Db
     * @param datas
     */
    public void addDatas(List<String> datas) {
        Log.i(TAG,"addDatas into db");
        list.addAll(datas);
    }

    /**
     * 获得数据库中所有的数据
     */
    public List<String> getDatas() {
        List<String> mock = new ArrayList<String>();
        for(String str : list) {
            mock.add(str);
        }
        return mock;
    }
}
