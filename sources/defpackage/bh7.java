package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bh7 extends xmb<Integer, int[], ah7> {
    public static final bh7 c = new bh7(rh7.a);

    @Override // defpackage.m1
    public final int d(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        return iArr.length;
    }

    @Override // defpackage.n92, defpackage.m1
    public final void f(ul2 ul2Var, int i, Object obj) {
        ah7 ah7Var = (ah7) obj;
        ah7Var.getClass();
        int iM = ul2Var.m(this.b, i);
        ah7Var.b(ah7Var.d() + 1);
        int[] iArr = ah7Var.a;
        int i2 = ah7Var.b;
        ah7Var.b = i2 + 1;
        iArr[i2] = iM;
    }

    @Override // defpackage.m1
    public final Object g(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        ah7 ah7Var = new ah7();
        ah7Var.a = iArr;
        ah7Var.b = iArr.length;
        ah7Var.b(10);
        return ah7Var;
    }

    @Override // defpackage.xmb
    public final int[] j() {
        return new int[0];
    }

    @Override // defpackage.xmb
    public final void k(vl2 vl2Var, int[] iArr, int i) {
        int[] iArr2 = iArr;
        vl2Var.getClass();
        iArr2.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            vl2Var.r(i2, iArr2[i2], this.b);
        }
    }
}
