package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.e;
import defpackage.i30;
import defpackage.ia;
import defpackage.jhf;
import defpackage.kjf;
import defpackage.lu8;
import defpackage.nj;
import defpackage.o03;
import defpackage.qx9;
import defpackage.rgf;
import defpackage.roa;
import defpackage.sm5;
import defpackage.t37;
import defpackage.us3;
import defpackage.vrf;
import defpackage.wl7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;", "Lqx9;", "Lo03;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CoreTextFieldSemanticsModifier extends qx9<o03> {
    public final vrf b;
    public final jhf c;
    public final lu8 d;
    public final boolean e;
    public final boolean f;
    public final roa g;
    public final rgf h;
    public final t37 i;
    public final sm5 j;

    public CoreTextFieldSemanticsModifier(vrf vrfVar, jhf jhfVar, lu8 lu8Var, boolean z, boolean z2, roa roaVar, rgf rgfVar, t37 t37Var, sm5 sm5Var) {
        this.b = vrfVar;
        this.c = jhfVar;
        this.d = lu8Var;
        this.e = z;
        this.f = z2;
        this.g = roaVar;
        this.h = rgfVar;
        this.i = t37Var;
        this.j = sm5Var;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        o03 o03Var = new o03();
        o03Var.f0 = this.b;
        o03Var.g0 = this.c;
        o03Var.h0 = this.d;
        o03Var.i0 = this.e;
        o03Var.j0 = this.f;
        o03Var.k0 = this.g;
        rgf rgfVar = this.h;
        o03Var.l0 = rgfVar;
        o03Var.m0 = this.i;
        o03Var.n0 = this.j;
        rgfVar.f = new i30(o03Var, 5);
        return o03Var;
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        o03 o03Var = (o03) cVar;
        boolean z = o03Var.j0;
        boolean z2 = false;
        boolean z3 = z && !o03Var.i0;
        t37 t37Var = o03Var.m0;
        rgf rgfVar = o03Var.l0;
        boolean z4 = this.e;
        boolean z5 = this.f;
        if (z5 && !z4) {
            z2 = true;
        }
        o03Var.f0 = this.b;
        jhf jhfVar = this.c;
        o03Var.g0 = jhfVar;
        o03Var.h0 = this.d;
        o03Var.i0 = z4;
        o03Var.j0 = z5;
        o03Var.k0 = this.g;
        rgf rgfVar2 = this.h;
        o03Var.l0 = rgfVar2;
        t37 t37Var2 = this.i;
        o03Var.m0 = t37Var2;
        o03Var.n0 = this.j;
        if (z5 != z || z2 != z3 || !wl7.b(t37Var2, t37Var) || !kjf.c(jhfVar.b)) {
            us3.f(o03Var).U();
        }
        if (wl7.b(rgfVar2, rgfVar)) {
            return;
        }
        rgfVar2.f = new nj(o03Var, 8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoreTextFieldSemanticsModifier)) {
            return false;
        }
        CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier = (CoreTextFieldSemanticsModifier) obj;
        return wl7.b(this.b, coreTextFieldSemanticsModifier.b) && wl7.b(this.c, coreTextFieldSemanticsModifier.c) && wl7.b(this.d, coreTextFieldSemanticsModifier.d) && this.e == coreTextFieldSemanticsModifier.e && this.f == coreTextFieldSemanticsModifier.f && wl7.b(this.g, coreTextFieldSemanticsModifier.g) && wl7.b(this.h, coreTextFieldSemanticsModifier.h) && wl7.b(this.i, coreTextFieldSemanticsModifier.i) && wl7.b(this.j, coreTextFieldSemanticsModifier.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ia.f(ia.f(ia.f((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31, 31, this.e), 31, this.f), 31, false)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.b + ", value=" + this.c + ", state=" + this.d + ", readOnly=" + this.e + ", enabled=" + this.f + ", isPassword=false, offsetMapping=" + this.g + ", manager=" + this.h + ", imeOptions=" + this.i + ", focusRequester=" + this.j + ')';
    }
}
