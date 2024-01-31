package com.example.activitiesandintents;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private TextView textViewReceivedData;
    private Button buttonSendBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textViewReceivedData = findViewById(R.id.text_view_received_data);
        buttonSendBack = findViewById(R.id.button_send_back);

        String data = getIntent().getStringExtra("data");
        textViewReceivedData.setText(data);

        buttonSendBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String responseData = "Data from SecondActivity";
                Intent intent = new Intent();
                intent.putExtra("responseData", responseData);
                setResult(RESULT_OK, intent);
                finish();
            } // Added the missing closing brace here
        });
    }
}
