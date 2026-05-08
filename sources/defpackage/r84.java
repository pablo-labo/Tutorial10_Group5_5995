package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class r84 extends xmb<Double, double[], q84> {
    public static final r84 c = new r84(y84.a);

    @Override // defpackage.m1
    public final int d(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        return dArr.length;
    }

    @Override // defpackage.n92, defpackage.m1
    public final void f(ul2 ul2Var, int i, Object obj) {
        q84 q84Var = (q84) obj;
        q84Var.getClass();
        double dG = ul2Var.G(this.b, i);
        q84Var.b(q84Var.d() + 1);
        double[] dArr = q84Var.a;
        int i2 = q84Var.b;
        q84Var.b = i2 + 1;
        dArr[i2] = dG;
    }

    @Override // defpackage.m1
    public final Object g(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        q84 q84Var = new q84();
        q84Var.a = dArr;
        q84Var.b = dArr.length;
        q84Var.b(10);
        return q84Var;
    }

    @Override // defpackage.xmb
    public final double[] j() {
        return new double[0];
    }

    @Override // defpackage.xmb
    public final void k(vl2 vl2Var, double[] dArr, int i) {
        double[] dArr2 = dArr;
        vl2Var.getClass();
        dArr2.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            vl2Var.C(this.b, i2, dArr2[i2]);
        }
    }
}
