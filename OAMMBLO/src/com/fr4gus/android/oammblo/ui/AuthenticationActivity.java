package com.fr4gus.android.oammblo.ui;

import com.fr4gus.android.oammblo.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AuthenticationActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentication);
        btnIngresar = (Button) findViewById(R.id.btnIngresar);
        btnIngresar.setOnClickListener( new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(AuthenticationActivity.this, TimelineActivity.class);
				startActivity(intent);	;				
			}
        });
    }
    
    private Button btnIngresar;
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_authentication, menu);
        return true;
    }
}
