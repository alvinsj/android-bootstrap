package com.stepsdk.android.app;

import java.io.File;

import android.content.Context;

public interface AppConfig {
    public boolean isDevelopmentMode();
    public File defaultCacheFolder(Context context);
    public String defaultPreferenceName(Context context);
    public String defaultCacheDBName(Context context);
}
