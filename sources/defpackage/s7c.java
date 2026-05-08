package defpackage;

import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode", f = "PullToRefresh.kt", l = {DataOkHttpUploader.HTTP_BAD_REQUEST}, m = "animateToThreshold")
public final class s7c extends pu2 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ t7c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7c(t7c t7cVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = t7cVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.g2(this);
    }
}
