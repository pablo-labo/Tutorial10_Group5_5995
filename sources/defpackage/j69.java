package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class j69 extends mj8 implements Function1<Long, Boolean> {
    final /* synthetic */ int $iterations;
    final /* synthetic */ l69 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j69(l69 l69Var, int i) {
        super(1);
        this.this$0 = l69Var;
        this.$iterations = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Long l) {
        return Boolean.valueOf(l69.i(this.this$0, this.$iterations, l.longValue()));
    }
}
