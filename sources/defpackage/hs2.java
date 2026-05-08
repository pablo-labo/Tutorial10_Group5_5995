package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.services.ContactInformationService", f = "ContactInformationService.kt", l = {29}, m = "updateResumeContactInformation")
public final class hs2 extends pu2 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ is2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs2(is2 is2Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = is2Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
