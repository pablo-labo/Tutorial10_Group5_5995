package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qtc {
    public static final qtc e = new qtc(0.0f, 0.0f, 0.0f, 0.0f);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public qtc(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public static qtc a(qtc qtcVar, float f, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f = qtcVar.a;
        }
        float f4 = qtcVar.b;
        if ((i & 4) != 0) {
            f2 = qtcVar.c;
        }
        if ((i & 8) != 0) {
            f3 = qtcVar.d;
        }
        return new qtc(f, f4, f2, f3);
    }

    public final long b() {
        float f = this.c;
        float f2 = this.a;
        float f3 = ((f - f2) / 2.0f) + f2;
        float f4 = this.d;
        float f5 = this.b;
        return (((long) Float.floatToRawIntBits(((f4 - f5) / 2.0f) + f5)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public final long c() {
        float f = this.c - this.a;
        return (((long) Float.floatToRawIntBits(this.d - this.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public final long d() {
        return (((long) Float.floatToRawIntBits(this.a)) << 32) | (((long) Float.floatToRawIntBits(this.b)) & 4294967295L);
    }

    public final qtc e(qtc qtcVar) {
        return new qtc(Math.max(this.a, qtcVar.a), Math.max(this.b, qtcVar.b), Math.min(this.c, qtcVar.c), Math.min(this.d, qtcVar.d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qtc)) {
            return false;
        }
        qtc qtcVar = (qtc) obj;
        return Float.compare(this.a, qtcVar.a) == 0 && Float.compare(this.b, qtcVar.b) == 0 && Float.compare(this.c, qtcVar.c) == 0 && Float.compare(this.d, qtcVar.d) == 0;
    }

    public final boolean f() {
        return (this.a >= this.c) | (this.b >= this.d);
    }

    public final boolean g(qtc qtcVar) {
        return (this.a < qtcVar.c) & (qtcVar.a < this.c) & (this.b < qtcVar.d) & (qtcVar.b < this.d);
    }

    public final qtc h(float f, float f2) {
        return new qtc(this.a + f, this.b + f2, this.c + f, this.d + f2);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + k6.c(k6.c(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final qtc i(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new qtc(Float.intBitsToFloat(i) + this.a, Float.intBitsToFloat(i2) + this.b, Float.intBitsToFloat(i) + this.c, Float.intBitsToFloat(i2) + this.d);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + q92.I(this.a) + ", " + q92.I(this.b) + ", " + q92.I(this.c) + ", " + q92.I(this.d) + ')';
    }
}
