package defpackage;

import defpackage.xh8;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class x02 implements xh8 {
    public final Lazy a = boa.E(qt8.a, new a(this));
    public final tx5 b = new tx5();

    public static final class a extends mj8 implements gu5<gz4> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x02 x02Var) {
            super(0);
            this.$this_inject = x02Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [gz4, java.lang.Object] */
        @Override // defpackage.gu5
        public final gz4 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(gz4.class), a9cVar);
        }
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
