package com.example.batinfo;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    static {
        System.loadLibrary("your-jni-library"); // Завантаження вашої бібліотеки JNI
    }

    public native int getBatteryLevel(); // Оголошення нативного методу

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int batteryLevel = getBatteryLevel();
        Log.d("BatteryInfo", "Battery Level: " + batteryLevel + "%");
    }
}
