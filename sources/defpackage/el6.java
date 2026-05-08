package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class el6 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ el6(int i, gu5 gu5Var, boolean z) {
        this.b = z;
        this.c = gu5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        boolean z = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                gu5 gu5Var = (gu5) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    if (z) {
                        bVar.L(651014712);
                        ehd ehdVarA = chd.a(vs0.a, c20.a.j, bVar, 0);
                        int iHashCode = Long.hashCode(bVar.k());
                        t8b t8bVarM = bVar.m();
                        e.a aVar = e.a.b;
                        e eVarC = c.c(bVar, aVar);
                        gl2.j.getClass();
                        pm8.a aVar2 = gl2.a.b;
                        if (bVar.j() == null) {
                            pg8.B();
                            throw null;
                        }
                        bVar.B();
                        if (bVar.f()) {
                            bVar.y(aVar2);
                        } else {
                            bVar.n();
                        }
                        ygg.y(bVar, ehdVarA, gl2.a.g);
                        ygg.y(bVar, t8bVarM, gl2.a.f);
                        gl2.a.C0251a c0251a = gl2.a.j;
                        if (bVar.f() || !wl7.b(bVar.v(), Integer.valueOf(iHashCode))) {
                            uz.g(iHashCode, bVar, iHashCode, c0251a);
                        }
                        ygg.y(bVar, eVarC, gl2.a.d);
                        gt6.l(fv6.G1, gu5Var, f.a(aVar, "BackButton"), null, null, bVar, 390, 248);
                        bVar.q();
                    } else {
                        bVar.L(648002008);
                    }
                    bVar.F();
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 1:
                ((Integer) obj2).getClass();
                cr8.b(ka2.L(1), (gu5) obj3, (b) obj, z);
                return j6g.a;
            default:
                ((Integer) obj2).getClass();
                ax2.b((List) obj3, z, (b) obj, ka2.L(1));
                return j6g.a;
        }
    }

    public /* synthetic */ el6(int i, List list, boolean z) {
        this.c = list;
        this.b = z;
    }

    public /* synthetic */ el6(gu5 gu5Var, boolean z) {
        this.b = z;
        this.c = gu5Var;
    }
}
