package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x42 {
    public int[] a;
    public int b;
    public int c;
    public int d;

    public x42(int i) {
        if (i < 1) {
            l5.q("capacity must be >= 1");
            throw null;
        }
        if (i > 1073741824) {
            l5.q("capacity must be <= 2^30");
            throw null;
        }
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        this.d = i - 1;
        this.a = new int[i];
    }

    public final void a(int i) {
        int[] iArr = this.a;
        int i2 = this.c;
        iArr[i2] = i;
        int i3 = this.d & (i2 + 1);
        this.c = i3;
        int i4 = this.b;
        if (i3 == i4) {
            int length = iArr.length;
            int i5 = length - i4;
            int i6 = length << 1;
            if (i6 < 0) {
                b0.o("Max array capacity exceeded");
                return;
            }
            int[] iArr2 = new int[i6];
            pyd.h(0, i4, length, iArr, iArr2);
            pyd.h(i5, 0, this.b, this.a, iArr2);
            this.a = iArr2;
            this.b = 0;
            this.c = length;
            this.d = i6 - 1;
        }
    }

    public final int b() {
        int i = this.b;
        if (i == this.c) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i2 = this.a[i];
        this.b = (i + 1) & this.d;
        return i2;
    }

    public x42() {
        this(8);
    }
}
