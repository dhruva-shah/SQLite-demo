package com.example.indianic1.sqlitedemo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by indianic1 on 05/01/16.
 */
public class DBHelper extends SQLiteOpenHelper {


    private static final int DATABASE_VERSION = 1;

    private SQLiteDatabase db;

    public DBHelper(Context context) {
        super(context, DBConstants.DATABASE_NAME, null, DATABASE_VERSION);
        db = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DBConstants.CREATE_CUSTOMER);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + DBConstants.TABLE_CUSTOMER);
    }



    public void close(){
        if(db!=null){
            db.close();
        }
    }












}
