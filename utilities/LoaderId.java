package com.alorma.utils;

/**
 * Class that manage LoaderManager ids.
 * Created by alorma on 18/05/13.
 */
public class LoaderId {

    private static int ID = -1;

    public static int getId() {
        return ID++;
    }

}
