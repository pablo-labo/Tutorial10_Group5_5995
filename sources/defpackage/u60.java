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
public final class u60 implements Function2<b, Integer, j6g> {
    public final /* synthetic */ long a;
    public final /* synthetic */ e b;

    public u60(long j, e eVar) {
        this.a = j;
        this.b = eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
            long j = this.a;
            if (j != 9205357640488583168L) {
                bVar2.L(-1244013944);
                e eVarM = g.m(this.b, m94.b(j), m94.a(j), 0.0f, 0.0f, 12);
                ag9 ag9VarD = hl1.d(c20.a.b, false);
                int iHashCode = Long.hashCode(bVar2.k());
                t8b t8bVarM = bVar2.m();
                e eVarC = c.c(bVar2, eVarM);
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
                ygg.y(bVar2, ag9VarD, gl2.a.g);
                ygg.y(bVar2, t8bVarM, gl2.a.f);
                gl2.a.C0251a c0251a = gl2.a.j;
                if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                    uz.g(iHashCode, bVar2, iHashCode, c0251a);
                }
                ygg.y(bVar2, eVarC, gl2.a.d);
                y60.b(null, bVar2, 0, 1);
                bVar2.q();
                bVar2.F();
            } else {
                bVar2.L(-1243644858);
                y60.b(this.b, bVar2, 0, 0);
                bVar2.F();
            }
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
