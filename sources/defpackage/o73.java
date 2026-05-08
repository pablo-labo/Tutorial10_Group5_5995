package defpackage;

import defpackage.csf;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class o73 extends mj8 implements Function1<cd6, j6g> {
    final /* synthetic */ ese<Float> $alpha$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o73(csf.d dVar) {
        super(1);
        this.$alpha$delegate = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(cd6 cd6Var) {
        cd6Var.b(this.$alpha$delegate.getValue().floatValue());
        return j6g.a;
    }
}
