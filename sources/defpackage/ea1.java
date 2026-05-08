package defpackage;

import androidx.media3.datasource.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class ea1 extends lg9 {
    public final long k;
    public final long l;
    public ga1 m;
    public int[] n;

    public ea1(a aVar, gf3 gf3Var, androidx.media3.common.a aVar2, int i, Object obj, long j, long j2, long j3, long j4, long j5) {
        super(aVar, gf3Var, aVar2, i, obj, j, j2, j5);
        this.k = j3;
        this.l = j4;
    }

    public final int e(int i) {
        int[] iArr = this.n;
        ka2.r(iArr);
        return iArr[i];
    }
}
