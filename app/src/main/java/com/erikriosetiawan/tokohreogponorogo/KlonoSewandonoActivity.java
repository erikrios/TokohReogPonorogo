package com.erikriosetiawan.tokohreogponorogo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class KlonoSewandonoActivity extends AppCompatActivity {

    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_klono_sewandono);

        title = findViewById(R.id.klono_sewandono_title);
        Intent intent = getIntent();
        String kata = intent.getStringExtra(ListReogAdapter.MESSAGE_KLONO_SEWANDONO);
        title.setText(kata);
    }
}
