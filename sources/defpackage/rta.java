package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rta {
    public final String a;

    public rta(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rta) && this.a.equals(((rta) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return w40.f(new StringBuilder("OpaqueKey(key="), this.a, ')');
    }
}
