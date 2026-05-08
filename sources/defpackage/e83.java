package defpackage;

import defpackage.xh8;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class e83 implements xh8 {
    public static final e83 a;
    public static final AtomicBoolean b;
    public static boolean c;
    public static final d2f d;
    public static final Lazy e;
    public static final Lazy f;

    public static final class a extends mj8 implements gu5<gsa> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e83 e83Var) {
            super(0);
            this.$this_inject = e83Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [gsa, java.lang.Object] */
        @Override // defpackage.gu5
        public final gsa invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(gsa.class), a9cVar);
        }
    }

    public static final class b extends mj8 implements gu5<zk6> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e83 e83Var) {
            super(0);
            this.$this_inject = e83Var;
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
        e83 e83Var = new e83();
        a = e83Var;
        b = new AtomicBoolean();
        d = new d2f(new pd1(2));
        a aVar = new a(e83Var);
        qt8 qt8Var = qt8.a;
        e = boa.E(qt8Var, aVar);
        f = boa.E(qt8Var, new b(e83Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(defpackage.e83 r7, java.lang.String r8, java.lang.String r9, defpackage.pu2 r10) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e83.a(e83, java.lang.String, java.lang.String, pu2):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(defpackage.e83 r5, java.lang.String r6, java.lang.String r7, defpackage.pu2 r8) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e83.b(e83, java.lang.String, java.lang.String, pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.h83 r6, defpackage.pu2 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.d83
            if (r0 == 0) goto L13
            r0 = r7
            d83 r0 = (defpackage.d83) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            d83 r0 = new d83
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r5 = r0.result
            int r7 = r0.label
            r1 = 0
            r2 = 0
            java.util.concurrent.atomic.AtomicBoolean r3 = defpackage.e83.b
            r4 = 1
            if (r7 == 0) goto L35
            if (r7 != r4) goto L2f
            java.lang.Object r6 = r0.L$0
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            defpackage.r7d.b(r5)     // Catch: java.lang.Throwable -> L2d
            goto L4e
        L2d:
            r5 = move-exception
            goto L54
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r5)
            return r1
        L35:
            defpackage.r7d.b(r5)
            boolean r5 = r3.getAndSet(r4)
            if (r5 == 0) goto L41
            j6g r5 = defpackage.j6g.a
            return r5
        L41:
            r0.L$0 = r1     // Catch: java.lang.Throwable -> L2d
            r0.label = r4     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r5 = r6.invoke(r0)     // Catch: java.lang.Throwable -> L2d
            g13 r6 = defpackage.g13.a
            if (r5 != r6) goto L4e
            return r6
        L4e:
            r3.set(r2)
            j6g r5 = defpackage.j6g.a
            return r5
        L54:
            r3.set(r2)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e83.c(h83, pu2):java.lang.Object");
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
