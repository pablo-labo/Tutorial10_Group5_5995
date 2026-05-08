package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ea0 extends mj8 implements Function1<ga0, Object> {
    final /* synthetic */ Function1<wpe, l9c<Object>> $mapper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ea0(Function1<? super wpe, ? extends l9c<Object>> function1) {
        super(1);
        this.$mapper = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(ga0 ga0Var) {
        ga0 ga0Var2 = ga0Var;
        ga0Var2.getClass();
        return ga0Var2.c(this.$mapper);
    }
}
