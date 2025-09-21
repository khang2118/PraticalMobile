package vn.edu.usth.weather;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class ForecastFragment extends Fragment {

    public ForecastFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_forecast, container, false);


//                PRACTICAL WORK 3
//        View view = new View(getContext());
//        view.setBackgroundColor(Color.parseColor("#200000FF"));
//
//
//                PRACTICAL WORK 4
//        LinearLayout layout = new LinearLayout(getContext());
//        layout.setOrientation(LinearLayout.VERTICAL);
//        layout.setLayoutParams(new LinearLayout.LayoutParams(
//                ViewGroup.LayoutParams.MATCH_PARENT,
//                ViewGroup.LayoutParams.WRAP_CONTENT
//        ));
//
//        TextView dayText = new TextView(getContext());
//        dayText.setText("Thursday");
//        dayText.setTextSize(18);
//        dayText.setPadding(16, 16, 16, 16);
//
//        ImageView weatherIcon = new ImageView(getContext());
//        weatherIcon.setImageResource(R.drawable.sunny);
//        weatherIcon.setAdjustViewBounds(true);
//        weatherIcon.setLayoutParams(new LinearLayout.LayoutParams(200, 200));
//
//        layout.addView(dayText);
//        layout.addView(weatherIcon);



        return view;
    }
}