package defpackage;

import defpackage.sp7;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.components.ResumeFileOptionsSheetKt$ResumeFileOptionsSheet$2$1", f = "ResumeFileOptionsSheet.kt", l = {}, m = "invokeSuspend")
public final class g8d extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new g8d(2, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((g8d) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        ((tp7) cr8.p(tp7.class)).b(new sp7.c("profile-files-tab", "sync-to-profile", sp7.c.a.e, null, null, 24));
        return j6g.a;
    }
}
