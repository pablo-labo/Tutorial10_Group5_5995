package defpackage;

import androidx.compose.ui.e;
import androidx.compose.ui.layout.q;

/* JADX INFO: loaded from: classes.dex */
public final class km8 extends e.c implements lm8 {
    public wu5<? super q, ? super vf9, ? super iq2, ? extends bg9> d0;

    public km8() {
        throw null;
    }

    @Override // defpackage.lm8
    public final bg9 d(q qVar, vf9 vf9Var, long j) {
        return this.d0.q(qVar, vf9Var, new iq2(j));
    }

    public final String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.d0 + ')';
    }
}
