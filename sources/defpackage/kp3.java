package defpackage;

import defpackage.zxd;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class kp3 implements cpa {
    public final bpa a;
    public final long b;
    public final long c;
    public final nue d;
    public int e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;

    public final class a implements zxd {
        public a() {
        }

        @Override // defpackage.zxd
        public final zxd.a e(long j) {
            kp3 kp3Var = kp3.this;
            long j2 = (((long) kp3Var.d.i) * j) / 1000000;
            long j3 = kp3Var.b;
            BigInteger bigIntegerValueOf = BigInteger.valueOf(j2);
            long j4 = kp3Var.c;
            byd bydVar = new byd(j, vjg.j((bigIntegerValueOf.multiply(BigInteger.valueOf(j4 - j3)).divide(BigInteger.valueOf(kp3Var.f)).longValue() + j3) - 30000, kp3Var.b, j4 - 1));
            return new zxd.a(bydVar, bydVar);
        }

        @Override // defpackage.zxd
        public final boolean h() {
            return true;
        }

        @Override // defpackage.zxd
        public final long k() {
            kp3 kp3Var = kp3.this;
            return (kp3Var.f * 1000000) / ((long) kp3Var.d.i);
        }
    }

    public kp3(nue nueVar, long j, long j2, long j3, long j4, boolean z) {
        ka2.l(j >= 0 && j2 > j);
        this.d = nueVar;
        this.b = j;
        this.c = j2;
        if (j3 == j2 - j || z) {
            this.f = j4;
            this.e = 4;
        } else {
            this.e = 0;
        }
        this.a = new bpa();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c2  */
    @Override // defpackage.cpa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(defpackage.n55 r28) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kp3.a(n55):long");
    }

    @Override // defpackage.cpa
    public final zxd b() {
        if (this.f != 0) {
            return new a();
        }
        return null;
    }

    @Override // defpackage.cpa
    public final void c(long j) {
        this.h = vjg.j(j, 0L, this.f - 1);
        this.e = 2;
        this.i = this.b;
        this.j = this.c;
        this.k = 0L;
        this.l = this.f;
    }
}
