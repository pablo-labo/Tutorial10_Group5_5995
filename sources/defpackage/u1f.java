package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class u1f extends mj8 implements Function1<w1f, v1f> {
    final /* synthetic */ Function1<w1f, Boolean> $confirmValueChange;
    final /* synthetic */ iy3 $density;
    final /* synthetic */ Function1<Float, Float> $positionalThreshold;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u1f(iy3 iy3Var, Function1<? super w1f, Boolean> function1, Function1<? super Float, Float> function12) {
        super(1);
        this.$density = iy3Var;
        this.$confirmValueChange = function1;
        this.$positionalThreshold = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final v1f invoke(w1f w1fVar) {
        return new v1f(w1fVar, this.$density, this.$confirmValueChange, this.$positionalThreshold);
    }
}
