package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", l = {56}, m = "invokeSuspend")
public final class y12 extends c1f implements Function2<upb<Object>, lu2<? super j6g>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ z12<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y12(z12<Object> z12Var, lu2<? super y12> lu2Var) {
        super(2, lu2Var);
        this.this$0 = z12Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        y12 y12Var = new y12(this.this$0, lu2Var);
        y12Var.L$0 = obj;
        return y12Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(upb<Object> upbVar, lu2<? super j6g> lu2Var) {
        return ((y12) create(upbVar, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            upb<? super Object> upbVar = (upb) this.L$0;
            z12<Object> z12Var = this.this$0;
            this.label = 1;
            Object objJ = z12Var.j(upbVar, this);
            g13 g13Var = g13.a;
            if (objJ == g13Var) {
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
