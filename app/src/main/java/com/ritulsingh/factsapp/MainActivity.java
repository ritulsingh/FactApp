package com.ritulsingh.factsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = findViewById(R.id.text_Facts);
        String[] myFacts = Facts.getFacts();

        for(String facts: myFacts){
            mTextView.append(facts + "\n\n");
        }
    }
}