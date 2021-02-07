package com.example.ifthen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button decision1 = findViewById(R.id.btn1);
        Button decision2 = findViewById(R.id.btn2);

        decision1.setOnClickListener(this);
        decision2.setOnClickListener(this);
    }
    @Override
    public void onClick (View view) {

        TextView story = findViewById(R.id.storyTxt);

        if (view.getId() == R.id.btn1) {
            story.setText("You spent your remaining money on food. You were able to focus on your classes. But, you did not have enough money for transportation, so you had to walk home.");
        }
        else if (view.getId() == R.id.btn2) {
            story.setText("You chose to save your money. You fell asleep during classes and did not learn anything that day.");
        }
    }
}
