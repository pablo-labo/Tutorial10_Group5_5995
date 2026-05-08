package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ahd {
    public float a = 0.0f;
    public boolean b = true;
    public k73 c = null;

    public ahd(int i) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahd)) {
            return false;
        }
        ahd ahdVar = (ahd) obj;
        return Float.compare(this.a, ahdVar.a) == 0 && this.b == ahdVar.b && wl7.b(this.c, ahdVar.c);
    }

    public final int hashCode() {
        int iF = ia.f(Float.hashCode(this.a) * 31, 31, this.b);
        k73 k73Var = this.c;
        return (iF + (k73Var == null ? 0 : k73Var.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.b + ", crossAxisAlignment=" + this.c + ", flowLayoutData=null)";
    }
}
