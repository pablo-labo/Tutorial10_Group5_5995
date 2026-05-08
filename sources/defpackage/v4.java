package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v4 extends dj3 implements zvf {
    public static final /* synthetic */ qf8<Object>[] X = {fwc.a.g(new l4c(v4.class, "constructors", "getConstructors()Ljava/util/Collection;", 0))};
    public List<? extends rxf> V;
    public final u4 W;
    public final aue e;
    public final e04 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(aue aueVar, aj3 aj3Var, lf0 lf0Var, n8a n8aVar, e04 e04Var) {
        super(aj3Var, lf0Var, n8aVar, qne.p);
        aueVar.getClass();
        aj3Var.getClass();
        e04Var.getClass();
        this.e = aueVar;
        this.f = e04Var;
        new r4(this, 0);
        this.W = new u4(this);
    }

    @Override // defpackage.dj3
    /* JADX INFO: renamed from: K0 */
    public final cj3 a() {
        return this;
    }

    public abstract List<rxf> L0();

    @Override // defpackage.zm9
    public final boolean X() {
        return false;
    }

    @Override // defpackage.dj3, defpackage.bj3, defpackage.aj3
    public final aj3 a() {
        return this;
    }

    @Override // defpackage.dj3, defpackage.bj3, defpackage.aj3
    public final v62 a() {
        return this;
    }

    @Override // defpackage.zm9, defpackage.fj3
    public final e04 getVisibility() {
        return this.f;
    }

    @Override // defpackage.zm9
    public final boolean i0() {
        return false;
    }

    @Override // defpackage.zm9
    public final boolean isExternal() {
        return false;
    }

    @Override // defpackage.v62
    public final kwf j() {
        return this.W;
    }

    @Override // defpackage.aj3
    public final <R, D> R o0(ej3<R, D> ej3Var, D d) {
        return (R) ej3Var.k(this, d);
    }

    @Override // defpackage.w62
    public final List<rxf> p() {
        List list = this.V;
        if (list != null) {
            return list;
        }
        wl7.g("declaredTypeParametersImpl");
        throw null;
    }

    @Override // defpackage.bj3
    public final String toString() {
        return "typealias " + getName().c();
    }

    @Override // defpackage.w62
    public final boolean y() {
        return kyf.c(((s14) this).t0(), new s4(this, 0), null);
    }
}
