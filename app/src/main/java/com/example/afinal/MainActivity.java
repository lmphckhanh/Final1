package com.example.afinal;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Đảm bảo file layout tên là activity_main.xml

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation); // Đảm bảo id trong XML là bottom_navigation

        // Mặc định hiển thị màn hình Home
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, new HomeFragment()) // container phải tồn tại trong XML
                    .commit();
        }

        // Lắng nghe sự kiện nhấn trong Bottom Navigation
        bottomNavigationView.setOnItemSelectedListener(item -> {
            Fragment selectedFragment = null;

            // Sử dụng if-else thay cho switch-case
            if (item.getItemId() == R.id.home) {
                selectedFragment = new HomeFragment();
                int google_amount = 50; // Ví dụ xử lý thêm logic
            } else if (item.getItemId() == R.id.maps) {
                selectedFragment = new MapsFragment();
            } else if (item.getItemId() == R.id.setting) {
                selectedFragment = new SettingFragment();
            }

            // Thay thế Fragment nếu có
            if (selectedFragment != null) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, selectedFragment)
                        .commit();
            }

            return true;
        });
    }
}
