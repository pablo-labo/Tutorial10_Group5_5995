package com.google.android.recaptcha.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import defpackage.u63;
import defpackage.z92;
import defpackage.zr4;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class zzid extends SQLiteOpenHelper {
    public static final zzic zza = new zzic(null);
    private static final int zzb = zzic.zzc("18.8.0");
    private static final String zzc = zzic.zzd("18.8.0");
    private static zzid zzd;

    public /* synthetic */ zzid(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        super(context, zzc, (SQLiteDatabase.CursorFactory) null, zzb);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ce");
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ce");
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    public final int zza(List list) throws IOException {
        if (list.isEmpty()) {
            return 0;
        }
        return getWritableDatabase().delete("ce", "id IN ".concat(z92.W0(list, ", ", "(", ")", new Function1() { // from class: com.google.android.recaptcha.internal.zzib
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                zzic zzicVar = zzid.zza;
                return String.valueOf(((zzie) obj).zza());
            }
        }, 24)), null);
    }

    public final int zzb() {
        Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT COUNT(*) FROM ce", null);
        int i = -1;
        try {
            if (cursorRawQuery.moveToNext()) {
                i = cursorRawQuery.getInt(0);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
        cursorRawQuery.close();
        return i;
    }

    public final List zzd() {
        Cursor cursorQuery = getReadableDatabase().query("ce", null, null, null, null, null, "ts ASC");
        List arrayList = new ArrayList();
        while (cursorQuery.moveToNext()) {
            try {
                try {
                    int i = cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("id"));
                    String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("ss"));
                    long j = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("ts"));
                    string.getClass();
                    arrayList.add(new zzie(string, j, i));
                } catch (Exception unused) {
                    arrayList = zr4.a;
                }
            } finally {
                cursorQuery.close();
            }
        }
        return arrayList;
    }

    public final boolean zzf(zzie zzieVar) {
        return zza(u63.Z(zzieVar)) == 1;
    }
}
