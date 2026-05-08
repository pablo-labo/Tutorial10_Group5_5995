package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ib6 {
    public final float[] a;
    public final int[] b;

    public ib6(float[] fArr, int[] iArr) {
        this.a = fArr;
        this.b = iArr;
    }

    public final void a(ib6 ib6Var) {
        int i = 0;
        while (true) {
            int[] iArr = ib6Var.b;
            if (i >= iArr.length) {
                return;
            }
            this.a[i] = ib6Var.a[i];
            this.b[i] = iArr[i];
            i++;
        }
    }

    public final ib6 b(float[] fArr) {
        int iV;
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            float f = fArr[i];
            float[] fArr2 = this.a;
            int iBinarySearch = Arrays.binarySearch(fArr2, f);
            int[] iArr2 = this.b;
            if (iBinarySearch >= 0) {
                iV = iArr2[iBinarySearch];
            } else {
                int i2 = -(iBinarySearch + 1);
                if (i2 == 0) {
                    iV = iArr2[0];
                } else if (i2 == iArr2.length - 1) {
                    iV = iArr2[iArr2.length - 1];
                } else {
                    int i3 = i2 - 1;
                    float f2 = fArr2[i3];
                    iV = hh1.v(iArr2[i3], (f - f2) / (fArr2[i2] - f2), iArr2[i2]);
                }
            }
            iArr[i] = iV;
        }
        return new ib6(fArr, iArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ib6.class != obj.getClass()) {
            return false;
        }
        ib6 ib6Var = (ib6) obj;
        return Arrays.equals(this.a, ib6Var.a) && Arrays.equals(this.b, ib6Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }
}
