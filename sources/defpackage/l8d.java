package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.services.ResumeFileService", f = "ResumeFileService.kt", l = {172, 174, 183}, m = "generateJobSeekerResumeFileUrl")
public final class l8d extends pu2 {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ o8d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8d(o8d o8dVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = o8dVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.h(this);
    }
}
