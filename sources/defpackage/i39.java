package defpackage;

import com.indeed.android.myjobs.data.model.HomepageLoggingResponse;
import defpackage.h39;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.domain.usecase.LogHomepageUseCase$invoke$2", f = "LogHomepageUseCase.kt", l = {25, 31}, m = "invokeSuspend")
public final class i39 extends c1f implements Function2<upb<? super hf3<String>>, lu2<? super j6g>, Object> {
    final /* synthetic */ h39.a $param;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ h39 this$0;

    @uh3(c = "com.indeed.android.myjobs.domain.usecase.LogHomepageUseCase$invoke$2$1", f = "LogHomepageUseCase.kt", l = {34, 39}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<hf3<HomepageLoggingResponse>, lu2<? super j6g>, Object> {
        final /* synthetic */ upb<hf3<String>> $$this$channelFlow;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(upb<? super hf3<String>> upbVar, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$$this$channelFlow = upbVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(this.$$this$channelFlow, lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(hf3<HomepageLoggingResponse> hf3Var, lu2<? super j6g> lu2Var) {
            return ((a) create(hf3Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
        
            if (r8.b(r7, r2) == r1) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
        
            if (r8.b(r7, r0) == r1) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
        
            return r1;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.L$0
                hf3 r0 = (defpackage.hf3) r0
                int r1 = r7.label
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L1a
                if (r1 == r3) goto L16
                if (r1 != r2) goto L10
                goto L16
            L10:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r7)
                return r4
            L16:
                defpackage.r7d.b(r8)
                goto L6f
            L1a:
                defpackage.r7d.b(r8)
                boolean r8 = r0 instanceof hf3.c
                g13 r1 = defpackage.g13.a
                if (r8 == 0) goto L47
                upb<hf3<java.lang.String>> r8 = r7.$$this$channelFlow
                hf3$c r2 = new hf3$c
                hf3$c r0 = (hf3.c) r0
                T r0 = r0.a
                com.indeed.android.myjobs.data.model.HomepageLoggingResponse r0 = (com.indeed.android.myjobs.data.model.HomepageLoggingResponse) r0
                com.indeed.android.myjobs.data.model.HomepageLoggingResponse$Body r0 = r0.getBody()
                if (r0 == 0) goto L38
                java.lang.String r0 = r0.getPageTk()
                goto L39
            L38:
                r0 = r4
            L39:
                r2.<init>(r0)
                r7.L$0 = r4
                r7.label = r3
                java.lang.Object r7 = r8.b(r7, r2)
                if (r7 != r1) goto L6f
                goto L6e
            L47:
                boolean r8 = r0 instanceof hf3.a
                if (r8 == 0) goto L6f
                java.util.ArrayList r8 = defpackage.lz2.a
                java.lang.String r8 = "LogHomepageUseCase"
                r0 = 0
                java.lang.String r3 = "Error occured while fetching pagetk"
                defpackage.w40.n(r3, r8, r3, r0)
                upb<hf3<java.lang.String>> r8 = r7.$$this$channelFlow
                hf3$a r0 = new hf3$a
                com.indeed.android.myjobs.data.model.APIError r3 = new com.indeed.android.myjobs.data.model.APIError
                r5 = -1
                java.lang.String r6 = "error occured"
                r3.<init>(r5, r6)
                r0.<init>(r3)
                r7.L$0 = r4
                r7.label = r2
                java.lang.Object r7 = r8.b(r7, r0)
                if (r7 != r1) goto L6f
            L6e:
                return r1
            L6f:
                j6g r7 = defpackage.j6g.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: i39.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i39(h39 h39Var, h39.a aVar, lu2<? super i39> lu2Var) {
        super(2, lu2Var);
        this.this$0 = h39Var;
        this.$param = aVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        i39 i39Var = new i39(this.this$0, this.$param, lu2Var);
        i39Var.L$0 = obj;
        return i39Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(upb<? super hf3<String>> upbVar, lu2<? super j6g> lu2Var) {
        return ((i39) create(upbVar, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (defpackage.wg2.q((defpackage.vi5) r7, r1, r6) == r5) goto L15;
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
            upb r0 = (defpackage.upb) r0
            int r1 = r6.label
            r2 = 2
            r3 = 1
            r4 = 0
            g13 r5 = defpackage.g13.a
            if (r1 == 0) goto L23
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L19
            java.lang.Object r6 = r6.L$1
            vi5 r6 = (defpackage.vi5) r6
            defpackage.r7d.b(r7)
            goto L4e
        L19:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r6)
            return r4
        L1f:
            defpackage.r7d.b(r7)
            goto L3a
        L23:
            defpackage.r7d.b(r7)
            h39 r7 = r6.this$0
            i88 r7 = r7.a
            h39$a r1 = r6.$param
            r1.getClass()
            r6.L$0 = r0
            r6.label = r3
            vi5 r7 = r7.b(r4, r4, r4, r6)
            if (r7 != r5) goto L3a
            goto L4d
        L3a:
            vi5 r7 = (defpackage.vi5) r7
            i39$a r1 = new i39$a
            r1.<init>(r0, r4)
            r6.L$0 = r4
            r6.L$1 = r4
            r6.label = r2
            java.lang.Object r6 = defpackage.wg2.q(r7, r1, r6)
            if (r6 != r5) goto L4e
        L4d:
            return r5
        L4e:
            j6g r6 = defpackage.j6g.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i39.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
