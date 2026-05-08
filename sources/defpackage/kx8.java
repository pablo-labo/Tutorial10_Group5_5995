package defpackage;

import android.graphics.Shader;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class kx8 extends tbe {
    public final List<da2> c;
    public final long d;
    public final long e;

    public kx8(long j, long j2, List list) {
        this.c = list;
        this.d = j;
        this.e = j2;
    }

    @Override // defpackage.tbe
    public final Shader b(long j) {
        long j2 = this.d;
        int i = (int) (j2 >> 32);
        if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
            i = (int) (j >> 32);
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
            i2 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        long j3 = this.e;
        int i3 = (int) (j3 >> 32);
        if (Float.intBitsToFloat(i3) == Float.POSITIVE_INFINITY) {
            i3 = (int) (j >> 32);
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat(i3);
        int i4 = (int) (j3 & 4294967295L);
        if (Float.intBitsToFloat(i4) == Float.POSITIVE_INFINITY) {
            i4 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat(i4);
        return pg8.e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L), this.c, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kx8)) {
            return false;
        }
        kx8 kx8Var = (kx8) obj;
        return wl7.b(this.c, kx8Var.c) && ooa.c(this.d, kx8Var.d) && ooa.c(this.e, kx8Var.e);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ia.d(ia.d(this.c.hashCode() * 961, 31, this.d), 31, this.e);
    }

    public final String toString() {
        String str;
        long j = this.d;
        String str2 = "";
        if (((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((Object) ooa.h(j)) + ", ";
        } else {
            str = "";
        }
        long j2 = this.e;
        if (((((j2 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) ooa.h(j2)) + ", ";
        }
        return "LinearGradient(colors=" + this.c + ", stops=null, " + str + str2 + "tileMode=" + ((Object) "Clamp") + ')';
    }
}
