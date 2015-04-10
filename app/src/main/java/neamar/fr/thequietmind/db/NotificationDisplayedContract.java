package neamar.fr.thequietmind.db;

import android.provider.BaseColumns;

/**
 * Created by neamar on 4/10/15.
 */
public class NotificationDisplayedContract {
    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    public NotificationDisplayedContract() {}

    /* Inner class that defines the table contents */
    public static abstract class NotificationDisplayedEntry implements BaseColumns {
        public static final String TABLE_NAME = "notificationDisplayed";
        public static final String COLUMN_NAME_ENTRY_ID = "id";
        public static final String COLUMN_NAME_PACKAGE = "package";
        public static final String COLUMN_NAME_DATE = "date";
        public static final String COLUMN_NAME_HOUR = "hour";
        public static final String COLUMN_NAME_DAY = "day";

    }
}
