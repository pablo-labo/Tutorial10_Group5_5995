package defpackage;

import android.database.sqlite.SQLiteStatement;

/* JADX INFO: loaded from: classes.dex */
public final class et5 extends dt5 implements zze {
    public final SQLiteStatement b;

    public et5(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.b = sQLiteStatement;
    }

    @Override // defpackage.zze
    public final long A0() {
        return this.b.executeInsert();
    }

    @Override // defpackage.zze
    public final int J() {
        return this.b.executeUpdateDelete();
    }

    @Override // defpackage.zze
    public final void b() {
        this.b.execute();
    }
}
