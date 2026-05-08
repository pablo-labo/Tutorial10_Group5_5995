package defpackage;

import defpackage.s87;
import defpackage.xh8;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class r2g implements q2g, xh8 {
    public final Lazy a = boa.E(qt8.a, new a(this));

    public static final class a extends mj8 implements gu5<gz4> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r2g r2gVar) {
            super(0);
            this.$this_inject = r2gVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [gz4, java.lang.Object] */
        @Override // defpackage.gu5
        public final gz4 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(gz4.class), a9cVar);
        }
    }

    @Override // defpackage.q2g
    public final void a(lx5 lx5Var) {
        Lazy<s87> lazy = s87.f;
        s87.a.a((gz4) this.a.getValue(), lx5Var);
    }

    @Override // defpackage.q2g
    public final String b() {
        return ep5.a.e();
    }

    @Override // defpackage.q2g
    public final String c() {
        return dd4.a.a();
    }

    @Override // defpackage.q2g
    public final String e() {
        String str = d93.b;
        if (str != null) {
            return str;
        }
        String strG = bu8.a.g();
        if (strG.length() == 0) {
            return null;
        }
        return strG;
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
