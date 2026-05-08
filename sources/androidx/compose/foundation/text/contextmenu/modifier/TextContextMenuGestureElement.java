package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.ui.e;
import defpackage.bdf;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.qx9;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuGestureElement;", "Lqx9;", "Lbdf;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class TextContextMenuGestureElement extends qx9<bdf> {
    public final Function1<lu2<? super j6g>, Object> b;

    /* JADX WARN: Multi-variable type inference failed */
    public TextContextMenuGestureElement(Function1<? super lu2<? super j6g>, ? extends Object> function1) {
        this.b = function1;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        return new bdf(this.b);
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        ((bdf) cVar).f0 = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TextContextMenuGestureElement) {
            return this.b == ((TextContextMenuGestureElement) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        Function1<lu2<? super j6g>, Object> function1 = this.b;
        if (function1 != null) {
            return function1.hashCode();
        }
        return 0;
    }
}
