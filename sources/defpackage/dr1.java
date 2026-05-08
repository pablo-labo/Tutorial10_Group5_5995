package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dr1 extends xmb<Byte, byte[], xq1> {
    public static final dr1 c = new dr1(qr1.a);

    @Override // defpackage.m1
    public final int d(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return bArr.length;
    }

    @Override // defpackage.n92, defpackage.m1
    public final void f(ul2 ul2Var, int i, Object obj) {
        xq1 xq1Var = (xq1) obj;
        xq1Var.getClass();
        byte bJ = ul2Var.j(this.b, i);
        xq1Var.b(xq1Var.d() + 1);
        byte[] bArr = xq1Var.a;
        int i2 = xq1Var.b;
        xq1Var.b = i2 + 1;
        bArr[i2] = bJ;
    }

    @Override // defpackage.m1
    public final Object g(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        xq1 xq1Var = new xq1();
        xq1Var.a = bArr;
        xq1Var.b = bArr.length;
        xq1Var.b(10);
        return xq1Var;
    }

    @Override // defpackage.xmb
    public final byte[] j() {
        return new byte[0];
    }

    @Override // defpackage.xmb
    public final void k(vl2 vl2Var, byte[] bArr, int i) {
        byte[] bArr2 = bArr;
        vl2Var.getClass();
        bArr2.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            vl2Var.f(this.b, i2, bArr2[i2]);
        }
    }
}
