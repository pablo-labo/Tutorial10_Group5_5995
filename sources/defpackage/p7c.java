package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class p7c extends mj8 implements Function1<cd6, j6g> {
    final /* synthetic */ float $elevation;
    final /* synthetic */ boolean $isRefreshing;
    final /* synthetic */ dce $shape;
    final /* synthetic */ w7c $state;
    final /* synthetic */ float $threshold;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7c(w7c w7cVar, boolean z, float f, float f2, dce dceVar) {
        super(1);
        this.$state = w7cVar;
        this.$isRefreshing = z;
        this.$threshold = f;
        this.$elevation = f2;
        this.$shape = dceVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(cd6 cd6Var) {
        cd6 cd6Var2 = cd6Var;
        boolean z = this.$state.b() > 0.0f || this.$isRefreshing;
        cd6Var2.e((this.$state.b() * cd6Var2.x0(this.$threshold)) - kie.b(cd6Var2.c()));
        cd6Var2.s(z ? cd6Var2.t1(this.$elevation) : 0.0f);
        cd6Var2.r1(this.$shape);
        cd6Var2.n(true);
        return j6g.a;
    }
}
