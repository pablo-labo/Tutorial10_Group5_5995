package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class otf<T> extends q7e<T> {
    public final ae6 a;
    public final iyf<T> b;
    public final boolean c;
    public volatile pvf<T> d;

    public final class a {
    }

    public otf(pb8 pb8Var, ja8 ja8Var, ae6 ae6Var, iyf iyfVar, boolean z) {
        this.a = ae6Var;
        this.b = iyfVar;
        this.c = z;
    }

    @Override // defpackage.pvf
    public final T a(nb8 nb8Var) {
        pvf<T> pvfVarD = this.d;
        if (pvfVarD == null) {
            pvfVarD = this.a.d(null, this.b);
            this.d = pvfVarD;
        }
        return pvfVarD.a(nb8Var);
    }

    @Override // defpackage.pvf
    public final void b(gc8 gc8Var, T t) {
        pvf<T> pvfVarD = this.d;
        if (pvfVarD == null) {
            pvfVarD = this.a.d(null, this.b);
            this.d = pvfVarD;
        }
        pvfVarD.b(gc8Var, t);
    }

    @Override // defpackage.q7e
    public final pvf<T> c() {
        pvf<T> pvfVar = this.d;
        if (pvfVar != null) {
            return pvfVar;
        }
        pvf<T> pvfVarD = this.a.d(null, this.b);
        this.d = pvfVarD;
        return pvfVarD;
    }
}
