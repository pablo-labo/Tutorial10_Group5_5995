package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.screens.ResumesSubTabScreenKt$ResumesSubTabScreen$4$1", f = "ResumesSubTabScreen.kt", l = {}, m = "invokeSuspend")
public final class z9d extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ gu5<j6g> $checkShouldShowRdiAlert;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9d(gu5<j6g> gu5Var, lu2<? super z9d> lu2Var) {
        super(2, lu2Var);
        this.$checkShouldShowRdiAlert = gu5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new z9d(this.$checkShouldShowRdiAlert, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((z9d) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        this.$checkShouldShowRdiAlert.invoke();
        return j6g.a;
    }
}
