package androidx.compose.foundation;

import androidx.compose.ui.e;
import defpackage.bt1;
import defpackage.dce;
import defpackage.j94;
import defpackage.kne;
import defpackage.qx9;
import defpackage.sn1;
import defpackage.wl7;
import defpackage.yi1;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/BorderModifierNodeElement;", "Lqx9;", "Lyi1;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BorderModifierNodeElement extends qx9<yi1> {
    public final float b;
    public final kne c;
    public final dce d;

    public BorderModifierNodeElement(float f, kne kneVar, dce dceVar) {
        this.b = f;
        this.c = kneVar;
        this.d = dceVar;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        return new yi1(this.b, this.c, this.d);
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        yi1 yi1Var = (yi1) cVar;
        float f = yi1Var.g0;
        bt1 bt1Var = yi1Var.j0;
        float f2 = this.b;
        if (!j94.c(f, f2)) {
            yi1Var.g0 = f2;
            bt1Var.U0();
        }
        sn1 sn1Var = yi1Var.h0;
        kne kneVar = this.c;
        if (!wl7.b(sn1Var, kneVar)) {
            yi1Var.h0 = kneVar;
            bt1Var.U0();
        }
        dce dceVar = yi1Var.i0;
        dce dceVar2 = this.d;
        if (wl7.b(dceVar, dceVar2)) {
            return;
        }
        yi1Var.i0 = dceVar2;
        bt1Var.U0();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return j94.c(this.b, borderModifierNodeElement.b) && wl7.b(this.c, borderModifierNodeElement.c) && wl7.b(this.d, borderModifierNodeElement.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (Float.hashCode(this.b) * 31)) * 31);
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) j94.e(this.b)) + ", brush=" + this.c + ", shape=" + this.d + ')';
    }
}
