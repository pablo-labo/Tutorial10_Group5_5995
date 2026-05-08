package defpackage;

import android.content.Context;
import defpackage.xh8;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 implements xh8 {
    public static final d0 a;
    public static a b;
    public static final a5a c;
    public static final Lazy d;

    public static abstract class a {

        /* JADX INFO: renamed from: d0$a$a, reason: collision with other inner class name */
        public static final class C0203a extends a {
            public final Exception a;

            public C0203a(Exception exc) {
                this.a = exc;
            }
        }

        public static final class b extends a {
            public final String a;

            public b(String str) {
                this.a = str;
            }
        }

        public static final class c extends a {
            public final String a;

            public c(String str) {
                this.a = str;
            }
        }
    }

    public static final class b extends mj8 implements gu5<Context> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d0 d0Var) {
            super(0);
            this.$this_inject = d0Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [android.content.Context, java.lang.Object] */
        @Override // defpackage.gu5
        public final Context invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(Context.class), a9cVar);
        }
    }

    static {
        d0 d0Var = new d0();
        a = d0Var;
        c = pnb.i();
        d = boa.E(qt8.a, new b(d0Var));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0071, code lost:
    
        if (r6 == r5) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v2, types: [z4a] */
    /* JADX WARN: Type inference failed for: r7v6, types: [z4a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.pu2 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.e0
            if (r0 == 0) goto L13
            r0 = r7
            e0 r0 = (defpackage.e0) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            e0 r0 = new e0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r6 = r0.result
            int r7 = r0.label
            r1 = 0
            r2 = 1
            r3 = 2
            r4 = 0
            g13 r5 = defpackage.g13.a
            if (r7 == 0) goto L44
            if (r7 == r2) goto L38
            if (r7 != r3) goto L32
            java.lang.Object r7 = r0.L$0
            z4a r7 = (defpackage.z4a) r7
            defpackage.r7d.b(r6)     // Catch: java.lang.Throwable -> L30
            goto L74
        L30:
            r6 = move-exception
            goto L81
        L32:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r6)
            return r4
        L38:
            int r7 = r0.I$0
            java.lang.Object r2 = r0.L$0
            z4a r2 = (defpackage.z4a) r2
            defpackage.r7d.b(r6)
            r6 = r7
            r7 = r2
            goto L58
        L44:
            defpackage.r7d.b(r6)
            a5a r6 = defpackage.d0.c
            r0.L$0 = r6
            r0.I$0 = r1
            r0.label = r2
            java.lang.Object r7 = r6.h(r0)
            if (r7 != r5) goto L56
            goto L73
        L56:
            r7 = r6
            r6 = r1
        L58:
            d0$a r2 = defpackage.d0.b     // Catch: java.lang.Throwable -> L30
            if (r2 != 0) goto L78
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L30
            r0.I$0 = r6     // Catch: java.lang.Throwable -> L30
            r0.I$1 = r1     // Catch: java.lang.Throwable -> L30
            r0.label = r3     // Catch: java.lang.Throwable -> L30
            eq3 r6 = defpackage.a74.a     // Catch: java.lang.Throwable -> L30
            no3 r6 = defpackage.no3.c     // Catch: java.lang.Throwable -> L30
            f0 r1 = new f0     // Catch: java.lang.Throwable -> L30
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L30
            java.lang.Object r6 = defpackage.u63.q0(r6, r1, r0)     // Catch: java.lang.Throwable -> L30
            if (r6 != r5) goto L74
        L73:
            return r5
        L74:
            d0$a r6 = (d0.a) r6     // Catch: java.lang.Throwable -> L30
            defpackage.d0.b = r6     // Catch: java.lang.Throwable -> L30
        L78:
            d0$a r6 = defpackage.d0.b     // Catch: java.lang.Throwable -> L30
            r6.getClass()     // Catch: java.lang.Throwable -> L30
            r7.p(r4)
            return r6
        L81:
            r7.p(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d0.a(pu2):java.lang.Object");
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
