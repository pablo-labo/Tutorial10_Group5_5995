package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class pq1 extends mj8 implements Function2<b, Integer, j6g> {
    final /* synthetic */ wu5<fhd, b, Integer, j6g> $content;
    final /* synthetic */ gza $contentPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public pq1(gza gzaVar, wu5<? super fhd, ? super b, ? super Integer, j6g> wu5Var) {
        super(2);
        this.$contentPadding = gzaVar;
        this.$content = wu5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        if ((num.intValue() & 3) == 2 && bVar2.i()) {
            bVar2.D();
        } else {
            e eVarE = f.e(g.a(e.a.b, hq1.c, hq1.d), this.$contentPadding);
            wu5<fhd, b, Integer, j6g> wu5Var = this.$content;
            ehd ehdVarA = chd.a(vs0.e, c20.a.k, bVar2, 54);
            int iG = bVar2.G();
            t8b t8bVarM = bVar2.m();
            e eVarC = c.c(bVar2, eVarE);
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
            wu5Var.q(ghd.a, bVar2, 6);
            bVar2.q();
        }
        return j6g.a;
    }
}
