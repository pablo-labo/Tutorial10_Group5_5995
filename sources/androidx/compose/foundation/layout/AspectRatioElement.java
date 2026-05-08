package androidx.compose.foundation.layout;

import androidx.compose.ui.e;
import defpackage.cu0;
import defpackage.j6g;
import defpackage.qx9;
import defpackage.wf7;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/AspectRatioElement;", "Lqx9;", "Lcu0;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class AspectRatioElement extends qx9<cu0> {
    public final float b = 0.8f;
    public final Function1<wf7, j6g> c;

    public AspectRatioElement(Function1 function1) {
        this.c = function1;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        cu0 cu0Var = new cu0();
        cu0Var.d0 = this.b;
        return cu0Var;
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        ((cu0) cVar).d0 = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AspectRatioElement aspectRatioElement = obj instanceof AspectRatioElement ? (AspectRatioElement) obj : null;
        if (aspectRatioElement == null || this.b != aspectRatioElement.b) {
            return false;
        }
        ((AspectRatioElement) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Float.hashCode(this.b) * 31);
    }
}
