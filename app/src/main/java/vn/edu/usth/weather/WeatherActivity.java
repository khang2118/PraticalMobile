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
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.Objects;

public class WeatherActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_weather);

        RawtoExternal copytosd = new RawtoExternal(WeatherActivity.this);

        // Copy MP3 to SD card
        copytosd.copyFileToSdCard(WeatherActivity.this);
        // Play it
        copytosd.playMusicFromSdCard();

        ViewPager2 viewPager = findViewById(R.id.viewPager);
        WeatherPagerAdapter adapter = new WeatherPagerAdapter(WeatherActivity.this);
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        WeatherPagerAdapter adapter1 = new WeatherPagerAdapter(this);
        viewPager.setAdapter(adapter1);


        new TabLayoutMediator(tabLayout, viewPager,
                (tab, position) -> {
                    switch (position) {
                        case 0: tab.setText("Forecast"); break;
                        case 1: tab.setText("Weather"); break;
                        case 2: tab.setText("Combined"); break;
                    }
                }).attach();
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