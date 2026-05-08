package defpackage;

import androidx.compose.runtime.c;
import androidx.compose.runtime.d;
import androidx.compose.runtime.l;
import androidx.compose.runtime.n;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class el2 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [dl2] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [x20] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    public static final List a(n nVar, Integer num, int i, Integer num2) {
        int iF;
        p3a<Object> p3aVarB;
        if (nVar.w || nVar.p() == 0) {
            return zr4.a;
        }
        int i2 = 0;
        ?? i5hVar = new i5h(0);
        if (num2 != null) {
            iF = num2.intValue();
        } else {
            iF = nVar.v;
            if (iF < 0) {
                iF = nVar.F(i, nVar.b);
            }
        }
        if (num == 0) {
            int iO = nVar.i - nVar.O(nVar.r(i), nVar.b);
            a3a<p3a<Object>> a3aVar = nVar.s;
            if (a3aVar != null && (p3aVarB = a3aVar.b(i)) != null) {
                i2 = p3aVarB.b;
            }
            num = Integer.valueOf(iO + i2);
        }
        while (i >= 0) {
            i5hVar.V(nVar.P(i), num);
            num = nVar.b(i);
            if (iF >= 0) {
                int i3 = iF;
                iF = nVar.F(iF, nVar.b);
                i = i3;
            } else {
                i = iF;
            }
        }
        return (ArrayList) i5hVar.a;
    }

    public static final Integer b(l lVar, dm2 dm2Var, int i, int i2) {
        Integer numB;
        int[] iArr = lVar.b;
        while (true) {
            if (i >= i2) {
                return null;
            }
            int i3 = iArr[(i * 5) + 3] + i;
            if (lVar.j(i) && lVar.i(i) == 206 && wl7.b(lVar.p(i, iArr), d.e)) {
                Object objH = lVar.h(i, 0);
                c.a aVar = objH instanceof c.a ? (c.a) objH : null;
                if (aVar != null && aVar.a == dm2Var) {
                    return Integer.valueOf(i);
                }
            }
            if (lVar.d(i) && (numB = b(lVar, dm2Var, i + 1, i3)) != null) {
                return Integer.valueOf(numB.intValue());
            }
            i = i3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [dl2, oqc] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    public static final ArrayList c(l lVar, int i, Integer num) {
        ?? oqcVar = new oqc(lVar);
        int iQ = lVar.q(i);
        x20 x20VarA = lVar.a(i);
        while (i >= 0) {
            oqcVar.V(lVar.a.i(i), num);
            if (iQ >= 0) {
                x20 x20Var = x20VarA;
                x20VarA = lVar.a(iQ);
                i = iQ;
                iQ = lVar.q(iQ);
                num = x20Var;
            } else {
                i = iQ;
                num = x20VarA;
            }
        }
        return (ArrayList) oqcVar.a;
    }
}
