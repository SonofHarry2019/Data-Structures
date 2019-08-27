package com.example.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.printf("\nHello, DS Lab #1 - Setup Software!\n");
        System.out.println("Hello World!");
        System.out.println("Hello Haaris!");
    }
}
