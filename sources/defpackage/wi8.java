package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class wi8 implements Function1 {
    public final kwf a;
    public final List b;

    public wi8(kwf kwfVar, List list, gwf gwfVar, boolean z) {
        this.a = kwfVar;
        this.b = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        bj8 bj8Var = (bj8) obj;
        bj8Var.getClass();
        v62 v62VarD = this.a.d();
        if (v62VarD != null) {
            bj8Var.y0(v62VarD);
        }
        return null;
    }
}
