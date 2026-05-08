package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ev0 extends dv0 {
    public final Function2<Object[], p3c, j6g> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ev0(String str, rf0[] rf0VarArr, Function2<? super Object[], ? super p3c, j6g> function2) {
        super(str, rf0VarArr);
        str.getClass();
        this.h = function2;
    }

    @Override // defpackage.dv0
    public final void g(Object[] objArr, p3c p3cVar, gk0 gk0Var) {
        this.h.invoke(qf0.b(this, objArr, gk0Var), p3cVar);
    }
}
