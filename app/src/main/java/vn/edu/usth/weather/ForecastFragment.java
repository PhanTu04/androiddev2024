package vn.edu.usth.weather;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass representing the Forecast.
 */
public class ForecastFragment extends Fragment {

    public ForecastFragment() {
        // Required empty public constructor
    }

    /**
     * Create a new instance of ForecastFragment.
     *
     * @return A new instance of fragment ForecastFragment.
     */
    public static ForecastFragment newInstance() {
        return new ForecastFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Initialize any necessary components or variables here
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_forecast, container, false);

        // Set background color for the view (you can change the color if you want)
        view.setBackgroundColor(Color.parseColor("#20FF0000")); // Red with transparency
        // Alternatively, you can try other colors:
        // view.setBackgroundColor(Color.parseColor("#2000FF00")); // Green with transparency
        // view.setBackgroundColor(Color.parseColor("#200000FF")); // Blue with transparency

        return view;
    }
}
