package com.tacticalnuclearstrike.tttumblr;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button btnPostText = (Button)findViewById(R.id.postTextBtn);
        btnPostText.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent startPostText = new Intent(MainActivity.this, PostTextActivity.class);
				startActivity(startPostText);
			}
		});
    }
    
    public boolean onCreateOptionsMenu(Menu menu) {
        boolean result = super.onCreateOptionsMenu(menu);
        menu.add(0,Menu.FIRST,0, "Settings");
        return result;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
        case Menu.FIRST:
            Intent startSettings = new Intent(MainActivity.this, SettingsActivity.class);
            startActivity(startSettings);
            return true;
        }
       
        return super.onOptionsItemSelected(item);
    }
}