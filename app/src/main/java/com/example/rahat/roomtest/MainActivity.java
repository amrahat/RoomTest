package com.example.rahat.roomtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.rahat.roomtest.database.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void populate(){
        User user = new User();
    }
}
