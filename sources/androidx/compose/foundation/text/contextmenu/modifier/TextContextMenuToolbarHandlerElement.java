package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.ui.e;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.ndf;
import defpackage.qtc;
import defpackage.qx9;
import defpackage.sl8;
import defpackage.tu2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerElement;", "Lqx9;", "Lndf;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class TextContextMenuToolbarHandlerElement extends qx9<ndf> {
    public final tu2 b;
    public final Function1<lu2<? super j6g>, Object> c;
    public final Function1<lu2<? super j6g>, Object> d;
    public final Function1<sl8, qtc> e;

    /* JADX WARN: Multi-variable type inference failed */
    public TextContextMenuToolbarHandlerElement(tu2 tu2Var, Function1<? super lu2<? super j6g>, ? extends Object> function1, Function1<? super lu2<? super j6g>, ? extends Object> function12, Function1<? super sl8, qtc> function13) {
        this.b = tu2Var;
        this.c = function1;
        this.d = function12;
        this.e = function13;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        return new ndf(this.b, this.c, this.d, this.e);
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        ndf ndfVar = (ndf) cVar;
        ndfVar.f0.a = null;
        tu2 tu2Var = this.b;
        ndfVar.f0 = tu2Var;
        tu2Var.a = ndfVar;
        ndfVar.g0 = this.c;
        ndfVar.h0 = this.d;
        ndfVar.i0 = this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextContextMenuToolbarHandlerElement)) {
            return false;
        }
        TextContextMenuToolbarHandlerElement textContextMenuToolbarHandlerElement = (TextContextMenuToolbarHandlerElement) obj;
        return this.b == textContextMenuToolbarHandlerElement.b && this.c == textContextMenuToolbarHandlerElement.c && this.d == textContextMenuToolbarHandlerElement.d && this.e == textContextMenuToolbarHandlerElement.e;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        Function1<lu2<? super j6g>, Object> function1 = this.c;
        int iHashCode2 = (iHashCode + (function1 != null ? function1.hashCode() : 0)) * 31;
        Function1<lu2<? super j6g>, Object> function12 = this.d;
        return this.e.hashCode() + ((iHashCode2 + (function12 != null ? function12.hashCode() : 0)) * 31);
    }
}
