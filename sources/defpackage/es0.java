package defpackage;

import com.indeed.android.myjobs.data.model.ApiResponse;
import defpackage.ds0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.domain.usecase.ArchivedJobUseCase$invoke$2", f = "ArchivedJobUseCase.kt", l = {27, 34}, m = "invokeSuspend")
public final class es0 extends c1f implements Function2<upb<? super hf3<ApiResponse>>, lu2<? super j6g>, Object> {
    final /* synthetic */ ds0.a $param;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ds0 this$0;

    @uh3(c = "com.indeed.android.myjobs.domain.usecase.ArchivedJobUseCase$invoke$2$1", f = "ArchivedJobUseCase.kt", l = {37, 47, 52}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<hf3<ApiResponse>, lu2<? super j6g>, Object> {
        final /* synthetic */ upb<hf3<ApiResponse>> $$this$channelFlow;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ds0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(upb<? super hf3<ApiResponse>> upbVar, ds0 ds0Var, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$$this$channelFlow = upbVar;
            this.this$0 = ds0Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(this.$$this$channelFlow, this.this$0, lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(hf3<ApiResponse> hf3Var, lu2<? super j6g> lu2Var) {
            return ((a) create(hf3Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
        
            if (r7.b(r6, r0) == r1) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
        
            if (r7.b(r6, r0) == r1) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0085, code lost:
        
            if (r7.b(r6, r0) == r1) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0087, code lost:
        
            return r1;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.L$0
                hf3 r0 = (defpackage.hf3) r0
                int r1 = r6.label
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L1d
                if (r1 == r4) goto L19
                if (r1 == r3) goto L19
                if (r1 != r2) goto L13
                goto L19
            L13:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r6)
                return r5
            L19:
                defpackage.r7d.b(r7)
                goto L88
            L1d:
                defpackage.r7d.b(r7)
                boolean r7 = r0 instanceof hf3.b
                g13 r1 = defpackage.g13.a
                if (r7 == 0) goto L33
                upb<hf3<com.indeed.android.myjobs.data.model.ApiResponse>> r7 = r6.$$this$channelFlow
                r6.L$0 = r5
                r6.label = r4
                java.lang.Object r6 = r7.b(r6, r0)
                if (r6 != r1) goto L88
                goto L87
            L33:
                boolean r7 = r0 instanceof hf3.c
                if (r7 == 0) goto L70
                r7 = r0
                hf3$c r7 = (hf3.c) r7
                T r7 = r7.a
                com.indeed.android.myjobs.data.model.ApiResponse r7 = (com.indeed.android.myjobs.data.model.ApiResponse) r7
                com.indeed.android.myjobs.data.model.Body r7 = r7.getBody()
                if (r7 == 0) goto L52
                java.util.List r7 = r7.getAppStatusJobs()
                if (r7 == 0) goto L52
                ds0 r2 = r6.this$0
                f88 r2 = r2.b
                r2.s(r7)
                goto L63
            L52:
                ds0 r7 = r6.this$0
                f88 r7 = r7.b
                r7.f()
                java.util.ArrayList r7 = defpackage.lz2.a
                java.lang.String r7 = "ArchivedJobUseCase"
                r2 = 0
                java.lang.String r4 = "Body or appStatusJob is null"
                defpackage.w40.n(r4, r7, r4, r2)
            L63:
                upb<hf3<com.indeed.android.myjobs.data.model.ApiResponse>> r7 = r6.$$this$channelFlow
                r6.L$0 = r5
                r6.label = r3
                java.lang.Object r6 = r7.b(r6, r0)
                if (r6 != r1) goto L88
                goto L87
            L70:
                boolean r7 = r0 instanceof hf3.a
                if (r7 == 0) goto L8b
                ds0 r7 = r6.this$0
                f88 r7 = r7.b
                r7.f()
                upb<hf3<com.indeed.android.myjobs.data.model.ApiResponse>> r7 = r6.$$this$channelFlow
                r6.L$0 = r5
                r6.label = r2
                java.lang.Object r6 = r7.b(r6, r0)
                if (r6 != r1) goto L88
            L87:
                return r1
            L88:
                j6g r6 = defpackage.j6g.a
                return r6
            L8b:
                defpackage.l.g()
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: es0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public es0(ds0 ds0Var, ds0.a aVar, lu2<? super es0> lu2Var) {
        super(2, lu2Var);
        this.this$0 = ds0Var;
        this.$param = aVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        es0 es0Var = new es0(this.this$0, this.$param, lu2Var);
        es0Var.L$0 = obj;
        return es0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(upb<? super hf3<ApiResponse>> upbVar, lu2<? super j6g> lu2Var) {
        return ((es0) create(upbVar, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        if (defpackage.wg2.q((defpackage.vi5) r14, r13, r12) == r5) goto L15;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.L$0
            upb r0 = (defpackage.upb) r0
            int r1 = r13.label
            r2 = 2
            r3 = 1
            r4 = 0
            g13 r5 = defpackage.g13.a
            if (r1 == 0) goto L24
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L19
            java.lang.Object r13 = r13.L$1
            vi5 r13 = (defpackage.vi5) r13
            defpackage.r7d.b(r14)
            goto L57
        L19:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r13)
            return r4
        L1f:
            defpackage.r7d.b(r14)
            r12 = r13
            goto L41
        L24:
            defpackage.r7d.b(r14)
            ds0 r14 = r13.this$0
            i88 r6 = r14.a
            ds0$a r14 = r13.$param
            long r7 = r14.a
            java.lang.String r10 = r14.b
            r13.L$0 = r0
            r13.label = r3
            java.lang.String r9 = "ARCHIVED"
            java.lang.String r11 = "app-tracker"
            r12 = r13
            vi5 r14 = r6.j(r7, r9, r10, r11, r12)
            if (r14 != r5) goto L41
            goto L56
        L41:
            vi5 r14 = (defpackage.vi5) r14
            es0$a r13 = new es0$a
            ds0 r1 = r12.this$0
            r13.<init>(r0, r1, r4)
            r12.L$0 = r4
            r12.L$1 = r4
            r12.label = r2
            java.lang.Object r13 = defpackage.wg2.q(r14, r13, r12)
            if (r13 != r5) goto L57
        L56:
            return r5
        L57:
            j6g r13 = defpackage.j6g.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.es0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
