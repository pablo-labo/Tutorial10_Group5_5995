package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.screens.ProfileSubTabScreenKt$ProfileSubTabScreen$5$5$1$1$1$1", f = "ProfileSubTabScreen.kt", l = {}, m = "invokeSuspend")
public final class oxb extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ Function1<String, j6g> $getEmployerImageUrl;
    final /* synthetic */ j2h $workExperienceItem;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oxb(j2h j2hVar, Function1<? super String, j6g> function1, lu2<? super oxb> lu2Var) {
        super(2, lu2Var);
        this.$workExperienceItem = j2hVar;
        this.$getEmployerImageUrl = function1;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new oxb(this.$workExperienceItem, this.$getEmployerImageUrl, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((oxb) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        String str = this.$workExperienceItem.c;
        if (str != null) {
            this.$getEmployerImageUrl.invoke(str);
        }
        return j6g.a;
    }
}
