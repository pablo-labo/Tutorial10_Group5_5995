package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rrc implements rie {
    public final iie b;

    public rrc(iie iieVar) {
        this.b = iieVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rrc) && wl7.b(this.b, ((rrc) obj).b);
    }

    @Override // defpackage.rie
    public final Object f(lu2<? super iie> lu2Var) {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "RealSizeResolver(size=" + this.b + ')';
    }
}
