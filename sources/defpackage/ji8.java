package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class ji8 extends mj8 implements Function1<Throwable, j6g> {
    final /* synthetic */ av1 $this_awaitResponse$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji8(av1 av1Var) {
        super(1);
        this.$this_awaitResponse$inlined = av1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(Throwable th) {
        this.$this_awaitResponse$inlined.cancel();
        return j6g.a;
    }
}
