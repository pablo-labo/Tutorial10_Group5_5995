package defpackage;

import androidx.compose.runtime.r;
import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class pf7 implements jm8, lx9, ox9<mzg> {
    public final mzg b;
    public final g4a c;
    public final g4a d;

    public pf7(mzg mzgVar) {
        this.b = mzgVar;
        this.c = r.f(mzgVar);
        this.d = r.f(mzgVar);
    }

    @Override // defpackage.jm8
    public final bg9 d(q qVar, vf9 vf9Var, long j) {
        g4a g4aVar = this.c;
        final int iD = ((mzg) ((gme) g4aVar).getValue()).d(qVar, qVar.getLayoutDirection());
        final int iA = ((mzg) ((gme) g4aVar).getValue()).a(qVar);
        int iB = ((mzg) ((gme) g4aVar).getValue()).b(qVar, qVar.getLayoutDirection()) + iD;
        int iC = ((mzg) ((gme) g4aVar).getValue()).c(qVar) + iA;
        final w wVarR = vf9Var.R(mq2.i(-iB, -iC, j));
        return qVar.Y0(mq2.g(wVarR.a + iB, j), mq2.f(wVarR.b + iC, j), bs4.a, new Function1() { // from class: of7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ((w.a) obj).r(wVarR, iD, iA, 0.0f);
                return j6g.a;
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pf7) {
            return wl7.b(((pf7) obj).b, this.b);
        }
        return false;
    }

    @Override // defpackage.ox9
    public final g6c<mzg> getKey() {
        return ka2.b0;
    }

    @Override // defpackage.lx9
    public final void h(px9 px9Var) {
        mzg mzgVar = (mzg) px9Var.g(ka2.b0);
        mzg mzgVar2 = this.b;
        ((gme) this.c).setValue(new b15(mzgVar2, mzgVar));
        ((gme) this.d).setValue(new g6g(mzgVar, mzgVar2));
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.ox9
    public final mzg i() {
        return (mzg) ((gme) this.d).getValue();
    }
}
