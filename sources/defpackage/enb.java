package defpackage;

import defpackage.ax5;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class enb extends ax5.a<Float> {
    public static final float[] d = new float[0];
    public float[] c;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        Float f = (Float) obj;
        if (f == null) {
            return;
        }
        float fFloatValue = f.floatValue();
        int i2 = this.b;
        if (i > i2 || i < 0) {
            l5.s(bg.d(i, "Index ", " out of bounds."));
            return;
        }
        float[] fArr = this.c;
        if (i2 == fArr.length) {
            this.c = Arrays.copyOf(fArr, i2 + (i2 >> 1) + 1);
        }
        float[] fArr2 = this.c;
        System.arraycopy(fArr2, i, fArr2, i + 1, this.b - i);
        this.c[i] = fFloatValue;
        this.b++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.b = 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (i < this.b) {
            return Float.valueOf(this.c[i]);
        }
        l5.s(bg.d(i, "Index ", " out of bounds."));
        return null;
    }

    @Override // defpackage.vw5
    public final Object peek() {
        int i = this.b;
        float[] fArr = this.c;
        if (i < fArr.length) {
            return Float.valueOf(fArr[i]);
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
        float[] fArr = this.c;
        float f = fArr[i];
        int i3 = i2 - 1;
        this.b = i3;
        System.arraycopy(fArr, i + 1, fArr, i, i3 - i);
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Float f = (Float) obj;
        if (f == null) {
            return null;
        }
        float fFloatValue = f.floatValue();
        if (i >= this.b) {
            l5.s(bg.d(i, "Index ", " out of bounds."));
            return null;
        }
        float[] fArr = this.c;
        float f2 = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f2);
    }
}
