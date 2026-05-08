package defpackage;

import defpackage.zxd;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class n42 implements zxd {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;

    public n42(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length <= 0) {
            this.f = 0L;
        } else {
            int i = length - 1;
            this.f = jArr2[i] + jArr3[i];
        }
    }

    @Override // defpackage.zxd
    public final zxd.a e(long j) {
        long[] jArr = this.e;
        int iE = vjg.e(jArr, j, true);
        long j2 = jArr[iE];
        long[] jArr2 = this.c;
        byd bydVar = new byd(j2, jArr2[iE]);
        if (j2 >= j || iE == this.a - 1) {
            return new zxd.a(bydVar, bydVar);
        }
        int i = iE + 1;
        return new zxd.a(bydVar, new byd(jArr[i], jArr2[i]));
    }

    @Override // defpackage.zxd
    public final boolean h() {
        return true;
    }

    @Override // defpackage.zxd
    public final long k() {
        return this.f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(this.c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
