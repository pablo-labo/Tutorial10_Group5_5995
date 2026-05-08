package androidx.compose.ui.input.pointer;

import androidx.compose.ui.e;
import defpackage.k1f;
import defpackage.qx9;
import defpackage.udf;
import defpackage.wl7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;", "Lqx9;", "Lk1f;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SuspendPointerInputElement extends qx9<k1f> {
    public final Object b;
    public final Object c;
    public final PointerInputEventHandler d;

    public SuspendPointerInputElement(Object obj, udf udfVar, PointerInputEventHandler pointerInputEventHandler, int i) {
        udfVar = (i & 2) != 0 ? null : udfVar;
        this.b = obj;
        this.c = udfVar;
        this.d = pointerInputEventHandler;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        return new k1f(this.b, this.c, this.d);
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        k1f k1fVar = (k1f) cVar;
        Object obj = k1fVar.d0;
        Object obj2 = this.b;
        boolean z = !wl7.b(obj, obj2);
        k1fVar.d0 = obj2;
        Object obj3 = k1fVar.e0;
        Object obj4 = this.c;
        if (!wl7.b(obj3, obj4)) {
            z = true;
        }
        k1fVar.e0 = obj4;
        Class<?> cls = k1fVar.f0.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.d;
        if (cls == pointerInputEventHandler.getClass() ? z : true) {
            k1fVar.K0();
        }
        k1fVar.f0 = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        return wl7.b(this.b, suspendPointerInputElement.b) && wl7.b(this.c, suspendPointerInputElement.c) && this.d == suspendPointerInputElement.d;
    }

    public final int hashCode() {
        Object obj = this.b;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.c;
        return this.d.hashCode() + ((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 961);
    }
}
