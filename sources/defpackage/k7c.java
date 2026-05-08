package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class k7c extends mj8 implements Function1<s5e, j6g> {
    final /* synthetic */ gu5<Float> $progress;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7c(gu5<Float> gu5Var) {
        super(1);
        this.$progress = gu5Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(s5e s5eVar) {
        r2c r2cVar = new r2c(this.$progress.invoke().floatValue(), new s82(0.0f, 1.0f));
        qf8<Object>[] qf8VarArr = o5e.a;
        r5e<r2c> r5eVar = k5e.c;
        qf8<Object> qf8Var = o5e.a[1];
        s5eVar.a(r5eVar, r2cVar);
        return j6g.a;
    }
}
