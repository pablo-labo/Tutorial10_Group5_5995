package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class la2 extends x2b {
    public ga2 W;
    public final long f;
    public float V = 1.0f;
    public final long X = 9205357640488583168L;

    public la2(long j) {
        this.f = j;
    }

    @Override // defpackage.x2b
    public final boolean a(float f) {
        this.V = f;
        return true;
    }

    @Override // defpackage.x2b
    public final boolean c(ga2 ga2Var) {
        this.W = ga2Var;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof la2) {
            return da2.c(this.f, ((la2) obj).f);
        }
        return false;
    }

    @Override // defpackage.x2b
    public final long h() {
        return this.X;
    }

    public final int hashCode() {
        int i = da2.j;
        return Long.hashCode(this.f);
    }

    @Override // defpackage.x2b
    public final void i(gb4 gb4Var) {
        gb4.o1(gb4Var, this.f, 0L, 0L, this.V, this.W, 86);
    }

    public final String toString() {
        return "ColorPainter(color=" + ((Object) da2.i(this.f)) + ')';
    }
}
