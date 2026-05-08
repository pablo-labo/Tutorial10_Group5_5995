package defpackage;

import defpackage.j29;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class tt8 extends ui8 {
    public final aue b;
    public final gu5<ui8> c;
    public final fla<ui8> d;

    /* JADX WARN: Multi-variable type inference failed */
    public tt8(aue aueVar, gu5<? extends ui8> gu5Var) {
        aueVar.getClass();
        this.b = aueVar;
        this.c = gu5Var;
        this.d = aueVar.f(gu5Var);
    }

    @Override // defpackage.ui8
    public final List K0() {
        return Q0().K0();
    }

    @Override // defpackage.ui8
    public final gwf L0() {
        return Q0().L0();
    }

    @Override // defpackage.ui8
    public final kwf M0() {
        return Q0().M0();
    }

    @Override // defpackage.ui8
    public final boolean N0() {
        return Q0().N0();
    }

    @Override // defpackage.ui8
    public final ui8 O0(bj8 bj8Var) {
        bj8Var.getClass();
        return new tt8(this.b, new ie8(1, bj8Var, this));
    }

    @Override // defpackage.ui8
    public final p7g P0() {
        ui8 ui8VarQ0 = Q0();
        while (ui8VarQ0 instanceof tt8) {
            ui8VarQ0 = ((tt8) ui8VarQ0).Q0();
        }
        ui8VarQ0.getClass();
        return (p7g) ui8VarQ0;
    }

    public final ui8 Q0() {
        return this.d.invoke();
    }

    public final boolean R0() {
        j29.f fVar = (j29.f) this.d;
        return (fVar.c == j29.l.a || fVar.c == j29.l.b) ? false : true;
    }

    @Override // defpackage.ui8
    public final in9 n() {
        return Q0().n();
    }

    public final String toString() {
        return R0() ? Q0().toString() : "<Not computed yet>";
    }
}
