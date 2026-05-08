package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.e;
import defpackage.dwa;
import defpackage.gu5;
import defpackage.ia;
import defpackage.qx9;
import defpackage.rr8;
import defpackage.ur8;
import defpackage.us3;
import defpackage.wl7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;", "Lqx9;", "Lur8;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class LazyLayoutSemanticsModifier extends qx9<ur8> {
    public final gu5<c> b;
    public final rr8 c;
    public final dwa d;
    public final boolean e;
    public final boolean f;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyLayoutSemanticsModifier(gu5<? extends c> gu5Var, rr8 rr8Var, dwa dwaVar, boolean z, boolean z2) {
        this.b = gu5Var;
        this.c = rr8Var;
        this.d = dwaVar;
        this.e = z;
        this.f = z2;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        return new ur8(this.b, this.c, this.d, this.e, this.f);
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        ur8 ur8Var = (ur8) cVar;
        ur8Var.d0 = this.b;
        ur8Var.e0 = this.c;
        dwa dwaVar = ur8Var.f0;
        dwa dwaVar2 = this.d;
        if (dwaVar != dwaVar2) {
            ur8Var.f0 = dwaVar2;
            us3.f(ur8Var).U();
        }
        boolean z = ur8Var.g0;
        boolean z2 = this.e;
        boolean z3 = this.f;
        if (z == z2 && ur8Var.h0 == z3) {
            return;
        }
        ur8Var.g0 = z2;
        ur8Var.h0 = z3;
        ur8Var.c2();
        us3.f(ur8Var).U();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutSemanticsModifier)) {
            return false;
        }
        LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) obj;
        return this.b == lazyLayoutSemanticsModifier.b && wl7.b(this.c, lazyLayoutSemanticsModifier.c) && this.d == lazyLayoutSemanticsModifier.d && this.e == lazyLayoutSemanticsModifier.e && this.f == lazyLayoutSemanticsModifier.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ia.f((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31, 31, this.e);
    }
}
