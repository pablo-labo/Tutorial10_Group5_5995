package androidx.compose.ui.input.rotary;

import androidx.compose.ui.e;
import defpackage.qx9;
import defpackage.tfd;
import defpackage.ufd;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/rotary/RotaryInputElement;", "Lqx9;", "Ltfd;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class RotaryInputElement extends qx9<tfd> {
    public final Function1<ufd, Boolean> b;

    public RotaryInputElement(Function1 function1) {
        this.b = function1;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        tfd tfdVar = new tfd();
        tfdVar.d0 = this.b;
        return tfdVar;
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        ((tfd) cVar).d0 = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RotaryInputElement) {
            return this.b == ((RotaryInputElement) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        Function1<ufd, Boolean> function1 = this.b;
        return (function1 != null ? function1.hashCode() : 0) * 31;
    }
}
