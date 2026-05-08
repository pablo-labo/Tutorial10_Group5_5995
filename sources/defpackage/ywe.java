package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.r;
import defpackage.kv0;

/* JADX INFO: loaded from: classes.dex */
public final class ywe implements wu5<axe, b, Integer, j6g> {
    public final /* synthetic */ ah2 a;

    public ywe(ah2 ah2Var) {
        this.a = ah2Var;
    }

    @Override // defpackage.wu5
    public final j6g q(axe axeVar, b bVar, Integer num) {
        axe axeVar2 = axeVar;
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= bVar2.K(axeVar2) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && bVar2.i()) {
            bVar2.D();
        } else {
            kv0.b bVar3 = (kv0.b) r.a(axeVar2.b().i0, bVar2).getValue();
            if (bVar3 instanceof kv0.b.c) {
                bVar2.L(1362365438);
                this.a.j(axeVar2, bVar3, bVar2, Integer.valueOf(iIntValue & 14));
                j6g j6gVar = j6g.a;
                bVar2.F();
                bVar2.L(-715997831);
            } else {
                if (bVar3 instanceof kv0.b.d) {
                    bVar2.L(-716230951);
                    bVar2.F();
                } else if (bVar3 instanceof kv0.b.C0300b) {
                    bVar2.L(-716143655);
                    bVar2.F();
                } else if (!(bVar3 instanceof kv0.b.a)) {
                    l.g();
                    return null;
                }
                bVar2.L(1362375718);
                zwe.b(axeVar2, null, null, null, null, null, 0.0f, null, false, bVar2, iIntValue & 14);
            }
            bVar2.F();
        }
        return j6g.a;
    }
}
