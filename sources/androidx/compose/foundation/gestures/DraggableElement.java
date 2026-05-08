package androidx.compose.foundation.gestures;

import androidx.compose.ui.e;
import defpackage.d3a;
import defpackage.dwa;
import defpackage.e13;
import defpackage.he;
import defpackage.ia;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.ooa;
import defpackage.qx9;
import defpackage.ua4;
import defpackage.wa4;
import defpackage.wl7;
import defpackage.wu5;
import defpackage.xa4;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/DraggableElement;", "Lqx9;", "Lwa4;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DraggableElement extends qx9<wa4> {
    public static final he j = new he(5);
    public final xa4 b;
    public final dwa c;
    public final boolean d;
    public final d3a e;
    public final boolean f;
    public final wu5<e13, ooa, lu2<? super j6g>, Object> g;
    public final wu5<e13, Float, lu2<? super j6g>, Object> h;
    public final boolean i;

    public DraggableElement(xa4 xa4Var, dwa dwaVar, boolean z, d3a d3aVar, boolean z2, ua4.a aVar, wu5 wu5Var, boolean z3) {
        this.b = xa4Var;
        this.c = dwaVar;
        this.d = z;
        this.e = d3aVar;
        this.f = z2;
        this.g = aVar;
        this.h = wu5Var;
        this.i = z3;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        he heVar = j;
        boolean z = this.d;
        d3a d3aVar = this.e;
        dwa dwaVar = this.c;
        wa4 wa4Var = new wa4(heVar, z, d3aVar, dwaVar);
        wa4Var.o0 = this.b;
        wa4Var.p0 = dwaVar;
        wa4Var.q0 = this.f;
        wa4Var.r0 = this.g;
        wa4Var.s0 = this.h;
        wa4Var.t0 = this.i;
        return wa4Var;
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        boolean z;
        boolean z2;
        wa4 wa4Var = (wa4) cVar;
        xa4 xa4Var = wa4Var.o0;
        xa4 xa4Var2 = this.b;
        if (wl7.b(xa4Var, xa4Var2)) {
            z = false;
        } else {
            wa4Var.o0 = xa4Var2;
            z = true;
        }
        dwa dwaVar = wa4Var.p0;
        dwa dwaVar2 = this.c;
        if (dwaVar != dwaVar2) {
            wa4Var.p0 = dwaVar2;
            z = true;
        }
        boolean z3 = wa4Var.t0;
        boolean z4 = this.i;
        if (z3 != z4) {
            wa4Var.t0 = z4;
            z2 = true;
        } else {
            z2 = z;
        }
        wa4Var.r0 = this.g;
        wa4Var.s0 = this.h;
        wa4Var.q0 = this.f;
        wa4Var.n2(j, this.d, this.e, dwaVar2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DraggableElement.class != obj.getClass()) {
            return false;
        }
        DraggableElement draggableElement = (DraggableElement) obj;
        return wl7.b(this.b, draggableElement.b) && this.c == draggableElement.c && this.d == draggableElement.d && wl7.b(this.e, draggableElement.e) && this.f == draggableElement.f && wl7.b(this.g, draggableElement.g) && wl7.b(this.h, draggableElement.h) && this.i == draggableElement.i;
    }

    public final int hashCode() {
        int iF = ia.f((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d);
        d3a d3aVar = this.e;
        return Boolean.hashCode(this.i) + ((this.h.hashCode() + ((this.g.hashCode() + ia.f((iF + (d3aVar != null ? d3aVar.hashCode() : 0)) * 31, 31, this.f)) * 31)) * 31);
    }
}
