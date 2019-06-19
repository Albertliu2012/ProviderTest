package com.androidbook.providertest;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button addData = findViewById(R.id.add_data);
        Button queryData = findViewById(R.id.query_data);
        Button updateData = findViewById(R.id.update_data);
        Button deleteData = findViewById(R.id.delete_data);

        addData.setOnClickListener();
        queryData.setOnClickListener();
        updateData.setOnClickListener();
        deleteData.setOnClickListener();
    }

    View.OnClickListener addDt = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            Uri uri = Uri.parse("content://com.androidbook.databasetest.provider");
            ContentValues values = new ContentValues();
            values.put("name","A Clash of Kings");
        }
    };
    View.OnClickListener queryDt = new View.OnClickListener(){
        @Override
        public void onClick(View v) {

        }
    };
    View.OnClickListener updateDt = new View.OnClickListener(){
        @Override
        public void onClick(View v) {

        }
    };
    View.OnClickListener deleteDt = new View.OnClickListener(){
        @Override
        public void onClick(View v) {

        }
    };
}
