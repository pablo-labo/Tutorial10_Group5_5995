package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class xef extends mj8 implements Function1<cd6, j6g> {
    final /* synthetic */ ese<Float> $prefixSuffixAlpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xef(ese<Float> eseVar) {
        super(1);
        this.$prefixSuffixAlpha = eseVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(cd6 cd6Var) {
        cd6Var.b(this.$prefixSuffixAlpha.getValue().floatValue());
        return j6g.a;
    }
}
