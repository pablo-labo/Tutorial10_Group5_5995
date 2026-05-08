package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;
import com.google.android.gms.common.util.VisibleForTesting;

/* JADX INFO: loaded from: classes2.dex */
public final class xvh extends m0i {
    public final dwh c;
    public boolean d;

    public xvh(i0i i0iVar) {
        super(i0iVar);
        this.c = new dwh(this, this.a.a);
    }

    public static long n(SQLiteDatabase sQLiteDatabase) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
            if (!cursorQuery.moveToFirst()) {
                cursorQuery.close();
                return -1L;
            }
            long j = cursorQuery.getLong(0);
            cursorQuery.close();
            return j;
        } finally {
        }
    }

    @Override // defpackage.m0i
    public final boolean m() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0100 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0158 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0158 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0158 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean o(int r18, byte[] r19) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xvh.o(int, byte[]):boolean");
    }

    public final void p() {
        g();
        b();
        try {
            int iDelete = r().delete("messages", null, null);
            if (iDelete > 0) {
                zzr().c0.a(Integer.valueOf(iDelete), "Reset local analytics data. records");
            }
        } catch (SQLiteException e) {
            zzr().f.a(e, "Error resetting local analytics data. error");
        }
    }

    public final void q() {
        b();
        g();
        if (!this.d && this.a.a.getDatabasePath("google_app_measurement_local.db").exists()) {
            int i = 5;
            for (int i2 = 0; i2 < 5; i2++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        try {
                            SQLiteDatabase sQLiteDatabaseR = r();
                            if (sQLiteDatabaseR == null) {
                                this.d = true;
                                if (sQLiteDatabaseR != null) {
                                    sQLiteDatabaseR.close();
                                    return;
                                }
                                return;
                            }
                            sQLiteDatabaseR.beginTransaction();
                            sQLiteDatabaseR.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                            sQLiteDatabaseR.setTransactionSuccessful();
                            sQLiteDatabaseR.endTransaction();
                            sQLiteDatabaseR.close();
                            return;
                        } catch (SQLiteFullException e) {
                            zzr().f.a(e, "Error deleting app launch break from local database");
                            this.d = true;
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                        }
                    } catch (SQLiteDatabaseLockedException unused) {
                        SystemClock.sleep(i);
                        i += 20;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteException e2) {
                    if (0 != 0) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Throwable th) {
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                            throw th;
                        }
                    }
                    zzr().f.a(e2, "Error deleting app launch break from local database");
                    this.d = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            zzr().X.b("Error deleting app launch break from local database in reasonable time");
        }
    }

    @VisibleForTesting
    public final SQLiteDatabase r() {
        if (this.d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.d = true;
        return null;
    }
}
