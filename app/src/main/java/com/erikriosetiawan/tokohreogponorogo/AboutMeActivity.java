package com.erikriosetiawan.tokohreogponorogo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AboutMeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);
    }

    private void setAppBarTitle() {
        if (getSupportActionBar() != null)
            getSupportActionBar().setTitle(getResources().getString(R.string.about_me));
    }
}
