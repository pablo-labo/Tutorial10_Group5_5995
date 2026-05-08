package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.room.coroutines.ConnectionPoolImpl$acquireWithTimeout$2", f = "ConnectionPoolImpl.kt", l = {171}, m = "invokeSuspend")
public final class so2 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ luc<ap2> $connection;
    final /* synthetic */ tfb $this_acquireWithTimeout;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public so2(luc<ap2> lucVar, tfb tfbVar, lu2<? super so2> lu2Var) {
        super(2, lu2Var);
        this.$connection = lucVar;
        this.$this_acquireWithTimeout = tfbVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new so2(this.$connection, this.$this_acquireWithTimeout, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((so2) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws Throwable {
        T t;
        luc<ap2> lucVar;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            luc<ap2> lucVar2 = this.$connection;
            tfb tfbVar = this.$this_acquireWithTimeout;
            this.L$0 = lucVar2;
            this.label = 1;
            Object objA = tfbVar.a(this);
            g13 g13Var = g13.a;
            if (objA == g13Var) {
                return g13Var;
            }
            t = objA;
            lucVar = lucVar2;
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lucVar = (luc) this.L$0;
            r7d.b(obj);
            t = obj;
        }
        lucVar.element = t;
        return j6g.a;
    }
}
