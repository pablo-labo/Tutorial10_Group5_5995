package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.presentation.components.other.HiredCelebrationContentKt$HiredCelebrationContent$1$1", f = "HiredCelebrationContent.kt", l = {}, m = "invokeSuspend")
public final class gi6 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ gu5<j6g> $generateBitmap;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi6(gu5<j6g> gu5Var, lu2<? super gi6> lu2Var) {
        super(2, lu2Var);
        this.$generateBitmap = gu5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new gi6(this.$generateBitmap, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((gi6) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        this.$generateBitmap.invoke();
        return j6g.a;
    }
}
