package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.presentation.components.interviewprep.InterviewPrepJobCardCTAKt$InterviewPrepJobCardCTAContent$1$1", f = "InterviewPrepJobCardCTA.kt", l = {}, m = "invokeSuspend")
public final class hk7 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ String $source;
    final /* synthetic */ c88 $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk7(String str, c88 c88Var, lu2<? super hk7> lu2Var) {
        super(2, lu2Var);
        this.$source = str;
        this.$state = c88Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new hk7(this.$source, this.$state, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((hk7) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        Function1<lx5, j6g> function1 = c05.a;
        c05.c(this.$source, new ji(this.$state, 4));
        return j6g.a;
    }
}
