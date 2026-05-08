package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class dv4 extends mj8 implements Function1<th7, th7> {
    final /* synthetic */ Function1<Integer, Integer> $targetHeight;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public dv4(Function1<? super Integer, Integer> function1) {
        super(1);
        this.$targetHeight = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final th7 invoke(th7 th7Var) {
        long j = th7Var.a;
        int i = (int) (j >> 32);
        return new th7((((long) this.$targetHeight.invoke(Integer.valueOf((int) (j & 4294967295L))).intValue()) & 4294967295L) | (((long) i) << 32));
    }
}
