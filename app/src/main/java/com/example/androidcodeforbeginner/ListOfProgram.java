package com.example.androidcodeforbeginner;

import static android.content.ContentValues.TAG;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListOfProgram extends ListActivity {




    String project_list[] = {"TextPlay","BasicAdition_Substraction","Email","Camera","Data"
            ,"ActionBar","GFX","GFXSurface","ListViewDemo","TrafficLight","SqlView"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
        setListAdapter(new ArrayAdapter<String>(ListOfProgram.this, android.R.layout.simple_expandable_list_item_1, project_list));

    }
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        String list = project_list[position];
        try {
            Class ourClass = Class.forName("com.example.androidcodeforbeginner."+list );
            Intent ourIntent = new Intent(ListOfProgram.this, ourClass);
            Log.d(TAG, "onListItemClick: " + list);

            startActivity(ourIntent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            Toast.makeText(this, "List "+list, Toast.LENGTH_SHORT).show();
        }
    }
}