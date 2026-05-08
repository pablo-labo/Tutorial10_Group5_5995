package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ea6 extends mj8 implements Function1<Object, j6g> {
    final /* synthetic */ u12<j6g> $channel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea6(go1 go1Var) {
        super(1);
        this.$channel = go1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(Object obj) {
        if (fa6.b.compareAndSet(false, true)) {
            this.$channel.f(j6g.a);
        }
        return j6g.a;
    }
}
