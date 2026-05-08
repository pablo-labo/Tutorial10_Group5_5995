package defpackage;

import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class yj6 implements jm8 {
    public final igf b;
    public final int c;
    public final vrf d;
    public final gu5<nif> e;

    public yj6(igf igfVar, int i, vrf vrfVar, gu5<nif> gu5Var) {
        this.b = igfVar;
        this.c = i;
        this.d = vrfVar;
        this.e = gu5Var;
    }

    @Override // defpackage.jm8
    public final bg9 d(final q qVar, vf9 vf9Var, long j) {
        long j2;
        if (vf9Var.P(iq2.g(j)) < iq2.h(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = iq2.a(0, Integer.MAX_VALUE, 0, 0, 13, j2);
        }
        final w wVarR = vf9Var.R(j);
        final int iMin = Math.min(wVarR.a, iq2.h(j2));
        return qVar.Y0(iMin, wVarR.b, bs4.a, new Function1() { // from class: xj6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                w.a aVar = (w.a) obj;
                yj6 yj6Var = this.a;
                int i = yj6Var.c;
                igf igfVar = yj6Var.b;
                vrf vrfVar = yj6Var.d;
                nif nifVarInvoke = yj6Var.e.invoke();
                mif mifVar = nifVarInvoke != null ? nifVarInvoke.a : null;
                boolean z = qVar.getLayoutDirection() == vl8.b;
                w wVar = wVarR;
                igfVar.a(dwa.b, oie.f(aVar, i, vrfVar, mifVar, z, wVar.a), iMin, wVar.a);
                w.a.y(aVar, wVar, Math.round(-((cme) igfVar.a).g()), 0);
                return j6g.a;
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yj6) {
            yj6 yj6Var = (yj6) obj;
            if (this.b == yj6Var.b && this.c == yj6Var.c && this.d.equals(yj6Var.d) && wl7.b(this.e, yj6Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + w40.c(this.c, this.b.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.b + ", cursorOffset=" + this.c + ", transformedText=" + this.d + ", textLayoutResultProvider=" + this.e + ')';
    }
}
