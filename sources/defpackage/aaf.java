package defpackage;

import defpackage.ge0;

/* JADX INFO: loaded from: classes.dex */
public final class aaf<T, V extends ge0> implements sd0<T, V> {
    public final lmg<V> a;
    public final lvf<T, V> b;
    public T c;
    public T d;
    public V e;
    public V f;
    public final V g;
    public long h;
    public V i;

    public aaf() {
        throw null;
    }

    public aaf(yd0<T> yd0Var, lvf<T, V> lvfVar, T t, T t2, V v) {
        this.a = yd0Var.a(lvfVar);
        this.b = lvfVar;
        this.c = t2;
        this.d = t;
        this.e = lvfVar.a().invoke(t);
        this.f = lvfVar.a().invoke(t2);
        this.g = v != null ? (V) ewa.o(v) : (V) lvfVar.a().invoke(t).c();
        this.h = -1L;
    }

    @Override // defpackage.sd0
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.sd0
    public final V b(long j) {
        if (!c(j)) {
            return (V) this.a.o(j, this.e, this.f, this.g);
        }
        V v = this.i;
        if (v != null) {
            return v;
        }
        V v2 = (V) this.a.k(this.e, this.f, this.g);
        this.i = v2;
        return v2;
    }

    @Override // defpackage.sd0
    public final long d() {
        if (this.h < 0) {
            this.h = this.a.d(this.e, this.f, this.g);
        }
        return this.h;
    }

    @Override // defpackage.sd0
    public final lvf<T, V> e() {
        return this.b;
    }

    @Override // defpackage.sd0
    public final T f(long j) {
        if (c(j)) {
            return this.c;
        }
        ge0 ge0VarQ = this.a.q(j, this.e, this.f, this.g);
        int iB = ge0VarQ.b();
        for (int i = 0; i < iB; i++) {
            if (Float.isNaN(ge0VarQ.a(i))) {
                hib.b("AnimationVector cannot contain a NaN. " + ge0VarQ + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return (T) this.b.b().invoke(ge0VarQ);
    }

    @Override // defpackage.sd0
    public final T g() {
        return this.c;
    }

    public final void h(T t) {
        if (wl7.b(t, this.d)) {
            return;
        }
        this.d = t;
        this.e = this.b.a().invoke(t);
        this.i = null;
        this.h = -1L;
    }

    public final void i(T t) {
        if (wl7.b(this.c, t)) {
            return;
        }
        this.c = t;
        this.f = this.b.a().invoke(t);
        this.i = null;
        this.h = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.d + " -> " + this.c + ",initial velocity: " + this.g + ", duration: " + (d() / 1000000) + " ms,animationSpec: " + this.a;
    }
}
