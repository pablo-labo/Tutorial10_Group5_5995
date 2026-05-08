package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class q22 extends xmb<Character, char[], o22> {
    public static final q22 c = new q22(x22.a);

    @Override // defpackage.m1
    public final int d(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        return cArr.length;
    }

    @Override // defpackage.n92, defpackage.m1
    public final void f(ul2 ul2Var, int i, Object obj) {
        o22 o22Var = (o22) obj;
        o22Var.getClass();
        char cG = ul2Var.g(this.b, i);
        o22Var.b(o22Var.d() + 1);
        char[] cArr = o22Var.a;
        int i2 = o22Var.b;
        o22Var.b = i2 + 1;
        cArr[i2] = cG;
    }

    @Override // defpackage.m1
    public final Object g(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        o22 o22Var = new o22();
        o22Var.a = cArr;
        o22Var.b = cArr.length;
        o22Var.b(10);
        return o22Var;
    }

    @Override // defpackage.xmb
    public final char[] j() {
        return new char[0];
    }

    @Override // defpackage.xmb
    public final void k(vl2 vl2Var, char[] cArr, int i) {
        char[] cArr2 = cArr;
        vl2Var.getClass();
        cArr2.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            vl2Var.z(this.b, i2, cArr2[i2]);
        }
    }
}
