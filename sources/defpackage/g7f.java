package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class g7f {
    public final boolean a;
    public final prd b;

    public g7f(boolean z, prd prdVar) {
        prdVar.getClass();
        this.a = z;
        this.b = prdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7f)) {
            return false;
        }
        g7f g7fVar = (g7f) obj;
        return this.a == g7fVar.a && this.b == g7fVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TabScrolledEvent(isTabAtTop=" + this.a + ", scrollDirection=" + this.b + ")";
    }
}
