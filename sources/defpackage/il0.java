package defpackage;

import defpackage.xh8;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import org.koin.core.error.NoBeanDefFoundException;

/* JADX INFO: loaded from: classes2.dex */
public final class il0 implements xh8 {
    public static final AtomicReference<xd2<j6g>> V;
    public static final d2f W;
    public static final a5a X;
    public static final g3a<Integer> Y;
    public static final il0 a;
    public static final Lazy b;
    public static final Lazy c;
    public static final Lazy d;
    public static final Lazy e;
    public static final Lazy f;

    public static final class a extends mj8 implements gu5<gsa> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(il0 il0Var) {
            super(0);
            this.$this_inject = il0Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [gsa, java.lang.Object] */
        @Override // defpackage.gu5
        public final gsa invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(gsa.class), a9cVar);
        }
    }

    public static final class b extends mj8 implements gu5<wla> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(il0 il0Var) {
            super(0);
            this.$this_inject = il0Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, wla] */
        @Override // defpackage.gu5
        public final wla invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(wla.class), a9cVar);
        }
    }

    public static final class c extends mj8 implements gu5<zk6> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(il0 il0Var) {
            super(0);
            this.$this_inject = il0Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, zk6] */
        @Override // defpackage.gu5
        public final zk6 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(zk6.class), a9cVar);
        }
    }

    public static final class d extends mj8 implements gu5<zcd> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(il0 il0Var) {
            super(0);
            this.$this_inject = il0Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, zcd] */
        @Override // defpackage.gu5
        public final zcd invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(zcd.class), a9cVar);
        }
    }

    public static final class e extends mj8 implements gu5<ed4> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(il0 il0Var) {
            super(0);
            this.$this_inject = il0Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [ed4, java.lang.Object] */
        @Override // defpackage.gu5
        public final ed4 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(ed4.class), a9cVar);
        }
    }

    static {
        il0 il0Var = new il0();
        a = il0Var;
        a aVar = new a(il0Var);
        qt8 qt8Var = qt8.a;
        b = boa.E(qt8Var, aVar);
        c = boa.E(qt8Var, new b(il0Var));
        d = boa.E(qt8Var, new c(il0Var));
        e = boa.E(qt8Var, new d(il0Var));
        f = boa.E(qt8Var, new e(il0Var));
        V = new AtomicReference<>(hh1.e());
        W = new d2f(new l7(1));
        X = pnb.i();
        Y = new g3a<>(0);
    }

    public static e13 c() {
        return (e13) W.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.pu2 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.al0
            if (r0 == 0) goto L13
            r0 = r5
            al0 r0 = (defpackage.al0) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            al0 r0 = new al0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r4 = r0.result
            int r5 = r0.label
            r1 = 1
            if (r5 == 0) goto L2c
            if (r5 != r1) goto L25
            defpackage.r7d.b(r4)
            goto L4f
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.r7d.b(r4)
            bu8 r4 = defpackage.bu8.a
            java.lang.String r5 = r4.a()
            if (r5 == 0) goto L3c
            java.lang.String r4 = r4.a()
            return r4
        L3c:
            java.util.concurrent.atomic.AtomicReference<xd2<j6g>> r4 = defpackage.il0.V
            java.lang.Object r4 = r4.get()
            xd2 r4 = (defpackage.xd2) r4
            r0.label = r1
            java.lang.Object r4 = r4.n1(r0)
            g13 r5 = defpackage.g13.a
            if (r4 != r5) goto L4f
            return r5
        L4f:
            bu8 r4 = defpackage.bu8.a
            java.lang.String r4 = r4.a()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.il0.a(pu2):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final w1g b() throws NoBeanDefFoundException {
        return (w1g) (this instanceof ai8 ? ((ai8) this).d() : (qpd) xh8.a.a().a.b).a(null, fwc.a.b(w1g.class), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.pu2 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.bl0
            if (r0 == 0) goto L13
            r0 = r6
            bl0 r0 = (defpackage.bl0) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            bl0 r0 = new bl0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r5 = r0.result
            int r6 = r0.label
            r1 = 0
            java.lang.String r2 = "AppInitValuesHolder"
            r3 = 0
            r4 = 1
            if (r6 == 0) goto L2f
            if (r6 != r4) goto L29
            defpackage.r7d.b(r5)
            goto L5c
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r5)
            return r1
        L2f:
            defpackage.r7d.b(r5)
            hjg r5 = defpackage.hjg.a
            boolean r5 = r5.a()
            if (r5 != 0) goto L44
            java.util.ArrayList r5 = defpackage.lz2.a
            java.lang.String r5 = "Skipping Unread Notifications Count - no credentials detected"
            defpackage.lz2.d(r2, r5, r3, r1)
            j6g r5 = defpackage.j6g.a
            return r5
        L44:
            kotlin.Lazy r5 = defpackage.il0.c
            java.lang.Object r5 = r5.getValue()
            wla r5 = (defpackage.wla) r5
            zk0 r6 = new zk0
            r6.<init>(r3, r3)
            r0.label = r4
            java.lang.Object r5 = r5.O(r6, r0)
            g13 r6 = defpackage.g13.a
            if (r5 != r6) goto L5c
            return r6
        L5c:
            wg0 r5 = (defpackage.wg0) r5
            java.lang.Object r6 = r5.b()
            if (r6 != 0) goto L77
            java.util.ArrayList r6 = defpackage.lz2.a
            p81 r6 = r5.a()
            if (r6 == 0) goto L71
            java.lang.Exception r6 = r6.getCause()
            goto L72
        L71:
            r6 = r1
        L72:
            java.lang.String r0 = "Get unread notifications count api failed"
            defpackage.lz2.b(r2, r0, r3, r6)
        L77:
            java.lang.Object r5 = r5.b()
            com.indeed.android.jobsearch.backend.tasks.NewNotificationsResponse r5 = (com.indeed.android.jobsearch.backend.tasks.NewNotificationsResponse) r5
            if (r5 == 0) goto L82
            int r5 = r5.d
            goto L83
        L82:
            r5 = r3
        L83:
            java.util.ArrayList r6 = defpackage.lz2.a
            java.lang.String r6 = "Update new notifications count: ("
            java.lang.String r0 = ")"
            java.lang.String r6 = defpackage.bg.d(r5, r6, r0)
            defpackage.lz2.d(r2, r6, r3, r1)
            g3a<java.lang.Integer> r6 = defpackage.il0.Y
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6.k(r5)
            j6g r5 = defpackage.j6g.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.il0.e(pu2):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00dc, code lost:
    
        if (r13 == r9) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.pu2 r14) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.il0.f(pu2):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.pu2 r12) throws org.koin.core.error.NoBeanDefFoundException {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.il0.g(pu2):java.lang.Object");
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    public final Object h(c1f c1fVar) {
        if (hjg.a.a()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            bu8 bu8Var = bu8.a;
            bu8Var.getClass();
            int i = ((jCurrentTimeMillis - ((Number) bu8.v0.a(bu8.b[33], bu8Var)).longValue()) > 1800000L ? 1 : ((jCurrentTimeMillis - ((Number) bu8.v0.a(bu8.b[33], bu8Var)).longValue()) == 1800000L ? 0 : -1));
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        bu8 bu8Var2 = bu8.a;
        bu8Var2.getClass();
        bu8.v0.b(bu8.b[33], bu8Var2, Long.valueOf(jCurrentTimeMillis2));
        int i2 = 1;
        if (!bu8Var2.h()) {
            Object objI = ka2.i(u63.a0(u63.l(c(), null, new gl0(2, null), 3), u63.l(c(), null, new hl0(2, null), 3)), c1fVar);
            return objI == g13.a ? objI : j6g.a;
        }
        u63.Y(c(), null, null, new fl0(2, null), 3);
        b().a(c(), new o7(i2));
        return j6g.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(defpackage.pu2 r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.jl0
            if (r0 == 0) goto L13
            r0 = r5
            jl0 r0 = (defpackage.jl0) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            jl0 r0 = new jl0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r4 = r0.result
            int r5 = r0.label
            r1 = 1
            r2 = 0
            if (r5 == 0) goto L30
            if (r5 != r1) goto L2a
            java.lang.Object r5 = r0.L$0
            z4a r5 = (defpackage.z4a) r5
            defpackage.r7d.b(r4)
            goto L45
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            return r2
        L30:
            defpackage.r7d.b(r4)
            a5a r5 = defpackage.il0.X
            r0.L$0 = r5
            r4 = 0
            r0.I$0 = r4
            r0.label = r1
            java.lang.Object r4 = r5.h(r0)
            g13 r0 = defpackage.g13.a
            if (r4 != r0) goto L45
            return r0
        L45:
            il0 r4 = defpackage.il0.a     // Catch: java.lang.Throwable -> L69
            r4.getClass()     // Catch: java.lang.Throwable -> L69
            e13 r4 = c()     // Catch: java.lang.Throwable -> L69
            kl0 r0 = new kl0     // Catch: java.lang.Throwable -> L69
            r1 = 2
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L69
            r3 = 3
            defpackage.u63.Y(r4, r2, r2, r0, r3)     // Catch: java.lang.Throwable -> L69
            e13 r4 = c()     // Catch: java.lang.Throwable -> L69
            ll0 r0 = new ll0     // Catch: java.lang.Throwable -> L69
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L69
            uqe r4 = defpackage.u63.Y(r4, r2, r2, r0, r3)     // Catch: java.lang.Throwable -> L69
            r5.p(r2)
            return r4
        L69:
            r4 = move-exception
            r5.p(r2)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.il0.i(pu2):java.lang.Object");
    }
}
