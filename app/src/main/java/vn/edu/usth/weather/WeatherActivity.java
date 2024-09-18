package vn.edu.usth.weather;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        // Ghi log để theo dõi quá trình khởi tạo Activity
        Log.i("WeatherActivity", "onCreate called");

        // Thêm ForecastFragment vào Activity
        ForecastFragment forecastFragment = ForecastFragment.newInstance();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.container, forecastFragment)
                .commit();
    }

    @Override
    protected void onStart() {
        super.onStart();
        // Ghi log khi Activity chuyển sang trạng thái Started
        Log.i("WeatherActivity", "onStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        // Ghi log khi Activity chuyển sang trạng thái Resumed
        Log.i("WeatherActivity", "onResume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        // Ghi log khi Activity chuyển sang trạng thái Paused
        Log.i("WeatherActivity", "onPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        // Ghi log khi Activity chuyển sang trạng thái Stopped
        Log.i("WeatherActivity", "onStop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Ghi log khi Activity bị hủy
        Log.i("WeatherActivity", "onDestroy called");
    }
}
