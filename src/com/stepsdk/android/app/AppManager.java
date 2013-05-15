/**
 * Copyright (c) 2012 Alvin S.J. Ng
 * 
 * Permission is hereby granted, free of charge, to any person obtaining 
 * a copy of this software and associated documentation files (the 
 * "Software"), to deal in the Software without restriction, including 
 * without limitation the rights to use, copy, modify, merge, publish, 
 * distribute, sublicense, and/or sell copies of the Software, and to 
 * permit persons to whom the Software is furnished to do so, subject 
 * to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be 
 * included in all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT 
 * WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, 
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF 
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR 
 * PURPOSE AND NONINFRINGEMENT. IN NO EVENT 
 * SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE 
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER 
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, 
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR 
 * IN CONNECTION WITH THE SOFTWARE OR 
 * THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 * 
 * @author 		Alvin S.J. Ng <email.to.alvin@gmail.com>
 * @copyright	2013	Alvin S.J. Ng
 * 
 */

package com.stepsdk.android.app;

import android.content.Context;

import com.stepsdk.android.cache.CacheStore;
import com.stepsdk.android.log.AppLogger;
import com.stepsdk.android.preference.AppPreference;

public class AppManager {
	
    private static AppManager singleton = null;
    private static AppLogger mLogger = null;
    private static AppConfig mConfig = null;
    private static CacheStore mCacheStore = null;
    private static AppPreference mPreference;
    
    private AppManager(Context applicationContext, AppConfig appConfig) {
    	mConfig = appConfig;
    	mLogger = new AppLogger(mConfig.isDevelopmentMode());
    	mPreference = new AppPreference(applicationContext, mConfig.defaultPreferenceName(applicationContext));
    	mCacheStore = setupCacheStore(applicationContext);
    }
    
    public static AppManager getInstance(Context applicationContext, AppConfig config) {
    	if( singleton == null )
        	singleton = new AppManager(applicationContext, config);
        return singleton;
    }
    
    public AppPreference preferences(Context context){
    	return mPreference;
    }
    
    public CacheStore cacheStore() {
    	return mCacheStore;
    }
    
    public AppLogger logger() {
    	return mLogger;
    }
    
    private CacheStore setupCacheStore(final Context applicationContext) {
    	return new CacheStore(applicationContext) {
			@Override
			public String storeName() {
				return mConfig.defaultCacheDBName(applicationContext);
			}

		};
    }
    
}
