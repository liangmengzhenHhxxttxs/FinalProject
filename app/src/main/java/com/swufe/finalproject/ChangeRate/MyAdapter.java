package com.swufe.finalproject.ChangeRate;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.swufe.finalproject.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MyAdapter extends ArrayAdapter {
    public MyAdapter(@NonNull Context context, int resource, ArrayList<HashMap<String, String>> list) {
        super(context, resource, list);
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View itemView = convertView;
        if(itemView == null)
        {
            itemView= LayoutInflater.from(getContext()).inflate(R.layout.list_adpter, parent, false);
        }
        Map<String, String> map = (Map<String, String>) getItem(position);
        TextView country = itemView.findViewById(R.id.textView3);
        TextView value =  itemView.findViewById(R.id.textView4);
        country.setText("country:"+map.get("country"));
        value.setText("value:"+map.get("value"));
        return itemView;
    }
}
