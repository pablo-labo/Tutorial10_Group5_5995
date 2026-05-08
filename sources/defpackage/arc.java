package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "coil3.RealImageLoader", f = "RealImageLoader.kt", l = {116, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, 132}, m = "execute")
public final class arc extends pu2 {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ xqc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arc(xqc xqcVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = xqcVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        xqc xqcVar = this.this$0;
        int i = xqc.f;
        return xqcVar.c(null, 0, this);
    }
}
