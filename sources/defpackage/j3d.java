package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class j3d {
    public final String a;
    public final int b;

    public j3d(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3d)) {
            return false;
        }
        j3d j3dVar = (j3d) obj;
        return this.a.equals(j3dVar.a) && this.b == j3dVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ReportType(type=" + this.a + ", labelId=" + this.b + ")";
    }
}
