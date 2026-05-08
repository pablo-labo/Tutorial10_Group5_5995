package androidx.compose.foundation.layout;

import androidx.compose.ui.e;
import defpackage.cd;
import defpackage.gza;
import defpackage.jza;
import defpackage.qx9;
import defpackage.wl7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValuesElement;", "Lqx9;", "Ljza;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class PaddingValuesElement extends qx9<jza> {
    public final gza b;

    public PaddingValuesElement(gza gzaVar, cd cdVar) {
        this.b = gzaVar;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        jza jzaVar = new jza();
        jzaVar.d0 = this.b;
        return jzaVar;
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        ((jza) cVar).d0 = this.b;
    }

    public final boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement = obj instanceof PaddingValuesElement ? (PaddingValuesElement) obj : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return wl7.b(this.b, paddingValuesElement.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
