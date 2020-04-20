package com.example.operacionesmatematicas;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    //Hola mundo y quienes lo habitan
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    @Override
    public void finishFromChild(Activity child) {
        super.finishFromChild(child);


    }
}
