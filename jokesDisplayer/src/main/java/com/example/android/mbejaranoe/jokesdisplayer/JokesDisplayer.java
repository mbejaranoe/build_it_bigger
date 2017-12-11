package com.example.android.mbejaranoe.jokesdisplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokesDisplayer extends AppCompatActivity {

    private TextView jokeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes_displayer);

        jokeTextView = (TextView) findViewById(R.id.joke_textView);
        Intent intent = getIntent();
        jokeTextView.setText(intent.getStringExtra("joke"));
    }
}
