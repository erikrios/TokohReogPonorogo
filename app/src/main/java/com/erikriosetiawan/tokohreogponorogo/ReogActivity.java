package com.erikriosetiawan.tokohreogponorogo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReogActivity extends AppCompatActivity {

    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reog);

        title = findViewById(R.id.reog_title);
        Intent intent = getIntent();
        String kata = intent.getStringExtra(ListReogAdapter.MESSAGE_REOG);
        title.setText(kata);
    }
}
