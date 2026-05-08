package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class xi8 implements Function1 {
    public final kwf a;
    public final List b;
    public final in9 c;

    public xi8(in9 in9Var, gwf gwfVar, kwf kwfVar, List list, boolean z) {
        this.a = kwfVar;
        this.b = list;
        this.c = in9Var;
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
