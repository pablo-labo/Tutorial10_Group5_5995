package defpackage;

import defpackage.aj8;

/* JADX INFO: loaded from: classes3.dex */
public final class qha implements pha {
    public final bj8 c;
    public final aj8 d;
    public final ixa e;

    public qha(bj8 bj8Var) {
        aj8.a aVar = aj8.a.d;
        bj8Var.getClass();
        aVar.getClass();
        this.c = bj8Var;
        this.d = aVar;
        this.e = new ixa(ixa.f, bj8Var, aVar);
    }

    @Override // defpackage.pha
    public final ixa a() {
        return this.e;
    }

    @Override // defpackage.vi8
    public final boolean b(ui8 ui8Var, ui8 ui8Var2) {
        ui8Var.getClass();
        ui8Var2.getClass();
        return w4.f(r62.a(false, null, this.d, this.c, 6), ui8Var.P0(), ui8Var2.P0());
    }

    @Override // defpackage.pha
    public final bj8 c() {
        return this.c;
    }

    public final boolean d(ui8 ui8Var, ui8 ui8Var2) {
        ui8Var.getClass();
        ui8Var2.getClass();
        iwf iwfVarA = r62.a(true, null, this.d, this.c, 6);
        p7g p7gVarP0 = ui8Var.P0();
        p7g p7gVarP02 = ui8Var2.P0();
        if (p7gVarP0 == p7gVarP02) {
            return true;
        }
        return w4.e(iwfVarA, p7gVarP0, p7gVarP02);
    }
}
