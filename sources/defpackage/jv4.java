package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class jv4 extends mj8 implements Function1<th7, lh7> {
    final /* synthetic */ Function1<Integer, Integer> $targetOffsetY;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public jv4(Function1<? super Integer, Integer> function1) {
        super(1);
        this.$targetOffsetY = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final lh7 invoke(th7 th7Var) {
        return new lh7(((long) this.$targetOffsetY.invoke(Integer.valueOf((int) (th7Var.a & 4294967295L))).intValue()) & 4294967295L);
    }
}
