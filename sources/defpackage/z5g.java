package defpackage;

import defpackage.qu2;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class z5g<T> extends vpd<T> {
    public final ThreadLocal<Pair<v03, Object>> e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public z5g(lu2 lu2Var, v03 v03Var) {
        b6g b6gVar = b6g.a;
        super(lu2Var, v03Var.h1(b6gVar) == null ? v03Var.d1(b6gVar) : v03Var);
        this.e = new ThreadLocal<>();
        if (lu2Var.getContext().h1(qu2.a.a) instanceof y03) {
            return;
        }
        Object objC = rkf.c(v03Var, null);
        rkf.a(v03Var, objC);
        t0(v03Var, objC);
    }

    @Override // defpackage.vpd, defpackage.d78
    public final void n(Object obj) {
        q0();
        Object objG0 = u63.g0(obj);
        lu2<T> lu2Var = this.d;
        v03 context = lu2Var.getContext();
        Object objC = rkf.c(context, null);
        z5g<?> z5gVarC = objC != rkf.a ? x03.c(lu2Var, context, objC) : null;
        try {
            lu2Var.resumeWith(objG0);
            j6g j6gVar = j6g.a;
            if (z5gVarC == null || z5gVarC.p0()) {
                rkf.a(context, objC);
            }
        } catch (Throwable th) {
            if (z5gVarC == null || z5gVarC.p0()) {
                rkf.a(context, objC);
            }
            throw th;
        }
    }

    @Override // defpackage.vpd
    public final void n0() {
        q0();
    }

    public final boolean p0() {
        boolean z = this.threadLocalIsSet && this.e.get() == null;
        this.e.remove();
        return !z;
    }

    public final void q0() {
        if (this.threadLocalIsSet) {
            Pair<v03, Object> pair = this.e.get();
            if (pair != null) {
                rkf.a(pair.a(), pair.b());
            }
            this.e.remove();
        }
    }

    public final void t0(v03 v03Var, Object obj) {
        this.threadLocalIsSet = true;
        this.e.set(new Pair<>(v03Var, obj));
    }
}
