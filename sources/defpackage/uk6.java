package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class uk6 extends mj8 implements Function1<em6, j6g> {
    final /* synthetic */ sk6 $event;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uk6(sk6 sk6Var) {
        super(1);
        this.$event = sk6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(em6 em6Var) {
        em6 em6Var2 = em6Var;
        em6Var2.getClass();
        em6Var2.a = Long.valueOf(this.$event.g);
        em6Var2.b = Long.valueOf(this.$event.h);
        em6Var2.c = Long.valueOf(this.$event.i);
        em6Var2.d = web.C(this.$event.j);
        em6Var2.e = Long.valueOf(this.$event.k);
        em6Var2.f = Long.valueOf(this.$event.l);
        return j6g.a;
    }
}
