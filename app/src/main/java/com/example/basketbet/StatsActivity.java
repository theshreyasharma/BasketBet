package com.example.basketbet;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class StatsActivity extends AppCompatActivity{

    private Button ret;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats);
        Intent intent = getIntent();
        int topnum = intent.getIntExtra("topTeam", 1);
        int bottomnum = intent.getIntExtra("bottomTeam", 1);
        TextView textView = (TextView) findViewById(R.id.team2Label);
        textView.setText(topnum);


        ret = findViewById(R.id.winBut);

        ret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                launchActivity();
            }
        });
    }
    private void launchActivity() {
        Intent intent = new Intent(this, ResultsActivity.class);
        startActivity(intent);
    }

}

