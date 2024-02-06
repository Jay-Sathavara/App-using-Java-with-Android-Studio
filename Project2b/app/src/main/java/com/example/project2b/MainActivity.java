package com.example.project2b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView countTextView;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button incrementButton = findViewById(R.id.incrementButton);
        Button decrementButton = findViewById(R.id.decrementButton);
        countTextView = findViewById(R.id.countTextView);

        // Increment button listener
        incrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                updateCount();
            }
        });

        // Decrement button listener
        decrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                updateCount();
            }
        });
    }

    private void updateCount() {
        countTextView.setText(  "Your Year: " + count);
    }
}
