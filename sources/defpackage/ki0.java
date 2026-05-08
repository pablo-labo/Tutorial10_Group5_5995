package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ki0 implements Function2<b, Integer, j6g> {
    public final /* synthetic */ ah2 a;

    public ki0(ah2 ah2Var) {
        this.a = ah2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
            e eVarC = g.c(e.a.b, 1.0f);
            ehd ehdVarA = chd.a(vs0.b, c20.a.k, bVar2, 54);
            int iG = bVar2.G();
            t8b t8bVarM = bVar2.m();
            e eVarC2 = c.c(bVar2, eVarC);
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
            ygg.y(bVar2, eVarC2, gl2.a.d);
            this.a.q(ghd.a, bVar2, 6);
            bVar2.q();
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
