package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class o5i extends r5i {
    @Override // defpackage.r5i
    public final double d(Object obj, long j) {
        return Double.longBitsToDouble(((Unsafe) this.a).getLong(obj, j));
    }

    @Override // defpackage.r5i
    public final float f(Object obj, long j) {
        return Float.intBitsToFloat(((Unsafe) this.a).getInt(obj, j));
    }

    @Override // defpackage.r5i
    public final void g(Object obj, long j, boolean z) {
        if (t5i.g) {
            t5i.c(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            t5i.d(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.r5i
    public final void h(Object obj, long j, byte b) {
        if (t5i.g) {
            t5i.c(obj, j, b);
        } else {
            t5i.d(obj, j, b);
        }
    }

    @Override // defpackage.r5i
    public final void i(Object obj, long j, double d) {
        ((Unsafe) this.a).putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.r5i
    public final void j(Object obj, long j, float f) {
        ((Unsafe) this.a).putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.r5i
    public final boolean k(Object obj, long j) {
        return t5i.g ? t5i.m(obj, j) : t5i.n(obj, j);
    }
}
