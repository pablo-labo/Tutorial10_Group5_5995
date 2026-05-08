package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.BasicTooltipStateImpl$show$2", f = "BasicTooltip.kt", l = {310, 312}, m = "invokeSuspend")
public final class ge1 extends c1f implements Function1<lu2<? super j6g>, Object> {
    final /* synthetic */ Function1<lu2<? super j6g>, Object> $cancellableShow;
    int label;
    final /* synthetic */ ie1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ge1(ie1 ie1Var, Function1<? super lu2<? super j6g>, ? extends Object> function1, lu2<? super ge1> lu2Var) {
        super(1, lu2Var);
        this.this$0 = ie1Var;
        this.$cancellableShow = function1;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new ge1(this.this$0, this.$cancellableShow, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<? super j6g> lu2Var) {
        return ((ge1) create(lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [j6g, java.lang.Object] */
    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        try {
            if (i == 0) {
                r7d.b(obj);
                this.this$0.getClass();
                Function1<lu2<? super j6g>, Object> function1 = this.$cancellableShow;
                this.label = 1;
                Object objInvoke = function1.invoke(this);
                g13 g13Var = g13.a;
                if (objInvoke == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1 && i != 2) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            ((gme) this.this$0.b).setValue(Boolean.FALSE);
            this = j6g.a;
            return this;
        } catch (Throwable th) {
            ((gme) this.this$0.b).setValue(Boolean.FALSE);
            throw th;
        }
    }
}
