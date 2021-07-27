package com.example.androidcodeforbeginner;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListOfProgram extends ListActivity {

    ListView list;

    String project_list[] = {"example1", "example2", "example3", "example4", "example5"};

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        String list = project_list[position];
        try {
            Class ourClass = Class.forName("com.example.androidcodeforbeginner" + list);
            Intent ourIntent = new Intent(ListOfProgram.this, ourClass);
            startActivity(ourIntent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
        setListAdapter(new ArrayAdapter<String>(ListOfProgram.this, android.R.layout.simple_list_item_1, project_list));

    }
}