package androidx.compose.ui.semantics;

import androidx.compose.ui.e;
import defpackage.a5e;
import defpackage.j6g;
import defpackage.qx9;
import defpackage.rz2;
import defpackage.s5e;
import defpackage.w4e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/semantics/ClearAndSetSemanticsElement;", "Lqx9;", "Lrz2;", "La5e;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ClearAndSetSemanticsElement extends qx9<rz2> implements a5e {
    public final Function1<s5e, j6g> b;

    /* JADX WARN: Multi-variable type inference failed */
    public ClearAndSetSemanticsElement(Function1<? super s5e, j6g> function1) {
        this.b = function1;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        return new rz2(false, true, this.b);
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        ((rz2) cVar).f0 = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ClearAndSetSemanticsElement) {
            return this.b == ((ClearAndSetSemanticsElement) obj).b;
        }
        return false;
    }

    @Override // defpackage.a5e
    public final w4e g() {
        w4e w4eVar = new w4e();
        w4eVar.c = false;
        w4eVar.d = true;
        this.b.invoke(w4eVar);
        return w4eVar;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
