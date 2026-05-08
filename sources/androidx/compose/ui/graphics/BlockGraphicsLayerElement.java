package androidx.compose.ui.graphics;

import androidx.compose.ui.e;
import defpackage.cd6;
import defpackage.j6g;
import defpackage.qx9;
import defpackage.rh1;
import defpackage.tia;
import defpackage.us3;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/BlockGraphicsLayerElement;", "Lqx9;", "Lrh1;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class BlockGraphicsLayerElement extends qx9<rh1> {
    public final Function1<cd6, j6g> b;

    /* JADX WARN: Multi-variable type inference failed */
    public BlockGraphicsLayerElement(Function1<? super cd6, j6g> function1) {
        this.b = function1;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        return new rh1(this.b);
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        rh1 rh1Var = (rh1) cVar;
        rh1Var.d0 = this.b;
        tia tiaVar = us3.d(rh1Var, 2).h0;
        if (tiaVar != null) {
            tiaVar.b2(true, rh1Var.d0);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BlockGraphicsLayerElement) {
            return this.b == ((BlockGraphicsLayerElement) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
