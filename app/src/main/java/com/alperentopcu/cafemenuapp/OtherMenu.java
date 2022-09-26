package com.alperentopcu.cafemenuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class OtherMenu extends AppCompatActivity {

    TextView textOtherTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_menu);

        textOtherTitle = findViewById(R.id.textOtherTitle);

    }

    public void waiter(View view){

    }

    public void pay(View view){

    }

    public void rate(View view){

    }

    public void backPage(View view){

        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);

    }
}