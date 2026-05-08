package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class b8f {
    public final long a;
    public final long b;
    public final long c;

    public b8f(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8f)) {
            return false;
        }
        b8f b8fVar = (b8f) obj;
        return da2.c(this.a, b8fVar.a) && da2.c(this.b, b8fVar.b) && da2.c(this.c, b8fVar.c);
    }

    public final int hashCode() {
        int i = da2.j;
        return Long.hashCode(this.c) + ia.d(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        String strI = da2.i(this.a);
        String strI2 = da2.i(this.b);
        return l6.i(u40.f("TagStyle(backgroundColor=", strI, ", textColor=", strI2, ", borderColor="), da2.i(this.c), ")");
    }
}
