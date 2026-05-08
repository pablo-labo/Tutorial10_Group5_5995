package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class tk6 extends mj8 implements Function1<am6, j6g> {
    final /* synthetic */ sk6 $event;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk6(sk6 sk6Var) {
        super(1);
        this.$event = sk6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(am6 am6Var) {
        am6 am6Var2 = am6Var;
        am6Var2.getClass();
        am6Var2.a = Long.valueOf(this.$event.c);
        am6Var2.b = Long.valueOf(this.$event.d);
        am6Var2.c = Long.valueOf(this.$event.e);
        String str = this.$event.f;
        am6Var2.d = str == null ? null : web.C(str);
        return j6g.a;
    }
}
