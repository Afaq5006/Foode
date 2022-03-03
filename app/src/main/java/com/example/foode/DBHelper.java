package com.example.foode;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    public DBHelper(@Nullable Context context) {
        super(context, "Foode.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase DB) {
        DB.execSQL("Create Table UserDetails(username TEXT, email TEXT primary key, password TEXT, city TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase DB, int i, int i1) {
        DB.execSQL("Drop table if exists UserDetails");

    }
    public boolean insert(String name, String email, String password, String city){
        SQLiteDatabase DB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("username", name);
        contentValues.put("email", email);
        contentValues.put("password", password);
        contentValues.put("city", city);
        long result = DB.insert("UserDetails", null, contentValues);
        if (result == -1){
            return false;
        }else{
            return true;
        }
    }
}
