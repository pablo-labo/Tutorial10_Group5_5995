package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@fd8
public final class l4g implements Comparable<l4g> {
    public final long a;

    public /* synthetic */ l4g(long j) {
        this.a = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(l4g l4gVar) {
        return wl7.d(this.a ^ Long.MIN_VALUE, l4gVar.a ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l4g) {
            return this.a == ((l4g) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return zte.h(10, this.a);
    }
}
