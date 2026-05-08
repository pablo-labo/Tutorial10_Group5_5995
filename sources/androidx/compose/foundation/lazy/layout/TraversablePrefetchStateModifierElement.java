package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.e;
import defpackage.ktf;
import defpackage.mr8;
import defpackage.qx9;
import defpackage.wl7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/TraversablePrefetchStateModifierElement;", "Lqx9;", "Lktf;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class TraversablePrefetchStateModifierElement extends qx9<ktf> {
    public final mr8 b;

    public TraversablePrefetchStateModifierElement(mr8 mr8Var) {
        this.b = mr8Var;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        return new ktf(this.b);
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        ((ktf) cVar).d0 = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraversablePrefetchStateModifierElement) && wl7.b(this.b, ((TraversablePrefetchStateModifierElement) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.b + ')';
    }
}
