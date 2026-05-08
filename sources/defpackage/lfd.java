package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lfd implements wze {
    public final /* synthetic */ mfd a;

    public lfd(mfd mfdVar) {
        this.a = mfdVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.wze
    public final void e(int i, double d) {
        this.a.e(i, d);
    }

    @Override // defpackage.wze
    public final void n(int i, String str) {
        str.getClass();
        this.a.n(i, str);
    }

    @Override // defpackage.wze
    public final void q(int i, long j) {
        this.a.q(i, j);
    }

    @Override // defpackage.wze
    public final void r(int i, byte[] bArr) {
        this.a.r(i, bArr);
    }

    @Override // defpackage.wze
    public final void u(int i) {
        this.a.u(i);
    }
}
