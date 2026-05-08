package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@fd8
public final class f4g implements Comparable<f4g> {
    public final int a;

    @Override // java.lang.Comparable
    public final int compareTo(f4g f4gVar) {
        return wl7.c(this.a ^ Integer.MIN_VALUE, f4gVar.a ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f4g) {
            return this.a == ((f4g) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return String.valueOf(((long) this.a) & 4294967295L);
    }
}
