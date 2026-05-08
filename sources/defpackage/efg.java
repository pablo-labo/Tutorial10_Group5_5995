package defpackage;

import app.rive.runtime.kotlin.renderers.RendererMetrics;
import com.indeed.android.myjobs.data.model.Response;
import defpackage.dfg;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.domain.usecase.UpdateJobStatusUseCase$invoke$2", f = "UpdateJobStatusUseCase.kt", l = {RendererMetrics.SAMPLES, 37}, m = "invokeSuspend")
public final class efg extends c1f implements Function2<upb<? super hf3<Response>>, lu2<? super j6g>, Object> {
    final /* synthetic */ dfg.a $param;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ dfg this$0;

    @uh3(c = "com.indeed.android.myjobs.domain.usecase.UpdateJobStatusUseCase$invoke$2$1", f = "UpdateJobStatusUseCase.kt", l = {40, 118, 122}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<hf3<Response>, lu2<? super j6g>, Object> {
        final /* synthetic */ upb<hf3<Response>> $$this$channelFlow;
        final /* synthetic */ dfg.a $param;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ dfg this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(upb<? super hf3<Response>> upbVar, dfg.a aVar, dfg dfgVar, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$$this$channelFlow = upbVar;
            this.$param = aVar;
            this.this$0 = dfgVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(this.$$this$channelFlow, this.$param, this.this$0, lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(hf3<Response> hf3Var, lu2<? super j6g> lu2Var) {
            return ((a) create(hf3Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
        
            if (r9.b(r8, r0) == r1) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00d2, code lost:
        
            if (r9.b(r8, r0) == r1) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00e3, code lost:
        
            if (r9.b(r8, r0) == r1) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x00e5, code lost:
        
            return r1;
         */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instruction units count: 237
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: efg.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efg(dfg dfgVar, dfg.a aVar, lu2<? super efg> lu2Var) {
        super(2, lu2Var);
        this.this$0 = dfgVar;
        this.$param = aVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        efg efgVar = new efg(this.this$0, this.$param, lu2Var);
        efgVar.L$0 = obj;
        return efgVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(upb<? super hf3<Response>> upbVar, lu2<? super j6g> lu2Var) {
        return ((efg) create(upbVar, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
    
        if (defpackage.wg2.q((defpackage.vi5) r13, r12, r11) == r5) goto L15;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.L$0
            upb r0 = (defpackage.upb) r0
            int r1 = r12.label
            r2 = 2
            r3 = 1
            r4 = 0
            g13 r5 = defpackage.g13.a
            if (r1 == 0) goto L24
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L19
            java.lang.Object r12 = r12.L$1
            vi5 r12 = (defpackage.vi5) r12
            defpackage.r7d.b(r13)
            goto L59
        L19:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r12)
            return r4
        L1f:
            defpackage.r7d.b(r13)
            r11 = r12
            goto L41
        L24:
            defpackage.r7d.b(r13)
            dfg r13 = r12.this$0
            i88 r6 = r13.a
            dfg$a r13 = r12.$param
            java.lang.String r7 = r13.b
            com.indeed.android.myjobs.data.model.UpdateJobsStatusUsecase r8 = r13.a
            java.lang.String r9 = r13.c
            r12.L$0 = r0
            r12.label = r3
            java.lang.String r10 = "app-tracker-webapp"
            r11 = r12
            vi5 r13 = r6.f(r7, r8, r9, r10, r11)
            if (r13 != r5) goto L41
            goto L58
        L41:
            vi5 r13 = (defpackage.vi5) r13
            efg$a r12 = new efg$a
            dfg$a r1 = r11.$param
            dfg r3 = r11.this$0
            r12.<init>(r0, r1, r3, r4)
            r11.L$0 = r4
            r11.L$1 = r4
            r11.label = r2
            java.lang.Object r12 = defpackage.wg2.q(r13, r12, r11)
            if (r12 != r5) goto L59
        L58:
            return r5
        L59:
            j6g r12 = defpackage.j6g.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efg.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
