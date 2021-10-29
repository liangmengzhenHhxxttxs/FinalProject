package com.swufe.finalproject.Contact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;

import com.swufe.finalproject.R;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class addNew extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new);
    }

    public void Add(View view) throws IOException {
        EditText phone = findViewById(R.id.editTextNumberPassword);
        EditText name = findViewById(R.id.editTextTextPersonName);
        String add = phone.getText().toString() +":"+name.getText().toString();
        Intent intent = new Intent(this, Contact.class);
        intent.putExtra("new", add);
        startActivityForResult(intent, 1);
    }
}