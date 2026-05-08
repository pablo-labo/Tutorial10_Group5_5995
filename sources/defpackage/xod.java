package defpackage;

import android.database.sqlite.SQLiteDatabase;
import defpackage.bpd;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xod implements bpd.a {
    @Override // bpd.a
    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }
}
