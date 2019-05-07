package com.example.homepage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String[] catalogueNames;
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, String[] catalogueNames) {
        this.context = applicationContext;
        this.catalogueNames = catalogueNames;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return catalogueNames.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        if(convertView == null) {
            convertView = inflter.inflate(R.layout.custom_spinner_layout, null);
        }
        TextView names = (TextView) convertView.findViewById(R.id.tvSpinnerLayout);
        names.setText(catalogueNames[position]);
        return convertView;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        convertView = inflter.inflate(R.layout.custom_dropdown_layout, null);
        TextView names = (TextView) convertView.findViewById(R.id.tvDropDownlayout);
        if(position==0)
            names.setVisibility(View.GONE);
        else
            names.setText(catalogueNames[position]);
        return convertView;
    }
}