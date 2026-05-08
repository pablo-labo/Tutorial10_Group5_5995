package defpackage;

import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;
import defpackage.c20;
import defpackage.iq2;
import defpackage.vs0;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ehd implements ag9, zgd {
    public final vs0.e a;
    public final c20.c b;

    public ehd(vs0.e eVar, c20.c cVar) {
        this.a = eVar;
        this.b = cVar;
    }

    @Override // defpackage.ag9
    public final int a(ql7 ql7Var, List<? extends pl7> list, int i) {
        int iX0 = ql7Var.x0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            pl7 pl7Var = list.get(i3);
            float fN = q92.n(q92.l(pl7Var));
            int iP = pl7Var.P(i);
            if (fN == 0.0f) {
                i2 += iP;
            } else if (fN > 0.0f) {
                f += fN;
                iMax = Math.max(iMax, Math.round(iP / fN));
            }
        }
        return ((list.size() - 1) * iX0) + Math.round(iMax * f) + i2;
    }

    @Override // defpackage.zgd
    public final void b(int i, int[] iArr, int[] iArr2, q qVar) {
        this.a.b(qVar, i, iArr, qVar.getLayoutDirection(), iArr2);
    }

    @Override // defpackage.ag9
    public final bg9 c(q qVar, List<? extends vf9> list, long j) {
        return cr8.y(this, iq2.j(j), iq2.i(j), iq2.h(j), iq2.g(j), qVar.x0(this.a.a()), qVar, list, new w[list.size()], 0, list.size(), null, 0);
    }

    @Override // defpackage.zgd
    public final long d(int i, int i2, int i3, boolean z) {
        ehd ehdVar = chd.a;
        return !z ? mq2.a(i, i2, 0, i3) : iq2.a.b(i, i2, 0, i3);
    }

    @Override // defpackage.ag9
    public final int e(ql7 ql7Var, List<? extends pl7> list, int i) {
        int iX0 = ql7Var.x0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            pl7 pl7Var = list.get(i3);
            float fN = q92.n(q92.l(pl7Var));
            int iO = pl7Var.O(i);
            if (fN == 0.0f) {
                i2 += iO;
            } else if (fN > 0.0f) {
                f += fN;
                iMax = Math.max(iMax, Math.round(iO / fN));
            }
        }
        return ((list.size() - 1) * iX0) + Math.round(iMax * f) + i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ehd)) {
            return false;
        }
        ehd ehdVar = (ehd) obj;
        return this.a.equals(ehdVar.a) && wl7.b(this.b, ehdVar.b);
    }

    @Override // defpackage.ag9
    public final int f(ql7 ql7Var, List<? extends pl7> list, int i) {
        int iX0 = ql7Var.x0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iX0, i);
        List<? extends pl7> list2 = list;
        int size = list2.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            pl7 pl7Var = list.get(i2);
            float fN = q92.n(q92.l(pl7Var));
            if (fN == 0.0f) {
                int iMin2 = Math.min(pl7Var.P(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, pl7Var.w(iMin2));
            } else if (fN > 0.0f) {
                f += fN;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            pl7 pl7Var2 = list.get(i3);
            float fN2 = q92.n(q92.l(pl7Var2));
            if (fN2 > 0.0f) {
                iMax = Math.max(iMax, pl7Var2.w(iRound != Integer.MAX_VALUE ? Math.round(iRound * fN2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.zgd
    public final int g(w wVar) {
        return wVar.a;
    }

    @Override // defpackage.ag9
    public final int h(ql7 ql7Var, List<? extends pl7> list, int i) {
        int iX0 = ql7Var.x0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iX0, i);
        List<? extends pl7> list2 = list;
        int size = list2.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            pl7 pl7Var = list.get(i2);
            float fN = q92.n(q92.l(pl7Var));
            if (fN == 0.0f) {
                int iMin2 = Math.min(pl7Var.P(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, pl7Var.K(iMin2));
            } else if (fN > 0.0f) {
                f += fN;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            pl7 pl7Var2 = list.get(i3);
            float fN2 = q92.n(q92.l(pl7Var2));
            if (fN2 > 0.0f) {
                iMax = Math.max(iMax, pl7Var2.K(iRound != Integer.MAX_VALUE ? Math.round(iRound * fN2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.zgd
    public final bg9 i(final w[] wVarArr, q qVar, final int[] iArr, int i, final int i2, int[] iArr2, int i3, int i4, int i5) {
        return qVar.Y0(i, i2, bs4.a, new Function1() { // from class: dhd
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                w.a aVar = (w.a) obj;
                w[] wVarArr2 = wVarArr;
                int length = wVarArr2.length;
                int i6 = 0;
                int i7 = 0;
                while (i6 < length) {
                    w wVar = wVarArr2[i6];
                    int i8 = i7 + 1;
                    wVar.getClass();
                    Object objG = wVar.g();
                    ahd ahdVar = objG instanceof ahd ? (ahd) objG : null;
                    k73 k73Var = ahdVar != null ? ahdVar.c : null;
                    int i9 = i2;
                    aVar.r(wVar, iArr[i7], k73Var != null ? k73Var.a(i9 - wVar.b, vl8.a) : this.b.a(0, i9 - wVar.b), 0.0f);
                    i6++;
                    i7 = i8;
                }
                return j6g.a;
            }
        });
    }

    @Override // defpackage.zgd
    public final int j(w wVar) {
        return wVar.b;
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.a + ", verticalAlignment=" + this.b + ')';
    }
}
