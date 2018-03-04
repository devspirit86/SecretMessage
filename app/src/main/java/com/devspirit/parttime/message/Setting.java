package com.devspirit.parttime.message;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class Setting extends PreferenceActivity {
	 public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        this.addPreferencesFromResource(R.xml.setting);
	 }
}
