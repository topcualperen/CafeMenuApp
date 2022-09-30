package com.alperentopcu.cafemenuapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class CappuccinoMenu extends AppCompatActivity {

    TextView cappuccinoText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cappuccino_menu);

        cappuccinoText = findViewById(R.id.macchiatoText);

        Intent intent = new Intent();
    }

    public void order(View view){

        AlertDialog.Builder alert = new AlertDialog.Builder(this);

        alert.setTitle("COFFEE SHOP");
        alert.setMessage("Would you like to confirm the coffee selection?");
        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Successful", Toast.LENGTH_LONG).show();
            }
        });
        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Not Saved", Toast.LENGTH_LONG).show();
            }
        });

        alert.show();

    }

    public void coffee_size_s(View view){

        Toast.makeText(getApplicationContext(), "Small size selected", Toast.LENGTH_SHORT).show();

    }

    public void coffee_size_m(View view){

        Toast.makeText(getApplicationContext(), "Medium size selected", Toast.LENGTH_SHORT).show();

    }

    public void coffee_size_l(View view){

        Toast.makeText(getApplicationContext(), "Large size selected", Toast.LENGTH_SHORT).show();

    }

    public void backPage(View view){

        Intent intent = new Intent(getApplicationContext(), CoffeesMenu.class);
        startActivity(intent);

    }

}