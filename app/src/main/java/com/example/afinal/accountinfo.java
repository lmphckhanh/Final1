package com.example.afinal;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.TextView;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;

public class accountinfo extends AppCompatActivity {

    TextView nameTextView, emailTextView, locationTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.account_information);

        // Khởi tạo các TextView
        nameTextView = findViewById(R.id.textView11);
        emailTextView = findViewById(R.id.textView12);
        locationTextView = findViewById(R.id.textView13);

        // Lấy dữ liệu từ Intent
        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME");
        String email = intent.getStringExtra("EMAIL");
        String phone = intent.getStringExtra("PHONE");

        // Đặt thông tin vào các TextView
        nameTextView.setText(name);
        emailTextView.setText(email);
        locationTextView.setText(phone);


        ImageView imageView = findViewById(R.id.imageView8);

        // Đặt sự kiện click cho ImageView
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Khi ImageView được nhấn, chuyển sang SecondActivity
                Intent intent = new Intent(accountinfo.this, accoptionActivity.class);
                startActivity(intent);
            }
        });
    }
}