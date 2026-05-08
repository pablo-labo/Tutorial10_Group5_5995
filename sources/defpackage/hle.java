package defpackage;

import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hle implements ag9 {
    public static final hle a = new hle();

    @Override // defpackage.ag9
    public final bg9 c(q qVar, List<? extends vf9> list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        boolean z = false;
        int iV = Integer.MIN_VALUE;
        int iV2 = Integer.MIN_VALUE;
        int iMax = 0;
        for (int i = 0; i < size; i++) {
            w wVarR = list.get(i).R(j);
            arrayList.add(wVarR);
            tj6 tj6Var = e20.a;
            if (wVarR.V(tj6Var) != Integer.MIN_VALUE && (iV == Integer.MIN_VALUE || wVarR.V(tj6Var) < iV)) {
                iV = wVarR.V(tj6Var);
            }
            tj6 tj6Var2 = e20.b;
            if (wVarR.V(tj6Var2) != Integer.MIN_VALUE && (iV2 == Integer.MIN_VALUE || wVarR.V(tj6Var2) > iV2)) {
                iV2 = wVarR.V(tj6Var2);
            }
            iMax = Math.max(iMax, wVarR.b);
        }
        if (iV != Integer.MIN_VALUE && iV2 != Integer.MIN_VALUE) {
            z = true;
        }
        int iMax2 = Math.max(qVar.x0((iV == iV2 || !z) ? 48.0f : 68.0f), iMax);
        return qVar.Y0(iq2.h(j), iMax2, bs4.a, new zq9(iMax2, arrayList));
    }
}
