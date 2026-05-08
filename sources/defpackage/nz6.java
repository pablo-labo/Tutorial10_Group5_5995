package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.ifl.components.IdlToastKt$IdlToast$1$1", f = "IdlToast.kt", l = {211}, m = "invokeSuspend")
public final class nz6 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ Long $duration;
    final /* synthetic */ gu5<j6g> $onDismiss;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz6(Long l, gu5<j6g> gu5Var, lu2<? super nz6> lu2Var) {
        super(2, lu2Var);
        this.$duration = l;
        this.$onDismiss = gu5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new nz6(this.$duration, this.$onDismiss, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((nz6) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            Long l = this.$duration;
            long jE = l != null ? nic.E(l.longValue(), 4000L, 10000L) : 4000L;
            this.label = 1;
            Object objB = ls3.b(jE, this);
            g13 g13Var = g13.a;
            if (objB == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        this.$onDismiss.invoke();
        return j6g.a;
    }
}
