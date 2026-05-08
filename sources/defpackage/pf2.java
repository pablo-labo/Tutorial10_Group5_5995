package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pf2<R> {
    public final R a;
    public final gw1 b;
    public final wu5<Throwable, R, v03, j6g> c;
    public final Object d;
    public final Throwable e;

    public /* synthetic */ pf2(Object obj, gw1 gw1Var, wu5 wu5Var, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : gw1Var, (wu5<? super Throwable, ? super Object, ? super v03, j6g>) ((i & 4) != 0 ? null : wu5Var), (Object) null, (i & 16) != 0 ? null : th);
    }

    public static pf2 a(pf2 pf2Var, gw1 gw1Var, Throwable th, int i) {
        R r = pf2Var.a;
        if ((i & 2) != 0) {
            gw1Var = pf2Var.b;
        }
        gw1 gw1Var2 = gw1Var;
        wu5<Throwable, R, v03, j6g> wu5Var = pf2Var.c;
        Object obj = pf2Var.d;
        if ((i & 16) != 0) {
            th = pf2Var.e;
        }
        return new pf2(r, gw1Var2, wu5Var, obj, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pf2)) {
            return false;
        }
        pf2 pf2Var = (pf2) obj;
        return wl7.b(this.a, pf2Var.a) && wl7.b(this.b, pf2Var.b) && wl7.b(this.c, pf2Var.c) && wl7.b(this.d, pf2Var.d) && wl7.b(this.e, pf2Var.e);
    }

    public final int hashCode() {
        R r = this.a;
        int iHashCode = (r == null ? 0 : r.hashCode()) * 31;
        gw1 gw1Var = this.b;
        int iHashCode2 = (iHashCode + (gw1Var == null ? 0 : gw1Var.hashCode())) * 31;
        wu5<Throwable, R, v03, j6g> wu5Var = this.c;
        int iHashCode3 = (iHashCode2 + (wu5Var == null ? 0 : wu5Var.hashCode())) * 31;
        Object obj = this.d;
        int iHashCode4 = (iHashCode3 + (obj == null ? 0 : obj.hashCode())) * 31;
        Throwable th = this.e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public pf2(R r, gw1 gw1Var, wu5<? super Throwable, ? super R, ? super v03, j6g> wu5Var, Object obj, Throwable th) {
        this.a = r;
        this.b = gw1Var;
        this.c = wu5Var;
        this.d = obj;
        this.e = th;
    }
}
