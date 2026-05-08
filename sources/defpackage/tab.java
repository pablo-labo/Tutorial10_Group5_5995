package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tab {
    public final long a;

    public tab(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tab) && kie.a(this.a, ((tab) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(3) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return akb.k("PlaceholderConfig(size=", kie.f(this.a), ", verticalAlign=", "Bottom", ")");
    }
}
