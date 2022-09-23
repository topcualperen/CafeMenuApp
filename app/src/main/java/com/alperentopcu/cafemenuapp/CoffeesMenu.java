package com.alperentopcu.cafemenuapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CoffeesMenu extends AppCompatActivity {

    TextView coffeeMenuText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffees_menu);

        coffeeMenuText =findViewById(R.id.coffeeMenuText);
    }

    public void americano(View view){

    }

    public void cappuccino(View view){

    }

    public void caramel(View view){

    }

    public void latte(View view){

    }

    public void coldBrew(View view){

    }

}