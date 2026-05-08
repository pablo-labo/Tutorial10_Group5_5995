package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lre<T> implements yd0<T> {
    public final yd0<T> a;
    public final long b;

    public lre(jf5 jf5Var, long j) {
        this.a = jf5Var;
        this.b = j;
    }

    @Override // defpackage.yd0
    public final <V extends ge0> lmg<V> a(lvf<T, V> lvfVar) {
        return new mre(this.a.a(lvfVar), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lre)) {
            return false;
        }
        lre lreVar = (lre) obj;
        return lreVar.b == this.b && wl7.b(lreVar.a, this.a);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
