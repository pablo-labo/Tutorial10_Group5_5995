package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bng extends bvf {
    public final String a;

    public bng(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bng) {
            return wl7.b(this.a, ((bng) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return w40.f(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.a, ')');
    }
}
