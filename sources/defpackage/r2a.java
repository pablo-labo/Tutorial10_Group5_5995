package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class r2a extends mj8 implements Function1<yb2, yb2> {
    final /* synthetic */ yz8 $remoteLoadStates;
    final /* synthetic */ yz8 $sourceLoadStates;
    final /* synthetic */ t2a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2a(t2a t2aVar, yz8 yz8Var, yz8 yz8Var2) {
        super(1);
        this.this$0 = t2aVar;
        this.$sourceLoadStates = yz8Var;
        this.$remoteLoadStates = yz8Var2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final yb2 invoke(yb2 yb2Var) {
        return t2a.a(this.this$0, yb2Var, this.$sourceLoadStates, this.$remoteLoadStates);
    }
}
