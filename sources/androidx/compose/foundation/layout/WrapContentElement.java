package androidx.compose.foundation.layout;

import androidx.compose.ui.e;
import defpackage.ia;
import defpackage.lh7;
import defpackage.o54;
import defpackage.qx9;
import defpackage.th7;
import defpackage.v4h;
import defpackage.vl8;
import defpackage.wl7;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/WrapContentElement;", "Lqx9;", "Lv4h;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class WrapContentElement extends qx9<v4h> {
    public final o54 b;
    public final Function2<th7, vl8, lh7> c;
    public final Object d;

    public WrapContentElement(o54 o54Var, Function2 function2, Object obj) {
        this.b = o54Var;
        this.c = function2;
        this.d = obj;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        v4h v4hVar = new v4h();
        v4hVar.d0 = this.b;
        v4hVar.e0 = this.c;
        return v4hVar;
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        v4h v4hVar = (v4h) cVar;
        v4hVar.d0 = this.b;
        v4hVar.e0 = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WrapContentElement.class != obj.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        return this.b == wrapContentElement.b && wl7.b(this.d, wrapContentElement.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ia.f(this.b.hashCode() * 31, 31, false);
    }
}
