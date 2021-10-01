package sweatyDiet.com.YoeruzYoussefApp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Button;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import androidx.fragment.app.FragmentContainerView;


public class MainActivity extends AppCompatActivity {



    private int totalConsumedCalories = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public int getTotalConsumedCalories() {
        return totalConsumedCalories;
    }

    void onConsumedCaloriesEntered(int inputCalories) {
        totalConsumedCalories += inputCalories;
    }
}