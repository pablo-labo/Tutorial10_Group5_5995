package defpackage;

import defpackage.xh8;
import kotlin.Lazy;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes2.dex */
public final class g2g implements f2g, xh8 {
    public final Lazy a = boa.E(qt8.a, new a(this));

    public static final class a extends mj8 implements gu5<p87> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g2g g2gVar) {
            super(0);
            this.$this_inject = g2gVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, p87] */
        @Override // defpackage.gu5
        public final p87 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(p87.class), a9cVar);
        }
    }

    @Override // defpackage.f2g
    public final String a() {
        return ((p87) this.a.getValue()).c();
    }

    @Override // defpackage.f2g
    public final OkHttpClient b() {
        return (OkHttpClient) epa.c0.getValue();
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
