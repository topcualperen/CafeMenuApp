package com.alperentopcu.cafemenuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AmericanoMenu extends AppCompatActivity {

    TextView americanoText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_americano_menu);

        americanoText = findViewById(R.id.americanoText);

        Intent intent = new Intent();
    }

    public void order(View view){

    }

    public void coffee_size_s(View view){

    }

    public void coffee_size_m(View view){

    }

    public void coffee_size_l(View view){

    }

}