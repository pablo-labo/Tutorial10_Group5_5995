package defpackage;

import android.database.sqlite.SQLiteProgram;

/* JADX INFO: loaded from: classes.dex */
public class dt5 implements wze {
    public final SQLiteProgram a;

    public dt5(SQLiteProgram sQLiteProgram) {
        sQLiteProgram.getClass();
        this.a = sQLiteProgram;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.wze
    public final void e(int i, double d) {
        this.a.bindDouble(i, d);
    }

    @Override // defpackage.wze
    public final void n(int i, String str) {
        str.getClass();
        this.a.bindString(i, str);
    }

    @Override // defpackage.wze
    public final void q(int i, long j) {
        this.a.bindLong(i, j);
    }

    @Override // defpackage.wze
    public final void r(int i, byte[] bArr) {
        bArr.getClass();
        this.a.bindBlob(i, bArr);
    }

    @Override // defpackage.wze
    public final void u(int i) {
        this.a.bindNull(i);
    }
}
