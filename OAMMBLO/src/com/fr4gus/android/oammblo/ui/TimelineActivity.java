package com.fr4gus.android.oammblo.ui;

import com.fr4gus.android.oammblo.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class TimelineActivity extends Activity {

    @Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeline);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_timeline, menu);
        return true;
    }


}
