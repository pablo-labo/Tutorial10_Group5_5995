package defpackage;

import com.indeed.android.rnhomepage.RNHomePageModule;
import defpackage.xh8;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class i3g implements g3g, xh8 {
    public final Lazy a;
    public final Lazy b;

    public static final class a extends mj8 implements gu5<p87> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i3g i3gVar) {
            super(0);
            this.$this_inject = i3gVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, p87] */
        @Override // defpackage.gu5
        public final p87 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(p87.class), a9cVar);
        }
    }

    public static final class b extends mj8 implements gu5<zk6> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i3g i3gVar) {
            super(0);
            this.$this_inject = i3gVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, zk6] */
        @Override // defpackage.gu5
        public final zk6 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(zk6.class), a9cVar);
        }
    }

    public i3g() {
        a aVar = new a(this);
        qt8 qt8Var = qt8.a;
        this.a = boa.E(qt8Var, aVar);
        this.b = boa.E(qt8Var, new b(this));
    }

    @Override // defpackage.g3g
    public final Object a(String str, String str2, RNHomePageModule.a.C0181a c0181a) {
        eq3 eq3Var = a74.a;
        return u63.q0(no3.c, new h3g(this, str, str2, null), c0181a);
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
