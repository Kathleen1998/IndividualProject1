package com.homework.individualproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class LastScreen extends AppCompatActivity {
    TextView showEverything;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last_screen);
        //shows the users information
        SharedPreferences spreferences = getSharedPreferences("MyUserPrefs", MODE_PRIVATE);
        String show = spreferences.getString("show", "");

        showEverything = findViewById(R.id.textView1);
        showEverything.setText(show);

    }
}