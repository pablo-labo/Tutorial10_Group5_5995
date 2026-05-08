package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.models.ProfileViewModel", f = "ProfileViewModel.kt", l = {793, 815}, m = "setJobseekerResumeFileMetadata")
public final class i2c extends pu2 {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ x1c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2c(x1c x1cVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = x1cVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A(null, this);
    }
}
