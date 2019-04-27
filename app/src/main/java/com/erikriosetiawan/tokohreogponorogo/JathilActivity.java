package com.erikriosetiawan.tokohreogponorogo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JathilActivity extends AppCompatActivity {

    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jathil);

        title = findViewById(R.id.jathil_title);
        Intent intent = getIntent();
        String kata = intent.getStringExtra(ListReogAdapter.MESSAGE_JATHIL);
        title.setText(kata);
    }
}
