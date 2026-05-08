package defpackage;

import defpackage.ax5;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class gnb extends ax5.a<Long> {
    public static final long[] d = new long[0];
    public long[] c;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        Long l = (Long) obj;
        if (l == null) {
            return;
        }
        long jLongValue = l.longValue();
        int i2 = this.b;
        if (i > i2 || i < 0) {
            l5.s(bg.d(i, "Index ", " out of bounds."));
            return;
        }
        long[] jArr = this.c;
        if (i2 == jArr.length) {
            this.c = Arrays.copyOf(jArr, i2 + (i2 >> 1) + 1);
        }
        long[] jArr2 = this.c;
        System.arraycopy(jArr2, i, jArr2, i + 1, this.b - i);
        this.c[i] = jLongValue;
        this.b++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.b = 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (i < this.b) {
            return Long.valueOf(this.c[i]);
        }
        l5.s(bg.d(i, "Index ", " out of bounds."));
        return null;
    }

    @Override // defpackage.vw5
    public final Object peek() {
        int i = this.b;
        long[] jArr = this.c;
        if (i < jArr.length) {
            return Long.valueOf(jArr[i]);
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
        long[] jArr = this.c;
        long j = jArr[i];
        int i3 = i2 - 1;
        this.b = i3;
        System.arraycopy(jArr, i + 1, jArr, i, i3 - i);
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Long l = (Long) obj;
        if (l == null) {
            return null;
        }
        long jLongValue = l.longValue();
        if (i >= this.b) {
            l5.s(bg.d(i, "Index ", " out of bounds."));
            return null;
        }
        long[] jArr = this.c;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }
}
