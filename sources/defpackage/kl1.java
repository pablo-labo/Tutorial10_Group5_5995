package defpackage;

import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class kl1 implements ag9 {
    public final c20 a;
    public final boolean b;

    public kl1(c20 c20Var, boolean z) {
        this.a = c20Var;
        this.b = z;
    }

    @Override // defpackage.ag9
    public final bg9 c(final q qVar, final List<? extends vf9> list, long j) {
        int iJ;
        int i;
        w wVarR;
        boolean zIsEmpty = list.isEmpty();
        bs4 bs4Var = bs4.a;
        if (zIsEmpty) {
            return qVar.Y0(iq2.j(j), iq2.i(j), bs4Var, new wd(3));
        }
        long j2 = this.b ? j : j & (-8589934589L);
        if (list.size() == 1) {
            final vf9 vf9Var = list.get(0);
            z3a<c20, ag9> z3aVar = hl1.a;
            Object objG = vf9Var.g();
            el1 el1Var = objG instanceof el1 ? (el1) objG : null;
            if (el1Var != null ? el1Var.e0 : false) {
                iJ = iq2.j(j);
                i = iq2.i(j);
                int iJ2 = iq2.j(j);
                int i2 = iq2.i(j);
                if (!((i2 >= 0) & (iJ2 >= 0))) {
                    ce7.a("width and height must be >= 0");
                }
                wVarR = vf9Var.R(mq2.h(iJ2, iJ2, i2, i2));
            } else {
                wVarR = vf9Var.R(j2);
                iJ = Math.max(iq2.j(j), wVarR.a);
                i = Math.max(iq2.i(j), wVarR.b);
            }
            final int i3 = i;
            final int i4 = iJ;
            final w wVar = wVarR;
            return qVar.Y0(i4, i3, bs4Var, new Function1() { // from class: il1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    hl1.b((w.a) obj, wVar, vf9Var, qVar.getLayoutDirection(), i4, i3, this.a);
                    return j6g.a;
                }
            });
        }
        final w[] wVarArr = new w[list.size()];
        final juc jucVar = new juc();
        jucVar.element = iq2.j(j);
        final juc jucVar2 = new juc();
        jucVar2.element = iq2.i(j);
        List<? extends vf9> list2 = list;
        int size = list2.size();
        boolean z = false;
        for (int i5 = 0; i5 < size; i5++) {
            vf9 vf9Var2 = list.get(i5);
            z3a<c20, ag9> z3aVar2 = hl1.a;
            Object objG2 = vf9Var2.g();
            el1 el1Var2 = objG2 instanceof el1 ? (el1) objG2 : null;
            if (el1Var2 != null ? el1Var2.e0 : false) {
                z = true;
            } else {
                w wVarR2 = vf9Var2.R(j2);
                wVarArr[i5] = wVarR2;
                jucVar.element = Math.max(jucVar.element, wVarR2.a);
                jucVar2.element = Math.max(jucVar2.element, wVarR2.b);
            }
        }
        if (z) {
            int i6 = jucVar.element;
            int i7 = i6 != Integer.MAX_VALUE ? i6 : 0;
            int i8 = jucVar2.element;
            long jA = mq2.a(i7, i6, i8 != Integer.MAX_VALUE ? i8 : 0, i8);
            int size2 = list2.size();
            for (int i9 = 0; i9 < size2; i9++) {
                vf9 vf9Var3 = list.get(i9);
                z3a<c20, ag9> z3aVar3 = hl1.a;
                Object objG3 = vf9Var3.g();
                el1 el1Var3 = objG3 instanceof el1 ? (el1) objG3 : null;
                if (el1Var3 != null ? el1Var3.e0 : false) {
                    wVarArr[i9] = vf9Var3.R(jA);
                }
            }
        }
        return qVar.Y0(jucVar.element, jucVar2.element, bs4Var, new Function1() { // from class: jl1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                w.a aVar = (w.a) obj;
                w[] wVarArr2 = wVarArr;
                int length = wVarArr2.length;
                int i10 = 0;
                int i11 = 0;
                while (i11 < length) {
                    int i12 = i10;
                    w wVar2 = wVarArr2[i11];
                    wVar2.getClass();
                    hl1.b(aVar, wVar2, (vf9) list.get(i12), qVar.getLayoutDirection(), jucVar.element, jucVar2.element, this.a);
                    i11++;
                    i10 = i12 + 1;
                }
                return j6g.a;
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl1)) {
            return false;
        }
        kl1 kl1Var = (kl1) obj;
        return wl7.b(this.a, kl1Var.a) && this.b == kl1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BoxMeasurePolicy(alignment=");
        sb.append(this.a);
        sb.append(", propagateMinConstraints=");
        return m6.i(sb, this.b, ')');
    }
}
