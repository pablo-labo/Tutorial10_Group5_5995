package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class o4g extends xmb<l4g, m4g, n4g> {
    public static final o4g c = new o4g(p4g.a);

    @Override // defpackage.m1
    public final int d(Object obj) {
        return ((m4g) obj).a.length;
    }

    @Override // defpackage.n92, defpackage.m1
    public final void f(ul2 ul2Var, int i, Object obj) {
        n4g n4gVar = (n4g) obj;
        n4gVar.getClass();
        long jN = ul2Var.d(this.b, i).n();
        n4gVar.b(n4gVar.d() + 1);
        long[] jArr = n4gVar.a;
        int i2 = n4gVar.b;
        n4gVar.b = i2 + 1;
        jArr[i2] = jN;
    }

    @Override // defpackage.m1
    public final Object g(Object obj) {
        long[] jArr = ((m4g) obj).a;
        n4g n4gVar = new n4g();
        n4gVar.a = jArr;
        n4gVar.b = jArr.length;
        n4gVar.b(10);
        return n4gVar;
    }

    @Override // defpackage.xmb
    public final m4g j() {
        return new m4g(new long[0]);
    }

    @Override // defpackage.xmb
    public final void k(vl2 vl2Var, m4g m4gVar, int i) {
        long[] jArr = m4gVar.a;
        vl2Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            vl2Var.l(this.b, i2).j(jArr[i2]);
        }
    }
}
