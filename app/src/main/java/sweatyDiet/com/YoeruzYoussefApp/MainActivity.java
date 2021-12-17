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
import androidx.lifecycle.ViewModelProvider;


public class MainActivity extends AppCompatActivity {

// TODO fix lost data on configration change!!

    private MainActivityViewModel mainActivityViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainActivityViewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);
    }


    public int getTotalConsumedCalories() {
        return mainActivityViewModel.getCalories();
    }

    public void onConsumedCaloriesEntered(int consumedCalories) {
        mainActivityViewModel.onConsumedCaloriesEntered(consumedCalories);
    }
}