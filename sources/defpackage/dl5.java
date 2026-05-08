package defpackage;

import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;
import defpackage.iq2;
import defpackage.vs0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public interface dl5 extends zgd {
    @Override // defpackage.zgd
    default void b(int i, int[] iArr, int[] iArr2, q qVar) {
        if (n()) {
            q().b(qVar, i, iArr, qVar.getLayoutDirection(), iArr2);
        } else {
            r().c(qVar, i, iArr, iArr2);
        }
    }

    @Override // defpackage.zgd
    default long d(int i, int i2, int i3, boolean z) {
        if (n()) {
            ehd ehdVar = chd.a;
            return !z ? mq2.a(i, i2, 0, i3) : iq2.a.b(i, i2, 0, i3);
        }
        ob2 ob2Var = mb2.a;
        return !z ? mq2.a(0, i3, i, i2) : iq2.a.a(0, i3, i, i2);
    }

    @Override // defpackage.zgd
    default int g(w wVar) {
        return n() ? wVar.e0() : wVar.c0();
    }

    @Override // defpackage.zgd
    default bg9 i(final w[] wVarArr, q qVar, final int[] iArr, int i, final int i2, final int[] iArr2, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        if (n()) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
        }
        final vl8 layoutDirection = n() ? vl8.a : qVar.getLayoutDirection();
        return qVar.Y0(i7, i6, bs4.a, new Function1() { // from class: cl5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                k73 k73VarK;
                w.a aVar = (w.a) obj;
                int[] iArr3 = iArr2;
                int i8 = iArr3 != null ? iArr3[i3] : 0;
                int i9 = i4;
                for (int i10 = i9; i10 < i5; i10++) {
                    w wVar = wVarArr[i10];
                    wVar.getClass();
                    Object objG = wVar.g();
                    ahd ahdVar = objG instanceof ahd ? (ahd) objG : null;
                    dl5 dl5Var = this;
                    if (ahdVar == null || (k73VarK = ahdVar.c) == null) {
                        k73VarK = dl5Var.k();
                    }
                    int iA = k73VarK.a(i2 - dl5Var.j(wVar), layoutDirection) + i8;
                    boolean zN = dl5Var.n();
                    int[] iArr4 = iArr;
                    if (zN) {
                        aVar.r(wVar, iArr4[i10 - i9], iA, 0.0f);
                    } else {
                        aVar.r(wVar, iA, iArr4[i10 - i9], 0.0f);
                    }
                }
                return j6g.a;
            }
        });
    }

    @Override // defpackage.zgd
    default int j(w wVar) {
        return n() ? wVar.c0() : wVar.e0();
    }

    k73 k();

    boolean n();

    vs0.e q();

    vs0.l r();
}
