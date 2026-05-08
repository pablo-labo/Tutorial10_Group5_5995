package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.gms.common.util.VisibleForTesting;

/* JADX INFO: loaded from: classes2.dex */
@VisibleForTesting
public final class dwh extends SQLiteOpenHelper {
    public final /* synthetic */ xvh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dwh(xvh xvhVar, Context context) {
        super(context, "google_app_measurement_local.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.a = xvhVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e) {
            throw e;
        } catch (SQLiteException unused) {
            xvh xvhVar = this.a;
            xvhVar.zzr().f.b("Opening the local database failed, dropping and recreating it");
            if (!xvhVar.a.a.getDatabasePath("google_app_measurement_local.db").delete()) {
                xvhVar.zzr().f.a("google_app_measurement_local.db", "Failed to delete corrupted local db file");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e2) {
                xvhVar.zzr().f.a(e2, "Failed to open local database. Events will bypass local storage");
                return null;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        web.K(this.a.zzr(), sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws Throwable {
        web.L(this.a.zzr(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
