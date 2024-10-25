package com.example.todolist;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton addButton = findViewById(R.id.add_button);

        addButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, AddScheduleActivity.class);
            startActivity(intent);
        });
    }
}