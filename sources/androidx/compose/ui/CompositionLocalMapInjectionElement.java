package androidx.compose.ui;

import androidx.compose.ui.e;
import defpackage.qx9;
import defpackage.sm2;
import defpackage.us3;
import defpackage.wl7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/CompositionLocalMapInjectionElement;", "Lqx9;", "Landroidx/compose/ui/d;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CompositionLocalMapInjectionElement extends qx9<d> {
    public final sm2 b;

    public CompositionLocalMapInjectionElement(sm2 sm2Var) {
        this.b = sm2Var;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        d dVar = new d();
        dVar.d0 = this.b;
        return dVar;
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        d dVar = (d) cVar;
        sm2 sm2Var = this.b;
        dVar.d0 = sm2Var;
        us3.f(dVar).r(sm2Var);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof CompositionLocalMapInjectionElement) && wl7.b(((CompositionLocalMapInjectionElement) obj).b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
