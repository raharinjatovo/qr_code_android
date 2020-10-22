package com.example.mbolatiana.qrcode;

import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class Data {
    int _id;
    String Date;
    String Data;
    public Data()
    {
        super();
    }
    public Data(int _id,String Date,String Data)
    {
        super();
        this._id= _id;
        this.Date = Date;
        this.Data = Data;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getData() {
        return Data;
    }

    public void setData(String data) {
        Data = data;
    }

    @Override
    public String toString() {
        return _id+" "+Date+" "+Data;
    }

}
