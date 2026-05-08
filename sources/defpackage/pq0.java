package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pq0 implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pq0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                ude udeVar = (ude) obj5;
                Context context = (Context) obj4;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((xo8) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    qq0.h(udeVar, context, bVar, 0);
                } else {
                    bVar.D();
                }
                return j6g.a;
            default:
                o97 o97Var = (o97) obj5;
                ah2 ah2Var = (ah2) obj4;
                gza gzaVar = (gza) obj;
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                gzaVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= bVar2.K(gzaVar) ? 4 : 2;
                }
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    e eVarE = f.e(g.d(e.a.b, 1.0f), gzaVar);
                    o97.g gVar = o97Var.i;
                    e eVarH = f.h(eVarE, 8.0f, 0.0f, 2);
                    ob2 ob2VarA = mb2.a(vs0.e, c20.a.n, bVar2, 54);
                    int iG = bVar2.G();
                    t8b t8bVarM = bVar2.m();
                    e eVarC = c.c(bVar2, eVarH);
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
                    ygg.y(bVar2, ob2VarA, gl2.a.g);
                    ygg.y(bVar2, t8bVarM, gl2.a.f);
                    gl2.a.C0251a c0251a = gl2.a.j;
                    if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iG))) {
                        uz.g(iG, bVar2, iG, c0251a);
                    }
                    ygg.y(bVar2, eVarC, gl2.a.d);
                    ah2Var.invoke(bVar2, 0);
                    bVar2.q();
                } else {
                    bVar2.D();
                }
                return j6g.a;
        }
    }
}
