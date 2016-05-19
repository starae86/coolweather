package com.ae86.coolweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper{
	// Provience表建表语句
	public static final String CREATE_PROVIENCE = "create table Provience ("
			+ "id integer primary key autoincrement," 
			+ "provience_name text,"
			+ "provience_code text)";

	// city表建表语句
	public static final String CREATE_CITY = "create table City ("
			+ "id integer primary key autoincrement,"
			+ "city_name text,"
			+ "city_code text," 
			+ "provience_id integer)";

	// country表建表语句
	public static final String CREATE_COUNTRY = "create table Country ("
			+ "id integer primary key autoincrement," 
			+ "provience_name text,"
			+ "provience_code text,"
			+ "city_id integer)";

	public CoolWeatherOpenHelper(Context context, String name,CursorFactory factory, int version) {
		super(context, name, factory, version);
		}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(CREATE_PROVIENCE);
		db.execSQL(CREATE_CITY);
		db.execSQL(CREATE_COUNTRY);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		
	}
}
