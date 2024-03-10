package com.example.actionbar_sample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuBuilder;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;

import androidx.appcompat.*;

public class MainActivity extends AppCompatActivity {
    Toolbar my_Toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        my_Toolbar = (Toolbar) findViewById(R.id.myToolBar);
        setSupportActionBar(my_Toolbar);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.my_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();

        if(id==R.id.action_settings){
            Toast.makeText(this,"Setting",Toast.LENGTH_LONG).show();

        }
        if(id==R.id.action_Storage){
            Toast.makeText(this,"Storage",Toast.LENGTH_LONG).show();

        }
        if(id==R.id.action_Calls){
            Toast.makeText(this,"Calls",Toast.LENGTH_LONG).show();

        }
        if(id==R.id.action_Update){
            Toast.makeText(this,"Update",Toast.LENGTH_LONG).show();

        }


        return super.onOptionsItemSelected(item);
    }
}