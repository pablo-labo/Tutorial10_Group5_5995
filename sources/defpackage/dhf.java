package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.i;
import defpackage.pn5;

/* JADX INFO: loaded from: classes.dex */
public final class dhf implements wu5<e, b, Integer, e> {
    public final /* synthetic */ tjf a;

    public dhf(tjf tjfVar) {
        this.a = tjfVar;
    }

    @Override // defpackage.wu5
    public final e q(e eVar, b bVar, Integer num) {
        b bVar2 = bVar;
        num.intValue();
        bVar2.L(1582736677);
        iy3 iy3Var = (iy3) bVar2.M(um2.h);
        pn5.a aVar = (pn5.a) bVar2.M(um2.k);
        vl8 vl8Var = (vl8) bVar2.M(um2.n);
        tjf tjfVar = this.a;
        boolean zK = bVar2.K(tjfVar) | bVar2.d(vl8Var.ordinal());
        Object objV = bVar2.v();
        b.a.C0020a c0020a = b.a.a;
        if (zK || objV == c0020a) {
            objV = web.y(tjfVar, vl8Var);
            bVar2.p(objV);
        }
        tjf tjfVar2 = (tjf) objV;
        boolean zK2 = bVar2.K(aVar) | bVar2.K(tjfVar2);
        Object objV2 = bVar2.v();
        if (zK2 || objV2 == c0020a) {
            foe foeVar = tjfVar2.a;
            pn5 pn5Var = foeVar.f;
            to5 to5Var = foeVar.c;
            if (to5Var == null) {
                to5Var = to5.b0;
            }
            mo5 mo5Var = foeVar.d;
            int i = mo5Var != null ? mo5Var.a : 0;
            no5 no5Var = foeVar.e;
            objV2 = aVar.a(pn5Var, to5Var, i, no5Var != null ? no5Var.a : 65535);
            bVar2.p(objV2);
        }
        ese eseVar = (ese) objV2;
        Object objV3 = bVar2.v();
        Object obj = objV3;
        if (objV3 == c0020a) {
            Object value = eseVar.getValue();
            chf chfVar = new chf();
            chfVar.a = vl8Var;
            chfVar.b = iy3Var;
            chfVar.c = aVar;
            chfVar.d = tjfVar;
            chfVar.e = value;
            chfVar.f = kef.a(tjfVar, iy3Var, aVar, kef.a, 1);
            bVar2.p(chfVar);
            obj = chfVar;
        }
        chf chfVar2 = (chf) obj;
        Object value2 = eseVar.getValue();
        if (vl8Var != chfVar2.a || !wl7.b(iy3Var, chfVar2.b) || !wl7.b(aVar, chfVar2.c) || !wl7.b(tjfVar2, chfVar2.d) || !wl7.b(value2, chfVar2.e)) {
            chfVar2.a = vl8Var;
            chfVar2.b = iy3Var;
            chfVar2.c = aVar;
            chfVar2.d = tjfVar2;
            chfVar2.e = value2;
            chfVar2.f = kef.a(tjfVar2, iy3Var, aVar, kef.a, 1);
        }
        boolean zX = bVar2.x(chfVar2);
        Object objV4 = bVar2.v();
        if (zX || objV4 == c0020a) {
            objV4 = new gr9(chfVar2, 2);
            bVar2.p(objV4);
        }
        e eVarA = i.a(e.a.b, (wu5) objV4);
        bVar2.F();
        return eVarA;
    }
}
