package androidx.compose.ui.focus;

import androidx.compose.ui.e;
import androidx.compose.ui.focus.b;
import defpackage.pm5;
import defpackage.qx9;
import defpackage.wl7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusPropertiesElement;", "Lqx9;", "Lpm5;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class FocusPropertiesElement extends qx9<pm5> {
    public final b.a b;

    public FocusPropertiesElement(b.a aVar) {
        this.b = aVar;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        pm5 pm5Var = new pm5();
        pm5Var.d0 = this.b;
        return pm5Var;
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        ((pm5) cVar).d0 = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusPropertiesElement) && wl7.b(this.b, ((FocusPropertiesElement) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "FocusPropertiesElement(scope=" + this.b + ')';
    }
}
