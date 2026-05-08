package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.e;
import defpackage.bq8;
import defpackage.cq8;
import defpackage.dwa;
import defpackage.ia;
import defpackage.qx9;
import defpackage.wl7;
import defpackage.zp8;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierElement;", "Lqx9;", "Lbq8;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class LazyLayoutBeyondBoundsModifierElement extends qx9<bq8> {
    public final cq8 b;
    public final zp8 c;
    public final boolean d;
    public final dwa e;

    public LazyLayoutBeyondBoundsModifierElement(cq8 cq8Var, zp8 zp8Var, boolean z, dwa dwaVar) {
        this.b = cq8Var;
        this.c = zp8Var;
        this.d = z;
        this.e = dwaVar;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        bq8 bq8Var = new bq8();
        bq8Var.d0 = this.b;
        bq8Var.e0 = this.c;
        bq8Var.f0 = this.d;
        bq8Var.g0 = this.e;
        return bq8Var;
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        bq8 bq8Var = (bq8) cVar;
        bq8Var.d0 = this.b;
        bq8Var.e0 = this.c;
        bq8Var.f0 = this.d;
        bq8Var.g0 = this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutBeyondBoundsModifierElement)) {
            return false;
        }
        LazyLayoutBeyondBoundsModifierElement lazyLayoutBeyondBoundsModifierElement = (LazyLayoutBeyondBoundsModifierElement) obj;
        return wl7.b(this.b, lazyLayoutBeyondBoundsModifierElement.b) && wl7.b(this.c, lazyLayoutBeyondBoundsModifierElement.c) && this.d == lazyLayoutBeyondBoundsModifierElement.d && this.e == lazyLayoutBeyondBoundsModifierElement.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ia.f((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d);
    }
}
