package com.stepsdk.android.log;

import android.util.Log;

public class AppLogger {
	private boolean mEnableDevelopmentMode;
	
	public AppLogger(boolean isDevelopmentMode){
		
	}
	
	public void log(String where, String message){
		if(mEnableDevelopmentMode)
			Log.d(where, message);
		else
			todo();
	}
	
	private void todo(){
	}
}
