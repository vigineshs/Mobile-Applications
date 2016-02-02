package com.air.test;





import com.airpush.android.Airpush;


import android.app.Activity;

import android.os.Bundle;

import android.view.KeyEvent;



public class AirTestActivity extends Activity {
	

Airpush airpush;

	/** Called when the activity is first created. */
	
@Override
	
public void onCreate(Bundle savedInstanceState) {
		
super.onCreate(savedInstanceState);
		
setContentView(R.layout.main);
		// create Airpush constructor.
		
airpush = new Airpush(this);
		
airpush.startSmartWallAd(); //launch smart wall on App start
		
/*
		 * Smart Wall ads: 1: Dialog Ad 2: AppWall Ad 3: LandingPage Ad Only one
		 * of the ad will get served at a time. SDK will ignore the other
		 * requests. To use them all give a gap of 20 seconds between calls.
		 */

		// start Dialog Ad
		// airpush.startDialogAd();
		// start AppWall ad
		// airpush.startAppWall();
		// start Landing Page
		// airpush.startLandingPageAd();		
		
		/*
		 * airpush.startPushNotification(false) requires one boolean parameter
		 * which will used for demo mode if it's true then App will receive demo
		 * ads. Please changed it to false before publishing.
		 */
		airpush.startPushNotification(false);
		// start icon ad.
		airpush.startIconAd();		
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {			
			//use smart wall on app exit. 
		//	airpush.startSmartWallAd();
		}
		return super.onKeyDown(keyCode, event);
	}

}