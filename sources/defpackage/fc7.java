package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.ui.platform.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", f = "InfiniteAnimationPolicy.kt", l = {66}, m = "invokeSuspend")
public final class fc7 extends c1f implements Function1<lu2<Object>, Object> {
    final /* synthetic */ Function1<Long, Object> $onFrame;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public fc7(Function1<? super Long, Object> function1, lu2<? super fc7> lu2Var) {
        super(1, lu2Var);
        this.$onFrame = function1;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new fc7(this.$onFrame, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<Object> lu2Var) {
        return ((fc7) create(lu2Var)).invokeSuspend(j6g.a);
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
        Function1<Long, Object> function1 = this.$onFrame;
        this.label = 1;
        Object objW = ly9.a(getContext()).W(function1, this);
        g13 g13Var = g13.a;
        return objW == g13Var ? g13Var : objW;
    }
}
