package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", l = {647, 658, 415, 424, 679, 720, 472, 741, 495, 521, 752}, m = "doLoad")
public final class yza extends pu2 {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ rza<Object, Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yza(rza<Object, Object> rzaVar, lu2<? super yza> lu2Var) {
        super(lu2Var);
        this.this$0 = rzaVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return rza.b(this.this$0, null, null, this);
    }
}
