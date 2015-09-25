package com.nirmauni.dudes.lets_judge;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Dishank on 9/23/2015.
 */
public class Tab1Activity extends Activity {


    String[] main={"Jainam"};
    String[] desc={"Clever bowwyy"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab1);


        CustomListAdapter list = new CustomListAdapter(this, main, desc);
        ListView content_list = (ListView)findViewById(R.id.list_view);
        content_list.setAdapter(list);

    /*
        content_list.setOnItemClickListener(new AdapterView.OnItemClickListener(){


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String c = main[position];
                try {
                    Class ourClass = Class.forName("com.nirmauni.dudes.lets_judge." + c);
                    Intent ourIntent = new Intent(Tab1Activity.this, ourClass);
                    startActivity(ourIntent);
                }catch(ClassNotFoundException e){
                    e.printStackTrace();
                }
            }
        });*/
    }


}
