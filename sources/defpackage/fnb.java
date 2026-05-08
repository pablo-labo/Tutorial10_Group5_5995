package defpackage;

import defpackage.ax5;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class fnb extends ax5.a<Integer> {
    public static final int[] d = new int[0];
    public int[] c;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        Integer num = (Integer) obj;
        if (num == null) {
            return;
        }
        int iIntValue = num.intValue();
        int i2 = this.b;
        if (i > i2 || i < 0) {
            l5.s(bg.d(i, "Index ", " out of bounds."));
            return;
        }
        int[] iArr = this.c;
        if (i2 == iArr.length) {
            this.c = Arrays.copyOf(iArr, i2 + (i2 >> 1) + 1);
        }
        int[] iArr2 = this.c;
        System.arraycopy(iArr2, i, iArr2, i + 1, this.b - i);
        this.c[i] = iIntValue;
        this.b++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.b = 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (i < this.b) {
            return Integer.valueOf(this.c[i]);
        }
        l5.s(bg.d(i, "Index ", " out of bounds."));
        return null;
    }

    @Override // defpackage.vw5
    public final Object peek() {
        int i = this.b;
        int[] iArr = this.c;
        if (i < iArr.length) {
            return Integer.valueOf(iArr[i]);
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
        int[] iArr = this.c;
        int i3 = iArr[i];
        int i4 = i2 - 1;
        this.b = i4;
        System.arraycopy(iArr, i + 1, iArr, i, i4 - i);
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Integer num = (Integer) obj;
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        if (i >= this.b) {
            l5.s(bg.d(i, "Index ", " out of bounds."));
            return null;
        }
        int[] iArr = this.c;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }
}
