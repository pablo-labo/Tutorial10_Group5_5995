package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class dn9 implements gu5 {
    public final gn9 a;
    public final rp9 b;
    public final je0 c;

    public dn9(gn9 gn9Var, rp9 rp9Var, je0 je0Var) {
        this.a = gn9Var;
        this.b = rp9Var;
        this.c = je0Var;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        gn9 gn9Var = this.a;
        h04 h04Var = gn9Var.a;
        s5c s5cVarA = gn9Var.a(h04Var.c);
        List<af0> listE = s5cVarA != null ? h04Var.a.e.e(s5cVarA, this.b, this.c) : null;
        return listE == null ? zr4.a : listE;
    }
}
