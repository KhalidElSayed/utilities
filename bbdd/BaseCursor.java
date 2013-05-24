package com.alorma.colibri.bbdd.cursor;

import android.content.ContentValues;
import android.database.Cursor;
import com.alorma.colibri.bean.item.Party;

import java.util.List;

/**
 * Created by alorma on 19/05/13.
 */
public abstract class BaseCursor<K> {

    public abstract ContentValues write(K k);

    public abstract K read(Cursor cursor);

    public ContentValues[] write(List<K> ks) {

        ContentValues[] values = new ContentValues[ks.size()];

        int i = 0;
        for (K k : ks) {
            values[i++] = write(k);
        }

        return values;
    }

}
