package defpackage;

import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import defpackage.hu8;

/* JADX INFO: loaded from: classes.dex */
public final class zt8 extends e.c implements ocb, nm2, z96, hu8.a {
    public hu8 d0;
    public lu8 e0;
    public rgf f0;
    public final g4a g0 = r.f(null);

    public zt8(hu8 hu8Var, lu8 lu8Var, rgf rgfVar) {
        this.d0 = hu8Var;
        this.e0 = lu8Var;
        this.f0 = rgfVar;
    }

    @Override // hu8.a
    public final uqe C(b80 b80Var) {
        if (!this.c0) {
            return null;
        }
        return u63.Y(Q1(), null, i13.d, new yt8(this, b80Var, null), 1);
    }

    @Override // hu8.a
    public final sl8 K() {
        return (sl8) ((gme) this.g0).getValue();
    }

    @Override // hu8.a
    public final lu8 K1() {
        return this.e0;
    }

    @Override // androidx.compose.ui.e.c
    public final void U1() {
        hu8 hu8Var = this.d0;
        if (hu8Var.a != null) {
            de7.c("Expected textInputModifierNode to be null");
        }
        hu8Var.a = this;
    }

    @Override // androidx.compose.ui.e.c
    public final void V1() {
        this.d0.j(this);
    }

    @Override // hu8.a
    public final rgf d1() {
        return this.f0;
    }

    @Override // hu8.a
    public final hne getSoftwareKeyboardController() {
        return (hne) om2.a(this, um2.p);
    }

    @Override // hu8.a
    public final opg getViewConfiguration() {
        return (opg) om2.a(this, um2.s);
    }

    @Override // defpackage.z96
    public final void n0(tia tiaVar) {
        ((gme) this.g0).setValue(tiaVar);
    }
}
