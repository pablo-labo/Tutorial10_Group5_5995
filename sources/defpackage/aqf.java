package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class aqf {
    public final tpf a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;

    public aqf(tpf tpfVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        ka2.l(iArr.length == jArr2.length);
        ka2.l(jArr.length == jArr2.length);
        ka2.l(iArr2.length == jArr2.length);
        this.a = tpfVar;
        this.c = jArr;
        this.d = iArr;
        this.e = i;
        this.f = jArr2;
        this.g = iArr2;
        this.h = j;
        this.b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j) {
        long[] jArr = this.f;
        for (int iA = vjg.a(jArr, j, true); iA < jArr.length; iA++) {
            if ((this.g[iA] & 1) != 0) {
                return iA;
            }
        }
        return -1;
    }
}
