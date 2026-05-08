package defpackage;

import defpackage.zxd;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
public final class iug implements zxd {
    public final gug a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public iug(gug gugVar, int i, long j, long j2) {
        this.a = gugVar;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / ((long) gugVar.c);
        this.d = j3;
        this.e = b(j3);
    }

    public final long b(long j) {
        long j2 = j * ((long) this.b);
        long j3 = this.a.b;
        String str = vjg.a;
        return vjg.X(j2, 1000000L, j3, RoundingMode.DOWN);
    }

    @Override // defpackage.zxd
    public final zxd.a e(long j) {
        gug gugVar = this.a;
        long j2 = (((long) gugVar.b) * j) / (((long) this.b) * 1000000);
        long j3 = this.d - 1;
        long j4 = vjg.j(j2, 0L, j3);
        int i = gugVar.c;
        long j5 = this.c;
        long jB = b(j4);
        byd bydVar = new byd(jB, (((long) i) * j4) + j5);
        if (jB >= j || j4 == j3) {
            return new zxd.a(bydVar, bydVar);
        }
        long j6 = j4 + 1;
        return new zxd.a(bydVar, new byd(b(j6), (((long) i) * j6) + j5));
    }

    @Override // defpackage.zxd
    public final boolean h() {
        return true;
    }

    @Override // defpackage.zxd
    public final long k() {
        return this.e;
    }
}
