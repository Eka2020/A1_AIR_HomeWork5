package com.geektech.recyclerview2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Main3Activity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void OnClick(View view) {

        Button button = findViewById(R.id.open_main);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}