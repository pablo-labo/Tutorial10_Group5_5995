package androidx.compose.foundation.layout;

import androidx.compose.ui.e;
import defpackage.j6g;
import defpackage.j94;
import defpackage.k6;
import defpackage.qie;
import defpackage.qx9;
import defpackage.wf7;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/SizeElement;", "Lqx9;", "Lqie;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class SizeElement extends qx9<qie> {
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final Function1<wf7, j6g> g;

    public /* synthetic */ SizeElement(float f, float f2, float f3, float f4, boolean z, Function1 function1, int i) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, z, function1);
    }

    @Override // defpackage.qx9
    public final e.c a() {
        qie qieVar = new qie();
        qieVar.d0 = this.b;
        qieVar.e0 = this.c;
        qieVar.f0 = this.d;
        qieVar.g0 = this.e;
        qieVar.h0 = this.f;
        return qieVar;
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        qie qieVar = (qie) cVar;
        qieVar.d0 = this.b;
        qieVar.e0 = this.c;
        qieVar.f0 = this.d;
        qieVar.g0 = this.e;
        qieVar.h0 = this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return j94.c(this.b, sizeElement.b) && j94.c(this.c, sizeElement.c) && j94.c(this.d, sizeElement.d) && j94.c(this.e, sizeElement.e) && this.f == sizeElement.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + k6.c(k6.c(k6.c(Float.hashCode(this.b) * 31, this.c, 31), this.d, 31), this.e, 31);
    }

    public SizeElement(float f, float f2, float f3, float f4, boolean z, Function1 function1) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = z;
        this.g = function1;
    }
}
