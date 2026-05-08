package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class b2g extends mj8 implements gu5<gsa> {
    final /* synthetic */ xh8 $this_inject;
    final /* synthetic */ a9c $qualifier = null;
    final /* synthetic */ gu5 $parameters = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2g(z1g z1gVar) {
        super(0);
        this.$this_inject = z1gVar;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [gsa, java.lang.Object] */
    @Override // defpackage.gu5
    public final gsa invoke() {
        xh8 xh8Var = this.$this_inject;
        a9c a9cVar = this.$qualifier;
        return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(gsa.class), a9cVar);
    }
}
