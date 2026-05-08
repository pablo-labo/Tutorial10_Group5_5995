package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class d59 extends xmb<Long, long[], b59> {
    public static final d59 c = new d59(p59.a);

    @Override // defpackage.m1
    public final int d(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        return jArr.length;
    }

    @Override // defpackage.n92, defpackage.m1
    public final void f(ul2 ul2Var, int i, Object obj) {
        b59 b59Var = (b59) obj;
        b59Var.getClass();
        long jF = ul2Var.f(this.b, i);
        b59Var.b(b59Var.d() + 1);
        long[] jArr = b59Var.a;
        int i2 = b59Var.b;
        b59Var.b = i2 + 1;
        jArr[i2] = jF;
    }

    @Override // defpackage.m1
    public final Object g(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        b59 b59Var = new b59();
        b59Var.a = jArr;
        b59Var.b = jArr.length;
        b59Var.b(10);
        return b59Var;
    }

    @Override // defpackage.xmb
    public final long[] j() {
        return new long[0];
    }

    @Override // defpackage.xmb
    public final void k(vl2 vl2Var, long[] jArr, int i) {
        long[] jArr2 = jArr;
        vl2Var.getClass();
        jArr2.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            vl2Var.D(this.b, i2, jArr2[i2]);
        }
    }
}
