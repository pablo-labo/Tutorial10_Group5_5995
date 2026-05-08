package defpackage;

import androidx.compose.runtime.b;

/* JADX INFO: loaded from: classes3.dex */
public final class bs6 implements wu5<ml1, b, Integer, j6g> {
    public final /* synthetic */ ah2 a;

    public bs6(ah2 ah2Var) {
        this.a = ah2Var;
    }

    @Override // defpackage.wu5
    public final j6g q(ml1 ml1Var, b bVar, Integer num) {
        ml1 ml1Var2 = ml1Var;
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        ml1Var2.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= bVar2.K(ml1Var2) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && bVar2.i()) {
            bVar2.D();
        } else {
            this.a.q(ml1Var2, bVar2, Integer.valueOf(iIntValue & 14));
        }
        return j6g.a;
    }
}
