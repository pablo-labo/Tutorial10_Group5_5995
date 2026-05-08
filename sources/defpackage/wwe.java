package defpackage;

import androidx.compose.runtime.b;

/* JADX INFO: loaded from: classes.dex */
public final class wwe implements wu5<sl1, b, Integer, j6g> {
    public final /* synthetic */ rie a;
    public final /* synthetic */ ah2 b;
    public final /* synthetic */ kv0 c;
    public final /* synthetic */ c20 d;
    public final /* synthetic */ ft2 e;

    public wwe(rie rieVar, ah2 ah2Var, kv0 kv0Var, c20 c20Var, ft2 ft2Var) {
        this.a = rieVar;
        this.b = ah2Var;
        this.c = kv0Var;
        this.d = c20Var;
        this.e = ft2Var;
    }

    @Override // defpackage.wu5
    public final j6g q(sl1 sl1Var, b bVar, Integer num) {
        sl1 sl1Var2 = sl1Var;
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= bVar2.K(sl1Var2) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && bVar2.i()) {
            bVar2.D();
        } else {
            ((nq2) this.a).b.b(new iq2(sl1Var2.c()));
            this.b.q(new urc(sl1Var2, this.c, this.d, this.e), bVar2, 0);
        }
        return j6g.a;
    }
}
