package com.alorma.colibri.bbdd.cursor;

import android.content.ContentValues;
import android.database.Cursor;
import com.alorma.colibri.bean.item.Party;

import java.util.List;

/**
 * Class that implements methods to read from Cursor to specific data Object, 
 * and read from data Object to insert into DB (ContentValues).
 *
 * Also contains non abstract method to convert multiple data Objects to ContentValues[].
 * 
 * Created by alorma on 19/05/13.
 */
public abstract class BaseCursor<K> {

    /**
    * Method to read from data Object and create ContentValues to insert, update into DB
    */
    public abstract ContentValues write(K k);

    /**
    * Method to read from cursor and create data Object.
    */
    public abstract K read(Cursor cursor);

    /**
    * Method to read from list of data Objects and create ContentValues[] to bulkInsert into DB
    */
    public ContentValues[] write(List<K> ks) {

        ContentValues[] values = new ContentValues[ks.size()];

        int i = 0;
        for (K k : ks) {
            values[i++] = write(k);
        }

        return values;
    }

}
