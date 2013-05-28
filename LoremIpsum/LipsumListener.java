package com.alorma.lib.lipsum;

import android.text.Spanned;

/**
 * Callback to receive lorem ipsum text
 *
 * Created by alorma on 24/05/13.
 */
public interface LipsumListener {

    void onLipsumLoaded(Spanned spanned);

}
