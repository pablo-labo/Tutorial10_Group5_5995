package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class lbb {
    public static final void a(e eVar, ah2 ah2Var, b bVar, final int i) {
        int i2;
        final e eVar2;
        final ah2 ah2Var2;
        c cVarH = bVar.h(790527681);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(eVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.x(ah2Var) ? 32 : 16;
        }
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = r.e(null, zkd.f);
                cVarH.p(objV);
            }
            g4a g4aVar = (g4a) objV;
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = new ex(2, g4aVar);
                cVarH.p(objV2);
            }
            gu5 gu5Var = (gu5) objV2;
            ahb ahbVar = yq3.a;
            rc1 rc1VarB = xc1.b(ei2.b, cVarH, 6);
            eVar2 = eVar;
            ah2Var2 = ah2Var;
            rm2.b(new i6c[]{idf.b.a(ab0.c(gu5Var, cVarH, 2)), idf.a.a(rc1VarB)}, bh2.c(1070596993, new kbb(eVar2, g4aVar, ah2Var2, rc1VarB, gu5Var), cVarH), cVarH, 56);
        } else {
            eVar2 = eVar;
            ah2Var2 = ah2Var;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: jbb
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(i | 1);
                    lbb.a(eVar2, ah2Var2, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(e eVar, ah2 ah2Var, b bVar, int i) {
        int i2;
        c cVarH = bVar.h(155925518);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(eVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.x(ah2Var) ? 32 : 16;
        }
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            boolean z = cVarH.M(idf.a) != null;
            boolean z2 = cVarH.M(idf.b) != null;
            if (z && z2) {
                cVarH.L(-1977156178);
                ag9 ag9VarD = hl1.d(c20.a.a, true);
                int iHashCode = Long.hashCode(cVarH.T);
                t8b t8bVarP = cVarH.P();
                e eVarC = androidx.compose.ui.c.c(cVarH, eVar);
                gl2.j.getClass();
                pm8.a aVar = gl2.a.b;
                cVarH.B();
                if (cVarH.S) {
                    cVarH.y(aVar);
                } else {
                    cVarH.n();
                }
                ygg.y(cVarH, ag9VarD, gl2.a.g);
                ygg.y(cVarH, t8bVarP, gl2.a.f);
                gl2.a.C0251a c0251a = gl2.a.j;
                if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                    ja.h(iHashCode, cVarH, iHashCode, c0251a);
                }
                ygg.y(cVarH, eVarC, gl2.a.d);
                ah2Var.invoke(cVarH, Integer.valueOf((i2 >> 3) & 14));
                cVarH.U(true);
                cVarH.U(false);
            } else if (z) {
                cVarH.L(-1976965962);
                ab0.a(eVar, ah2Var, cVarH, i2 & 126);
                cVarH.U(false);
            } else if (z2) {
                cVarH.L(-1976815178);
                yq3.d(eVar, ah2Var, cVarH, i2 & 126);
                cVarH.U(false);
            } else {
                cVarH.L(-1976684761);
                a(eVar, ah2Var, cVarH, i2 & 126);
                cVarH.U(false);
            }
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new ip0(eVar, ah2Var, i);
        }
    }
}
