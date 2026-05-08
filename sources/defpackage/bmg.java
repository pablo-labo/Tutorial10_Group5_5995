package defpackage;

import defpackage.zxd;

/* JADX INFO: loaded from: classes.dex */
public final class bmg implements jyd {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;
    public final int e;

    public bmg(long[] jArr, long[] jArr2, long j, long j2, long j3, int i) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j3;
        this.e = i;
    }

    @Override // defpackage.jyd
    public final long a(long j) {
        return this.a[vjg.e(this.b, j, true)];
    }

    @Override // defpackage.zxd
    public final zxd.a e(long j) {
        long[] jArr = this.a;
        int iE = vjg.e(jArr, j, true);
        long j2 = jArr[iE];
        long[] jArr2 = this.b;
        byd bydVar = new byd(j2, jArr2[iE]);
        if (j2 >= j || iE == jArr.length - 1) {
            return new zxd.a(bydVar, bydVar);
        }
        int i = iE + 1;
        return new zxd.a(bydVar, new byd(jArr[i], jArr2[i]));
    }

    @Override // defpackage.jyd
    public final long g() {
        return this.d;
    }

    @Override // defpackage.zxd
    public final boolean h() {
        return true;
    }

    @Override // defpackage.jyd
    public final int j() {
        return this.e;
    }

    @Override // defpackage.zxd
    public final long k() {
        return this.c;
    }
}
