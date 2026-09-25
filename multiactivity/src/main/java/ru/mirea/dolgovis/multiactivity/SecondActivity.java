package ru.mirea.dolgovis.multiactivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {
    // Тег для удобного поиска в LogCat
    private static final String TAG = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String message = (String) getIntent().getSerializableExtra("message");
        TextView textViewMessage = findViewById(R.id.textViewMessage);

        if (message != null) {
            textViewMessage.setText(message);
        } else {
            textViewMessage.setText("ПУСТО");
        }

        Log.i(TAG, "onCreate()");
    }

    // Переопределяем основные методы жизненного цикла с логированием
    @Override protected void onStart()   { super.onStart();   Log.i(TAG, "onStart()"); }
    @Override protected void onRestart() { super.onRestart(); Log.i(TAG, "onRestart()"); }
    @Override protected void onResume()  { super.onResume();  Log.i(TAG, "onResume()"); }
    @Override protected void onPause()   { super.onPause();   Log.i(TAG, "onPause()"); }
    @Override protected void onStop()    { super.onStop();    Log.i(TAG, "onStop()"); }
    @Override protected void onDestroy() { super.onDestroy(); Log.i(TAG, "onDestroy()"); }
}