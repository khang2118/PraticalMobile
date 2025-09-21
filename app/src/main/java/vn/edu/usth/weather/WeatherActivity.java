package vn.edu.usth.weather;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.widget.Toolbar;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Objects;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_weather);



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i("USTHWeather", "onStart()");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i("USTHWeather", "onResume()");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i("USTHWeather", "onPause()");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i("USTHWeather", "onStop()");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("USTHWeather", "onDestroy()");
    }
}