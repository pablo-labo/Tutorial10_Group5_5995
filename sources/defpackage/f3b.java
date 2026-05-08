package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f3b {
    public final h80 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;

    public f3b(h80 h80Var, int i, int i2, int i3, int i4, float f, float f2) {
        this.a = h80Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f;
        this.g = f2;
    }

    public final qtc a(qtc qtcVar) {
        return qtcVar.i((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(this.f)) & 4294967295L));
    }

    public final long b(long j, boolean z) {
        if (z) {
            long j2 = kjf.b;
            if (kjf.b(j, j2)) {
                return j2;
            }
        }
        int i = kjf.c;
        int i2 = this.b;
        return cr8.c(((int) (j >> 32)) + i2, ((int) (j & 4294967295L)) + i2);
    }

    public final qtc c(qtc qtcVar) {
        float f = -this.f;
        return qtcVar.i((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
    }

    public final int d(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return nic.C(i, i3, i2) - i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f3b) {
            f3b f3bVar = (f3b) obj;
            if (this.a == f3bVar.a && this.b == f3bVar.b && this.c == f3bVar.c && this.d == f3bVar.d && this.e == f3bVar.e && Float.compare(this.f, f3bVar.f) == 0 && Float.compare(this.g, f3bVar.g) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + k6.c(w40.c(this.e, w40.c(this.d, w40.c(this.c, w40.c(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), this.f, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        sb.append(this.c);
        sb.append(", startLineIndex=");
        sb.append(this.d);
        sb.append(", endLineIndex=");
        sb.append(this.e);
        sb.append(", top=");
        sb.append(this.f);
        sb.append(", bottom=");
        return l6.h(sb, this.g, ')');
    }
}
