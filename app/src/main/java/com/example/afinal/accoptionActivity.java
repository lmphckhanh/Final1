package com.example.afinal;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.LinearLayout;
import android.view.View;
import android.content.Intent;

public class accoptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.account_option);

        LinearLayout linearLayout = findViewById(R.id.linearLayout);

        // Đặt sự kiện click cho LinearLayout
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Khi LinearLayout được nhấn, chuyển sang EditActivity
                Intent intent = new Intent(accoptionActivity.this, EditActivity.class);
                startActivity(intent);
            }
        });

        LinearLayout linearLayout1 = findViewById(R.id.linearLayout1);

        // Đặt sự kiện click cho LinearLayout
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Khi LinearLayout được nhấn, chuyển sang ChangepassActivity
                Intent intent = new Intent(accoptionActivity.this, ChangepassActivity.class);
                startActivity(intent);
            }
        });
    }
}