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

        TabHost.TabSpec specs = th.newTabSpec("tab1");

        specs.setContent(R.id.tab1);
        specs.setIndicator("Trivia");
        th.addTab(specs);

        specs = th.newTabSpec("tab2");
        specs.setContent(R.id.tab2);
        specs.setIndicator("Faculties");
        th.addTab(specs);

        specs = th.newTabSpec("tab3");
        specs.setContent(R.id.tab3);
        specs.setIndicator("Notadded");
        th.addTab(specs);


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
