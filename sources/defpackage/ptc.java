package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ptc {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public ptc(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ptc)) {
            return false;
        }
        ptc ptcVar = (ptc) obj;
        return Float.compare(this.a, ptcVar.a) == 0 && Float.compare(this.b, ptcVar.b) == 0 && Float.compare(this.c, ptcVar.c) == 0 && Float.compare(this.d, ptcVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + k6.c(k6.c(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        return "Rect(x=" + this.a + ", y=" + this.b + ", width=" + this.c + ", height=" + this.d + ")";
    }
}
