package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    ListView list;
    Button mapButton, balls;
    FloatingActionButton addButton;
    SimpleAdapter simpleAdapter;
    SharedPreferences sharedPreferences;
    private static final String STATUS = "status";
    int stat, count;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mapButton = findViewById(R.id.mapButton);
        addButton = findViewById(R.id.addButton);
        balls = findViewById(R.id.balls);
        list = findViewById(R.id.list);
        stat = getIntent().getIntExtra(STATUS, 0);
        count = Integer.parseInt(balls.getText().toString());


        mapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Goooooooooood", Toast.LENGTH_SHORT).show();
            }
        });

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Goooooooooood", Toast.LENGTH_SHORT).show();
            }
        });

        //simpleAdapter = new SimpleAdapter(this, )

        sharedPreferences = getSharedPreferences("pref", 0);
    }
}
