package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.rnace.RNAceChatFragment$setupDownloadReportToast$1$1$1$1", f = "RNAceChatFragment.kt", l = {}, m = "invokeSuspend")
public final class yac extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ g4a<Boolean> $showToast$delegate;
    final /* synthetic */ g4a<Integer> $stringResId$delegate;
    int label;
    final /* synthetic */ xac this$0;

    @uh3(c = "com.indeed.android.rnace.RNAceChatFragment$setupDownloadReportToast$1$1$1$1$1", f = "RNAceChatFragment.kt", l = {253}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ g4a<Boolean> $showToast$delegate;
        final /* synthetic */ g4a<Integer> $stringResId$delegate;
        int label;

        /* JADX INFO: renamed from: yac$a$a, reason: collision with other inner class name */
        public static final class C0481a<T> implements wi5 {
            public final /* synthetic */ g4a<Boolean> a;
            public final /* synthetic */ g4a<Integer> b;

            public C0481a(g4a<Boolean> g4aVar, g4a<Integer> g4aVar2) {
                this.a = g4aVar;
                this.b = g4aVar2;
            }

            @Override // defpackage.wi5
            public final Object a(Object obj, lu2 lu2Var) {
                bed bedVar = (bed) obj;
                this.a.setValue(Boolean.valueOf(bedVar.a));
                this.b.setValue(bedVar.b);
                return j6g.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g4a<Boolean> g4aVar, g4a<Integer> g4aVar2, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$showToast$delegate = g4aVar;
            this.$stringResId$delegate = g4aVar2;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$showToast$delegate, this.$stringResId$delegate, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            return g13.a;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type lu2 to yac$a for r5v2 'this'  lu2
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // defpackage.x81
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                int r0 = r5.label
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L12
                if (r0 == r2) goto Le
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r5)
                return r1
            Le:
                defpackage.r7d.b(r6)
                goto L2d
            L12:
                defpackage.r7d.b(r6)
                rqc r6 = defpackage.ced.b
                yac$a$a r0 = new yac$a$a
                g4a<java.lang.Boolean> r3 = r5.$showToast$delegate
                g4a<java.lang.Integer> r4 = r5.$stringResId$delegate
                r0.<init>(r3, r4)
                r5.label = r2
                fse<T> r6 = r6.a
                java.lang.Object r5 = r6.e(r0, r5)
                g13 r6 = defpackage.g13.a
                if (r5 != r6) goto L2d
                return r6
            L2d:
                defpackage.r40.e()
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: yac.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yac(xac xacVar, g4a<Boolean> g4aVar, g4a<Integer> g4aVar2, lu2<? super yac> lu2Var) {
        super(2, lu2Var);
        this.this$0 = xacVar;
        this.$showToast$delegate = g4aVar;
        this.$stringResId$delegate = g4aVar2;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new yac(this.this$0, this.$showToast$delegate, this.$stringResId$delegate, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((yac) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        u63.Y(hh1.A(this.this$0), null, null, new a(this.$showToast$delegate, this.$stringResId$delegate, null), 3);
        return j6g.a;
    }
}
