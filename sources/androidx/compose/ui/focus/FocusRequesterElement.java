package androidx.compose.ui.focus;

import androidx.compose.ui.e;
import defpackage.qx9;
import defpackage.sm5;
import defpackage.wl7;
import defpackage.wm5;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusRequesterElement;", "Lqx9;", "Lwm5;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class FocusRequesterElement extends qx9<wm5> {
    public final sm5 b;

    public FocusRequesterElement(sm5 sm5Var) {
        this.b = sm5Var;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        wm5 wm5Var = new wm5();
        wm5Var.d0 = this.b;
        return wm5Var;
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        wm5 wm5Var = (wm5) cVar;
        wm5Var.d0.a.j(wm5Var);
        sm5 sm5Var = this.b;
        wm5Var.d0 = sm5Var;
        sm5Var.a.b(wm5Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && wl7.b(this.b, ((FocusRequesterElement) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.b + ')';
    }
}
