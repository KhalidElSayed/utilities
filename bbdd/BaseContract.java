package com.alorma.colibri.bbdd;

import android.provider.BaseColumns;

/**
 * Interface that implements BaseColumns interface
 * and create() method that returns "create table" sql query.
 * Created by alorma on 25/05/13.
 */
public interface BaseContract extends BaseColumns {

    public String create();

}
