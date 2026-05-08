package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pi1 {
    public v70 a = null;
    public y40 b = null;
    public ax1 c = null;
    public m80 d = null;

    public pi1(int i) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pi1)) {
            return false;
        }
        pi1 pi1Var = (pi1) obj;
        return wl7.b(this.a, pi1Var.a) && wl7.b(this.b, pi1Var.b) && wl7.b(this.c, pi1Var.c) && wl7.b(this.d, pi1Var.d);
    }

    public final int hashCode() {
        v70 v70Var = this.a;
        int iHashCode = (v70Var == null ? 0 : v70Var.hashCode()) * 31;
        y40 y40Var = this.b;
        int iHashCode2 = (iHashCode + (y40Var == null ? 0 : y40Var.hashCode())) * 31;
        ax1 ax1Var = this.c;
        int iHashCode3 = (iHashCode2 + (ax1Var == null ? 0 : ax1Var.hashCode())) * 31;
        m80 m80Var = this.d;
        return iHashCode3 + (m80Var != null ? m80Var.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.a + ", canvas=" + this.b + ", canvasDrawScope=" + this.c + ", borderPath=" + this.d + ')';
    }
}
