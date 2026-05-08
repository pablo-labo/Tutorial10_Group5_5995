package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qp2 extends pp2 implements jyd {
    public final long h;
    public final int i;
    public final int j;
    public final boolean k;
    public final long l;

    public qp2(long j, long j2, int i, int i2, boolean z) {
        super(j, j2, i, i2, z);
        this.h = j2;
        this.i = i;
        this.j = i2;
        this.k = z;
        this.l = j == -1 ? -1L : j;
    }

    @Override // defpackage.jyd
    public final long a(long j) {
        return (Math.max(0L, j - this.b) * 8000000) / ((long) this.e);
    }

    @Override // defpackage.jyd
    public final long g() {
        return this.l;
    }

    @Override // defpackage.jyd
    public final int j() {
        return this.i;
    }
}
