package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pde extends i4<nde<?>> {
    public long a = -1;
    public qw1 b;

    @Override // defpackage.i4
    public final boolean a(g4 g4Var) {
        nde ndeVar = (nde) g4Var;
        if (this.a >= 0) {
            return false;
        }
        long j = ndeVar.X;
        if (j < ndeVar.Y) {
            ndeVar.Y = j;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.i4
    public final lu2[] b(g4 g4Var) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((nde) g4Var).y(j);
    }
}
