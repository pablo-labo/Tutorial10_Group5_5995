package defpackage;

import defpackage.sp7;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.components.MissingDetailsAlertKt$MissingDetailsAlert$1$1", f = "MissingDetailsAlert.kt", l = {}, m = "invokeSuspend")
public final class gu9 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ String $itemId;
    final /* synthetic */ String $sectionType;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gu9(String str, String str2, lu2<? super gu9> lu2Var) {
        super(2, lu2Var);
        this.$sectionType = str;
        this.$itemId = str2;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new gu9(this.$sectionType, this.$itemId, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((gu9) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        String str = this.$sectionType;
        String str2 = this.$itemId;
        str.getClass();
        str2.getClass();
        ((tp7) cr8.p(tp7.class)).b(new sp7.c("rich-profile-home-screen", "richProfileMissingDetailsAlert", sp7.c.a.a, null, new mm1(2, str, str2), 8));
        return j6g.a;
    }
}
