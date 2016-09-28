package com.example.bruno.task;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.parse.GetCallback;
import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Parse.initialize(new Parse.Configuration.Builder(this)
                        .applicationId("ZXnle3NNA7eFg9RsyGDULvd3jtz4cRu4K7x9Zl55")
                        .clientKey("Z5kbmWrfqlez4PPJaGqwBPFfugBFZmLg1NffrAF8")
                        .server("https://parseapi.back4app.com/").build()
        );

        ParseObject testObject = new ParseObject("Task");
        testObject.put("ID", 3);
        testObject.put("Name", "task 3");
        testObject.put("Notes", "nota nenuma");
        testObject.put("Done", false);
        testObject.saveInBackground();
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
