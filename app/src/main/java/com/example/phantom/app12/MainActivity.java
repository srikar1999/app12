package com.example.phantom.app12;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        menu.add("Copy");
        menu.add("Edit");
        menu.add("Paste");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.


        //noinspection SimplifiableIfStatement
        if(item.getTitle()=="Copy")
        Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_LONG).show();
        else if(item.getTitle()=="Edit")
            Toast.makeText(getApplicationContext(), "Edited successfully", Toast.LENGTH_LONG).show();
        else
            Toast.makeText(getApplicationContext(), "Pasted", Toast.LENGTH_LONG);
        return super.onOptionsItemSelected(item);

    }
}
