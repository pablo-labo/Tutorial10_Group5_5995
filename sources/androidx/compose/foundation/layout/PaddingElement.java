package androidx.compose.foundation.layout;

import androidx.compose.ui.e;
import defpackage.fza;
import defpackage.j6g;
import defpackage.j94;
import defpackage.k6;
import defpackage.qx9;
import defpackage.wf7;
import defpackage.yd7;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/PaddingElement;", "Lqx9;", "Lfza;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class PaddingElement extends qx9<fza> {
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final boolean f = true;
    public final Function1<wf7, j6g> g;

    public PaddingElement(float f, float f2, float f3, float f4, Function1 function1) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        boolean z = true;
        this.g = function1;
        boolean z2 = (f >= 0.0f || Float.isNaN(f)) & (f2 >= 0.0f || Float.isNaN(f2)) & (f3 >= 0.0f || Float.isNaN(f3));
        if (f4 < 0.0f && !Float.isNaN(f4)) {
            z = false;
        }
        if (!z2 || !z) {
            yd7.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.qx9
    public final e.c a() {
        fza fzaVar = new fza();
        fzaVar.d0 = this.b;
        fzaVar.e0 = this.c;
        fzaVar.f0 = this.d;
        fzaVar.g0 = this.e;
        fzaVar.h0 = this.f;
        return fzaVar;
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        fza fzaVar = (fza) cVar;
        fzaVar.d0 = this.b;
        fzaVar.e0 = this.c;
        fzaVar.f0 = this.d;
        fzaVar.g0 = this.e;
        fzaVar.h0 = this.f;
    }

    public final boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && j94.c(this.b, paddingElement.b) && j94.c(this.c, paddingElement.c) && j94.c(this.d, paddingElement.d) && j94.c(this.e, paddingElement.e) && this.f == paddingElement.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + k6.c(k6.c(k6.c(Float.hashCode(this.b) * 31, this.c, 31), this.d, 31), this.e, 31);
    }
}
