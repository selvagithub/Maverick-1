package com.maveric;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class Apppref {
	private SharedPreferences appSharedPrefs;
	private Editor prefsEditor;
	private Context context;
	private static final String BMI = "bmi";
	// private static final String REC_WATER = "recWater";
	private static final String REC_WEIGHT = "recWeight";
	private static final String STARTUP = "startUp";
	private static final String SINGINOnly = "signinonly";
	private static final String USERNAMEOnly = "usernameonly";
	private static final String PASSWORDOnly = "passwordonly";

	public Apppref(Context context) {
		this.context = context.getApplicationContext();
		String AppPrefsString = getAppPrefsString(context
				.getString(R.string.APP_PREF_NAME));
		this.appSharedPrefs = context.getSharedPreferences(AppPrefsString,
				Activity.MODE_PRIVATE);
		this.prefsEditor = appSharedPrefs.edit();
	}

	private String getAppPrefsString(String prefsString) {
		return context.getPackageName() + "." + prefsString;
	}

	public void setBmi(float bmi) {
		prefsEditor.putFloat(BMI, bmi);
		prefsEditor.commit();
	}

	public float getBmi() {
		return appSharedPrefs.getFloat(BMI, 20);
	}

	public void setRecWeight(float weight) {
		prefsEditor.putFloat(REC_WEIGHT, weight);
		prefsEditor.commit();
	}

	public float getRecWeight() {
		return appSharedPrefs.getFloat(REC_WEIGHT, 60);
	}

	// public void setRecWater(float water) {
	// prefsEditor.putFloat(REC_WATER, water);
	// prefsEditor.commit();
	// }
	//
	// public float getRecWater() {
	// return appSharedPrefs.getFloat(REC_WATER, 3);
	// }

	public void setStartup(Boolean yes) {
		prefsEditor.putBoolean(STARTUP, yes);
		prefsEditor.commit();
	}

	public Boolean isStartUp() {
		return appSharedPrefs.getBoolean(STARTUP, true);
	}

	public void setLastTime(String yes) {
		prefsEditor.putString("time", yes);
		prefsEditor.commit();
	}

	public String getLastTime() {
		return appSharedPrefs.getString("time", "0");
	}

	public void setLastTime1(String yes) {
		prefsEditor.putString("time1", yes);
		prefsEditor.commit();
	}

	public String getLastTime1() {
		return appSharedPrefs.getString("time1", "0");
	}

	public void setLastMetabolicQueriesResult(String result) {
		prefsEditor.putString("metabolicQueries", result);
		prefsEditor.commit();
	}

	public String getLastMetabolicQueriesResult() {
		return appSharedPrefs.getString("metabolicQueries", " ");
	}

	public void setIsQueriesAlreadyAnswerd(Boolean answer) {
		prefsEditor.putBoolean("isQueriesAlreadyAnswerd", answer);
		prefsEditor.commit();
	}

	public Boolean isQueriesAlreadyAnswerd() {
		return appSharedPrefs.getBoolean("isQueriesAlreadyAnswerd", false);
	}

	public void setIsWorkQueriesAlreadyAnswerd(Boolean answer) {
		prefsEditor.putBoolean("isWorkQueriesAlreadyAnswerd", answer);
		prefsEditor.commit();
	}

	public Boolean isWorkQueriesAlreadyAnswerd() {
		return appSharedPrefs.getBoolean("isWorkQueriesAlreadyAnswerd", false);
	}

	public void setLastWorkQueriesResult(String result) {
		prefsEditor.putString("WorkQueries", result);
		prefsEditor.commit();
	}

	public String getLastWorkQueriesResult() {
		return appSharedPrefs.getString("WorkQueries", " ");
	}

	public void setSignInOnly(Boolean yes) {
		prefsEditor.putBoolean(SINGINOnly, yes);
		prefsEditor.commit();
	}

	public Boolean getSignInOnly() {
		return appSharedPrefs.getBoolean(SINGINOnly, false);
	}

	public void setUserNameOnly(String userName) {
		prefsEditor.putString(USERNAMEOnly, userName);
		prefsEditor.commit();
	}

	public String getUserNameOnly() {
		return appSharedPrefs.getString(USERNAMEOnly, "demo");
	}

	public void setPasswordonly(String password) {
		prefsEditor.putString(PASSWORDOnly, password);
		prefsEditor.commit();
	}

	public String getPasswordonly() {
		return appSharedPrefs.getString(PASSWORDOnly, "demo");
	}

	public void setHowHappyUR(String date, int selectedToy) {
		prefsEditor.putInt(date, selectedToy);
		prefsEditor.commit();
	}

	public int getHowHappyUR(String date) {
		return appSharedPrefs.getInt(date, 0);
	}

	public void setWaterConsume(String date, String value) {
		prefsEditor.putString("water_" + date, value);
		prefsEditor.commit();
	}

	public String getWaterConsume(String date) {
		return appSharedPrefs.getString("water_" + date, "");
	}

	public void setIsprofileApiCall(Boolean ans) {
		prefsEditor.putBoolean("pApi", ans);
		prefsEditor.commit();
	}

	public Boolean IsprofileApiCall() {
		return appSharedPrefs.getBoolean("pApi", false);
	}

	public void setCurrentWeight(String w) {
		prefsEditor.putString("cWeight", w);
		prefsEditor.commit();
	}

	public String getCurrentWeight() {
		return appSharedPrefs.getString("cWeight", "");
	}

	public void setUserName(String name) {
		prefsEditor.putString("name", name);
		prefsEditor.commit();
	}

	public String getUserName() {
		return appSharedPrefs.getString("name", "");
	}
}
