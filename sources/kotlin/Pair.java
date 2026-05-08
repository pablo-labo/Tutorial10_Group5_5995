package kotlin;

import defpackage.wl7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00060\u0003j\u0002`\u0004R\u0017\u0010\u0005\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lkotlin/Pair;", "A", "B", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "first", "Ljava/lang/Object;", "d", "()Ljava/lang/Object;", "second", "e", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Pair<A, B> implements Serializable {
    private final A first;
    private final B second;

    public Pair(A a, B b) {
        this.first = a;
        this.second = b;
    }

    public static Pair c(Pair pair) {
        Boolean bool = Boolean.FALSE;
        B b = pair.second;
        pair.getClass();
        return new Pair(bool, b);
    }

    public final A a() {
        return this.first;
    }

    public final B b() {
        return this.second;
    }

    public final A d() {
        return this.first;
    }

    public final B e() {
        return this.second;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return wl7.b(this.first, pair.first) && wl7.b(this.second, pair.second);
    }

    public final int hashCode() {
        A a = this.first;
        int iHashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.second;
        return iHashCode + (b != null ? b.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.first + ", " + this.second + ')';
    }
}
