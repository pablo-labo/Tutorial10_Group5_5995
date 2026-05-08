package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class st3 implements oa2 {
    public final /* synthetic */ wt3 a;

    public st3(wt3 wt3Var) {
        this.a = wt3Var;
    }

    @Override // defpackage.oa2
    public final long a() {
        wt3 wt3Var = this.a;
        long jA = wt3Var.i0.a();
        if (jA != 16) {
            return jA;
        }
        kdd kddVar = (kdd) om2.a(wt3Var, sdd.a);
        if (kddVar != null) {
            long j = kddVar.a;
            if (j != 16) {
                return j;
            }
        }
        long j2 = ((da2) om2.a(wt3Var, ps2.a)).a;
        return (((kb2) om2.a(wt3Var, lb2.a)).g() || ((double) pnb.J(j2)) >= 0.5d) ? j2 : da2.e;
    }
}
