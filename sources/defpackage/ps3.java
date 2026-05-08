package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "expo.modules.speechrecognition.DelayedFileStreamer", f = "DelayedFileStreamer.kt", l = {138}, m = "streamAudioContents")
public final class ps3 extends pu2 {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ qs3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ps3(qs3 qs3Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = qs3Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return qs3.a(this.this$0, null, null, this);
    }
}
