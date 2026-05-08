package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class rtc {
    public long[] a;
    public long[] b;
    public int c;

    public final void a(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2) {
        long[] jArr = this.a;
        int i7 = this.c;
        int i8 = i7 + 3;
        this.c = i8;
        int length = jArr.length;
        if (length <= i8) {
            int iMax = Math.max(length * 2, i8);
            this.a = Arrays.copyOf(jArr, iMax);
            this.b = Arrays.copyOf(this.b, iMax);
        }
        long[] jArr2 = this.a;
        jArr2[i7] = (((long) i2) << 32) | (((long) i3) & 4294967295L);
        jArr2[i7 + 1] = (((long) i4) << 32) | (((long) i5) & 4294967295L);
        int i9 = i6 & 67108863;
        jArr2[i7 + 2] = ((z2 ? 1L : 0L) << 63) | ((z ? 1L : 0L) << 62) | 2305843009213693952L | (((long) i9) << 26) | ((long) (i & 67108863));
        if (i6 < 0) {
            return;
        }
        for (int i10 = i7 - 3; i10 >= 0; i10 -= 3) {
            int i11 = i10 + 2;
            long j = jArr2[i11];
            if ((((int) j) & 67108863) == i9) {
                jArr2[i11] = (j & (-2301339409586323457L)) | (((long) ((i7 - i10) & 511)) << 52);
                return;
            }
        }
    }

    public final void b(int i, xu5 xu5Var) {
        int i2 = i & 67108863;
        long[] jArr = this.a;
        int i3 = this.c;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            if ((((int) jArr[i4 + 2]) & 67108863) == i2) {
                long j = jArr[i4];
                long j2 = jArr[i4 + 1];
                xu5Var.j(Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2));
                return;
            }
        }
    }
}
