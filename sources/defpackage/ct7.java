package defpackage;

import defpackage.et7;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.tare.push.JSTPushAuthorizationImpl$handleSettingsIntentResult$1", f = "JSTPushAuthorizationImpl.kt", l = {}, m = "invokeSuspend")
public final class ct7 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ Function1<et7, j6g> $callback;
    final /* synthetic */ ft7 $pushStatus;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ct7(Function1<? super et7, j6g> function1, ft7 ft7Var, lu2<? super ct7> lu2Var) {
        super(2, lu2Var);
        this.$callback = function1;
        this.$pushStatus = ft7Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new ct7(this.$callback, this.$pushStatus, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((ct7) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        Function1<et7, j6g> function1 = this.$callback;
        ft7 ft7Var = this.$pushStatus;
        ft7Var.getClass();
        function1.invoke(new et7.b(ft7Var));
        return j6g.a;
    }
}
