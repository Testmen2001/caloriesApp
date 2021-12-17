package sweatyDiet.com.YoeruzYoussefApp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CaloriesInputFragment extends Fragment {

    private EditText calsInputField;
    private Button numberOfCals;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_calories_input, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        calsInputField = (EditText) view.findViewById(R.id.cal_intake_edit_field);
        numberOfCals = (Button) view.findViewById(R.id.enter_intake_button);
        numberOfCals.setOnClickListener(v -> saveConsumedCalories());
    }

    /* 1. Cap on max number of calories.
       2. Mandatory field otherwise alert message
     */
    private void saveConsumedCalories() {
        String consumedCaloriesString = calsInputField.getText().toString();
        if (consumedCaloriesString.equals("")) {
            Toast toast= Toast.makeText(getContext(),"Please enter a value!", Toast.LENGTH_SHORT );
                toast.show();
        } else {
            int consumedCalories = Integer.parseInt(consumedCaloriesString);
            MainActivity activity = (MainActivity) getActivity();
            assert activity != null;
            activity.onConsumedCaloriesEntered(consumedCalories);
            activity.getSupportFragmentManager().popBackStack();
        }

    }
}