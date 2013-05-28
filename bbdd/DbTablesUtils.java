package com.alorma.colibri.utils;

import android.provider.BaseColumns;

import java.util.HashMap;

/**
 *
 * Class that allows  dev to create "create table" script easly.
 *
 * Created by alorma on 25/05/13.
 */
public class DbTablesUtils {

    private String table;
    private HashMap<String, String> params;

    /**
    * Constructor of DbTablesUtils.
    *
    * _ID column is not need to set.
    * 
    * @param String table:  name of table to be created.
    */
    public DbTablesUtils(String table) {
        this.table = table;
        params = new HashMap<String, String>();
    }

    /**
    * Method to add new param into the script.
    * 
    * @param String col: column name.
    * @param String type: type of columnt: TEXT, INTEGER; NUMBER, ...
    */
    public void addParam(String col, String type) {
        params.put(col, type);
    }

    /**
    * Method to generate "create table script" with _ID param, and columns.
    * 
    * @return String with "create table ..." script.
    */
    public String create() {
        StringBuffer buffer = new StringBuffer();

        buffer.append("CREATE TABLE ");
        buffer.append(table);
        buffer.append(" ");
        buffer.append("(");
        buffer.append(BaseColumns._ID + " INTEGER PRIMARY KEY");
        for (String key : params.keySet()) {
            buffer.append(", ");
            buffer.append(key);
            buffer.append(" ");
            buffer.append(params.get(key));
        }
        buffer.append(");");

        return buffer.toString();
    }


}
