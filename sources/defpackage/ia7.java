package defpackage;

import defpackage.zxd;

/* JADX INFO: loaded from: classes.dex */
public final class ia7 implements zxd {
    public final a59 a;
    public final a59 b;
    public long c;

    public ia7(long j, long[] jArr, long[] jArr2) {
        ka2.l(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.a = new a59(length);
            this.b = new a59(length);
        } else {
            int i = length + 1;
            a59 a59Var = new a59(i);
            this.a = a59Var;
            a59 a59Var2 = new a59(i);
            this.b = a59Var2;
            a59Var.a(0L);
            a59Var2.a(0L);
        }
        this.a.b(jArr);
        this.b.b(jArr2);
        this.c = j;
    }

    @Override // defpackage.zxd
    public final zxd.a e(long j) {
        a59 a59Var = this.b;
        if (a59Var.a == 0) {
            byd bydVar = byd.c;
            return new zxd.a(bydVar, bydVar);
        }
        int iB = vjg.b(a59Var, j);
        long jC = a59Var.c(iB);
        a59 a59Var2 = this.a;
        byd bydVar2 = new byd(jC, a59Var2.c(iB));
        if (jC == j || iB == a59Var.a - 1) {
            return new zxd.a(bydVar2, bydVar2);
        }
        int i = iB + 1;
        return new zxd.a(bydVar2, new byd(a59Var.c(i), a59Var2.c(i)));
    }

    @Override // defpackage.zxd
    public final boolean h() {
        return this.b.a > 0;
    }

    @Override // defpackage.zxd
    public final long k() {
        return this.c;
    }
}
