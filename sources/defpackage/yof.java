package defpackage;

import defpackage.s87;
import defpackage.xh8;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class yof implements xh8 {
    public final Lazy a = boa.E(qt8.a, new a(this));
    public final tx5 b = new tx5();

    public static final class a extends mj8 implements gu5<gz4> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(yof yofVar) {
            super(0);
            this.$this_inject = yofVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [gz4, java.lang.Object] */
        @Override // defpackage.gu5
        public final gz4 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(gz4.class), a9cVar);
        }
    }

    public final void a(String str) {
        Lazy<s87> lazy = s87.f;
        s87.a.a((gz4) this.a.getValue(), tx5.k(this.b, "tos-update-banner", "OK", new d12(str, 4), 4));
    }

    public final void b(String str, String str2) {
        str.getClass();
        Lazy<s87> lazy = s87.f;
        s87.a.a((gz4) this.a.getValue(), tx5.k(this.b, "tos-update-banner", str, new vx4(str2, 3), 4));
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
