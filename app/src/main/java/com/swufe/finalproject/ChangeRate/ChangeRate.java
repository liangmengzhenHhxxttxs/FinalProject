package com.swufe.finalproject.ChangeRate;

import androidx.annotation.NonNull;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;

import com.swufe.finalproject.R;

import java.util.ArrayList;
import java.util.HashMap;

public class ChangeRate extends ListActivity implements AdapterView.OnItemClickListener{

    Handler handler ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        handler = new Handler(){
            @Override
            public void handleMessage(@NonNull Message msg) {
                if (msg.what == 6)
                {
                    ArrayList<HashMap<String, String>> list = (ArrayList<HashMap<String, String>>) msg.obj;
                    MyAdapter myAdapter = new MyAdapter(ChangeRate.this, R.layout.list_adpter,list);
                    setListAdapter(myAdapter);
                }
                super.handleMessage(msg);
            }
        };
        getListView().setOnItemClickListener(this);
        Runable runable = new Runable();
        runable.setHandler(handler);
        Thread thread = new Thread(runable);
        thread.start();
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        Log.i("test", "onItemClick: ssss" +  position);
        Object itemAtPosition = getListView().getItemAtPosition(position);
        HashMap<String, String> map = (HashMap<String, String>) itemAtPosition;
        String  country = map.get("country");
        String value = map.get("value");
        Intent intent = new Intent(this, getList.class);
        intent.putExtra("country", country);
        intent.putExtra("value", value);
        startActivityForResult(intent, 1);
    }

}