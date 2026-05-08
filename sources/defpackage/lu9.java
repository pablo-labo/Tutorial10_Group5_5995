package defpackage;

import android.util.Pair;
import defpackage.zxd;

/* JADX INFO: loaded from: classes.dex */
public final class lu9 implements jyd {
    public final long[] a;
    public final long[] b;
    public final long c;

    public lu9(long j, long[] jArr, long[] jArr2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? vjg.O(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair<Long, Long> b(long j, long[] jArr, long[] jArr2) {
        int iE = vjg.e(jArr, j, true);
        long j2 = jArr[iE];
        long j3 = jArr2[iE];
        int i = iE + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i] == j2 ? 0.0d : (j - j2) / (r6 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // defpackage.jyd
    public final long a(long j) {
        return vjg.O(((Long) b(j, this.a, this.b).second).longValue());
    }

    @Override // defpackage.zxd
    public final zxd.a e(long j) {
        Pair<Long, Long> pairB = b(vjg.c0(vjg.j(j, 0L, this.c)), this.b, this.a);
        byd bydVar = new byd(vjg.O(((Long) pairB.first).longValue()), ((Long) pairB.second).longValue());
        return new zxd.a(bydVar, bydVar);
    }

    @Override // defpackage.jyd
    public final long g() {
        return -1L;
    }

    @Override // defpackage.zxd
    public final boolean h() {
        return true;
    }

    @Override // defpackage.jyd
    public final int j() {
        return -2147483647;
    }

    @Override // defpackage.zxd
    public final long k() {
        return this.c;
    }
}
