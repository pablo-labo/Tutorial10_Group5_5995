package defpackage;

import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1", f = "SingleProcessDataStore.kt", l = {DataOkHttpUploader.HTTP_UNAVAILABLE, 337, 339}, m = "updateData")
public final class hhe extends pu2 {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ihe this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hhe(ihe iheVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = iheVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
