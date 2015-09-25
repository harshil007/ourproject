package com.nirmauni.dudes.lets_judge;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TabHost;

public class MainActivity extends Activity {


    String str[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost th = (TabHost)findViewById(R.id.tabHost);

        th.setup();

        TabHost.TabSpec specs1 = th.newTabSpec("tab1");
        specs1.setContent(R.id.tab1);
        specs1.setIndicator("Faculties");
        th.addTab(specs1);
        Intent tab1_intent = new Intent(this, Tab1Activity.class);
        specs1.setContent(tab1_intent);

        TabHost.TabSpec specs2 = th.newTabSpec("tab2");
        specs2.setContent(R.id.tab2);
        specs2.setIndicator("Trivia");
        th.addTab(specs2);

        TabHost.TabSpec specs3 = th.newTabSpec("tab3");
        specs3.setContent(R.id.tab3);
        specs3.setIndicator("Notadded");
        th.addTab(specs3);


    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
