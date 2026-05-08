package defpackage;

import defpackage.xh8;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class nl0 implements xh8 {
    public final nm0 a;
    public final Lazy b = boa.E(qt8.a, new a(this));
    public final d2f c = new d2f(new la(this, 2));
    public final d2f d = new d2f(new ig(this, 1));

    public static final class a extends mj8 implements gu5<mm0> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(nl0 nl0Var) {
            super(0);
            this.$this_inject = nl0Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, mm0] */
        @Override // defpackage.gu5
        public final mm0 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(mm0.class), a9cVar);
        }
    }

    public nl0(nm0 nm0Var) {
        this.a = nm0Var;
    }

    public final String a() {
        return (String) this.c.getValue();
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
