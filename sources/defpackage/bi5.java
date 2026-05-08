package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bi5 extends xmb<Float, float[], ai5> {
    public static final bi5 c = new bi5(ei5.a);

    @Override // defpackage.m1
    public final int d(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        return fArr.length;
    }

    @Override // defpackage.n92, defpackage.m1
    public final void f(ul2 ul2Var, int i, Object obj) {
        ai5 ai5Var = (ai5) obj;
        ai5Var.getClass();
        float fV = ul2Var.v(this.b, i);
        ai5Var.b(ai5Var.d() + 1);
        float[] fArr = ai5Var.a;
        int i2 = ai5Var.b;
        ai5Var.b = i2 + 1;
        fArr[i2] = fV;
    }

    @Override // defpackage.m1
    public final Object g(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        ai5 ai5Var = new ai5();
        ai5Var.a = fArr;
        ai5Var.b = fArr.length;
        ai5Var.b(10);
        return ai5Var;
    }

    @Override // defpackage.xmb
    public final float[] j() {
        return new float[0];
    }

    @Override // defpackage.xmb
    public final void k(vl2 vl2Var, float[] fArr, int i) {
        float[] fArr2 = fArr;
        vl2Var.getClass();
        fArr2.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            vl2Var.q(this.b, i2, fArr2[i2]);
        }
    }
}
