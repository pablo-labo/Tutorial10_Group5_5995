package androidx.compose.foundation.lazy;

import androidx.compose.ui.e;
import defpackage.e4b;
import defpackage.ese;
import defpackage.qx9;
import defpackage.wl7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/ParentSizeElement;", "Lqx9;", "Le4b;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ParentSizeElement extends qx9<e4b> {
    public final float b = 1.0f;
    public final ese<Integer> c;

    public ParentSizeElement(ese eseVar) {
        this.c = eseVar;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        e4b e4bVar = new e4b();
        e4bVar.d0 = this.b;
        e4bVar.e0 = this.c;
        return e4bVar;
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        e4b e4bVar = (e4b) cVar;
        e4bVar.d0 = this.b;
        e4bVar.e0 = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParentSizeElement)) {
            return false;
        }
        ParentSizeElement parentSizeElement = (ParentSizeElement) obj;
        return this.b == parentSizeElement.b && wl7.b(this.c, parentSizeElement.c);
    }

    public final int hashCode() {
        ese<Integer> eseVar = this.c;
        return Float.hashCode(this.b) + ((eseVar != null ? eseVar.hashCode() : 0) * 961);
    }
}
