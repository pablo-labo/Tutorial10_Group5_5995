package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ngf implements udf {
    public final /* synthetic */ rgf a;

    public ngf(rgf rgfVar) {
        this.a = rgfVar;
    }

    @Override // defpackage.udf
    public final void a() {
    }

    @Override // defpackage.udf
    public final void b(long j) {
        nif nifVarD;
        rgf rgfVar = this.a;
        long jA = t3e.a(rgfVar.k(true));
        lu8 lu8Var = rgfVar.d;
        if (lu8Var == null || (nifVarD = lu8Var.d()) == null) {
            return;
        }
        long jE = nifVarD.e(jA);
        rgfVar.o = jE;
        ((gme) rgfVar.s).setValue(new ooa(jE));
        rgfVar.q = 0L;
        ((gme) rgfVar.r).setValue(jf6.a);
        rgfVar.s(false);
    }

    @Override // defpackage.udf
    public final void c() {
        rgf rgfVar = this.a;
        ((gme) rgfVar.r).setValue(null);
        ((gme) rgfVar.s).setValue(null);
    }

    @Override // defpackage.udf
    public final void d(long j) {
        nif nifVarD;
        yf6 yf6Var;
        rgf rgfVar = this.a;
        rgfVar.q = ooa.f(rgfVar.q, j);
        lu8 lu8Var = rgfVar.d;
        if (lu8Var == null || (nifVarD = lu8Var.d()) == null) {
            return;
        }
        ((gme) rgfVar.s).setValue(new ooa(ooa.f(rgfVar.o, rgfVar.q)));
        roa roaVar = rgfVar.b;
        ooa ooaVarI = rgfVar.i();
        ooaVarI.getClass();
        int iA = roaVar.a(nifVarD.b(ooaVarI.a, true));
        long jC = cr8.c(iA, iA);
        if (kjf.b(jC, rgfVar.m().b)) {
            return;
        }
        lu8 lu8Var2 = rgfVar.d;
        if ((lu8Var2 == null || ((Boolean) ((gme) lu8Var2.q).getValue()).booleanValue()) && (yf6Var = rgfVar.k) != null) {
            yf6Var.a(9);
        }
        rgfVar.c.invoke(rgf.e(rgfVar.m().a, jC));
        rgfVar.w = new kjf(jC);
    }

    @Override // defpackage.udf
    public final void onCancel() {
    }

    @Override // defpackage.udf
    public final void onStop() {
        rgf rgfVar = this.a;
        ((gme) rgfVar.r).setValue(null);
        ((gme) rgfVar.s).setValue(null);
    }
}
