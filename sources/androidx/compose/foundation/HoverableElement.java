package androidx.compose.foundation;

import androidx.compose.ui.e;
import defpackage.d3a;
import defpackage.lk6;
import defpackage.qx9;
import defpackage.wl7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/HoverableElement;", "Lqx9;", "Llk6;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class HoverableElement extends qx9<lk6> {
    public final d3a b;

    public HoverableElement(d3a d3aVar) {
        this.b = d3aVar;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        lk6 lk6Var = new lk6();
        lk6Var.d0 = this.b;
        return lk6Var;
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        lk6 lk6Var = (lk6) cVar;
        d3a d3aVar = lk6Var.d0;
        d3a d3aVar2 = this.b;
        if (wl7.b(d3aVar, d3aVar2)) {
            return;
        }
        lk6Var.e2();
        lk6Var.d0 = d3aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HoverableElement) && wl7.b(((HoverableElement) obj).b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() * 31;
    }
}
