package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ic7<T> implements yd0<T> {
    public final xd4<T> a;
    public final b2d b;

    public ic7(xd4 xd4Var, b2d b2dVar) {
        this.a = xd4Var;
        this.b = b2dVar;
    }

    @Override // defpackage.yd0
    public final <V extends ge0> lmg<V> a(lvf<T, V> lvfVar) {
        return new rmg(this.a.a((lvf) lvfVar), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ic7)) {
            return false;
        }
        ic7 ic7Var = (ic7) obj;
        return wl7.b(ic7Var.a, this.a) && ic7Var.b == this.b;
    }

    public final int hashCode() {
        return Long.hashCode(0L) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
