package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "expo.modules.kotlin.functions.AsyncFunctionComponent$dispatchOnQueue$4", f = "AsyncFunctionComponent.kt", l = {}, m = "invokeSuspend")
public final class cv0 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ gu5<j6g> $block;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv0(gu5<j6g> gu5Var, lu2<? super cv0> lu2Var) {
        super(2, lu2Var);
        this.$block = gu5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new cv0(this.$block, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((cv0) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        this.$block.invoke();
        return j6g.a;
    }
}
