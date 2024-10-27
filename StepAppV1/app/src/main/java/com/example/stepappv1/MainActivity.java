package com.example.stepappv1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private int stepCounter = 0;

    private TextView showCount;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        showCount = findViewById(R.id.textView);
        updateCountDisplay();
    }

    public void startCount(View view) {
        stepCounter = 0;
        updateCountDisplay();
        Toast toast = Toast.makeText( this, R.string.counterStarted, Toast.LENGTH_LONG);
        toast.show();
    }

    public void countUp(View view) {

        stepCounter ++;
        updateCountDisplay();

    }
    private void updateCountDisplay(){
        showCount.setText(String.format("%d", stepCounter));
    }
}