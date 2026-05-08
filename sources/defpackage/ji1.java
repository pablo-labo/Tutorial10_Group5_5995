package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ji1 extends xmb<Boolean, boolean[], ii1> {
    public static final ji1 c = new ji1(ni1.a);

    @Override // defpackage.m1
    public final int d(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        return zArr.length;
    }

    @Override // defpackage.n92, defpackage.m1
    public final void f(ul2 ul2Var, int i, Object obj) {
        ii1 ii1Var = (ii1) obj;
        ii1Var.getClass();
        boolean zE = ul2Var.E(this.b, i);
        ii1Var.b(ii1Var.d() + 1);
        boolean[] zArr = ii1Var.a;
        int i2 = ii1Var.b;
        ii1Var.b = i2 + 1;
        zArr[i2] = zE;
    }

    @Override // defpackage.m1
    public final Object g(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        ii1 ii1Var = new ii1();
        ii1Var.a = zArr;
        ii1Var.b = zArr.length;
        ii1Var.b(10);
        return ii1Var;
    }

    @Override // defpackage.xmb
    public final boolean[] j() {
        return new boolean[0];
    }

    @Override // defpackage.xmb
    public final void k(vl2 vl2Var, boolean[] zArr, int i) {
        boolean[] zArr2 = zArr;
        vl2Var.getClass();
        zArr2.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            vl2Var.w(this.b, i2, zArr2[i2]);
        }
    }
}
