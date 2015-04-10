package neamar.fr.thequietmind.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by neamar on 4/10/15.
 */
public class NotificationDisplayedDbHelper extends SQLiteOpenHelper {

    private static final String TEXT_TYPE = " TEXT";
    private static final String COMMA_SEP = ",";
    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + NotificationDisplayedContract.NotificationDisplayedEntry.TABLE_NAME + " (" +
                    NotificationDisplayedContract.NotificationDisplayedEntry._ID + " INTEGER PRIMARY KEY," +
                    NotificationDisplayedContract.NotificationDisplayedEntry.COLUMN_NAME_PACKAGE + TEXT_TYPE + COMMA_SEP +
                    NotificationDisplayedContract.NotificationDisplayedEntry.COLUMN_NAME_DATE + TEXT_TYPE + COMMA_SEP +
                    " )";

    // If you change the database schema, you must increment the database version.
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "thequietmind.db";

    public NotificationDisplayedDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}
