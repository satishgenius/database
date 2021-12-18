package com.example.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class db  extends SQLiteOpenHelper {
    SQLiteDatabase db;
    public db(Context context) {
        super(context, "user", null, 1);
        db = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table user(Name text,mobilenumber text )");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void savedata(String s1, String s2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("Name",s1);
        contentValues.put("mobilenumber",s2);
        db .insert("user", null, contentValues);



    }

    public String getlo(String s3) {
        Cursor g;
        g = db.query("user",null,"Name=?",new String[]{s3},null,null,null);
        s3 = g.getString(g.getColumnIndex("mobilenumber"));
        return s3;
    }
}
