package com.erikriosetiawan.tokohreogponorogo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BujangGanongActivity extends AppCompatActivity {

    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bujang_ganong);

        title = findViewById(R.id.bujang_ganong_title);
        Intent intent = getIntent();
        String kata = intent.getStringExtra(ListReogAdapter.MESSAGE_BUJANG_GANONG);
        title.setText(kata);
    }
}
