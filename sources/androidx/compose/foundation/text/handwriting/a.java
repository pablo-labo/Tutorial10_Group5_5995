package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.e;
import androidx.compose.ui.input.pointer.StylusHoverIconModifierElement;
import defpackage.gu5;
import defpackage.n94;
import defpackage.owe;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final n94 a = new n94();

    public static final e a(boolean z, boolean z2, gu5 gu5Var) {
        e stylusHoverIconModifierElement = e.a.b;
        if (!z || !owe.a) {
            return stylusHoverIconModifierElement;
        }
        if (z2) {
            stylusHoverIconModifierElement = new StylusHoverIconModifierElement(a);
        }
        return stylusHoverIconModifierElement.o(new StylusHandwritingElement(gu5Var));
    }
}
