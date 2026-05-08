package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.paging.CancelableChannelFlowKt$cancelableChannelFlow$1", f = "CancelableChannelFlow.kt", l = {33}, m = "invokeSuspend")
public final class mw1 extends c1f implements Function2<cge<Object>, lu2<? super j6g>, Object> {
    final /* synthetic */ Function2<cge<Object>, lu2<? super j6g>, Object> $block;
    final /* synthetic */ ex7 $controller;
    private /* synthetic */ Object L$0;
    int label;

    public static final class a extends mj8 implements Function1<Throwable, j6g> {
        final /* synthetic */ cge<Object> $$this$simpleChannelFlow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(cge<Object> cgeVar) {
            super(1);
            this.$$this$simpleChannelFlow = cgeVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Throwable th) {
            this.$$this$simpleChannelFlow.k(null);
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public mw1(ex7 ex7Var, Function2<? super cge<Object>, ? super lu2<? super j6g>, ? extends Object> function2, lu2<? super mw1> lu2Var) {
        super(2, lu2Var);
        this.$controller = ex7Var;
        this.$block = function2;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        mw1 mw1Var = new mw1(this.$controller, this.$block, lu2Var);
        mw1Var.L$0 = obj;
        return mw1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(cge<Object> cgeVar, lu2<? super j6g> lu2Var) {
        return ((mw1) create(cgeVar, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            cge<Object> cgeVar = (cge) this.L$0;
            this.$controller.d0(new a(cgeVar));
            Function2<cge<Object>, lu2<? super j6g>, Object> function2 = this.$block;
            this.label = 1;
            Object objInvoke = function2.invoke(cgeVar, this);
            g13 g13Var = g13.a;
            if (objInvoke == g13Var) {
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
