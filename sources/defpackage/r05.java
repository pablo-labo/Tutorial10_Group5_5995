package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class r05 extends SQLiteOpenHelper {
    public static final a a = new a();
    public static final HashMap<String, r05> b = new HashMap<>();

    public static final class a {
        public static void a(Context context, String str) {
            File databasePath = context.getDatabasePath("snowplowEvents.sqlite");
            File databasePath2 = context.getDatabasePath("snowplowEvents.sqlite-wal");
            File databasePath3 = context.getDatabasePath("snowplowEvents.sqlite-shm");
            File parentFile = databasePath.getParentFile();
            File file = new File(parentFile, str);
            File file2 = new File(parentFile, str.concat("-wal"));
            File file3 = new File(parentFile, str.concat("-shm"));
            if (databasePath.renameTo(file) && databasePath2.renameTo(file2)) {
                databasePath3.renameTo(file3);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS 'events' (id INTEGER PRIMARY KEY, eventData BLOB, dateCreated TIMESTAMP DEFAULT CURRENT_TIMESTAMP)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        c49.a("r05", "Upgrade not implemented, resetting database...", new Object[0]);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'events'");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS 'events' (id INTEGER PRIMARY KEY, eventData BLOB, dateCreated TIMESTAMP DEFAULT CURRENT_TIMESTAMP)");
    }
}
