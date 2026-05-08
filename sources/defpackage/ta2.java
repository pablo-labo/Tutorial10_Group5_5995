package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ta2 {
    public final String a;
    public final long b;
    public final int c;

    public ta2(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
        if (str.length() == 0) {
            l5.q("The name of a color space cannot be null and must contain at least 1 character");
            throw null;
        }
        if (i < -1 || i > 63) {
            l5.q("The id must be between -1 and 63");
            throw null;
        }
    }

    public abstract float[] a(float[] fArr);

    public abstract float b(int i);

    public abstract float c(int i);

    public boolean d() {
        return false;
    }

    public long e(float f, float f2, float f3) {
        float[] fArrF = f(new float[]{f, f2, f3});
        return (((long) Float.floatToRawIntBits(fArrF[0])) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fArrF[1])));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ta2 ta2Var = (ta2) obj;
        if (this.c == ta2Var.c && this.a.equals(ta2Var.a)) {
            return ka2.v(this.b, ta2Var.b);
        }
        return false;
    }

    public abstract float[] f(float[] fArr);

    public float g(float f, float f2, float f3) {
        return f(new float[]{f, f2, f3})[2];
    }

    public long h(float f, float f2, float f3, float f4, ta2 ta2Var) {
        float[] fArr = new float[(int) (this.b >> 32)];
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        float[] fArrA = a(fArr);
        return pnb.b(fArrA[0], fArrA[1], fArrA[2], f4, ta2Var);
    }

    public int hashCode() {
        return ia.d(this.a.hashCode() * 31, 31, this.b) + this.c;
    }

    public final String toString() {
        return this.a + " (id=" + this.c + ", model=" + ((Object) ka2.J(this.b)) + ')';
    }
}
