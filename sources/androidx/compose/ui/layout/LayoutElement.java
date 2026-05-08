package androidx.compose.ui.layout;

import androidx.compose.ui.e;
import defpackage.bg9;
import defpackage.iq2;
import defpackage.km8;
import defpackage.qx9;
import defpackage.vf9;
import defpackage.wu5;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/LayoutElement;", "Lqx9;", "Lkm8;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class LayoutElement extends qx9<km8> {
    public final wu5<q, vf9, iq2, bg9> b;

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutElement(wu5<? super q, ? super vf9, ? super iq2, ? extends bg9> wu5Var) {
        this.b = wu5Var;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        km8 km8Var = new km8();
        km8Var.d0 = this.b;
        return km8Var;
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        ((km8) cVar).d0 = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LayoutElement) {
            return this.b == ((LayoutElement) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
