package com.erikriosetiawan.tokohreogponorogo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WarokActivity extends AppCompatActivity {

    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warok);

        title = findViewById(R.id.warok_title);
        Intent intent = getIntent();
        String kata = intent.getStringExtra(ListReogAdapter.MESSAGE_WAROK);
        title.setText(kata);
    }
}
