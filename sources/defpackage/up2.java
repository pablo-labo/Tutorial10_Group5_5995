package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class up2<T> {
    public final T a;

    public up2(T t) {
        this.a = t;
    }

    public abstract ui8 a(xx9 xx9Var);

    public T b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        T tB = b();
        up2 up2Var = obj instanceof up2 ? (up2) obj : null;
        return wl7.b(tB, up2Var != null ? up2Var.b() : null);
    }

    public final int hashCode() {
        T tB = b();
        if (tB != null) {
            return tB.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(b());
    }
}
