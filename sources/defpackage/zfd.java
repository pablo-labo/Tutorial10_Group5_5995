package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zfd {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        ak2.e(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public zfd(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final float a() {
        return this.d - this.b;
    }

    public final float b() {
        return this.c - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zfd)) {
            return false;
        }
        zfd zfdVar = (zfd) obj;
        return Float.compare(this.a, zfdVar.a) == 0 && Float.compare(this.b, zfdVar.b) == 0 && Float.compare(this.c, zfdVar.c) == 0 && Float.compare(this.d, zfdVar.d) == 0 && r03.j(this.e, zfdVar.e) && r03.j(this.f, zfdVar.f) && r03.j(this.g, zfdVar.g) && r03.j(this.h, zfdVar.h);
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + ia.d(ia.d(ia.d(k6.c(k6.c(k6.c(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        String str = q92.I(this.a) + ", " + q92.I(this.b) + ", " + q92.I(this.c) + ", " + q92.I(this.d);
        long j = this.e;
        long j2 = this.f;
        boolean zJ = r03.j(j, j2);
        long j3 = this.g;
        long j4 = this.h;
        if (!zJ || !r03.j(j2, j3) || !r03.j(j3, j4)) {
            StringBuilder sbM = akb.m("RoundRect(rect=", str, ", topLeft=");
            sbM.append((Object) r03.C(j));
            sbM.append(", topRight=");
            sbM.append((Object) r03.C(j2));
            sbM.append(", bottomRight=");
            sbM.append((Object) r03.C(j3));
            sbM.append(", bottomLeft=");
            sbM.append((Object) r03.C(j4));
            sbM.append(')');
            return sbM.toString();
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            StringBuilder sbM2 = akb.m("RoundRect(rect=", str, ", radius=");
            sbM2.append(q92.I(Float.intBitsToFloat(i)));
            sbM2.append(')');
            return sbM2.toString();
        }
        StringBuilder sbM3 = akb.m("RoundRect(rect=", str, ", x=");
        sbM3.append(q92.I(Float.intBitsToFloat(i)));
        sbM3.append(", y=");
        sbM3.append(q92.I(Float.intBitsToFloat(i2)));
        sbM3.append(')');
        return sbM3.toString();
    }
}
