package defpackage;

import com.datadog.android.rum.internal.utils.ViewUtilsKt;

/* JADX INFO: loaded from: classes.dex */
public final class zg1 extends x2b {
    public final long V;
    public int W = 1;
    public final long X;
    public float Y;
    public ga2 Z;
    public final m07 f;

    public zg1(m07 m07Var, long j) {
        int i;
        this.f = m07Var;
        this.V = j;
        int i2 = (int) (j >> 32);
        if (i2 < 0 || (i = (int) (4294967295L & j)) < 0 || i2 > m07Var.getWidth() || i > m07Var.getHeight()) {
            l5.q("Failed requirement.");
            throw null;
        }
        this.X = j;
        this.Y = 1.0f;
    }

    @Override // defpackage.x2b
    public final boolean a(float f) {
        this.Y = f;
        return true;
    }

    @Override // defpackage.x2b
    public final boolean c(ga2 ga2Var) {
        this.Z = ga2Var;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zg1)) {
            return false;
        }
        zg1 zg1Var = (zg1) obj;
        return wl7.b(this.f, zg1Var.f) && lh7.b(0L, 0L) && th7.b(this.V, zg1Var.V) && this.W == zg1Var.W;
    }

    @Override // defpackage.x2b
    public final long h() {
        return hh1.Y(this.X);
    }

    public final int hashCode() {
        return Integer.hashCode(this.W) + ia.d(ia.d(this.f.hashCode() * 31, 31, 0L), 31, this.V);
    }

    @Override // defpackage.x2b
    public final void i(gb4 gb4Var) {
        gb4.y1(gb4Var, this.f, 0L, this.V, 0L, (((long) Math.round(Float.intBitsToFloat((int) (gb4Var.c() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (gb4Var.c() & 4294967295L)))) & 4294967295L), this.Y, null, this.Z, 0, this.W, 328);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.f);
        sb.append(", srcOffset=");
        sb.append((Object) lh7.e(0L));
        sb.append(", srcSize=");
        sb.append((Object) th7.c(this.V));
        sb.append(", filterQuality=");
        int i = this.W;
        sb.append((Object) (i == 0 ? "None" : i == 1 ? "Low" : i == 2 ? "Medium" : i == 3 ? "High" : ViewUtilsKt.UNKNOWN_DESTINATION_URL));
        sb.append(')');
        return sb.toString();
    }
}
