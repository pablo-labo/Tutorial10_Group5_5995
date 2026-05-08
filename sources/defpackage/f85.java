package defpackage;

import com.datadog.android.trace.AndroidTracer;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.domain.usecase.FetchInferredJobUseCase", f = "FetchInferredJobUseCase.kt", l = {34, 57, 59, 61, AndroidTracer.SPAN_ID_BIT_SIZE, 65, 67}, m = "invoke")
public final class f85 extends pu2 {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ g85 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f85(g85 g85Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = g85Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
