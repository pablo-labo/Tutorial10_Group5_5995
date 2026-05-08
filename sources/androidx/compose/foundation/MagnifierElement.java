package androidx.compose.foundation;

import android.view.View;
import androidx.compose.ui.e;
import defpackage.gu5;
import defpackage.h89;
import defpackage.i89;
import defpackage.ia;
import defpackage.iy3;
import defpackage.j6g;
import defpackage.j94;
import defpackage.k6;
import defpackage.m94;
import defpackage.ooa;
import defpackage.qx9;
import defpackage.r5e;
import defpackage.us3;
import defpackage.vs3;
import defpackage.wbb;
import defpackage.wl7;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/MagnifierElement;", "Lqx9;", "Lh89;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MagnifierElement extends qx9<h89> {
    public final Function1<iy3, ooa> b;
    public final Function1<m94, j6g> c;
    public final float d = Float.NaN;
    public final boolean e = true;
    public final long f = 9205357640488583168L;
    public final float g = Float.NaN;
    public final float h = Float.NaN;
    public final boolean i = true;
    public final wbb j;

    public MagnifierElement(Function1 function1, Function1 function12, wbb wbbVar) {
        this.b = function1;
        this.c = function12;
        this.j = wbbVar;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        return new h89(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        h89 h89Var = (h89) cVar;
        float f = h89Var.f0;
        long j = h89Var.h0;
        float f2 = h89Var.i0;
        boolean z = h89Var.g0;
        float f3 = h89Var.j0;
        boolean z2 = h89Var.k0;
        wbb wbbVar = h89Var.l0;
        View view = h89Var.m0;
        iy3 iy3Var = h89Var.n0;
        h89Var.d0 = this.b;
        float f4 = this.d;
        h89Var.f0 = f4;
        boolean z3 = this.e;
        h89Var.g0 = z3;
        long j2 = this.f;
        h89Var.h0 = j2;
        float f5 = this.g;
        h89Var.i0 = f5;
        float f6 = this.h;
        h89Var.j0 = f6;
        boolean z4 = this.i;
        h89Var.k0 = z4;
        h89Var.e0 = this.c;
        wbb wbbVar2 = this.j;
        h89Var.l0 = wbbVar2;
        View viewA = vs3.a(h89Var);
        iy3 iy3Var2 = us3.f(h89Var).m0;
        if (h89Var.o0 != null) {
            r5e<gu5<ooa>> r5eVar = i89.a;
            if (((!Float.isNaN(f4) || !Float.isNaN(f)) && f4 != f && !wbbVar2.a()) || j2 != j || !j94.c(f5, f2) || !j94.c(f6, f3) || z3 != z || z4 != z2 || !wl7.b(wbbVar2, wbbVar) || !viewA.equals(view) || !wl7.b(iy3Var2, iy3Var)) {
                h89Var.d2();
            }
        }
        h89Var.e2();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MagnifierElement) {
            MagnifierElement magnifierElement = (MagnifierElement) obj;
            if (this.b == magnifierElement.b && this.d == magnifierElement.d && this.e == magnifierElement.e && this.f == magnifierElement.f && j94.c(this.g, magnifierElement.g) && j94.c(this.h, magnifierElement.h) && this.i == magnifierElement.i && this.c == magnifierElement.c && wl7.b(this.j, magnifierElement.j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iF = ia.f(k6.c(k6.c(ia.d(ia.f(k6.c(this.b.hashCode() * 961, this.d, 31), 31, this.e), 31, this.f), this.g, 31), this.h, 31), 31, this.i);
        Function1<m94, j6g> function1 = this.c;
        return this.j.hashCode() + ((iF + (function1 != null ? function1.hashCode() : 0)) * 31);
    }
}
