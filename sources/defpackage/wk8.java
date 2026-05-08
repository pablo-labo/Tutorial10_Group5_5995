package defpackage;

import com.indeed.android.jobsearch.LaunchActivity;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.LaunchActivity$setupReportErrorToast$1$1$1$1", f = "LaunchActivity.kt", l = {}, m = "invokeSuspend")
public final class wk8 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ g4a<Boolean> $showToast$delegate;
    final /* synthetic */ g4a<Integer> $stringResId$delegate;
    int label;
    final /* synthetic */ LaunchActivity this$0;

    @uh3(c = "com.indeed.android.jobsearch.LaunchActivity$setupReportErrorToast$1$1$1$1$1", f = "LaunchActivity.kt", l = {1016}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ g4a<Boolean> $showToast$delegate;
        final /* synthetic */ g4a<Integer> $stringResId$delegate;
        int label;
        final /* synthetic */ LaunchActivity this$0;

        /* JADX INFO: renamed from: wk8$a$a, reason: collision with other inner class name */
        public static final class C0469a<T> implements wi5 {
            public final /* synthetic */ LaunchActivity a;
            public final /* synthetic */ g4a<Boolean> b;
            public final /* synthetic */ g4a<Integer> c;

            public C0469a(LaunchActivity launchActivity, g4a<Boolean> g4aVar, g4a<Integer> g4aVar2) {
                this.a = launchActivity;
                this.b = g4aVar;
                this.c = g4aVar2;
            }

            @Override // defpackage.wi5
            public final Object a(Object obj, lu2 lu2Var) {
                yk8 yk8Var = (yk8) obj;
                boolean z = yk8Var.a;
                int i = LaunchActivity.e1;
                Boolean boolValueOf = Boolean.valueOf(z);
                g4a<Boolean> g4aVar = this.b;
                g4aVar.setValue(boolValueOf);
                this.c.setValue(yk8Var.b);
                boolean zBooleanValue = g4aVar.getValue().booleanValue();
                LaunchActivity launchActivity = this.a;
                f8 f8Var = launchActivity.J0;
                if (zBooleanValue) {
                    if (f8Var == null) {
                        wl7.g("binding");
                        throw null;
                    }
                    f8Var.f.setVisibility(0);
                    f8 f8Var2 = launchActivity.J0;
                    if (f8Var2 == null) {
                        wl7.g("binding");
                        throw null;
                    }
                    f8Var2.f.requestFocus();
                } else {
                    if (f8Var == null) {
                        wl7.g("binding");
                        throw null;
                    }
                    f8Var.f.setVisibility(8);
                    f8 f8Var3 = launchActivity.J0;
                    if (f8Var3 == null) {
                        wl7.g("binding");
                        throw null;
                    }
                    f8Var3.f.clearFocus();
                }
                return j6g.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LaunchActivity launchActivity, g4a<Boolean> g4aVar, g4a<Integer> g4aVar2, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.this$0 = launchActivity;
            this.$showToast$delegate = g4aVar;
            this.$stringResId$delegate = g4aVar2;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.this$0, this.$showToast$delegate, this.$stringResId$delegate, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            return g13.a;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type lu2 to wk8$a for r6v2 'this'  lu2
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // defpackage.x81
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                int r0 = r6.label
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L12
                if (r0 == r2) goto Le
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r6)
                return r1
            Le:
                defpackage.r7d.b(r7)
                goto L2f
            L12:
                defpackage.r7d.b(r7)
                rqc r7 = defpackage.zk8.b
                wk8$a$a r0 = new wk8$a$a
                com.indeed.android.jobsearch.LaunchActivity r3 = r6.this$0
                g4a<java.lang.Boolean> r4 = r6.$showToast$delegate
                g4a<java.lang.Integer> r5 = r6.$stringResId$delegate
                r0.<init>(r3, r4, r5)
                r6.label = r2
                fse<T> r7 = r7.a
                java.lang.Object r6 = r7.e(r0, r6)
                g13 r7 = defpackage.g13.a
                if (r6 != r7) goto L2f
                return r7
            L2f:
                defpackage.r40.e()
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: wk8.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wk8(LaunchActivity launchActivity, g4a<Boolean> g4aVar, g4a<Integer> g4aVar2, lu2<? super wk8> lu2Var) {
        super(2, lu2Var);
        this.this$0 = launchActivity;
        this.$showToast$delegate = g4aVar;
        this.$stringResId$delegate = g4aVar2;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new wk8(this.this$0, this.$showToast$delegate, this.$stringResId$delegate, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((wk8) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        u63.Y(hh1.A(this.this$0), null, null, new a(this.this$0, this.$showToast$delegate, this.$stringResId$delegate, null), 3);
        return j6g.a;
    }
}
