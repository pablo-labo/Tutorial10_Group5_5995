package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a3b<F, S> {
    public final F a;
    public final S b;

    public a3b(F f, S s) {
        this.a = f;
        this.b = s;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a3b)) {
            return false;
        }
        a3b a3bVar = (a3b) obj;
        return Objects.equals(a3bVar.a, this.a) && Objects.equals(a3bVar.b, this.b);
    }

    public final int hashCode() {
        F f = this.a;
        int iHashCode = f == null ? 0 : f.hashCode();
        S s = this.b;
        return iHashCode ^ (s != null ? s.hashCode() : 0);
    }

    public final String toString() {
        return "Pair{" + this.a + " " + this.b + "}";
    }
}
