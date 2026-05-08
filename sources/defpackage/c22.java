package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", l = {148}, m = "invokeSuspend")
public final class c22 extends c1f implements Function2<wi5<Object>, lu2<? super j6g>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d22<Object, Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c22(d22<Object, Object> d22Var, lu2<? super c22> lu2Var) {
        super(2, lu2Var);
        this.this$0 = d22Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        c22 c22Var = new c22(this.this$0, lu2Var);
        c22Var.L$0 = obj;
        return c22Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(wi5<Object> wi5Var, lu2<? super j6g> lu2Var) {
        return ((c22) create(wi5Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            wi5<? super Object> wi5Var = (wi5) this.L$0;
            d22<Object, Object> d22Var = this.this$0;
            this.label = 1;
            Object objN = d22Var.n(wi5Var, this);
            g13 g13Var = g13.a;
            if (objN == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        return j6g.a;
    }
}
