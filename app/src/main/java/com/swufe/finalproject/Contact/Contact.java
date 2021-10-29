package com.swufe.finalproject.Contact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

import com.swufe.finalproject.ChangeRate.ChangeRate;
import com.swufe.finalproject.ChangeRate.MyAdapter;
import com.swufe.finalproject.ChangeRate.Runable;
import com.swufe.finalproject.R;
import java.util.ArrayList;
import java.util.HashMap;
import com.swufe.finalproject.R;

public class Contact extends AppCompatActivity{
    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        Intent intent = getIntent();
        String all = intent.getStringExtra("new");
        if(all != null)
        {
            TextView view = findViewById(R.id.textView5);
            view.setText(view.getText().toString()+"\n"+all);
        }
    }
    public void addNew(View view)
    {
        Intent intent = new Intent(this, addNew.class);
        startActivityForResult(intent, 1);
    }
}