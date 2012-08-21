package com.fr4gus.android.oammblo.ui;

import com.fr4gus.android.oammblo.R;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Shows App logo for few seconds.
 * 
 * @author Franklin Garcia
 * Created Mar 25, 2012
 */
public class SplashActivity extends OammbloActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
    }
    Handler mHandler = new Handler();
	@Override
	protected void onResume() {
		super.onResume();
		mHandler.postDelayed(new Runnable(){

			@Override
			public void run() {
				Intent intent = new Intent(SplashActivity.this, AuthenticationActivity.class);
				startActivity(intent);			
			}
				
			
		}, 3000);
		
	}
    
}
