package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rt3 implements oa2 {
    public final /* synthetic */ vt3 a;

    public rt3(vt3 vt3Var) {
        this.a = vt3Var;
    }

    @Override // defpackage.oa2
    public final long a() {
        vt3 vt3Var = this.a;
        long jA = vt3Var.i0.a();
        if (jA != 16) {
            return jA;
        }
        jdd jddVar = (jdd) om2.a(vt3Var, rdd.b);
        if (jddVar != null) {
            long j = jddVar.a;
            if (j != 16) {
                return j;
            }
        }
        return ((da2) om2.a(vt3Var, qs2.a)).a;
    }
}
