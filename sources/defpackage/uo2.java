package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.room.coroutines.ConnectionPoolImpl$useConnection$2", f = "ConnectionPoolImpl.kt", l = {115}, m = "invokeSuspend")
public final class uo2 extends c1f implements Function2<e13, lu2<Object>, Object> {
    final /* synthetic */ Function2<drf, lu2<Object>, Object> $block;
    final /* synthetic */ egb $confinedConnection;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public uo2(Function2<? super drf, ? super lu2<Object>, ? extends Object> function2, egb egbVar, lu2<? super uo2> lu2Var) {
        super(2, lu2Var);
        this.$block = function2;
        this.$confinedConnection = egbVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new uo2(this.$block, this.$confinedConnection, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<Object> lu2Var) {
        return ((uo2) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                r7d.b(obj);
                return obj;
            }
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        Function2<drf, lu2<Object>, Object> function2 = this.$block;
        egb egbVar = this.$confinedConnection;
        this.label = 1;
        Object objInvoke = function2.invoke(egbVar, this);
        g13 g13Var = g13.a;
        return objInvoke == g13Var ? g13Var : objInvoke;
    }
}
