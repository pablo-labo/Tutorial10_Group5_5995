package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class fa1 implements mg9 {
    public final long b;
    public final long c;
    public long d;

    public fa1(long j, long j2) {
        this.b = j;
        this.c = j2;
        this.d = j - 1;
    }

    public final void c() {
        long j = this.d;
        if (j < this.b || j > this.c) {
            k20.p();
        }
    }

    @Override // defpackage.mg9
    public final boolean next() {
        long j = this.d + 1;
        this.d = j;
        return !(j > this.c);
    }
}
