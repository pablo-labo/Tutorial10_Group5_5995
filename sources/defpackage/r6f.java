package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class r6f extends mj8 implements Function1<iy3, lh7> {
    final /* synthetic */ ese<j94> $indicatorOffset$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6f(ese<j94> eseVar) {
        super(1);
        this.$indicatorOffset$delegate = eseVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final lh7 invoke(iy3 iy3Var) {
        return new lh7(((long) iy3Var.x0(this.$indicatorOffset$delegate.getValue().a)) << 32);
    }
}
