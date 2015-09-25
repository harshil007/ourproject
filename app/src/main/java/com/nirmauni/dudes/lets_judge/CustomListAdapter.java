package com.nirmauni.dudes.lets_judge;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by Dishank on 9/23/2015.
 */
public class CustomListAdapter extends ArrayAdapter<String> {


    private final Activity context;
    private final String[] main;
    private final String[] desc;

    public CustomListAdapter(Activity context, String[] main, String[] desc) {
        super(context, R.layout.single_row, main);

        this.context=context;
        this.main=main;
        this.desc=desc;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View listview= inflater.inflate(R.layout.single_row, null, true);

        TextView maintv = (TextView) listview.findViewById(R.id.maintext);
        TextView desctv = (TextView) listview.findViewById(R.id.description);

        maintv.setText(main[position]);
        desctv.setText(desc[position]);

        return super.getView(position, convertView, parent);
    }
}
