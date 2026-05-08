package defpackage;

import defpackage.k13;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.room.CoroutinesRoom$Companion", f = "CoroutinesRoom.android.kt", l = {64, 94}, m = "execute")
public final class l13<R> extends pu2 {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ k13.a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l13(k13.a aVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = aVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, null, null, this);
    }
}
