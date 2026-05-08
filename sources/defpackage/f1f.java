package defpackage;

import androidx.compose.ui.e;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class f1f {
    public static final neb a = new neb(zr4.a, null);

    public static final class a implements PointerInputEventHandler, ev5 {
        public final /* synthetic */ Function2 a;

        public a(Function2 function2) {
            this.a = function2;
        }

        @Override // defpackage.ev5
        public final vu5<?> c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof PointerInputEventHandler) || !(obj instanceof ev5)) {
                return false;
            }
            return wl7.b(this.a, ((ev5) obj).c());
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final /* synthetic */ Object invoke(efb efbVar, lu2 lu2Var) {
            return this.a.invoke(efbVar, lu2Var);
        }
    }

    public static final k1f a(PointerInputEventHandler pointerInputEventHandler) {
        return new k1f(null, null, pointerInputEventHandler);
    }

    public static final e b(e eVar, Object obj, PointerInputEventHandler pointerInputEventHandler) {
        return eVar.o(new SuspendPointerInputElement(obj, null, pointerInputEventHandler, 6));
    }
}
