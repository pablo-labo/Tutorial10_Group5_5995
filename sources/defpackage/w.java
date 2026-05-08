package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w extends t {
    @Override // defpackage.q
    public final w a() {
        return this;
    }

    public abstract boolean b(w wVar);

    public abstract void c(v vVar);

    public abstract int d();

    public w e() {
        return this;
    }

    @Override // defpackage.t
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && b(((q) obj).a());
    }

    @Override // defpackage.t
    public abstract int hashCode();
}
