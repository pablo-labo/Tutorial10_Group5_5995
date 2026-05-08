package defpackage;

import defpackage.xh8;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class ipb implements xh8 {
    public static long a;
    public static final Lazy b;
    public static final Lazy c;
    public static final d2f d;
    public static final d2f e;

    public static final class a extends mj8 implements gu5<ed4> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ipb ipbVar) {
            super(0);
            this.$this_inject = ipbVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [ed4, java.lang.Object] */
        @Override // defpackage.gu5
        public final ed4 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(ed4.class), a9cVar);
        }
    }

    public static final class b extends mj8 implements gu5<sf5> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ipb ipbVar) {
            super(0);
            this.$this_inject = ipbVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, sf5] */
        @Override // defpackage.gu5
        public final sf5 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(sf5.class), a9cVar);
        }
    }

    static {
        ipb ipbVar = new ipb();
        a aVar = new a(ipbVar);
        qt8 qt8Var = qt8.a;
        b = boa.E(qt8Var, aVar);
        c = boa.E(qt8Var, new b(ipbVar));
        d = new d2f(new ym0(12));
        e = new d2f(new cn0(16));
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
