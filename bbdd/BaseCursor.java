package com.alorma.bbdd.cursorhelpers;

import android.content.ContentValues;
import android.database.Cursor;

/**
 * Created by alorma on 19/05/13.
 */
public abstract class BaseCursor<K> {

    public abstract ContentValues write(K k);
    public abstract K read(Cursor cursor);

}
