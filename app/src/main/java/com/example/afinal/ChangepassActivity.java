package com.example.afinal;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.ImageView;
import android.view.View;
import android.content.Intent;

public class ChangepassActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.change_password);;

        ImageView imageView = findViewById(R.id.imageView13);

        // Đặt sự kiện click cho ImageView
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Khi ImageView được nhấn, chuyển sang SecondActivity
                Intent intent = new Intent(ChangepassActivity.this, accoptionActivity.class);
                startActivity(intent);
            }
        });
    }
}