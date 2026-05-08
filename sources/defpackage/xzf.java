package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xzf extends xmb<uzf, vzf, wzf> {
    public static final xzf c = new xzf(yzf.a);

    @Override // defpackage.m1
    public final int d(Object obj) {
        return ((vzf) obj).a.length;
    }

    @Override // defpackage.n92, defpackage.m1
    public final void f(ul2 ul2Var, int i, Object obj) {
        wzf wzfVar = (wzf) obj;
        wzfVar.getClass();
        byte bH = ul2Var.d(this.b, i).H();
        wzfVar.b(wzfVar.d() + 1);
        byte[] bArr = wzfVar.a;
        int i2 = wzfVar.b;
        wzfVar.b = i2 + 1;
        bArr[i2] = bH;
    }

    @Override // defpackage.m1
    public final Object g(Object obj) {
        byte[] bArr = ((vzf) obj).a;
        wzf wzfVar = new wzf();
        wzfVar.a = bArr;
        wzfVar.b = bArr.length;
        wzfVar.b(10);
        return wzfVar;
    }

    @Override // defpackage.xmb
    public final vzf j() {
        return new vzf(new byte[0]);
    }

    @Override // defpackage.xmb
    public final void k(vl2 vl2Var, vzf vzfVar, int i) {
        byte[] bArr = vzfVar.a;
        vl2Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            vl2Var.l(this.b, i2).e(bArr[i2]);
        }
    }
}
