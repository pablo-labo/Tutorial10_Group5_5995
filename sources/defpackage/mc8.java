package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class mc8 implements gu5 {
    public final nc8 a;
    public final j29 b;

    public mc8(nc8 nc8Var, j29 j29Var) {
        this.a = nc8Var;
        this.b = j29Var;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        nc8 nc8Var = this.a;
        Function1<xx9, aj3> function1 = nc8Var.b;
        yx9 yx9Var = nc8Var.a;
        aj3 aj3VarInvoke = function1.invoke(yx9Var);
        n8a n8aVar = nc8.g;
        List listZ = u63.Z(yx9Var.d.e());
        ax9 ax9Var = ax9.e;
        c62 c62Var = c62.INTERFACE;
        j29 j29Var = this.b;
        w52 w52Var = new w52(aj3VarInvoke, n8aVar, ax9Var, c62Var, listZ, j29Var);
        w52Var.K0(new e82(j29Var, w52Var), is4.a, null);
        return w52Var;
    }
}
