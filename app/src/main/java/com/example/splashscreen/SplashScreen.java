package com.example.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    private static final int SPLASH_DELAY = 2000; // Waktu tampilan SplashScreen dalam milidetik (2 detik)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        // Menggunakan Handler untuk mengalihkan ke MainActivity setelah SPLASH_DELAY
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Membuat Intent untuk berpindah ke MainActivity
               Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intent);
                finish(); // Menutup aktivitas SplashScreen
            }
        }, SPLASH_DELAY);
    }
}
