package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import defpackage.af1;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.vs0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class li0 implements wu5<fhd, b, Integer, j6g> {
    public final /* synthetic */ Function2<b, Integer, j6g> a;
    public final /* synthetic */ ah2 b;

    public li0(Function2 function2, ah2 ah2Var) {
        this.a = function2;
        this.b = ah2Var;
    }

    @Override // defpackage.wu5
    public final j6g q(fhd fhdVar, b bVar, Integer num) {
        fhd fhdVar2 = fhdVar;
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= bVar2.K(fhdVar2) ? 4 : 2;
        }
        if (bVar2.o(iIntValue & 1, (iIntValue & 19) != 18)) {
            vs0.j jVar = vs0.a;
            af1.b bVar3 = c20.a.k;
            Function2<b, Integer, j6g> function2 = this.a;
            if (function2 == null) {
                bVar2.L(-1394361313);
                jh2.f(bVar2, ri0.a);
                bVar2.F();
            } else {
                bVar2.L(-1394295686);
                e eVar = ri0.b;
                ehd ehdVarA = chd.a(jVar, bVar3, bVar2, 48);
                int iG = bVar2.G();
                t8b t8bVarM = bVar2.m();
                e eVarC = c.c(bVar2, eVar);
                gl2.j.getClass();
                pm8.a aVar = gl2.a.b;
                if (bVar2.j() == null) {
                    pg8.B();
                    throw null;
                }
                bVar2.B();
                if (bVar2.f()) {
                    bVar2.y(aVar);
                } else {
                    bVar2.n();
                }
                ygg.y(bVar2, ehdVarA, gl2.a.g);
                ygg.y(bVar2, t8bVarM, gl2.a.f);
                gl2.a.C0251a c0251a = gl2.a.j;
                if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iG))) {
                    uz.g(iG, bVar2, iG, c0251a);
                }
                ygg.y(bVar2, eVarC, gl2.a.d);
                ne4 ne4Var = ls2.a;
                long j = ((da2) bVar2.M(ps2.a)).a;
                rm2.a(ne4Var.a(Float.valueOf((!((kb2) bVar2.M(lb2.a)).g() ? ((double) pnb.J(j)) < 0.5d : ((double) pnb.J(j)) > 0.5d) ? 0.87f : 1.0f)), function2, bVar2, 8);
                bVar2.q();
                bVar2.F();
            }
            e eVarA = fhdVar2.a(g.c(e.a.b, 1.0f), 1.0f);
            ehd ehdVarA2 = chd.a(jVar, bVar3, bVar2, 48);
            int iG2 = bVar2.G();
            t8b t8bVarM2 = bVar2.m();
            e eVarC2 = c.c(bVar2, eVarA);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            if (bVar2.j() == null) {
                pg8.B();
                throw null;
            }
            bVar2.B();
            if (bVar2.f()) {
                bVar2.y(aVar2);
            } else {
                bVar2.n();
            }
            ygg.y(bVar2, ehdVarA2, gl2.a.g);
            ygg.y(bVar2, t8bVarM2, gl2.a.f);
            gl2.a.C0251a c0251a2 = gl2.a.j;
            if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iG2))) {
                uz.g(iG2, bVar2, iG2, c0251a2);
            }
            ygg.y(bVar2, eVarC2, gl2.a.d);
            fif.a(((nzf) bVar2.M(rzf.b)).f, bh2.c(1206983395, new ji0(), bVar2), bVar2, 48);
            bVar2.q();
            ne4 ne4Var2 = ls2.a;
            long j2 = ((da2) bVar2.M(ps2.a)).a;
            rm2.a(ne4Var2.a(Float.valueOf((!((kb2) bVar2.M(lb2.a)).g() ? ((double) pnb.J(j2)) < 0.5d : ((double) pnb.J(j2)) > 0.5d) ? 0.6f : 0.74f)), bh2.c(-1033635954, new ki0(this.b), bVar2), bVar2, 56);
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
