package defpackage;

import defpackage.zxd;

/* JADX INFO: loaded from: classes.dex */
public final class v5h implements jyd {
    public final long a;
    public final int b;
    public final long c;
    public final int d;
    public final long e;
    public final long f;
    public final long[] g;

    public v5h(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = i2;
        this.e = j3;
        this.g = jArr;
        this.f = j3 != -1 ? j + j3 : -1L;
    }

    @Override // defpackage.jyd
    public final long a(long j) {
        long j2 = j - this.a;
        if (!h() || j2 <= this.b) {
            return 0L;
        }
        long[] jArr = this.g;
        ka2.r(jArr);
        double d = (j2 * 256.0d) / this.e;
        int iE = vjg.e(jArr, (long) d, true);
        long j3 = this.c;
        long j4 = (((long) iE) * j3) / 100;
        long j5 = jArr[iE];
        int i = iE + 1;
        long j6 = (j3 * ((long) i)) / 100;
        return Math.round((j5 == (iE == 99 ? 256L : jArr[i]) ? 0.0d : (d - j5) / (r0 - j5)) * (j6 - j4)) + j4;
    }

    @Override // defpackage.zxd
    public final zxd.a e(long j) {
        double d;
        double d2;
        boolean zH = h();
        int i = this.b;
        long j2 = this.a;
        if (!zH) {
            byd bydVar = new byd(0L, j2 + ((long) i));
            return new zxd.a(bydVar, bydVar);
        }
        long j3 = vjg.j(j, 0L, this.c);
        double d3 = (j3 * 100.0d) / this.c;
        double d4 = 0.0d;
        if (d3 <= 0.0d) {
            d = 256.0d;
        } else if (d3 >= 100.0d) {
            d = 256.0d;
            d4 = 256.0d;
        } else {
            int i2 = (int) d3;
            long[] jArr = this.g;
            ka2.r(jArr);
            double d5 = jArr[i2];
            if (i2 == 99) {
                d = 256.0d;
                d2 = 256.0d;
            } else {
                d = 256.0d;
                d2 = jArr[i2 + 1];
            }
            d4 = ((d2 - d5) * (d3 - ((double) i2))) + d5;
        }
        long j4 = this.e;
        byd bydVar2 = new byd(j3, j2 + vjg.j(Math.round((d4 / d) * j4), i, j4 - 1));
        return new zxd.a(bydVar2, bydVar2);
    }

    @Override // defpackage.jyd
    public final long g() {
        return this.f;
    }

    @Override // defpackage.zxd
    public final boolean h() {
        return this.g != null;
    }

    @Override // defpackage.jyd
    public final int j() {
        return this.d;
    }

    @Override // defpackage.zxd
    public final long k() {
        return this.c;
    }
}
