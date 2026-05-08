package defpackage;

/* JADX INFO: loaded from: classes.dex */
@fd8
public final class ld6 {
    public final long a;

    public final boolean equals(Object obj) {
        if (obj instanceof ld6) {
            return this.a == ((ld6) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "GridItemSpan(packedValue=" + this.a + ')';
    }
}
