package defpackage;

import defpackage.x29;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.domain.usecase.LogBrandedAdsUseCase$invoke$2", f = "LogBrandedAdsUseCase.kt", l = {22, 22}, m = "invokeSuspend")
public final class y29 extends c1f implements Function2<wi5<? super hf3<j6g>>, lu2<? super j6g>, Object> {
    final /* synthetic */ x29.a $param;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ x29 this$0;

    public static final class a<T> implements wi5 {
        public final /* synthetic */ wi5<hf3<j6g>> a;

        /* JADX INFO: renamed from: y29$a$a, reason: collision with other inner class name */
        @uh3(c = "com.indeed.android.myjobs.domain.usecase.LogBrandedAdsUseCase$invoke$2$1", f = "LogBrandedAdsUseCase.kt", l = {25, 29, 34}, m = "emit")
        public static final class C0480a extends pu2 {
            Object L$0;
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ a<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0480a(a<? super T> aVar, lu2<? super C0480a> lu2Var) {
                super(lu2Var);
                this.this$0 = aVar;
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.a(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(wi5<? super hf3<j6g>> wi5Var) {
            this.a = wi5Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
        
            if (r6.a(r7, r0) == r1) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
        
            if (r6.a(r8, r0) == r1) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b1, code lost:
        
            if (r6.a(r7, r0) == r1) goto L40;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // defpackage.wi5
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(defpackage.hf3<defpackage.j6g> r7, defpackage.lu2<? super defpackage.j6g> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof y29.a.C0480a
                if (r0 == 0) goto L13
                r0 = r8
                y29$a$a r0 = (y29.a.C0480a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                y29$a$a r0 = new y29$a$a
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.result
                int r1 = r0.label
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L48
                if (r1 == r4) goto L40
                if (r1 == r3) goto L37
                if (r1 != r2) goto L31
                java.lang.Object r6 = r0.L$0
                hf3 r6 = (defpackage.hf3) r6
                defpackage.r7d.b(r8)
                goto Lb4
            L31:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r6)
                return r5
            L37:
                java.lang.Object r6 = r0.L$0
                r7 = r6
                hf3 r7 = (defpackage.hf3) r7
                defpackage.r7d.b(r8)
                goto L81
            L40:
                java.lang.Object r6 = r0.L$0
                hf3 r6 = (defpackage.hf3) r6
                defpackage.r7d.b(r8)
                goto L65
            L48:
                defpackage.r7d.b(r8)
                boolean r8 = r7 instanceof hf3.c
                wi5<hf3<j6g>> r6 = r6.a
                g13 r1 = defpackage.g13.a
                if (r8 == 0) goto L68
                hf3$c r7 = new hf3$c
                j6g r8 = defpackage.j6g.a
                r7.<init>(r8)
                r0.L$0 = r5
                r0.label = r4
                java.lang.Object r6 = r6.a(r7, r0)
                if (r6 != r1) goto L65
                goto Lb3
            L65:
                j6g r6 = defpackage.j6g.a
                return r6
            L68:
                boolean r8 = r7 instanceof hf3.a
                if (r8 == 0) goto La0
                hf3$a r8 = new hf3$a
                r2 = r7
                hf3$a r2 = (hf3.a) r2
                com.indeed.android.myjobs.data.model.APIError r2 = r2.a
                r8.<init>(r2)
                r0.L$0 = r7
                r0.label = r3
                java.lang.Object r6 = r6.a(r8, r0)
                if (r6 != r1) goto L81
                goto Lb3
            L81:
                java.util.ArrayList r6 = defpackage.lz2.a
                hf3$a r7 = (hf3.a) r7
                com.indeed.android.myjobs.data.model.APIError r6 = r7.a
                if (r6 == 0) goto L8e
                java.lang.String r6 = r6.getMessage()
                goto L8f
            L8e:
                r6 = r5
            L8f:
                java.lang.String r7 = "Error logging branded ads: "
                java.lang.String r6 = defpackage.l5.l(r7, r6)
                r7 = 0
                r8 = 8
                java.lang.String r0 = "LogBrandedAdsUseCase"
                defpackage.lz2.c(r0, r6, r7, r5, r8)
                j6g r6 = defpackage.j6g.a
                return r6
            La0:
                boolean r7 = r7 instanceof hf3.b
                if (r7 == 0) goto Lb7
                hf3$b r7 = new hf3$b
                r7.<init>()
                r0.L$0 = r5
                r0.label = r2
                java.lang.Object r6 = r6.a(r7, r0)
                if (r6 != r1) goto Lb4
            Lb3:
                return r1
            Lb4:
                j6g r6 = defpackage.j6g.a
                return r6
            Lb7:
                defpackage.l.g()
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: y29.a.a(hf3, lu2):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y29(x29 x29Var, x29.a aVar, lu2<? super y29> lu2Var) {
        super(2, lu2Var);
        this.this$0 = x29Var;
        this.$param = aVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        y29 y29Var = new y29(this.this$0, this.$param, lu2Var);
        y29Var.L$0 = obj;
        return y29Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(wi5<? super hf3<j6g>> wi5Var, lu2<? super j6g> lu2Var) {
        return ((y29) create(wi5Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (((defpackage.vi5) r7).e(r1, r6) == r5) goto L15;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.L$0
            wi5 r0 = (defpackage.wi5) r0
            int r1 = r6.label
            r2 = 0
            r3 = 2
            r4 = 1
            g13 r5 = defpackage.g13.a
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L15
            defpackage.r7d.b(r7)
            goto L47
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r6)
            return r2
        L1b:
            defpackage.r7d.b(r7)
            goto L35
        L1f:
            defpackage.r7d.b(r7)
            x29 r7 = r6.this$0
            cm1 r7 = r7.a
            x29$a r1 = r6.$param
            com.indeed.android.myjobs.data.model.BrandedAdsLoggingRequestParams r1 = r1.a
            r6.L$0 = r0
            r6.label = r4
            vi5 r7 = r7.p(r1, r6)
            if (r7 != r5) goto L35
            goto L46
        L35:
            vi5 r7 = (defpackage.vi5) r7
            y29$a r1 = new y29$a
            r1.<init>(r0)
            r6.L$0 = r2
            r6.label = r3
            java.lang.Object r6 = r7.e(r1, r6)
            if (r6 != r5) goto L47
        L46:
            return r5
        L47:
            j6g r6 = defpackage.j6g.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y29.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
