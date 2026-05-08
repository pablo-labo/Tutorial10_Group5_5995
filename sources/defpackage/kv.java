package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kv implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ah2 b;

    public /* synthetic */ kv(ah2 ah2Var, int i) {
        this.a = i;
        this.b = ah2Var;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        ah2 ah2Var = this.b;
        switch (i) {
            case 0:
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    e eVarA = g.a(f.f(e.a.b, 0.0f), 1.0f, 1.0f);
                    ag9 ag9VarD = hl1.d(c20.a.a, false);
                    int iHashCode = Long.hashCode(bVar.k());
                    t8b t8bVarM = bVar.m();
                    e eVarC = c.c(bVar, eVarA);
                    gl2.j.getClass();
                    pm8.a aVar = gl2.a.b;
                    if (bVar.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar.B();
                    if (bVar.f()) {
                        bVar.y(aVar);
                    } else {
                        bVar.n();
                    }
                    ygg.y(bVar, ag9VarD, gl2.a.g);
                    ygg.y(bVar, t8bVarM, gl2.a.f);
                    gl2.a.C0251a c0251a = gl2.a.j;
                    if (bVar.f() || !wl7.b(bVar.v(), Integer.valueOf(iHashCode))) {
                        uz.g(iHashCode, bVar, iHashCode, c0251a);
                    }
                    ygg.y(bVar, eVarC, gl2.a.d);
                    ah2Var.q(androidx.compose.foundation.layout.b.a, bVar, 6);
                    bVar.q();
                } else {
                    bVar.D();
                }
                return j6g.a;
            default:
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ah2Var.invoke(bVar2, 0);
                } else {
                    bVar2.D();
                }
                return j6g.a;
        }
    }
}
