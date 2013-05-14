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
