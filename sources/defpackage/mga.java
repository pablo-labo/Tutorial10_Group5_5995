package defpackage;

import defpackage.xh8;
import kotlin.Lazy;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes2.dex */
public final class mga implements oha, xh8 {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final z45 d;

    public static final class a extends mj8 implements gu5<p87> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mga mgaVar) {
            super(0);
            this.$this_inject = mgaVar;
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
        public b(mga mgaVar) {
            super(0);
            this.$this_inject = mgaVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, zk6] */
        @Override // defpackage.gu5
        public final zk6 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(zk6.class), a9cVar);
        }
    }

    public static final class c extends mj8 implements gu5<gz4> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(mga mgaVar) {
            super(0);
            this.$this_inject = mgaVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [gz4, java.lang.Object] */
        @Override // defpackage.gu5
        public final gz4 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(gz4.class), a9cVar);
        }
    }

    public mga() {
        com.indeed.android.jobsearch.backend.util.a.a();
        a aVar = new a(this);
        qt8 qt8Var = qt8.a;
        Lazy lazyE = boa.E(qt8Var, aVar);
        this.a = lazyE;
        this.b = boa.E(qt8Var, new b(this));
        this.c = boa.E(qt8Var, new c(this));
        p87 p87Var = (p87) lazyE.getValue();
        epa epaVar = epa.a;
        OkHttpClient okHttpClientB = epa.b();
        bu8 bu8Var = bu8.a;
        bu8Var.getClass();
        this.d = new z45(p87Var, okHttpClientB, (String) bu8.l0.a(bu8.b[21], bu8Var));
    }

    @Override // defpackage.oha
    public final Object a(lsc lscVar, dud dudVar) {
        eq3 eq3Var = a74.a;
        return u63.q0(no3.c, new lga(this, lscVar, null), dudVar);
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
