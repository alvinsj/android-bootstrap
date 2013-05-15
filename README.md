## android-bootstrap
<b>android-bootstrap</b> is an Android Library Project to kick start Android App Development.
 
### Getting Started
Initialize AppManager and with AppConfig configuration:  

```
public AppManager manager() {
  try { return AppManager.getInstance(); } 
  catch(Exception e) { return AppManager.bootstrap(getApplicationContext(), setupConfig()); }
}

private AppConfig setupConfig() {
	return new AppConfig()	{
		public File defaultCacheFolder(Context context) { //return.. }
		public String defaultPreferenceName(Context context){ //return.. }
		public String defaultCacheDBName(Context context){ //return.. }
  }
}
```

## Features
- preferences()
<code>AppPreference pref = manager().preferences(); pref.set("[key]", "[value]");</code>
- logger()
<code>AppLogger logger = manager().logger(); logger.log("[where]", "[debug message]");</code>
- cacheStore()
<code>CacheStore store = manager().cacheStore(); store.put("[type]", "[key]", "[value]");</code>
