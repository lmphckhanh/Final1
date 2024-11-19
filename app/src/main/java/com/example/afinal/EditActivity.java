package com.example.afinal;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;

public class EditActivity extends AppCompatActivity {

    private TextView EditName, EditEmail, EditLocation;
    private Button Apply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.edit_profile_information);

        ImageView imageView = findViewById(R.id.imageView11);

        imageView.setOnClickListener(new View.OnClickListener() {
                                         @Override public void onClick(View v) {
                                             // Chuyển sang Dashboard Activity
                                             Intent intent = new Intent(EditActivity.this, MenuActivity.class);
                                             startActivity(intent);
                                         }
        });

        EditName = findViewById(R.id.textView11);
        EditEmail = findViewById(R.id.textView12);
        EditLocation = findViewById(R.id.textView14);;
        Apply = findViewById(R.id.button6);

        Apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lấy thông tin đã nhập
                String name = EditName.getText().toString();
                String email = EditEmail.getText().toString();
                String Location = EditLocation.getText().toString();

                // Chuyển sang AccountInfo Activity
                Intent intent = new Intent(EditActivity.this, accountinfo.class);
                intent.putExtra("NAME", name);
                intent.putExtra("EMAIL", email);
                intent.putExtra("LOCATION", Location);
                startActivity(intent);
            }
        });
    }
}