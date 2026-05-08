package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vmd {
    public final float a = 0.92f;
    public final long b;
    public final dvf c;

    public vmd(long j, dvf dvfVar) {
        this.b = j;
        this.c = dvfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vmd)) {
            return false;
        }
        vmd vmdVar = (vmd) obj;
        return Float.compare(this.a, vmdVar.a) == 0 && mrf.a(this.b, vmdVar.b) && wl7.b(this.c, vmdVar.c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.a) * 31;
        int i = mrf.c;
        return this.c.hashCode() + ia.d(iHashCode, 31, this.b);
    }

    public final String toString() {
        return "Scale(scale=" + this.a + ", transformOrigin=" + ((Object) mrf.b(this.b)) + ", animationSpec=" + this.c + ')';
    }
}
