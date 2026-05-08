package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class dg6 {
    public final long[] a;
    public final int[] b;
    public final long[] c;

    public dg6(long[] jArr, int[] iArr, long[] jArr2) {
        this.a = jArr;
        this.b = iArr;
        this.c = jArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!dg6.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        dg6 dg6Var = (dg6) obj;
        return Arrays.equals(this.a, dg6Var.a) && Arrays.equals(this.b, dg6Var.b) && Arrays.equals(this.c, dg6Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + ((Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        String string = Arrays.toString(this.a);
        String string2 = Arrays.toString(this.b);
        return l6.i(u40.f("HapticsVibrationType(timings=", string, ", amplitudes=", string2, ", oldSDKPattern="), Arrays.toString(this.c), ")");
    }
}
