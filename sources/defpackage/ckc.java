package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes3.dex */
public final class ckc extends SQLiteOpenHelper {
    public static ckc d;
    public Context a;
    public SQLiteDatabase b;
    public long c;

    public final synchronized void a() {
        SQLiteDatabase sQLiteDatabase = this.b;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            this.b.close();
            this.b = null;
        }
    }

    public final synchronized void h() {
        SQLiteDatabase sQLiteDatabase = this.b;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            SQLiteException e = null;
            for (int i = 0; i < 2; i++) {
                if (i > 0) {
                    try {
                        synchronized (this) {
                            a();
                            this.a.deleteDatabase("RKStorage");
                        }
                    } catch (SQLiteException e2) {
                        e = e2;
                        try {
                            Thread.sleep(30L);
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
                this.b = getWritableDatabase();
            }
            SQLiteDatabase sQLiteDatabase2 = this.b;
            if (sQLiteDatabase2 == null) {
                throw e;
            }
            sQLiteDatabase2.setMaximumSize(this.c);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE catalystLocalStorage (key TEXT PRIMARY KEY, value TEXT NOT NULL)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i != i2) {
            synchronized (this) {
                a();
                this.a.deleteDatabase("RKStorage");
            }
            onCreate(sQLiteDatabase);
        }
    }

    public final synchronized SQLiteDatabase p() {
        h();
        return this.b;
    }
}
