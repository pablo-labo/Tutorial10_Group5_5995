package defpackage;

import defpackage.ax5;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class cnb extends ax5.a<Boolean> {
    public static final byte[] d = new byte[0];
    public byte[] c;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        byte[] bArr;
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            return;
        }
        boolean zBooleanValue = bool.booleanValue();
        int i3 = this.b;
        if (i > i3 || i < 0) {
            l5.s(bg.d(i, "Index ", " out of bounds."));
            return;
        }
        byte[] bArr2 = this.c;
        if (i3 == bArr2.length * 8) {
            this.c = Arrays.copyOf(bArr2, bArr2.length + (bArr2.length >> 1) + 1);
        }
        int i4 = this.b + 1;
        this.b = i4;
        int i5 = i4 / 8;
        while (true) {
            i2 = i / 8;
            bArr = this.c;
            if (i5 <= i2) {
                break;
            }
            byte b = (byte) (bArr[i5] << 1);
            bArr[i5] = b;
            if (i5 > 0 && (bArr[i5 - 1] & 256) > 0) {
                bArr[i5] = (byte) (b | 1);
            }
            i5--;
        }
        byte b2 = (byte) (1 << (i % 8));
        int i6 = b2 - 1;
        byte b3 = (byte) (~(b2 + i6));
        byte b4 = bArr[i2];
        byte b5 = (byte) ((b3 & b4) << 1);
        byte b6 = (byte) (((byte) i6) & b4);
        if (zBooleanValue) {
            bArr[i2] = (byte) (b2 | b6 | b5);
        } else {
            bArr[i2] = (byte) (b5 | b6);
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.b = 0;
    }

    public final boolean f(int i, boolean z) {
        if (i >= this.b) {
            l5.s(bg.d(i, "Index ", " out of bounds."));
            return false;
        }
        byte[] bArr = this.c;
        int i2 = i / 8;
        byte b = bArr[i2];
        int i3 = 1 << (i % 8);
        boolean z2 = (b & i3) > 0;
        if (z) {
            bArr[i2] = (byte) (i3 | b);
            return z2;
        }
        bArr[i2] = (byte) ((255 - i3) & b);
        return z2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (i < this.b) {
            return Boolean.valueOf((this.c[i / 8] & (1 << (i % 8))) > 0);
        }
        l5.s(bg.d(i, "Index ", " out of bounds."));
        return null;
    }

    @Override // defpackage.vw5
    public final Object peek() {
        int i = this.b;
        byte[] bArr = this.c;
        if (i < bArr.length * 8) {
            return Boolean.valueOf((bArr[i / 8] & (1 << (i % 8))) > 0);
        }
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2 = this.b;
        if (i >= i2) {
            l5.s(bg.d(i, "Index ", " out of bounds."));
            return null;
        }
        byte[] bArr = this.c;
        int i3 = i / 8;
        boolean z = (bArr[i3] & (1 << (i % 8))) > 0;
        this.b = i2 - 1;
        int i4 = i3 + 1;
        byte b = i4 < bArr.length ? (byte) ((bArr[i4] & 1) << 7) : (byte) 0;
        while (true) {
            int i5 = this.b / 8;
            byte[] bArr2 = this.c;
            if (i4 > i5) {
                byte b2 = (byte) ((1 << ((i + 1) % 8)) - 1);
                byte b3 = (byte) (~b2);
                byte b4 = bArr2[i3];
                bArr2[i3] = (byte) ((((b2 & 255) >>> 1) & b4) | (b3 & (b4 >> 1)) | b);
                return Boolean.valueOf(z);
            }
            byte b5 = (byte) ((bArr2[i4] & 255) >>> 1);
            bArr2[i4] = b5;
            int i6 = i4 + 1;
            if (i6 < bArr2.length && (bArr2[i6] & 1) == 1) {
                bArr2[i4] = (byte) (b5 | 128);
            }
            i4 = i6;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(f(i, bool.booleanValue()));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            return false;
        }
        boolean zBooleanValue = bool.booleanValue();
        int i = this.b;
        byte[] bArr = this.c;
        if (i == bArr.length * 8) {
            this.c = Arrays.copyOf(bArr, bArr.length + (bArr.length >> 1) + 1);
        }
        int i2 = this.b;
        this.b = i2 + 1;
        f(i2, zBooleanValue);
        return true;
    }
}
