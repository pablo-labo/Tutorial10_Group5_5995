package androidx.compose.foundation;

import androidx.compose.ui.e;
import defpackage.da2;
import defpackage.dce;
import defpackage.fb4;
import defpackage.j6g;
import defpackage.k6;
import defpackage.qx9;
import defpackage.sn1;
import defpackage.t71;
import defpackage.wf7;
import defpackage.wl7;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/BackgroundElement;", "Lqx9;", "Lt71;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class BackgroundElement extends qx9<t71> {
    public final long b;
    public final sn1 c;
    public final float d;
    public final dce e;
    public final Function1<wf7, j6g> f;

    public BackgroundElement(long j, sn1 sn1Var, dce dceVar, Function1 function1, int i) {
        j = (i & 1) != 0 ? da2.i : j;
        sn1Var = (i & 2) != 0 ? null : sn1Var;
        this.b = j;
        this.c = sn1Var;
        this.d = 1.0f;
        this.e = dceVar;
        this.f = function1;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        t71 t71Var = new t71();
        t71Var.d0 = this.b;
        t71Var.e0 = this.c;
        t71Var.f0 = this.d;
        t71Var.g0 = this.e;
        t71Var.h0 = 9205357640488583168L;
        return t71Var;
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        t71 t71Var = (t71) cVar;
        t71Var.d0 = this.b;
        t71Var.e0 = this.c;
        t71Var.f0 = this.d;
        t71Var.g0 = this.e;
        fb4.a(t71Var);
    }

    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        return backgroundElement != null && da2.c(this.b, backgroundElement.b) && wl7.b(this.c, backgroundElement.c) && this.d == backgroundElement.d && wl7.b(this.e, backgroundElement.e);
    }

    public final int hashCode() {
        int i = da2.j;
        int iHashCode = Long.hashCode(this.b) * 31;
        sn1 sn1Var = this.c;
        return this.e.hashCode() + k6.c((iHashCode + (sn1Var != null ? sn1Var.hashCode() : 0)) * 31, this.d, 31);
    }
}
