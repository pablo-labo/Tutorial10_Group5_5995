package defpackage;

import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;

/* JADX INFO: loaded from: classes.dex */
public final class ing implements jm8 {
    public final igf b;
    public final int c;
    public final vrf d;
    public final gu5<nif> e;

    public ing(igf igfVar, int i, vrf vrfVar, gu5<nif> gu5Var) {
        this.b = igfVar;
        this.c = i;
        this.d = vrfVar;
        this.e = gu5Var;
    }

    @Override // defpackage.jm8
    public final bg9 d(q qVar, vf9 vf9Var, long j) {
        w wVarR = vf9Var.R(iq2.a(0, 0, 0, Integer.MAX_VALUE, 7, j));
        int iMin = Math.min(wVarR.b, iq2.g(j));
        return qVar.Y0(wVarR.a, iMin, bs4.a, new urd(this, wVarR, iMin));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ing) {
            ing ingVar = (ing) obj;
            if (this.b == ingVar.b && this.c == ingVar.c && this.d.equals(ingVar.d) && wl7.b(this.e, ingVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + w40.c(this.c, this.b.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.b + ", cursorOffset=" + this.c + ", transformedText=" + this.d + ", textLayoutResultProvider=" + this.e + ')';
    }
}
