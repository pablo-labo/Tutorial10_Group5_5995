package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.models.ProfileViewModel$submitContactInformationForm$1$1", f = "ProfileViewModel.kt", l = {640}, m = "invokeSuspend")
public final class j2c extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ String $jobSeekerResumeId;
    final /* synthetic */ gu5<j6g> $postSaveCallback;
    int label;
    final /* synthetic */ x1c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2c(x1c x1cVar, String str, gu5<j6g> gu5Var, lu2<? super j2c> lu2Var) {
        super(2, lu2Var);
        this.this$0 = x1cVar;
        this.$jobSeekerResumeId = str;
        this.$postSaveCallback = gu5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new j2c(this.this$0, this.$jobSeekerResumeId, this.$postSaveCallback, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((j2c) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            x1c x1cVar = this.this$0;
            String str = this.$jobSeekerResumeId;
            gu5<j6g> gu5Var = this.$postSaveCallback;
            qq qqVar = new qq(x1cVar, 21);
            this.label = 1;
            Object objW = x1cVar.w(str, gu5Var, qqVar, this);
            g13 g13Var = g13.a;
            if (objW == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        return j6g.a;
    }
}
