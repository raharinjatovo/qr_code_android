package com.example.mbolatiana.qrcode;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

import java.util.ArrayList;
import java.util.Date;

public class DBHelper extends SQLiteOpenHelper {
    public static final String DB_NAME="QR_Data";
    public static final String TB_NAME="QR_Table";
    public static final String _ID="id";
    public static final String DATE="Date";
    public static final String DATA="Data";
    public static final int VERSION=1;





    public DBHelper(@Nullable Context context) {
        super(context, DB_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String sql ="CREATE TABLE "+TB_NAME+"("+_ID+" INTEGER PRIMARY KEY AUTOINCREMENT,"+DATE+"TEXT,"+DATA+"TEXT)";
        db.execSQL(sql);
    }


    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }


    public void InsertData(Data d) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(DATE,d.getDate());
        cv.put(DATA,d.getData());
        db.insert(TB_NAME,null,cv);
        db.close();


    }
    public ArrayList<Data> GetData()
    {
        ArrayList<Data> ary = new ArrayList<Data>();
        SQLiteDatabase db = getReadableDatabase();
        Cursor s= db.query(TB_NAME,null,null,null,null,null,null,null);
        while (s.moveToNext())
        {
                int id = s.getInt(0);
                String Data = s.getString(1);
                String Date = s.getString(2);
                Data d = new Data(id,Data,Date);
                ary.add(d);
        }
        return  ary;
    }
}
