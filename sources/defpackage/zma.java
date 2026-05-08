package defpackage;

import defpackage.xh8;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class zma implements xh8 {
    public static final zma a;
    public static final Lazy b;
    public static String c;
    public static long d;
    public static String e;
    public static String f;

    public static final class a extends mj8 implements gu5<zk6> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(zma zmaVar) {
            super(0);
            this.$this_inject = zmaVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, zk6] */
        @Override // defpackage.gu5
        public final zk6 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(zk6.class), a9cVar);
        }
    }

    static {
        zma zmaVar = new zma();
        a = zmaVar;
        b = boa.E(qt8.a, new a(zmaVar));
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
