package com.example.androidcodeforbeginner;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class BasicAdition_Substraction extends Activity {
    int counter;
    Button add, sub;
    TextView display;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startactivity);

        counter = 0;
        add = (Button) findViewById(R.id.badd);
        sub = (Button) findViewById(R.id.bsub);
        display = (TextView) findViewById(R.id.textViewdisplay);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                display.setText("your total is" + counter);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter--;
                display.setText("your total is" + counter);
            }
        });

    }


}

//    String classes []={"MainActivity","TextPlay","Email","Camera","Data"
//            ,"ActionBar","GFX","GFXSurface","ListViewDemo","TrafficLight","SqlView"};


//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
////        setContentView(R.layout.list);
//
////        //FULL SCREEN
////        requestWindowFeature(Window.FEATURE_NO_TITLE);
////        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
////                WindowManager.LayoutParams.FLAG_FULLSCREEN);
//
//        setListAdapter(new ArrayAdapter<String>(ListOfProgram.this,
//                android.R.layout.simple_expandable_list_item_1,classes));
//    }
//
//    @Override
//    protected void onListItemClick(ListView l, View v, int position, long id) {
//        super.onListItemClick(l, v, position, id);
//
//        String Cheese=classes[position];
//
//        try {
//            Class ourClass = Class.forName("com.example.abhinav.myapplication12."+ Cheese);
//            Intent ourIntent = new Intent(ListOfProgram.this, ourClass);
//            startActivity(ourIntent);
//        }
//        catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }