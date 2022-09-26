package com.alperentopcu.cafemenuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textOtherTitle); // Görünüm sınıfında, findViewById olarak tanımlanan bir yöntem, bir şey kimliğine sahip olan görünümü bulur.


        Intent intent = new Intent();
    }

    public void coffees(View view){
        Intent intent = new Intent(getApplicationContext(), CoffeesMenu.class);
        startActivity(intent);
    }

    public void menu(View view){
        // Intent
    }

    public void other(View view){
        Intent intent = new Intent(getApplicationContext(), OtherMenu.class);
        startActivity(intent);
    }


}