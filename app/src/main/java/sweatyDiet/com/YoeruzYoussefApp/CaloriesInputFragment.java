package sweatyDiet.com.YoeruzYoussefApp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class CaloriesInputFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_calories_input, container, false);
    }

    private void enterAmountOfCalories() {
        EditText numberOfCal = (EditText) getView().findViewById(R.id.cal_intake);
        numberOfCal.setOnClickListener(v -> enterAmountOfCalories());

    }

}