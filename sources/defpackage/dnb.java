package defpackage;

import defpackage.ax5;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class dnb extends ax5.a<Double> {
    public static final double[] d = new double[0];
    public double[] c;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        Double d2 = (Double) obj;
        if (d2 == null) {
            return;
        }
        double dFloatValue = d2.floatValue();
        int i2 = this.b;
        if (i > i2 || i < 0) {
            l5.s(bg.d(i, "Index ", " out of bounds."));
            return;
        }
        double[] dArr = this.c;
        if (i2 == dArr.length) {
            this.c = Arrays.copyOf(dArr, i2 + (i2 >> 1) + 1);
        }
        double[] dArr2 = this.c;
        System.arraycopy(dArr2, i, dArr2, i + 1, this.b - i);
        this.c[i] = dFloatValue;
        this.b++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.b = 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (i < this.b) {
            return Double.valueOf(this.c[i]);
        }
        l5.s(bg.d(i, "Index ", " out of bounds."));
        return null;
    }

    @Override // defpackage.vw5
    public final Object peek() {
        int i = this.b;
        double[] dArr = this.c;
        if (i < dArr.length) {
            return Double.valueOf(dArr[i]);
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
        double[] dArr = this.c;
        double d2 = dArr[i];
        int i3 = i2 - 1;
        this.b = i3;
        System.arraycopy(dArr, i + 1, dArr, i, i3 - i);
        return Double.valueOf(d2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Double d2 = (Double) obj;
        if (d2 == null) {
            return null;
        }
        double dFloatValue = d2.floatValue();
        if (i >= this.b) {
            l5.s(bg.d(i, "Index ", " out of bounds."));
            return null;
        }
        double[] dArr = this.c;
        double d3 = dArr[i];
        dArr[i] = dFloatValue;
        return Double.valueOf(d3);
    }
}
