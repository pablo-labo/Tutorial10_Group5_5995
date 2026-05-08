package defpackage;

import defpackage.et7;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.tare.push.JSTPushAuthorizationImpl$handlePostNotificationsCallback$1", f = "JSTPushAuthorizationImpl.kt", l = {}, m = "invokeSuspend")
public final class bt7 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ Function1<et7, j6g> $callback;
    final /* synthetic */ boolean $permissionGranted;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public bt7(boolean z, Function1<? super et7, j6g> function1, lu2<? super bt7> lu2Var) {
        super(2, lu2Var);
        this.$permissionGranted = z;
        this.$callback = function1;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new bt7(this.$permissionGranted, this.$callback, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((bt7) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        this.$callback.invoke(new et7.b(this.$permissionGranted ? ft7.c : ft7.b));
        return j6g.a;
    }
}
