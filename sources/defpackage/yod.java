package defpackage;

import android.database.sqlite.SQLiteDatabase;
import defpackage.bpd;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yod implements bpd.a {
    @Override // bpd.a
    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
