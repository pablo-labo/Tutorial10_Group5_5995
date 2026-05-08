package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class bpd extends SQLiteOpenHelper {
    public static final String c = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";
    public static final int d = 5;
    public static final List<a> e = Arrays.asList(new wod(), new xod(), new yod(), new zod(), new apd());
    public final int a;
    public boolean b;

    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    public bpd(Context context, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.b = false;
        this.a = i;
    }

    public static void a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        List<a> list = e;
        if (i2 <= list.size()) {
            while (i < i2) {
                list.get(i).a(sQLiteDatabase);
                i++;
            }
        } else {
            StringBuilder sbF = uz.f("Migration from ", i, " to ", i2, " was requested, but cannot be performed. Only ");
            sbF.append(list.size());
            sbF.append(" migrations are provided");
            throw new IllegalArgumentException(sbF.toString());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (!this.b) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, 0, this.a);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        if (!this.b) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, 0, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (this.b) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (!this.b) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, i, i2);
    }
}
