package androidx.compose.foundation;

import androidx.compose.ui.e;
import defpackage.d3a;
import defpackage.dwa;
import defpackage.ia;
import defpackage.mn1;
import defpackage.nh5;
import defpackage.nsd;
import defpackage.nxa;
import defpackage.qx9;
import defpackage.rsd;
import defpackage.wl7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ScrollingContainerElement;", "Lqx9;", "Lrsd;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ScrollingContainerElement extends qx9<rsd> {
    public final nsd b;
    public final dwa c;
    public final boolean d;
    public final boolean e;
    public final nh5 f;
    public final d3a g;
    public final mn1 h;
    public final boolean i;
    public final nxa j;

    public ScrollingContainerElement(mn1 mn1Var, nh5 nh5Var, d3a d3aVar, dwa dwaVar, nxa nxaVar, nsd nsdVar, boolean z, boolean z2, boolean z3) {
        this.b = nsdVar;
        this.c = dwaVar;
        this.d = z;
        this.e = z2;
        this.f = nh5Var;
        this.g = d3aVar;
        this.h = mn1Var;
        this.i = z3;
        this.j = nxaVar;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        rsd rsdVar = new rsd();
        rsdVar.f0 = this.b;
        rsdVar.g0 = this.c;
        rsdVar.h0 = this.d;
        rsdVar.i0 = this.e;
        rsdVar.j0 = this.f;
        rsdVar.k0 = this.g;
        rsdVar.l0 = this.h;
        rsdVar.m0 = this.i;
        rsdVar.n0 = this.j;
        return rsdVar;
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        ((rsd) cVar).h2(this.h, this.f, this.g, this.c, this.j, this.b, this.i, this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ScrollingContainerElement.class != obj.getClass()) {
            return false;
        }
        ScrollingContainerElement scrollingContainerElement = (ScrollingContainerElement) obj;
        return wl7.b(this.b, scrollingContainerElement.b) && this.c == scrollingContainerElement.c && this.d == scrollingContainerElement.d && this.e == scrollingContainerElement.e && wl7.b(this.f, scrollingContainerElement.f) && wl7.b(this.g, scrollingContainerElement.g) && wl7.b(this.h, scrollingContainerElement.h) && this.i == scrollingContainerElement.i && wl7.b(this.j, scrollingContainerElement.j);
    }

    public final int hashCode() {
        int iF = ia.f(ia.f((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d), 31, this.e);
        nh5 nh5Var = this.f;
        int iHashCode = (iF + (nh5Var != null ? nh5Var.hashCode() : 0)) * 31;
        d3a d3aVar = this.g;
        int iHashCode2 = (iHashCode + (d3aVar != null ? d3aVar.hashCode() : 0)) * 31;
        mn1 mn1Var = this.h;
        int iF2 = ia.f((iHashCode2 + (mn1Var != null ? mn1Var.hashCode() : 0)) * 31, 31, this.i);
        nxa nxaVar = this.j;
        return iF2 + (nxaVar != null ? nxaVar.hashCode() : 0);
    }
}
