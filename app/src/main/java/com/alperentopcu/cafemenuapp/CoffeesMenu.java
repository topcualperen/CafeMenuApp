package com.alperentopcu.cafemenuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

        Intent intent = new Intent();
    }

    public void americano(View view){
        Intent intent = new Intent(getApplicationContext(),AmericanoMenu.class);
        startActivity(intent);
    }

    public void cappuccino(View view){
        Intent intent = new Intent(getApplicationContext(),CappuccinoMenu.class);
        startActivity(intent);
    }

    public void caramel(View view){
        Intent intent = new Intent(getApplicationContext(), CaramelMacchiatoMenu.class);
        startActivity(intent);
    }

    public void latte(View view){
        Intent intent = new Intent(getApplicationContext(), LatteMenu.class);
        startActivity(intent);
    }

    public void coldBrew(View view){
        // Intent
    }

    public void backPage(View view){

        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);

    }

}