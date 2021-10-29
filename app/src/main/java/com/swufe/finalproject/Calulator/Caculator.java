package com.swufe.finalproject.Calulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.swufe.finalproject.R;

public class Caculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caculator);
    }

    public void OnClick(View view)
    {
        EditText input1 = findViewById(R.id.editTextTextPersonName2);
        EditText input2 = findViewById(R.id.editTextTextPersonName5);
        EditText sign = findViewById(R.id.editTextTextPersonName4);
        double num1 = Double.parseDouble(input1.getText().toString());
        double num2 = Double.parseDouble(input2.getText().toString());
        String signs = sign.getText().toString();
        double result;
        if(signs.equals("*"))
        {
            result = num1*num2;
        }
        else if(signs.equals("/"))
        {
            result = num1/num2;
        }
        else if(signs.equals("+"))
        {
            result = num1 + num2;
        }
        else
        {
            result = num1 - num2;
        }
        TextView views = findViewById(R.id.textView);
        views.setText(String.valueOf(result));
        sign.setText("");
        input1.setText(String.valueOf(result));
        input2.setText("");
    }
}