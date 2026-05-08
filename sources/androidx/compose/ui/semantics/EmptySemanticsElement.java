package androidx.compose.ui.semantics;

import androidx.compose.ui.e;
import defpackage.gs4;
import defpackage.qx9;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/semantics/EmptySemanticsElement;", "Lqx9;", "Lgs4;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EmptySemanticsElement extends qx9<gs4> {
    public final gs4 b;

    public EmptySemanticsElement(gs4 gs4Var) {
        this.b = gs4Var;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        return this.b;
    }

    @Override // defpackage.qx9
    public final /* bridge */ /* synthetic */ void b(e.c cVar) {
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }
}
