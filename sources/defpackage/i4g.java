package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class i4g extends xmb<f4g, g4g, h4g> {
    public static final i4g c = new i4g(j4g.a);

    @Override // defpackage.m1
    public final int d(Object obj) {
        return ((g4g) obj).a.length;
    }

    @Override // defpackage.n92, defpackage.m1
    public final void f(ul2 ul2Var, int i, Object obj) {
        h4g h4gVar = (h4g) obj;
        h4gVar.getClass();
        int iK = ul2Var.d(this.b, i).k();
        h4gVar.b(h4gVar.d() + 1);
        int[] iArr = h4gVar.a;
        int i2 = h4gVar.b;
        h4gVar.b = i2 + 1;
        iArr[i2] = iK;
    }

    @Override // defpackage.m1
    public final Object g(Object obj) {
        int[] iArr = ((g4g) obj).a;
        h4g h4gVar = new h4g();
        h4gVar.a = iArr;
        h4gVar.b = iArr.length;
        h4gVar.b(10);
        return h4gVar;
    }

    @Override // defpackage.xmb
    public final g4g j() {
        return new g4g(new int[0]);
    }

    @Override // defpackage.xmb
    public final void k(vl2 vl2Var, g4g g4gVar, int i) {
        int[] iArr = g4gVar.a;
        vl2Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            vl2Var.l(this.b, i2).A(iArr[i2]);
        }
    }
}
