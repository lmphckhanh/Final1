package com.example.afinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.LinearLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import android.widget.Button;


public class accandlogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.account_and_login);

        LinearLayout linearLayout = findViewById(R.id.linearLayout);

        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Khi LinearLayout được nhấn, chuyển sang EditActivity
                Intent intent = new Intent(accandlogActivity.this, accountinfo.class);
                startActivity(intent);
            }
        });

        LinearLayout linearLayout1 = findViewById(R.id.linearLayout1);

        // Đặt sự kiện click cho LinearLayout
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Khi LinearLayout được nhấn, chuyển sang ChangepassActivity
                Intent intent = new Intent(accandlogActivity.this, accoptionActivity.class);
                startActivity(intent);
            }
        });





    }

}