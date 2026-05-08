package defpackage;

import com.datadog.android.trace.AndroidTracer;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class h9e implements g9e {
    public static final double f = Math.random();
    public static final /* synthetic */ int g = 0;
    public final pf5 a;
    public final vf5 b;
    public final dae c;
    public final h00 d;
    public final v03 e;

    @uh3(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl$logSession$1", f = "SessionFirelogPublisher.kt", l = {AndroidTracer.SPAN_ID_BIT_SIZE, 64, 70}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ c9e $sessionDetails;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c9e c9eVar, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$sessionDetails = c9eVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return h9e.this.new a(this.$sessionDetails, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v1 l9e, still in use, count: 3, list:
              (r10v1 l9e) from 0x00f5: MOVE (r20v1 l9e) = (r10v1 l9e)
              (r10v1 l9e) from 0x00f0: MOVE (r20v2 l9e) = (r10v1 l9e)
              (r10v1 l9e) from 0x00e5: MOVE (r20v4 l9e) = (r10v1 l9e)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
            	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
            	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
            */
        @Override // defpackage.x81
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instruction units count: 338
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: h9e.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public h9e(pf5 pf5Var, vf5 vf5Var, dae daeVar, h00 h00Var, v03 v03Var) {
        this.a = pf5Var;
        this.b = vf5Var;
        this.c = daeVar;
        this.d = h00Var;
        this.e = v03Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(defpackage.h9e r4, defpackage.pu2 r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof defpackage.i9e
            if (r0 == 0) goto L16
            r0 = r5
            i9e r0 = (defpackage.i9e) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.label = r1
            goto L1b
        L16:
            i9e r0 = new i9e
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.result
            int r1 = r0.label
            r2 = 1
            java.lang.String r3 = "SessionFirelogPublisher"
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2e
            java.lang.Object r4 = r0.L$0
            h9e r4 = (defpackage.h9e) r4
            defpackage.r7d.b(r5)
            goto L4c
        L2e:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            r4 = 0
            return r4
        L35:
            defpackage.r7d.b(r5)
            java.lang.String r5 = "Data Collection is enabled for at least one Subscriber"
            android.util.Log.d(r3, r5)
            dae r5 = r4.c
            r0.L$0 = r4
            r0.label = r2
            java.lang.Object r5 = r5.b(r0)
            g13 r0 = defpackage.g13.a
            if (r5 != r0) goto L4c
            return r0
        L4c:
            dae r5 = r4.c
            oq2 r0 = r5.a
            java.lang.Boolean r0 = r0.d()
            if (r0 == 0) goto L5b
            boolean r2 = r0.booleanValue()
            goto L67
        L5b:
            z0d r5 = r5.b
            java.lang.Boolean r5 = r5.a()
            if (r5 == 0) goto L67
            boolean r2 = r5.booleanValue()
        L67:
            if (r2 != 0) goto L71
            java.lang.String r4 = "Sessions SDK disabled. Events will not be sent."
            android.util.Log.d(r3, r4)
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L71:
            dae r4 = r4.c
            double r4 = r4.a()
            double r0 = defpackage.h9e.f
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 > 0) goto L80
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L80:
            java.lang.String r4 = "Sessions SDK has dropped this session due to sampling."
            android.util.Log.d(r3, r4)
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h9e.b(h9e, pu2):java.lang.Object");
    }

    @Override // defpackage.g9e
    public final void a(c9e c9eVar) {
        u63.Y(f13.a(this.e), null, null, new a(c9eVar, null), 3);
    }
}
