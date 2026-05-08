package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.services.UploadResumeApiImpl", f = "UploadResumeApiImpl.kt", l = {51}, m = "uploadResume")
public final class dhg extends pu2 {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ehg this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhg(ehg ehgVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = ehgVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, this);
    }
}
