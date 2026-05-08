package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class o7g<ReturnType> extends dv0 {
    public final Function1<Object[], ReturnType> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o7g(String str, rf0[] rf0VarArr, Function1<? super Object[], ? extends ReturnType> function1) {
        super(str, rf0VarArr);
        str.getClass();
        this.h = function1;
    }

    @Override // defpackage.dv0
    public void g(Object[] objArr, p3c p3cVar, gk0 gk0Var) {
        p3cVar.resolve(this.h.invoke(qf0.b(this, objArr, gk0Var)));
    }
}
