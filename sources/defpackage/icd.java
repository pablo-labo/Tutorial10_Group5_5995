package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.services.RichProfileServiceHelper", f = "RichProfileServiceHelper.kt", l = {288}, m = "getRichProfileResumeData")
public final class icd extends pu2 {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ zcd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icd(zcd zcdVar, lu2<? super icd> lu2Var) {
        super(lu2Var);
        this.this$0 = zcdVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.I(this);
    }
}
