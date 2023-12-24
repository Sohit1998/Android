package com.example.androidbasics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    TextView Welcome;
    TextView YourPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Welcome = findViewById(R.id.home);
        YourPass = findViewById(R.id.home_pass);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String name = bundle.getString("NAME");
            String pass = bundle.getString("PASSWORD");
            // Display the name in a TextView
            Welcome.setText("Hello, " + name + "!");
            YourPass.setText("Your Password is " + "'" + pass + "'");
        }
    }
}