package com.fr4gus.android.oammblo.ui;

import com.fr4gus.android.oammblo.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class AuthenticationActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentication);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_authentication, menu);
        return true;
    }
}
