package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class tu4 extends mj8 implements Function1<cd6, j6g> {
    final /* synthetic */ boolean $disableClip;
    final /* synthetic */ gu5<Boolean> $isEnabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu4(gu5 gu5Var, boolean z) {
        super(1);
        this.$disableClip = z;
        this.$isEnabled = gu5Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(cd6 cd6Var) {
        cd6Var.n(!this.$disableClip && this.$isEnabled.invoke().booleanValue());
        return j6g.a;
    }
}
