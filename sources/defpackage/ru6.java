package defpackage;

import androidx.compose.runtime.b;

/* JADX INFO: loaded from: classes3.dex */
public final class ru6 implements wu5<ml1, b, Integer, j6g> {
    public final /* synthetic */ ou6 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ c3a c;

    public ru6(ou6 ou6Var, int i, c3a c3aVar) {
        this.a = ou6Var;
        this.b = i;
        this.c = c3aVar;
    }

    @Override // defpackage.wu5
    public final j6g q(ml1 ml1Var, b bVar, Integer num) {
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        ml1Var.getClass();
        if ((iIntValue & 17) == 16 && bVar2.i()) {
            bVar2.D();
        } else {
            ou6 ou6Var = this.a;
            String str = ou6Var.b;
            boolean z = ou6Var.d;
            Integer num2 = ou6Var.e;
            bVar2.L(-1633490746);
            boolean zK = bVar2.K(ou6Var);
            Object objV = bVar2.v();
            if (zK || objV == b.a.a) {
                objV = new qj(8, ou6Var, this.c);
                bVar2.p(objV);
            }
            bVar2.F();
            vu6.a(str, z, null, num2, (gu5) objV, p6.c(this.b, "null_FilterChip_"), bVar2, 0);
        }
        return j6g.a;
    }
}
