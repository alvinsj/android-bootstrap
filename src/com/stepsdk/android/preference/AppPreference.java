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

package com.stepsdk.android.preference;

import android.content.Context;
import android.content.SharedPreferences;

public class AppPreference {
    public static final String DEFAULT_STRING_VALUE = "";
    public static final long DEFAULT_LONG_VALUE = 0;
    public static final int DEFAULT_INTEGER_VALUE = 0;
    public static final float DEFAULT_FLOAT_VALUE = 0.0f;
    public static final boolean DEFAULT_BOOLEAN_VALUE = false;
    
    public SharedPreferences mSharedPreferences;
    
    public AppPreference(Context context, String preferenceName){
        mSharedPreferences = context.getSharedPreferences(preferenceName, 0);
    }

    public Boolean set(String key, String value)
    {
        final SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putString(key, value);
        return editor.commit();
    }
    
    public void set(String key, long value)
    {
        final SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putLong(key, value);
        editor.commit();
    }
    
    public void set(String key, int value)
    {
        final SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putInt(key, value);
        editor.commit();
    }
    
    public void set(String key, float value)
    {
        final SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putFloat(key, value);
        editor.commit();
    }
    
    public void set(String key, boolean value)
    {
        final SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putBoolean(key, value);
        editor.commit();
    }
    
    public String getString(String key)
    {
        if (!mSharedPreferences.contains(key))
            return null;
        else
            return mSharedPreferences.getString(key, DEFAULT_STRING_VALUE);
    }
    
    public Long getLong(String key)
    {
        if (!mSharedPreferences.contains(key))
            return null;
        else
            return mSharedPreferences.getLong(key, DEFAULT_LONG_VALUE);
    }
    
    public Integer getInt(String key)
    {
        if (!mSharedPreferences.contains(key))
            return null;
        else
            return mSharedPreferences.getInt(key, DEFAULT_INTEGER_VALUE);
    }
    
    public Float getFloat(String key)
    {
        if (!mSharedPreferences.contains(key))
            return null;
        else
            return mSharedPreferences.getFloat(key, DEFAULT_FLOAT_VALUE);
    }
    
    public Boolean getBoolean(String key)
    {
        if (!mSharedPreferences.contains(key))
            return null;
        else
            return mSharedPreferences.getBoolean(key, DEFAULT_BOOLEAN_VALUE);
    }
    
    public void clear(String key)
    {
        final SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.remove(key);
        editor.commit();
    }
}
