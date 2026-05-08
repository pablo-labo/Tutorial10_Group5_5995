package androidx.compose.foundation;

import androidx.compose.ui.e;
import defpackage.ia;
import defpackage.qx9;
import defpackage.vrd;
import defpackage.wl7;
import defpackage.zrd;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ScrollingLayoutElement;", "Lqx9;", "Lvrd;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScrollingLayoutElement extends qx9<vrd> {
    public final zrd b;
    public final boolean c;

    public ScrollingLayoutElement(zrd zrdVar, boolean z) {
        this.b = zrdVar;
        this.c = z;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        vrd vrdVar = new vrd();
        vrdVar.d0 = this.b;
        vrdVar.e0 = this.c;
        return vrdVar;
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        vrd vrdVar = (vrd) cVar;
        vrdVar.d0 = this.b;
        vrdVar.e0 = this.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        return wl7.b(this.b, scrollingLayoutElement.b) && this.c == scrollingLayoutElement.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ia.f(this.b.hashCode() * 31, 31, false);
    }
}
