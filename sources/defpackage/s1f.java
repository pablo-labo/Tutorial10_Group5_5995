package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class s1f extends mj8 implements gu5<v1f> {
    final /* synthetic */ Function1<w1f, Boolean> $confirmValueChange;
    final /* synthetic */ iy3 $density;
    final /* synthetic */ w1f $initialValue;
    final /* synthetic */ Function1<Float, Float> $positionalThreshold;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s1f(w1f w1fVar, iy3 iy3Var, Function1<? super w1f, Boolean> function1, Function1<? super Float, Float> function12) {
        super(0);
        this.$initialValue = w1fVar;
        this.$density = iy3Var;
        this.$confirmValueChange = function1;
        this.$positionalThreshold = function12;
    }

    @Override // defpackage.gu5
    public final v1f invoke() {
        return new v1f(this.$initialValue, this.$density, this.$confirmValueChange, this.$positionalThreshold);
    }
}
