package com.example.mbolatiana.qrcode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Main3Activity extends AppCompatActivity {
    DBHelper dbh;
    ListView lst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        lst = (ListView)findViewById(R.id.Listview1);
        dbh= new DBHelper(Main3Activity.this);
        ArrayList<Data> ary = dbh.GetData();
        ArrayAdapter<Data> adt =   new ArrayAdapter<Data>(Main3Activity.this, android.R.layout.activity_list_item);
    }
}
