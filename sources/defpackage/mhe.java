package defpackage;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {359, 362, 365}, m = "readDataOrHandleCorruption")
public final class mhe extends pu2 {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ yge<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mhe(yge ygeVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = ygeVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        yge<Object> ygeVar = this.this$0;
        LinkedHashSet linkedHashSet = yge.Y;
        return ygeVar.h(this);
    }
}
