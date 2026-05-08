package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.e;
import defpackage.gu5;
import defpackage.j6g;
import defpackage.nwe;
import defpackage.qx9;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/handwriting/StylusHandwritingElement;", "Lqx9;", "Lnwe;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class StylusHandwritingElement extends qx9<nwe> {
    public final gu5<j6g> b;

    public StylusHandwritingElement(gu5<j6g> gu5Var) {
        this.b = gu5Var;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        return new nwe(this.b);
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        ((nwe) cVar).f0 = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StylusHandwritingElement) {
            return this.b == ((StylusHandwritingElement) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
