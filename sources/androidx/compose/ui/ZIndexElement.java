package androidx.compose.ui;

import androidx.compose.ui.e;
import defpackage.l6;
import defpackage.qx9;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/ZIndexElement;", "Lqx9;", "Landroidx/compose/ui/f;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ZIndexElement extends qx9<f> {
    public final float b;

    public ZIndexElement(float f) {
        this.b = f;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        f fVar = new f();
        fVar.d0 = this.b;
        return fVar;
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        ((f) cVar).d0 = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZIndexElement) && Float.compare(this.b, ((ZIndexElement) obj).b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b);
    }

    public final String toString() {
        return l6.h(new StringBuilder("ZIndexElement(zIndex="), this.b, ')');
    }
}
