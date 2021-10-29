package com.swufe.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.swufe.finalproject.Calulator.Caculator;
import com.swufe.finalproject.ChangeRate.ChangeRate;
import com.swufe.finalproject.Contact.Contact;
import com.swufe.finalproject.Events.Events;

public class Functions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_functions);
    }

    public void ExchangeRate(View view)
    {
        Intent intent = new Intent(this, ChangeRate.class);
        startActivityForResult(intent, 1);
    }

    public void Calculator(View view)
    {
        Intent intent = new Intent(this, Caculator.class);
        startActivityForResult(intent, 1);
    }

    public void Contact(View view)
    {
        Intent intent = new Intent(this, Contact.class);
        startActivityForResult(intent, 1);
    }

    public void Events(View view)
    {
        Intent intent = new Intent(this, Events.class);
        startActivityForResult(intent, 1);
    }
}