package com.alperentopcu.cafemenuapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class OtherMenu extends AppCompatActivity {

    TextView textOtherTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_menu);

        textOtherTitle = findViewById(R.id.textOtherTitle);

    }

    public void waiter(View view){
        Toast.makeText(getApplicationContext(), "Success", Toast.LENGTH_SHORT).show();
    }

    public void pay(View view){
        Toast.makeText(getApplicationContext(), "Coming Soon ...", Toast.LENGTH_LONG).show();
    }

    public void rate(View view){

        AlertDialog.Builder alert = new AlertDialog.Builder(this);

        alert.setTitle("COFFEE SHOP");
        alert.setMessage("Do you like it?");
        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Please give feedback to our waiters", Toast.LENGTH_LONG).show();
            }
        });
        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Thanks !", Toast.LENGTH_LONG).show();
            }
        });

        alert.show();

    }

    public void backPage(View view){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}