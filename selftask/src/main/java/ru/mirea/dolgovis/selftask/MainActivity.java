package ru.mirea.dolgovis.selftask;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShowTime(View view) {
        new MyTimeDialogFragment().show(getSupportFragmentManager(), "time");
    }

    public void onClickShowDate(View view) {
        new MyDateDialogFragment().show(getSupportFragmentManager(), "date");
    }

    public void onClickShowProgress(View view) {
        new MyProgressDialogFragment().show(getSupportFragmentManager(), "progress");
    }

    public void onClickShowSnackbar(View view) {
        Snackbar.make(view, "Это Snackbar поверх экрана!", Snackbar.LENGTH_LONG)
                .setAction("Закрыть", v -> {
                })
                .show();
    }
}