package androidx.compose.ui.layout;

import androidx.compose.ui.e;
import defpackage.qx9;
import defpackage.wl7;
import defpackage.zl8;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/LayoutIdElement;", "Lqx9;", "Lzl8;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class LayoutIdElement extends qx9<zl8> {
    public final String b;

    public LayoutIdElement(String str) {
        this.b = str;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        zl8 zl8Var = new zl8();
        zl8Var.d0 = this.b;
        return zl8Var;
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        ((zl8) cVar).d0 = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdElement) && wl7.b(this.b, ((LayoutIdElement) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + ((Object) this.b) + ')';
    }
}
