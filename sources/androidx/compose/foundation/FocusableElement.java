package androidx.compose.foundation;

import androidx.compose.ui.e;
import defpackage.d3a;
import defpackage.fn5;
import defpackage.qx9;
import defpackage.wl7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/FocusableElement;", "Lqx9;", "Lfn5;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class FocusableElement extends qx9<fn5> {
    public final d3a b;

    public FocusableElement(d3a d3aVar) {
        this.b = d3aVar;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        return new fn5(this.b, 1, null);
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        ((fn5) cVar).h2(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FocusableElement) {
            return wl7.b(this.b, ((FocusableElement) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        d3a d3aVar = this.b;
        if (d3aVar != null) {
            return d3aVar.hashCode();
        }
        return 0;
    }
}
