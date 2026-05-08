package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class x21<T> {
    public final T a;
    public final jnb b;

    /* JADX WARN: Multi-variable type inference failed */
    public x21(Object obj, jnb jnbVar) {
        if (obj == 0) {
            ja.k("Null payload");
            throw null;
        }
        this.a = obj;
        this.b = jnbVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x21)) {
            return false;
        }
        x21 x21Var = (x21) obj;
        return this.a.equals(x21Var.a) && this.b.equals(x21Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ (((1000003 * 1000003) ^ this.a.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.a + ", priority=" + this.b + "}";
    }
}
