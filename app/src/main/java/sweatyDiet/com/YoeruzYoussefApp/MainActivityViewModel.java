package sweatyDiet.com.YoeruzYoussefApp;

import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {

    private int totalConsumedCalories = 0;

    public int getCalories() {
        return totalConsumedCalories;
    }

    public void onConsumedCaloriesEntered(int inputCalories) {
        totalConsumedCalories += inputCalories;
    }
}