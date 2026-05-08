package androidx.compose.animation;

import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;
import defpackage.bg9;
import defpackage.bs4;
import defpackage.iq2;
import defpackage.it2;
import defpackage.mj8;
import defpackage.vf9;
import defpackage.wu5;

/* JADX INFO: loaded from: classes.dex */
public final class c extends mj8 implements wu5<q, vf9, iq2, bg9> {
    final /* synthetic */ it2 $specOnEnter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(it2 it2Var) {
        super(3);
        this.$specOnEnter = it2Var;
    }

    @Override // defpackage.wu5
    public final bg9 q(q qVar, vf9 vf9Var, iq2 iq2Var) {
        w wVarR = vf9Var.R(iq2Var.a);
        return qVar.Y0(wVarR.a, wVarR.b, bs4.a, new b(wVarR, this.$specOnEnter));
    }
}
