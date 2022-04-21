package com.example.foode;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DBHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="login.db";
    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE user(ID INTEGER PRIMARY KEY AUTOINCREMENT,  username TEXT,password TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }
    public Boolean Insert(String username,String password){
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("username",username);
        contentValues.put("password",password);
        long result=sqLiteDatabase.insert("user",null,contentValues);
        if (result == -1){
            return false;
        }else {
            return true;
        }

    }
    public Boolean Checkusername(String username)
    { SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        Cursor cursor=sqLiteDatabase.rawQuery("SELECT * FROM user WHERE  username =?",new String[]{username});
        if (cursor.getCount()>0){
            return false;
        }else {
            return true;
        }
    }

    public Boolean checklogin(String username,String password){
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        Cursor cursor=sqLiteDatabase.rawQuery("SELECT * FROM user WHERE username =? AND password=?",new String[]{username,password});
        if (cursor.getCount()>0){
            return true;
        }else {
            return false;
        }

    }

}
