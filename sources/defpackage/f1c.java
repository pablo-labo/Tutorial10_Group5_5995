package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.fragment.app.g;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f1c implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ vu5 c;

    public /* synthetic */ f1c(Object obj, vu5 vu5Var, int i) {
        this.a = i;
        this.b = obj;
        this.c = vu5Var;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        b.a.C0020a c0020a = b.a.a;
        vu5 vu5Var = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                g gVar = (g) obj4;
                wu5 wu5Var = (wu5) vu5Var;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    boolean zX = bVar.x(gVar) | bVar.K(wu5Var);
                    Object objV = bVar.v();
                    if (zX || objV == c0020a) {
                        objV = new aq0(7, gVar, wu5Var);
                        bVar.p(objV);
                    }
                    q1c.c(48, (gu5) objV, bVar, "Review Certification Suggestion", true);
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 1:
                g gVar2 = (g) obj4;
                wu5 wu5Var2 = (wu5) vu5Var;
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    boolean zX2 = bVar2.x(gVar2) | bVar2.K(wu5Var2);
                    Object objV2 = bVar2.v();
                    if (zX2 || objV2 == c0020a) {
                        objV2 = new qyb(gVar2, wu5Var2, 1);
                        bVar2.p(objV2);
                    }
                    q1c.c(48, (gu5) objV2, bVar2, "Review Languages Suggestion", true);
                } else {
                    bVar2.D();
                }
                return j6g.a;
            default:
                gu5 gu5Var = (gu5) obj4;
                gu5 gu5Var2 = (gu5) vu5Var;
                b bVar3 = (b) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (!bVar3.o(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    bVar3.D();
                } else if (((h2g) cr8.p(h2g.class)).a()) {
                    bVar3.L(-1787058056);
                    ehd ehdVarA = chd.a(vs0.a, c20.a.j, bVar3, 0);
                    int iHashCode = Long.hashCode(bVar3.k());
                    t8b t8bVarM = bVar3.m();
                    e eVarC = c.c(bVar3, e.a.b);
                    gl2.j.getClass();
                    pm8.a aVar = gl2.a.b;
                    if (bVar3.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar3.B();
                    if (bVar3.f()) {
                        bVar3.y(aVar);
                    } else {
                        bVar3.n();
                    }
                    ygg.y(bVar3, ehdVarA, gl2.a.g);
                    ygg.y(bVar3, t8bVarM, gl2.a.f);
                    gl2.a.C0251a c0251a = gl2.a.j;
                    if (bVar3.f() || !wl7.b(bVar3.v(), Integer.valueOf(iHashCode))) {
                        uz.g(iHashCode, bVar3, iHashCode, c0251a);
                    }
                    ygg.y(bVar3, eVarC, gl2.a.d);
                    irb.c(gu5Var2, bVar3, 0);
                    irb.e(gu5Var, bVar3, 0);
                    bVar3.q();
                    bVar3.F();
                } else {
                    bVar3.L(-1786864058);
                    irb.e(gu5Var, bVar3, 0);
                    bVar3.F();
                }
                return j6g.a;
        }
    }
}
