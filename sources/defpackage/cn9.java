package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class cn9 implements gu5 {
    public final gn9 a;
    public final boolean b;
    public final g5c c;

    public cn9(gn9 gn9Var, boolean z, g5c g5cVar) {
        this.a = gn9Var;
        this.b = z;
        this.c = g5cVar;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        List listZ1;
        gn9 gn9Var = this.a;
        h04 h04Var = gn9Var.a;
        s5c s5cVarA = gn9Var.a(h04Var.c);
        if (s5cVarA != null) {
            g04 g04Var = h04Var.a;
            boolean z = this.b;
            g5c g5cVar = this.c;
            listZ1 = z ? z92.z1(g04Var.e.i(s5cVarA, g5cVar)) : z92.z1(g04Var.e.d(s5cVarA, g5cVar));
        } else {
            listZ1 = null;
        }
        return listZ1 == null ? zr4.a : listZ1;
    }
}
