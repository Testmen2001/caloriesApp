package sweatyDiet.com.YoeruzYoussefApp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class HomeFragment extends Fragment {
    

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.home_fragment, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        TextView totalSumCalories = (TextView) view.findViewById(R.id.total_sum_cals_intake);
        MainActivity activity = (MainActivity)getActivity();
        assert activity != null;
        int totalCalories = activity.getTotalConsumedCalories();
        totalSumCalories.setText(totalCalories +"");

        Button button = (Button) view.findViewById(R.id.button);
        button.setOnClickListener(v -> navigateToCaloriesInput());
        setDateOfToday(view);
    }

    private void setDateOfToday(View view) {
        // 1. Get date of today in a variable
        Date c = Calendar.getInstance().getTime();
        // 2. Convert date to a string
        SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy", Locale.getDefault());
        String formattedDate = df.format(c);

        // 3. Get textview in a variable
        TextView dateTextView = view.findViewById(R.id.date_textview);
        String currentText = dateTextView.getText().toString();

        // 4. Set dateString in textView
        dateTextView.setText(currentText +" " + formattedDate);

    }

    private void navigateToCaloriesInput(){
        // create reference to activity, then create ref to fragment, then add transaction
        AppCompatActivity activity = (AppCompatActivity)getActivity();
        activity.getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainerView, new CaloriesInputFragment())
                .addToBackStack("")
                .commit();

    }


}