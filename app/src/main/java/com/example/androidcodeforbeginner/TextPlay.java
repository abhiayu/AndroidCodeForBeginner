package com.example.androidcodeforbeginner;

import android.graphics.Color;
import android.os.Bundle;
import android.text.InputType;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class TextPlay extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text);

        Button btn = findViewById(R.id.bResults);
        EditText ecommand = findViewById(R.id.etCommands);
        ToggleButton togleBtn = findViewById(R.id.toggleButton);
        TextView txtResult = findViewById(R.id.tvResult);
        togleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (togleBtn.isChecked()) {
                    ecommand.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);

                } else {
                    ecommand.setInputType(InputType.TYPE_CLASS_TEXT);

                }
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String check = ecommand.getText().toString();
                txtResult.setText(check);
                if (check.contentEquals("left")){
                    txtResult.setGravity(Gravity.LEFT);
                    txtResult.setTextColor(Color.BLUE);
                }else if (check.contentEquals("center")){
                    txtResult.setGravity(Gravity.CENTER);
                    txtResult.setTextColor(Color.GREEN);
                }else if (check.contentEquals("right")){
                    txtResult.setGravity(Gravity.RIGHT);
                    txtResult.setTextColor(Color.RED);

                }else if(check.contains("WTF")){

                    Random random = new Random();
                    txtResult.setText("WFH");
                    txtResult.setTextSize(random.nextInt(75));
                    txtResult.setTextColor(Color.rgb(random.nextInt(156), random.nextInt(375),random.nextInt(175)));
                }else{
                    txtResult.setText("Invalid");
                    txtResult.setGravity(Gravity.CENTER);
                }
            }
        });
    }
}
