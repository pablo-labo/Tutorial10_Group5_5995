package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kne extends sn1 {
    public final long a;

    public kne(long j) {
        this.a = j;
    }

    @Override // defpackage.sn1
    public final void a(float f, long j, u2b u2bVar) {
        u2bVar.b(1.0f);
        long jB = this.a;
        if (f != 1.0f) {
            jB = da2.b(jB, da2.d(jB) * f);
        }
        u2bVar.d(jB);
        if (u2bVar.g() != null) {
            u2bVar.f(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kne) {
            return da2.c(this.a, ((kne) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int i = da2.j;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) da2.i(this.a)) + ')';
    }
}
