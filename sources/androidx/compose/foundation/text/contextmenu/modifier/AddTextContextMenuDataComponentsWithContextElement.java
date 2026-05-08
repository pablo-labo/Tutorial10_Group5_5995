package androidx.compose.foundation.text.contextmenu.modifier;

import android.content.Context;
import androidx.compose.ui.e;
import defpackage.j6g;
import defpackage.ox;
import defpackage.px;
import defpackage.qx9;
import defpackage.wcf;
import defpackage.yh;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/modifier/AddTextContextMenuDataComponentsWithContextElement;", "Lqx9;", "Lpx;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class AddTextContextMenuDataComponentsWithContextElement extends qx9<px> {
    public final Function2<wcf, Context, j6g> b;

    /* JADX WARN: Multi-variable type inference failed */
    public AddTextContextMenuDataComponentsWithContextElement(Function2<? super wcf, ? super Context, j6g> function2) {
        this.b = function2;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        px pxVar = new px();
        pxVar.f0 = this.b;
        yh yhVar = new yh(pxVar, 2);
        ox oxVar = new ox();
        oxVar.d0 = yhVar;
        pxVar.c2(oxVar);
        return pxVar;
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        ((px) cVar).f0 = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AddTextContextMenuDataComponentsWithContextElement) {
            return this.b == ((AddTextContextMenuDataComponentsWithContextElement) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
