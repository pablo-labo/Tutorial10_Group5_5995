package androidx.compose.ui.input.key;

import androidx.compose.ui.e;
import defpackage.ng8;
import defpackage.qx9;
import defpackage.sg8;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/key/KeyInputElement;", "Lqx9;", "Lsg8;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class KeyInputElement extends qx9<sg8> {
    public final Function1<ng8, Boolean> b;
    public final Function1<ng8, Boolean> c;

    /* JADX WARN: Multi-variable type inference failed */
    public KeyInputElement(Function1<? super ng8, Boolean> function1, Function1<? super ng8, Boolean> function12) {
        this.b = function1;
        this.c = function12;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        sg8 sg8Var = new sg8();
        sg8Var.d0 = this.b;
        sg8Var.e0 = this.c;
        return sg8Var;
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        sg8 sg8Var = (sg8) cVar;
        sg8Var.d0 = this.b;
        sg8Var.e0 = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        return this.b == keyInputElement.b && this.c == keyInputElement.c;
    }

    public final int hashCode() {
        Function1<ng8, Boolean> function1 = this.b;
        int iHashCode = (function1 != null ? function1.hashCode() : 0) * 31;
        Function1<ng8, Boolean> function12 = this.c;
        return iHashCode + (function12 != null ? function12.hashCode() : 0);
    }
}
