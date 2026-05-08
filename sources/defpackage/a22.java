package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public class a22<T> extends z12<T> {
    public final Function2<upb<? super T>, lu2<? super j6g>, Object> d;

    /* JADX WARN: Multi-variable type inference failed */
    public a22(Function2<? super upb<? super T>, ? super lu2<? super j6g>, ? extends Object> function2, v03 v03Var, int i, eo1 eo1Var) {
        super(v03Var, i, eo1Var);
        this.d = function2;
    }

    @Override // defpackage.z12
    public Object j(upb<? super T> upbVar, lu2<? super j6g> lu2Var) {
        Object objInvoke = this.d.invoke(upbVar, lu2Var);
        return objInvoke == g13.a ? objInvoke : j6g.a;
    }

    @Override // defpackage.z12
    public z12<T> k(v03 v03Var, int i, eo1 eo1Var) {
        return new a22(this.d, v03Var, i, eo1Var);
    }

    @Override // defpackage.z12
    public final String toString() {
        return "block[" + this.d + "] -> " + super.toString();
    }
}
