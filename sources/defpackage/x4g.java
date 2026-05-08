package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class x4g extends xmb<u4g, v4g, w4g> {
    public static final x4g c = new x4g(y4g.a);

    @Override // defpackage.m1
    public final int d(Object obj) {
        return ((v4g) obj).a.length;
    }

    @Override // defpackage.n92, defpackage.m1
    public final void f(ul2 ul2Var, int i, Object obj) {
        w4g w4gVar = (w4g) obj;
        w4gVar.getClass();
        short sT = ul2Var.d(this.b, i).t();
        w4gVar.b(w4gVar.d() + 1);
        short[] sArr = w4gVar.a;
        int i2 = w4gVar.b;
        w4gVar.b = i2 + 1;
        sArr[i2] = sT;
    }

    @Override // defpackage.m1
    public final Object g(Object obj) {
        short[] sArr = ((v4g) obj).a;
        w4g w4gVar = new w4g();
        w4gVar.a = sArr;
        w4gVar.b = sArr.length;
        w4gVar.b(10);
        return w4gVar;
    }

    @Override // defpackage.xmb
    public final v4g j() {
        return new v4g(new short[0]);
    }

    @Override // defpackage.xmb
    public final void k(vl2 vl2Var, v4g v4gVar, int i) {
        short[] sArr = v4gVar.a;
        vl2Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            vl2Var.l(this.b, i2).o(sArr[i2]);
        }
    }
}
