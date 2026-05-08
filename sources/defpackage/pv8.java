package defpackage;

import defpackage.kv8;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", l = {}, m = "invokeSuspend")
public final class pv8 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ qv8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv8(qv8 qv8Var, lu2<? super pv8> lu2Var) {
        super(2, lu2Var);
        this.this$0 = qv8Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        pv8 pv8Var = new pv8(this.this$0, lu2Var);
        pv8Var.L$0 = obj;
        return pv8Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((pv8) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        e13 e13Var = (e13) this.L$0;
        if (this.this$0.a.b().compareTo(kv8.b.b) >= 0) {
            qv8 qv8Var = this.this$0;
            qv8Var.a.a(qv8Var);
        } else {
            u63.o(e13Var.getCoroutineContext(), null);
        }
        return j6g.a;
    }
}
