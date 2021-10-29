package com.swufe.finalproject.ChangeRate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.swufe.finalproject.R;

public class getList extends AppCompatActivity {
    String value = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_list);
        Intent intent = getIntent();
        String country = intent.getStringExtra("country");
        value = intent.getStringExtra("value");
        TextView name = findViewById(R.id.textView10);
        name.setText(country);
    }

    public void onCLick(View view)
    {
        EditText edit = findViewById(R.id.editTextNumberDecimal5);
        double val = Double.parseDouble(edit.getText().toString());
        double result = Double.parseDouble(value)*val/100;
        TextView ANS = findViewById(R.id.textView12);
        ANS.setText(String.valueOf(result));
    }
}