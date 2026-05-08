package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.launch.IndeedRecaptcha", f = "IndeedRecaptcha.kt", l = {102}, m = "logRecaptchaResult")
public final class k97 extends pu2 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ l97 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k97(l97 l97Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = l97Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return l97.a(this.this$0, this);
    }
}
