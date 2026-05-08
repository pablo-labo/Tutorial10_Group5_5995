package defpackage;

import androidx.media3.common.a;

/* JADX INFO: loaded from: classes.dex */
public final class tpf {
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final a g;
    public final int h;
    public final long[] i;
    public final long[] j;
    public final int k;
    public final upf[] l;

    public tpf(int i, int i2, long j, long j2, long j3, long j4, a aVar, int i3, upf[] upfVarArr, int i4, long[] jArr, long[] jArr2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = aVar;
        this.h = i3;
        this.l = upfVarArr;
        this.k = i4;
        this.i = jArr;
        this.j = jArr2;
    }

    public final tpf a(a aVar) {
        return new tpf(this.a, this.b, this.c, this.d, this.e, this.f, aVar, this.h, this.l, this.k, this.i, this.j);
    }
}
