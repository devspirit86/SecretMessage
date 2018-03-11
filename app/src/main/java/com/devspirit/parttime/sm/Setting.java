package com.devspirit.parttime.sm;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class Setting extends PreferenceActivity {
	 public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        this.addPreferencesFromResource(com.devspirit.parttime.sm.R.xml.setting);
	 }
}
