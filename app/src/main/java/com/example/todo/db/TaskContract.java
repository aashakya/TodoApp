package com.example.todo.db;

import android.provider.BaseColumns;

public class TaskContract {
    public static final String DB_NAME = "com.example.todo.db";
    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns{
        public static final String TABLE = "Tasks";
        public static final String COL_TITLE = "Title";
    }
}
