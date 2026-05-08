package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.MyJobsPlugin$userDidLogout$2", f = "MyJobsPlugin.kt", l = {23, 23, 26, 26}, m = "invokeSuspend")
public final class g6a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ h6a this$0;

    @uh3(c = "com.indeed.android.myjobs.MyJobsPlugin$userDidLogout$2$1", f = "MyJobsPlugin.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<j6g, lu2<? super j6g>, Object> {
        int label;

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(2, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(j6g j6gVar, lu2<? super j6g> lu2Var) {
            return ((a) create(j6gVar, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            c05.a.invoke(tx5.k(c05.b, "myjobs_native_screen", "logOut", null, 12));
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.myjobs.MyJobsPlugin$userDidLogout$2$2", f = "MyJobsPlugin.kt", l = {}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<j6g, lu2<? super j6g>, Object> {
        int label;

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new b(2, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(j6g j6gVar, lu2<? super j6g> lu2Var) {
            return ((b) create(j6gVar, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r7d.b(obj);
                return j6g.a;
            }
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6a(h6a h6aVar, lu2<? super g6a> lu2Var) {
        super(2, lu2Var);
        this.this$0 = h6aVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new g6a(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((g6a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00af, code lost:
    
        if (defpackage.wg2.q(r9, r0, r8) == r6) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4  */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.label
            r1 = 4
            r2 = 3
            r3 = 1
            r4 = 2
            r5 = 0
            g13 r6 = defpackage.g13.a
            if (r0 == 0) goto L2b
            if (r0 == r3) goto L27
            if (r0 == r4) goto L23
            if (r0 == r2) goto L1e
            if (r0 != r1) goto L18
            defpackage.r7d.b(r9)
            goto Lb2
        L18:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r8)
            return r5
        L1e:
            defpackage.r7d.b(r9)
            goto La0
        L23:
            defpackage.r7d.b(r9)
            goto L70
        L27:
            defpackage.r7d.b(r9)
            goto L5e
        L2b:
            defpackage.r7d.b(r9)
            h6a r9 = r8.this$0
            r9.getClass()
            vh8 r9 = xh8.a.a()
            zpd r9 = r9.a
            java.lang.Object r9 = r9.b
            qpd r9 = (defpackage.qpd) r9
            java.lang.Class<eka> r0 = defpackage.eka.class
            iwc r7 = defpackage.fwc.a
            yd8 r0 = r7.b(r0)
            java.lang.Object r9 = r9.c(r5, r0, r5)
            eka r9 = (defpackage.eka) r9
            if (r9 == 0) goto L70
            j6g r0 = defpackage.j6g.a
            r8.label = r3
            dka r0 = new dka
            r0.<init>(r9, r5)
            kjd r9 = new kjd
            r9.<init>(r0)
            if (r9 != r6) goto L5e
            goto Lb1
        L5e:
            vi5 r9 = (defpackage.vi5) r9
            if (r9 == 0) goto L70
            g6a$a r0 = new g6a$a
            r0.<init>(r4, r5)
            r8.label = r4
            java.lang.Object r9 = defpackage.wg2.q(r9, r0, r8)
            if (r9 != r6) goto L70
            goto Lb1
        L70:
            h6a r9 = r8.this$0
            r9.getClass()
            vh8 r9 = xh8.a.a()
            zpd r9 = r9.a
            java.lang.Object r9 = r9.b
            qpd r9 = (defpackage.qpd) r9
            java.lang.Class<mr4> r0 = defpackage.mr4.class
            iwc r3 = defpackage.fwc.a
            yd8 r0 = r3.b(r0)
            java.lang.Object r9 = r9.c(r5, r0, r5)
            mr4 r9 = (defpackage.mr4) r9
            if (r9 == 0) goto Lb5
            j6g r0 = defpackage.j6g.a
            r8.label = r2
            lr4 r0 = new lr4
            r0.<init>(r9, r5)
            kjd r9 = new kjd
            r9.<init>(r0)
            if (r9 != r6) goto La0
            goto Lb1
        La0:
            vi5 r9 = (defpackage.vi5) r9
            if (r9 == 0) goto Lb5
            g6a$b r0 = new g6a$b
            r0.<init>(r4, r5)
            r8.label = r1
            java.lang.Object r8 = defpackage.wg2.q(r9, r0, r8)
            if (r8 != r6) goto Lb2
        Lb1:
            return r6
        Lb2:
            j6g r8 = defpackage.j6g.a
            return r8
        Lb5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g6a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
