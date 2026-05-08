package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class zv9 extends mj8 implements Function1<gb4, j6g> {
    final /* synthetic */ ese<Float> $alpha$delegate;
    final /* synthetic */ long $color;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv9(long j, ese<Float> eseVar) {
        super(1);
        this.$color = j;
        this.$alpha$delegate = eseVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(gb4 gb4Var) {
        gb4 gb4Var2 = gb4Var;
        long j = this.$color;
        ese<Float> eseVar = this.$alpha$delegate;
        int i = hv9.b;
        gb4.o1(gb4Var2, j, 0L, 0L, nic.B(eseVar.getValue().floatValue(), 0.0f, 1.0f), null, 118);
        return j6g.a;
    }
}
