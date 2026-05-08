package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.zza;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$1", f = "PageFetcherSnapshot.kt", l = {646, 658, 125, 669, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, 680, 692, 125, 703, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, 714, 726, 125, 737, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, 748}, m = "emit")
public final class a0b extends pu2 {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ zza.c.a<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0b(zza.c.a<Object> aVar, lu2<? super a0b> lu2Var) {
        super(lu2Var);
        this.this$0 = aVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(this);
    }
}
