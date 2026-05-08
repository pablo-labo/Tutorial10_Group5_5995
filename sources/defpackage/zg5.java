package defpackage;

import defpackage.ah5;
import defpackage.zxd;

/* JADX INFO: loaded from: classes.dex */
public final class zg5 implements zxd {
    public final ah5 a;
    public final long b;

    public zg5(ah5 ah5Var, long j) {
        this.a = ah5Var;
        this.b = j;
    }

    @Override // defpackage.zxd
    public final zxd.a e(long j) {
        ah5 ah5Var = this.a;
        ka2.r(ah5Var.k);
        ah5.a aVar = ah5Var.k;
        long[] jArr = aVar.a;
        long[] jArr2 = aVar.b;
        int iE = vjg.e(jArr, vjg.j((((long) ah5Var.e) * j) / 1000000, 0L, ah5Var.j - 1), false);
        long j2 = iE == -1 ? 0L : jArr[iE];
        long j3 = iE != -1 ? jArr2[iE] : 0L;
        int i = ah5Var.e;
        long j4 = (j2 * 1000000) / ((long) i);
        long j5 = this.b;
        byd bydVar = new byd(j4, j3 + j5);
        if (j4 == j || iE == jArr.length - 1) {
            return new zxd.a(bydVar, bydVar);
        }
        int i2 = iE + 1;
        return new zxd.a(bydVar, new byd((jArr[i2] * 1000000) / ((long) i), j5 + jArr2[i2]));
    }

    @Override // defpackage.zxd
    public final boolean h() {
        return true;
    }

    @Override // defpackage.zxd
    public final long k() {
        return this.a.b();
    }
}
