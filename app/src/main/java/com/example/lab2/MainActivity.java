package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Metoda 1
     //   Log.d("Lab2", "metoda OnCreate");
        //Metoda 2
        Toast.makeText(this, "Metoda OnCreate", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume(){
        super.onResume();
        //Metoda 1
     //   Log.d("lab2", "metoda onResume");
        //Metoda 2
        Toast.makeText(this, "Metoda onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected  void onPause(){
        super.onPause();
        Toast.makeText(this, "Metoda onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected  void onDestroy(){
        super.onDestroy();
        Toast.makeText(this, "Metoda onDestroy", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected  void onRestart(){
        super.onRestart();
        Toast.makeText(this, "Metoda onRestart", Toast.LENGTH_SHORT).show();
    }
}