package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ule<T> implements xd4<T> {
    public final int a;

    public ule(int i) {
        this.a = i;
    }

    @Override // defpackage.yd0
    public final <V extends ge0> nmg<V> a(lvf<T, V> lvfVar) {
        return new umg(this.a);
    }

    @Override // defpackage.jf5
    public final omg b() {
        return new umg(this.a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ule) && ((ule) obj).a == this.a;
    }

    public final int hashCode() {
        return this.a;
    }
}
