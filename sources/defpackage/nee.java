package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class nee extends xmb<Short, short[], mee> {
    public static final nee c = new nee(oee.a);

    @Override // defpackage.m1
    public final int d(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        return sArr.length;
    }

    @Override // defpackage.n92, defpackage.m1
    public final void f(ul2 ul2Var, int i, Object obj) {
        mee meeVar = (mee) obj;
        meeVar.getClass();
        short sA = ul2Var.A(this.b, i);
        meeVar.b(meeVar.d() + 1);
        short[] sArr = meeVar.a;
        int i2 = meeVar.b;
        meeVar.b = i2 + 1;
        sArr[i2] = sA;
    }

    @Override // defpackage.m1
    public final Object g(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        mee meeVar = new mee();
        meeVar.a = sArr;
        meeVar.b = sArr.length;
        meeVar.b(10);
        return meeVar;
    }

    @Override // defpackage.xmb
    public final short[] j() {
        return new short[0];
    }

    @Override // defpackage.xmb
    public final void k(vl2 vl2Var, short[] sArr, int i) {
        short[] sArr2 = sArr;
        vl2Var.getClass();
        sArr2.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            vl2Var.g(this.b, i2, sArr2[i2]);
        }
    }
}
