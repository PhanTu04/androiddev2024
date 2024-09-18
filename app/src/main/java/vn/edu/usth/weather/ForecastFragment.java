package vn.edu.usth.weather;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class ForecastFragment extends Fragment {

    public static ForecastFragment newInstance() {
        return new ForecastFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Create a parent LinearLayout to hold everything
        LinearLayout parentLayout = new LinearLayout(getActivity());
        parentLayout.setOrientation(LinearLayout.VERTICAL);
        parentLayout.setGravity(Gravity.CENTER);

        // Create the blue forecast area (child LinearLayout)
        LinearLayout forecastArea = new LinearLayout(getActivity());
        forecastArea.setOrientation(LinearLayout.VERTICAL);
        forecastArea.setGravity(Gravity.CENTER);
        forecastArea.setBackgroundColor(Color.parseColor("#FF0000FF")); // Set the blue color (#FF0000FF)

        // Set layout parameters for the forecast area
        LinearLayout.LayoutParams forecastParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        forecastParams.setMargins(16, 16, 16, 16); // Optional margin around the blue area
        forecastArea.setLayoutParams(forecastParams);

        // Add forecast for each day inside the blue area
        addForecast(forecastArea, "Thursday", R.drawable.cloudy);
        addForecast(forecastArea, "Friday", R.drawable.smallrain);
        addForecast(forecastArea, "Saturday", R.drawable.storm);
        addForecast(forecastArea, "Sunday", R.drawable.sunny);

        // Add the blue forecast area to the parent layout
        parentLayout.addView(forecastArea);

        // Return the parent layout
        return parentLayout;
    }

    private void addForecast(LinearLayout layout, String day, int weatherIconRes) {
        // Create a TextView for the day
        TextView dayTextView = new TextView(getActivity());
        dayTextView.setText(day);
        dayTextView.setTextSize(24);
        dayTextView.setGravity(Gravity.CENTER);
        layout.addView(dayTextView);

        // Create an ImageView for the weather icon
        ImageView weatherIcon = new ImageView(getActivity());
        weatherIcon.setImageResource(weatherIconRes);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        layoutParams.gravity = Gravity.CENTER;
        weatherIcon.setLayoutParams(layoutParams);
        layout.addView(weatherIcon);
    }
}
