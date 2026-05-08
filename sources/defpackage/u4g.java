package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@fd8
public final class u4g implements Comparable<u4g> {
    public final short a;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(u4g u4gVar) {
        return wl7.c(this.a & 65535, u4gVar.a & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u4g) {
            return this.a == ((u4g) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.a);
    }

    public final String toString() {
        return String.valueOf(this.a & 65535);
    }
}
