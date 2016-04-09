package com.jeffchen.coolweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * 创建数据库
 * Created by JeffChen on 2016/4/9.
 */
public class CoolWeatherOpenHelper extends SQLiteOpenHelper {

    /**
     *Province表建表语句
     */
    public static final String CREATE_PROVINCE = "create table Province ("
            +"id integer primary key autoincrement,"
            +"province_name text,"
            +"province_code text)";
    /**
     *City 表建表语句
     */
    public static final String CREATE_CITY = "create table city ("
            +"id integer primary key autoincrement,"
            +"city_name text,"
            +"city_code text,"
            +"province_id integer)";
    /**
     *Country 表建表语句
     */
    public static final String CREATE_COUNTRY = "create table Country ("
            +"id integer primary key autoincrement,"
            +"country_name text,"
            +"country_code text,"
            +"city_id integer)";

    public CoolWeatherOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        /**
         *创建Province 、City、Country 表
         */
        db.execSQL(CREATE_PROVINCE);
        db.execSQL(CREATE_CITY);
        db.execSQL(CREATE_COUNTRY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
