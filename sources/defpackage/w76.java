package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class w76 extends mj8 implements gu5<s66> {
    final /* synthetic */ xh8 $this_inject;
    final /* synthetic */ a9c $qualifier = null;
    final /* synthetic */ gu5 $parameters = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w76(x76 x76Var) {
        super(0);
        this.$this_inject = x76Var;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, s66] */
    @Override // defpackage.gu5
    public final s66 invoke() {
        xh8 xh8Var = this.$this_inject;
        a9c a9cVar = this.$qualifier;
        return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(s66.class), a9cVar);
    }
}
