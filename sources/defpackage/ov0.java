package defpackage;

import defpackage.pv0;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "coil3.compose.AsyncImagePreviewHandler$Companion$Default$1", f = "LocalAsyncImagePreviewHandler.kt", l = {37}, m = "handle")
public final class ov0 extends pu2 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ pv0.a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov0(pv0.a aVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = aVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, this);
    }
}
