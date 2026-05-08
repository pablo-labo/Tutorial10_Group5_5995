package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lse<T> extends rse {
    public r3 c;
    public int d;
    public int e;

    public lse(long j, r3 r3Var) {
        super(j);
        this.c = r3Var;
    }

    @Override // defpackage.rse
    public final void a(rse rseVar) {
        synchronized (ak2.a0) {
            rseVar.getClass();
            this.c = ((lse) rseVar).c;
            this.d = ((lse) rseVar).d;
            this.e = ((lse) rseVar).e;
            j6g j6gVar = j6g.a;
        }
    }

    @Override // defpackage.rse
    public final rse b() {
        return c(ame.j().g());
    }

    @Override // defpackage.rse
    public final rse c(long j) {
        return new lse(j, this.c);
    }
}
