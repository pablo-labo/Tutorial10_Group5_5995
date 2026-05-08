package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.rnonboarding.detectlocation.DetectLocationHandler", f = "DetectLocationHandler.kt", l = {118}, m = "requestAndDetectLocation")
public final class z14 extends pu2 {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b24 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z14(b24 b24Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = b24Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return b24.a(this.this$0, this);
    }
}
