package defpackage;

import defpackage.sp7;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.screens.ProfileScreenKt$ProfileScreen$5$3$3$2$1", f = "ProfileScreen.kt", l = {}, m = "invokeSuspend")
public final class gvb extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;

    public gvb() {
        super(2, null);
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new gvb(2, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((gvb) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        ((tp7) cr8.p(tp7.class)).b(new sp7.c("profile-tab", "rdi-alert", sp7.c.a.a, null, null, 24));
        return j6g.a;
    }
}
