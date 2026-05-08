package defpackage;

import com.indeed.android.myjobs.data.model.dto.BrandedAdsDto;
import defpackage.a06;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.domain.usecase.GetBrandedAdsUseCase$invoke$2", f = "GetBrandedAdsUseCase.kt", l = {23, 23}, m = "invokeSuspend")
public final class b06 extends c1f implements Function2<wi5<? super hf3<BrandedAdsDto>>, lu2<? super j6g>, Object> {
    final /* synthetic */ a06.a $param;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a06 this$0;

    public static final class a<T> implements wi5 {
        public final /* synthetic */ wi5<hf3<BrandedAdsDto>> a;

        /* JADX INFO: renamed from: b06$a$a, reason: collision with other inner class name */
        @uh3(c = "com.indeed.android.myjobs.domain.usecase.GetBrandedAdsUseCase$invoke$2$1", f = "GetBrandedAdsUseCase.kt", l = {27, 34, 39}, m = "emit")
        public static final class C0085a extends pu2 {
            Object L$0;
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ a<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0085a(a<? super T> aVar, lu2<? super C0085a> lu2Var) {
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
        public a(wi5<? super hf3<BrandedAdsDto>> wi5Var) {
            this.a = wi5Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
        
            if (r8.a(r10, r0) == r1) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0090, code lost:
        
            if (r8.a(r10, r0) == r1) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00c0, code lost:
        
            if (r8.a(r9, r0) == r1) goto L44;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // defpackage.wi5
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(defpackage.hf3<com.indeed.android.myjobs.data.model.BrandedAdsApiResponse> r9, defpackage.lu2<? super defpackage.j6g> r10) {
            /*
                Method dump skipped, instruction units count: 202
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: b06.a.a(hf3, lu2):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b06(a06 a06Var, a06.a aVar, lu2<? super b06> lu2Var) {
        super(2, lu2Var);
        this.this$0 = a06Var;
        this.$param = aVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        b06 b06Var = new b06(this.this$0, this.$param, lu2Var);
        b06Var.L$0 = obj;
        return b06Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(wi5<? super hf3<BrandedAdsDto>> wi5Var, lu2<? super j6g> lu2Var) {
        return ((b06) create(wi5Var, lu2Var)).invokeSuspend(j6g.a);
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
            a06 r7 = r6.this$0
            cm1 r7 = r7.a
            a06$a r1 = r6.$param
            com.indeed.android.myjobs.data.model.BrandedAdsApiRequestParams r1 = r1.a
            r6.L$0 = r0
            r6.label = r4
            vi5 r7 = r7.a(r1, r6)
            if (r7 != r5) goto L35
            goto L46
        L35:
            vi5 r7 = (defpackage.vi5) r7
            b06$a r1 = new b06$a
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b06.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
