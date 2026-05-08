package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import defpackage.pn5;

/* JADX INFO: loaded from: classes.dex */
public final class mh6 implements wu5<e, b, Integer, e> {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ tjf c;

    public mh6(int i, int i2, tjf tjfVar) {
        this.a = i;
        this.b = i2;
        this.c = tjfVar;
    }

    @Override // defpackage.wu5
    public final e q(e eVar, b bVar, Integer num) {
        b bVar2 = bVar;
        num.intValue();
        bVar2.L(408240218);
        int i = this.a;
        int i2 = this.b;
        mh2.D(i, i2);
        e.a aVar = e.a.b;
        if (i == 1 && i2 == Integer.MAX_VALUE) {
            bVar2.F();
            return aVar;
        }
        iy3 iy3Var = (iy3) bVar2.M(um2.h);
        pn5.a aVar2 = (pn5.a) bVar2.M(um2.k);
        vl8 vl8Var = (vl8) bVar2.M(um2.n);
        tjf tjfVar = this.c;
        boolean zK = bVar2.K(tjfVar) | bVar2.d(vl8Var.ordinal());
        Object objV = bVar2.v();
        b.a.C0020a c0020a = b.a.a;
        if (zK || objV == c0020a) {
            objV = web.y(tjfVar, vl8Var);
            bVar2.p(objV);
        }
        tjf tjfVar2 = (tjf) objV;
        boolean zK2 = bVar2.K(aVar2) | bVar2.K(tjfVar2);
        Object objV2 = bVar2.v();
        if (zK2 || objV2 == c0020a) {
            foe foeVar = tjfVar2.a;
            pn5 pn5Var = foeVar.f;
            to5 to5Var = foeVar.c;
            if (to5Var == null) {
                to5Var = to5.b0;
            }
            mo5 mo5Var = foeVar.d;
            int i3 = mo5Var != null ? mo5Var.a : 0;
            no5 no5Var = foeVar.e;
            objV2 = aVar2.a(pn5Var, to5Var, i3, no5Var != null ? no5Var.a : 65535);
            bVar2.p(objV2);
        }
        ese eseVar = (ese) objV2;
        boolean zK3 = bVar2.K(eseVar.getValue()) | bVar2.K(iy3Var) | bVar2.K(aVar2) | bVar2.K(tjfVar) | bVar2.d(vl8Var.ordinal());
        Object objV3 = bVar2.v();
        if (zK3 || objV3 == c0020a) {
            objV3 = Integer.valueOf((int) (kef.a(tjfVar2, iy3Var, aVar2, kef.a, 1) & 4294967295L));
            bVar2.p(objV3);
        }
        int iIntValue = ((Number) objV3).intValue();
        boolean zK4 = bVar2.K(tjfVar) | bVar2.K(iy3Var) | bVar2.K(aVar2) | bVar2.d(vl8Var.ordinal()) | bVar2.K(eseVar.getValue());
        Object objV4 = bVar2.v();
        if (zK4 || objV4 == c0020a) {
            StringBuilder sb = new StringBuilder();
            String str = kef.a;
            sb.append(str);
            sb.append('\n');
            sb.append(str);
            objV4 = Integer.valueOf((int) (kef.a(tjfVar2, iy3Var, aVar2, sb.toString(), 2) & 4294967295L));
            bVar2.p(objV4);
        }
        int iIntValue2 = ((Number) objV4).intValue() - iIntValue;
        Integer numValueOf = i == 1 ? null : Integer.valueOf(((i - 1) * iIntValue2) + iIntValue);
        Integer numValueOf2 = i2 != Integer.MAX_VALUE ? Integer.valueOf(((i2 - 1) * iIntValue2) + iIntValue) : null;
        e eVarI = g.i(aVar, numValueOf != null ? iy3Var.k1(numValueOf.intValue()) : Float.NaN, numValueOf2 != null ? iy3Var.k1(numValueOf2.intValue()) : Float.NaN);
        bVar2.F();
        return eVarI;
    }
}
