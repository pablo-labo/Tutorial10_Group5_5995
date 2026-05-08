package defpackage;

import androidx.compose.runtime.b;

/* JADX INFO: loaded from: classes3.dex */
public final class mx6 implements wu5<pb2, b, Integer, j6g> {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ah2 b;

    public mx6(boolean z, ah2 ah2Var) {
        this.a = z;
        this.b = ah2Var;
    }

    @Override // defpackage.wu5
    public final j6g q(pb2 pb2Var, b bVar, Integer num) {
        pb2 pb2Var2 = pb2Var;
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        pb2Var2.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= bVar2.K(pb2Var2) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && bVar2.i()) {
            bVar2.D();
        } else {
            rm2.a(nx6.a.a(Boolean.valueOf(this.a)), bh2.c(1511599812, new lx6(0, this.b, pb2Var2), bVar2), bVar2, 56);
        }
        return j6g.a;
    }
}
