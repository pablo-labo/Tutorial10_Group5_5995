package androidx.compose.ui.draw;

import androidx.compose.ui.e;
import defpackage.ct1;
import defpackage.ft1;
import defpackage.nfa;
import defpackage.qx9;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/DrawWithCacheElement;", "Lqx9;", "Lct1;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class DrawWithCacheElement extends qx9<ct1> {
    public final Function1<ft1, nfa> b;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawWithCacheElement(Function1<? super ft1, nfa> function1) {
        this.b = function1;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        return new ct1(new ft1(), this.b);
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        ct1 ct1Var = (ct1) cVar;
        ct1Var.g0 = this.b;
        ct1Var.U0();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DrawWithCacheElement) {
            return this.b == ((DrawWithCacheElement) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
