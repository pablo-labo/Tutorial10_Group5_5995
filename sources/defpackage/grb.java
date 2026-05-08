package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class grb implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gu5 b;

    public /* synthetic */ grb(int i, gu5 gu5Var) {
        this.a = i;
        this.b = gu5Var;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        gu5 gu5Var = this.b;
        switch (i) {
            case 0:
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    boolean zK = bVar.K(gu5Var);
                    Object objV = bVar.v();
                    if (zK || objV == b.a.a) {
                        objV = new hh(11, gu5Var);
                        bVar.p(objV);
                    }
                    irb.d((gu5) objV, bVar, 0);
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 1:
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    cyb.a(gu5Var, bVar2, 0);
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 2:
                fhd fhdVar = (fhd) obj;
                b bVar3 = (b) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                fhdVar.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= bVar3.K(fhdVar) ? 4 : 2;
                }
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    if (gu5Var == null) {
                        bVar3.L(931763993);
                    } else {
                        bVar3.L(931763994);
                        e eVarA = fhdVar.a(e.a.b, 1.0f);
                        ehd ehdVarA = chd.a(vs0.a, c20.a.j, bVar3, 0);
                        int iHashCode = Long.hashCode(bVar3.k());
                        t8b t8bVarM = bVar3.m();
                        e eVarC = c.c(bVar3, eVarA);
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
                        rof.a(gu5Var, bVar3, 48);
                        bVar3.q();
                    }
                    bVar3.F();
                } else {
                    bVar3.D();
                }
                return j6g.a;
            default:
                b bVar4 = (b) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar4.o(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    q9f.e(6, gu5Var, bVar4, "Request Push Primer");
                } else {
                    bVar4.D();
                }
                return j6g.a;
        }
    }
}
