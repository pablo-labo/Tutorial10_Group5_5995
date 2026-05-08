package androidx.compose.foundation.layout;

import androidx.compose.ui.e;
import defpackage.j94;
import defpackage.k6;
import defpackage.m6;
import defpackage.pm8;
import defpackage.qoa;
import defpackage.qx9;
import defpackage.soa;
import defpackage.us3;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/OffsetElement;", "Lqx9;", "Lsoa;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class OffsetElement extends qx9<soa> {
    public final float b;
    public final float c;
    public final boolean d = true;

    public OffsetElement(float f, float f2, qoa qoaVar) {
        this.b = f;
        this.c = f2;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        soa soaVar = new soa();
        soaVar.d0 = this.b;
        soaVar.e0 = this.c;
        soaVar.f0 = this.d;
        return soaVar;
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        soa soaVar = (soa) cVar;
        float f = soaVar.d0;
        float f2 = this.b;
        boolean zC = j94.c(f, f2);
        float f3 = this.c;
        boolean z = this.d;
        if (!zC || !j94.c(soaVar.e0, f3) || soaVar.f0 != z) {
            pm8 pm8VarF = us3.f(soaVar);
            pm8.c cVar2 = pm8.F0;
            pm8VarF.i0(false);
        }
        soaVar.d0 = f2;
        soaVar.e0 = f3;
        soaVar.f0 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetElement offsetElement = obj instanceof OffsetElement ? (OffsetElement) obj : null;
        return offsetElement != null && j94.c(this.b, offsetElement.b) && j94.c(this.c, offsetElement.c) && this.d == offsetElement.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + k6.c(Float.hashCode(this.b) * 31, this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OffsetModifierElement(x=");
        sb.append((Object) j94.e(this.b));
        sb.append(", y=");
        sb.append((Object) j94.e(this.c));
        sb.append(", rtlAware=");
        return m6.i(sb, this.d, ')');
    }
}
