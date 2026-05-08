package androidx.compose.ui.layout;

import androidx.compose.ui.e;
import defpackage.j6g;
import defpackage.kra;
import defpackage.qx9;
import defpackage.th7;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/OnSizeChangedModifier;", "Lqx9;", "Lkra;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class OnSizeChangedModifier extends qx9<kra> {
    public final Function1<th7, j6g> b;

    /* JADX WARN: Multi-variable type inference failed */
    public OnSizeChangedModifier(Function1<? super th7, j6g> function1) {
        this.b = function1;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        return new kra(this.b);
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        kra kraVar = (kra) cVar;
        kraVar.d0 = this.b;
        kraVar.f0 = -9223372034707292160L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnSizeChangedModifier) {
            return this.b == ((OnSizeChangedModifier) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
