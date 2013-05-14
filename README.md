# android-bootstrap
android-bootstrap is an Android Library Project to kick start Android App Development.
 
## Getting Started
1. Initialize your app with AppManager with AppConfig configuration:
<code>
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
</code>
2. Features
- preferences()
<code>AppPreference pref = manager().preferences(); pref.set("[key]", "[value]");</code>
- logger()
<code>AppLogger logger = manager().logger(); logger.log("[where]", "[debug message]");</code>
- cacheStore()
<code>CacheStore store = manager().cacheStore(); store.put("[type]", "[key]", "[value]");</code>