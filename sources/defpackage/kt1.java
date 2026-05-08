package defpackage;

import android.app.AlertDialog;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.media3.database.DatabaseIOException;
import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class kt1 {
    public static final String[] c = {"name", "length", "last_touch_timestamp"};
    public final Object a;
    public Object b;

    public kt1(int i) {
        switch (i) {
            case 3:
                this.a = new awd();
                this.b = new a89(16);
                break;
            case 4:
            default:
                this.a = new HashMap();
                break;
            case 5:
                this.a = new ConcurrentHashMap(16, 0.75f, 10);
                this.b = new ReferenceQueue();
                break;
        }
    }

    public HashMap a() throws DatabaseIOException {
        try {
            ((String) this.b).getClass();
            Cursor cursorQuery = ((sf3) this.a).getReadableDatabase().query((String) this.b, c, null, null, null, null, null);
            try {
                HashMap map = new HashMap(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    string.getClass();
                    map.put(string, new jt1(cursorQuery.getLong(1), cursorQuery.getLong(2)));
                }
                cursorQuery.close();
                return map;
            } finally {
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public synchronized Map b() {
        try {
            if (((Map) this.b) == null) {
                this.b = Collections.unmodifiableMap(new HashMap((HashMap) this.a));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.b;
    }

    public void c(long j) throws DatabaseIOException {
        sf3 sf3Var = (sf3) this.a;
        try {
            String hexString = Long.toHexString(j);
            this.b = "ExoPlayerCacheFileMetadata" + hexString;
            if (dng.a(sf3Var.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = sf3Var.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    dng.b(writableDatabase, 2, hexString);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + ((String) this.b));
                    writableDatabase.execSQL("CREATE TABLE " + ((String) this.b) + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public void d(Set set) throws DatabaseIOException {
        ((String) this.b).getClass();
        try {
            SQLiteDatabase writableDatabase = ((sf3) this.a).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete((String) this.b, "name = ?", new String[]{(String) it.next()});
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public void e(long j, String str, long j2) throws DatabaseIOException {
        ((String) this.b).getClass();
        try {
            SQLiteDatabase writableDatabase = ((sf3) this.a).getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j2));
            writableDatabase.replaceOrThrow((String) this.b, null, contentValues);
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public kt1(LinearLayout linearLayout, FrameLayout frameLayout, ComposeView composeView) {
        this.a = frameLayout;
        this.b = composeView;
    }

    public kt1(fch fchVar, AlertDialog alertDialog) {
        this.b = fchVar;
        this.a = alertDialog;
    }

    public kt1(sf3 sf3Var) {
        this.a = sf3Var;
    }
}
