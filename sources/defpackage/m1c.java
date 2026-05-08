package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.fragment.app.g;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.saa;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m1c implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m1c(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        int i2 = 0;
        switch (i) {
            case 0:
                g gVar = (g) obj6;
                wu5 wu5Var = (wu5) obj5;
                svb svbVar = (svb) obj4;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    q1c.d(bh2.c(-1852297759, new x0c(gVar, wu5Var, 0), bVar), bVar, 6);
                    q1c.d(bh2.c(-403122280, new y0c(i2, wu5Var, svbVar, gVar), bVar), bVar, 6);
                    q1c.d(bh2.c(660066329, new z0c(gVar, wu5Var, 0), bVar), bVar, 6);
                } else {
                    bVar.D();
                }
                return j6g.a;
            default:
                o97 o97Var = (o97) obj6;
                List<raa> list = (List) obj5;
                Function1 function1 = (Function1) obj4;
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    o97.g gVar2 = o97Var.i;
                    e eVarJ = f.j(e.a.b, 0.0f, 0.0f, 4.0f, 0.0f, 11);
                    ehd ehdVarA = chd.a(vs0.a, c20.a.k, bVar2, 48);
                    int iG = bVar2.G();
                    t8b t8bVarM = bVar2.m();
                    e eVarC = c.c(bVar2, eVarJ);
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
                    if (list == null) {
                        bVar2.L(1050188222);
                    } else {
                        bVar2.L(1050188223);
                        for (raa raaVar : list) {
                            if (wl7.b(raaVar.a, saa.a.a)) {
                                bVar2.L(847915460);
                                bVar2.F();
                                function1.invoke("Back button can only be in leading items, ignoring trailing back button");
                            } else if (wl7.b(raaVar.a, saa.b.a)) {
                                bVar2.L(848105986);
                                bVar2.F();
                                function1.invoke("Close button can only be in leading items, ignoring trailing close button");
                            } else {
                                bVar2.L(848251779);
                                b4g.j(raaVar, bVar2, 0);
                                bVar2.F();
                            }
                        }
                    }
                    bVar2.F();
                    bVar2.q();
                } else {
                    bVar2.D();
                }
                return j6g.a;
        }
    }
}
