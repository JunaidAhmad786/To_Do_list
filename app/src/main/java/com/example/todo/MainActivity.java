package com.example.todo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.todo.R.layout.activity_main;

public class MainActivity extends AppCompatActivity {
    Button btnadd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);
        init();
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity
                        .this,com.example.todo.MainActivity2.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private void init() {
        btnadd=findViewById(R.id.btnadd);
    }
}