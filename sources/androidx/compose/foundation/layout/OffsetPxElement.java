package androidx.compose.foundation.layout;

import androidx.compose.ui.e;
import defpackage.iy3;
import defpackage.lh7;
import defpackage.m6;
import defpackage.pm8;
import defpackage.qx9;
import defpackage.uoa;
import defpackage.us3;
import defpackage.w31;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/OffsetPxElement;", "Lqx9;", "Luoa;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class OffsetPxElement extends qx9<uoa> {
    public final Function1<iy3, lh7> b;
    public final boolean c = true;

    public OffsetPxElement(Function1 function1, w31 w31Var) {
        this.b = function1;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        uoa uoaVar = new uoa();
        uoaVar.d0 = this.b;
        uoaVar.e0 = this.c;
        return uoaVar;
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        uoa uoaVar = (uoa) cVar;
        Function1<? super iy3, lh7> function1 = uoaVar.d0;
        Function1<iy3, lh7> function12 = this.b;
        boolean z = this.c;
        if (function1 != function12 || uoaVar.e0 != z) {
            pm8 pm8VarF = us3.f(uoaVar);
            pm8.c cVar2 = pm8.F0;
            pm8VarF.i0(false);
        }
        uoaVar.d0 = function12;
        uoaVar.e0 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetPxElement offsetPxElement = obj instanceof OffsetPxElement ? (OffsetPxElement) obj : null;
        return offsetPxElement != null && this.b == offsetPxElement.b && this.c == offsetPxElement.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OffsetPxModifier(offset=");
        sb.append(this.b);
        sb.append(", rtlAware=");
        return m6.i(sb, this.c, ')');
    }
}
