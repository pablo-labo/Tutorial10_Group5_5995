package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class a97 extends mj8 implements gu5<s9e> {
    final /* synthetic */ xh8 $this_inject;
    final /* synthetic */ a9c $qualifier = null;
    final /* synthetic */ gu5 $parameters = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a97(s87 s87Var) {
        super(0);
        this.$this_inject = s87Var;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, s9e] */
    @Override // defpackage.gu5
    public final s9e invoke() {
        xh8 xh8Var = this.$this_inject;
        a9c a9cVar = this.$qualifier;
        return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(s9e.class), a9cVar);
    }
}
