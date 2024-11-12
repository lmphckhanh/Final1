package com.example.afinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.setting);

        TextView tvGoToDashboard = findViewById(R.id.tvGoToDashboard);
        tvGoToDashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( SettingActivity.this, DashboardActivity.class);
                startActivity(intent);
            }
        });

        TextView tvGoToChooseLan = findViewById(R.id.tvGoToChooseLan);
        tvGoToChooseLan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( SettingActivity.this, ChooseLanActivity.class);
                startActivity(intent);
            }
        });
    }
}