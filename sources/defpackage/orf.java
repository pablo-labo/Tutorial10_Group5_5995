package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class orf {
    public abstract String a();

    public abstract Object b();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof orf) && wl7.b(a(), ((orf) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return "Transformation(cacheKey=" + a() + ')';
    }
}
