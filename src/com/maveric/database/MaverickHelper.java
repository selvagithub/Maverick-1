package com.maveric.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.maveric.database.model.DietTracker;
import com.maveric.database.model.ExceriseValue;
import com.maveric.database.model.FavWorkoutTracterTable;
import com.maveric.database.model.FoodTrackerTable;
import com.maveric.database.model.FoodTable;
import com.maveric.database.model.ProfileTable;
import com.maveric.database.model.WaterTracker;
import com.maveric.database.model.WorkOutTrackerTable;

public class MaverickHelper extends SQLiteOpenHelper {

	public static final String DATABASE_NAME = "ConsumerDB";
	public static final int DATABASE_VERSION = 1;

	public MaverickHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	// Method is called during creation of the database
	@Override
	public void onCreate(SQLiteDatabase database) {
		try {
			ProfileTable.onCreate(database);
			WorkOutTrackerTable.onCreate(database);
			WaterTracker.onCreate(database);
			DietTracker.onCreate(database);
			ExceriseValue.onCreate(database);
			FoodTrackerTable.onCreate(database);
			FoodTable.onCreate(database);
			FavWorkoutTracterTable.onCreate(database);
		} catch (Exception e) {
			Log.e("mohan", "error in create db");
		}
	}

	// Method is called during an upgrade of the database,
	@Override
	public void onUpgrade(SQLiteDatabase database, int oldVersion,
			int newVersion) {
		// WorkOutTrackerTable.onUpgrade(database, oldVersion, newVersion);
		// ConsumerInterestsTable.onUpgrade(database, oldVersion, newVersion);
	}
}
