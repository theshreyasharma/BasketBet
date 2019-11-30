package com.example.basketbet;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ResultsActivity extends AppCompatActivity{

    private Button res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        res = findViewById(R.id.restart);

        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                launchActivity();
            }
        });
    }
    private void launchActivity() {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}

