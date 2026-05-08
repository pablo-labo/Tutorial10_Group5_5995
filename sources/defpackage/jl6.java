package defpackage;

import android.content.res.Configuration;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class jl6 {
    public static final void a(gu5<j6g> gu5Var, gu5<j6g> gu5Var2, b bVar, int i) {
        int i2;
        c cVar;
        int i3;
        c cVarC = ja.c(gu5Var, gu5Var2, bVar, -1807285482);
        if ((i & 6) == 0) {
            i2 = (cVarC.x(gu5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarC.x(gu5Var2) ? 32 : 16;
        }
        if (cVarC.o(i2 & 1, (i2 & 19) != 18)) {
            ah2 ah2VarC = bh2.c(382636440, new dl6(0, gu5Var, gu5Var2), cVarC);
            cVar = cVarC;
            i3 = 1;
            pmd.a(null, null, null, null, null, null, 0, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ah2VarC, cVar, 0, 131071);
        } else {
            cVar = cVarC;
            i3 = 1;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new p61(i, i3, gu5Var, gu5Var2);
        }
    }

    public static final void b(gu5<j6g> gu5Var, gu5<j6g> gu5Var2, b bVar, int i) {
        int i2;
        c cVar;
        int i3;
        c cVarC = ja.c(gu5Var, gu5Var2, bVar, 1654392282);
        if ((i & 6) == 0) {
            i2 = (cVarC.x(gu5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarC.x(gu5Var2) ? 32 : 16;
        }
        if (cVarC.o(i2 & 1, (i2 & 19) != 18)) {
            ah2 ah2VarC = bh2.c(1032298264, new ie4(1, gu5Var, gu5Var2), cVarC);
            cVar = cVarC;
            i3 = 1;
            pmd.a(null, null, null, null, null, null, 0, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ah2VarC, cVar, 0, 131071);
        } else {
            cVar = cVarC;
            i3 = 1;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new je4(i, i3, gu5Var, gu5Var2);
        }
    }

    public static final void c(final gu5<j6g> gu5Var, final gu5<j6g> gu5Var2, b bVar, final int i) {
        int i2;
        c cVarC = ja.c(gu5Var, gu5Var2, bVar, 1240128363);
        if ((i & 6) == 0) {
            i2 = (cVarC.x(gu5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarC.x(gu5Var2) ? 32 : 16;
        }
        if (!cVarC.o(i2 & 1, (i2 & 19) != 18)) {
            cVarC.D();
        } else if (((Configuration) cVarC.M(AndroidCompositionLocals_androidKt.a)).orientation == 1) {
            cVarC.L(-644425206);
            b(gu5Var, gu5Var2, cVarC, i2 & 126);
            cVarC.U(false);
        } else {
            cVarC.L(-644279351);
            a(gu5Var, gu5Var2, cVarC, i2 & 126);
            cVarC.U(false);
        }
        i iVarW = cVarC.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: al6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iL = ka2.L(i | 1);
                    jl6.c(gu5Var, gu5Var2, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
