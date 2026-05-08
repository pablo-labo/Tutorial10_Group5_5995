package defpackage;

import defpackage.u2e;

/* JADX INFO: loaded from: classes.dex */
public final class pgf implements udf {
    public final /* synthetic */ rgf a;
    public final /* synthetic */ boolean b;

    public pgf(rgf rgfVar, boolean z) {
        this.a = rgfVar;
        this.b = z;
    }

    @Override // defpackage.udf
    public final void a() {
        nif nifVarD;
        boolean z = this.b;
        jf6 jf6Var = z ? jf6.b : jf6.c;
        rgf rgfVar = this.a;
        ((gme) rgfVar.r).setValue(jf6Var);
        long jA = t3e.a(rgfVar.k(z));
        lu8 lu8Var = rgfVar.d;
        if (lu8Var == null || (nifVarD = lu8Var.d()) == null) {
            return;
        }
        long jE = nifVarD.e(jA);
        rgfVar.o = jE;
        ((gme) rgfVar.s).setValue(new ooa(jE));
        rgfVar.q = 0L;
        rgfVar.t = -1;
        lu8 lu8Var2 = rgfVar.d;
        if (lu8Var2 != null) {
            ((gme) lu8Var2.q).setValue(Boolean.TRUE);
        }
        rgfVar.s(false);
    }

    @Override // defpackage.udf
    public final void b(long j) {
    }

    @Override // defpackage.udf
    public final void c() {
        rgf rgfVar = this.a;
        ((gme) rgfVar.r).setValue(null);
        ((gme) rgfVar.s).setValue(null);
        rgfVar.s(true);
    }

    @Override // defpackage.udf
    public final void d(long j) {
        rgf rgfVar = this.a;
        long jF = ooa.f(rgfVar.q, j);
        rgfVar.q = jF;
        ((gme) rgfVar.s).setValue(new ooa(ooa.f(rgfVar.o, jF)));
        jhf jhfVarM = rgfVar.m();
        ooa ooaVarI = rgfVar.i();
        ooaVarI.getClass();
        rgf.c(rgfVar, jhfVarM, ooaVarI.a, false, this.b, u2e.a.d, true);
        rgfVar.s(false);
    }

    @Override // defpackage.udf
    public final void onCancel() {
    }

    @Override // defpackage.udf
    public final void onStop() {
        rgf rgfVar = this.a;
        ((gme) rgfVar.r).setValue(null);
        ((gme) rgfVar.s).setValue(null);
        rgfVar.s(true);
    }
}
