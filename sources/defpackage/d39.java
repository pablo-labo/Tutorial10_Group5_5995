package defpackage;

import defpackage.c39;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.domain.usecase.LogEventUseCase$invoke$2", f = "LogEventUseCase.kt", l = {57, 58, 60}, m = "invokeSuspend")
public final class d39 extends c1f implements Function2<wi5<? super hf3<j6g>>, lu2<? super j6g>, Object> {
    final /* synthetic */ c39.a $param;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ c39 this$0;

    public static final class a<T> implements wi5 {
        public final /* synthetic */ wi5<hf3<j6g>> a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(wi5<? super hf3<j6g>> wi5Var) {
            this.a = wi5Var;
        }

        @Override // defpackage.wi5
        public final Object a(Object obj, lu2 lu2Var) {
            Object objA = this.a.a((hf3) obj, lu2Var);
            return objA == g13.a ? objA : j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d39(c39.a aVar, c39 c39Var, lu2<? super d39> lu2Var) {
        super(2, lu2Var);
        this.$param = aVar;
        this.this$0 = c39Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        d39 d39Var = new d39(this.$param, this.this$0, lu2Var);
        d39Var.L$0 = obj;
        return d39Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(wi5<? super hf3<j6g>> wi5Var, lu2<? super j6g> lu2Var) {
        return ((d39) create(wi5Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
    
        if (((defpackage.vi5) r15).e(r0, r14) == r6) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009c, code lost:
    
        if (r1.a(r0, r14) != r6) goto L31;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.L$0
            r1 = r0
            wi5 r1 = (defpackage.wi5) r1
            int r0 = r14.label
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            g13 r6 = defpackage.g13.a
            if (r0 == 0) goto L38
            if (r0 == r4) goto L30
            if (r0 == r3) goto L24
            if (r0 != r2) goto L1e
            java.lang.Object r14 = r14.L$1
            java.lang.Exception r14 = (java.lang.Exception) r14
            defpackage.r7d.b(r15)
            goto L9f
        L1e:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r14)
            return r5
        L24:
            java.lang.Object r0 = r14.L$1
            com.indeed.android.myjobs.data.model.dto.LogEventData r0 = (com.indeed.android.myjobs.data.model.dto.LogEventData) r0
            defpackage.r7d.b(r15)     // Catch: java.lang.Exception -> L2d
            goto L9f
        L2d:
            r0 = move-exception
            r15 = r0
            goto L79
        L30:
            java.lang.Object r0 = r14.L$1
            com.indeed.android.myjobs.data.model.dto.LogEventData r0 = (com.indeed.android.myjobs.data.model.dto.LogEventData) r0
            defpackage.r7d.b(r15)     // Catch: java.lang.Exception -> L2d
            goto L65
        L38:
            defpackage.r7d.b(r15)
            com.indeed.android.myjobs.data.model.dto.LogEventData r7 = new com.indeed.android.myjobs.data.model.dto.LogEventData     // Catch: java.lang.Exception -> L2d
            c39$a r15 = r14.$param     // Catch: java.lang.Exception -> L2d
            java.lang.String r8 = r15.a     // Catch: java.lang.Exception -> L2d
            java.lang.String r9 = "trackEvent"
            java.lang.String r10 = "atweb"
            java.lang.String r11 = "event"
            long r12 = r15.b     // Catch: java.lang.Exception -> L2d
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch: java.lang.Exception -> L2d
            c39$a r15 = r14.$param     // Catch: java.lang.Exception -> L2d
            java.lang.String r13 = r15.c     // Catch: java.lang.Exception -> L2d
            r7.<init>(r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> L2d
            c39 r15 = r14.this$0     // Catch: java.lang.Exception -> L2d
            i88 r15 = r15.a     // Catch: java.lang.Exception -> L2d
            r14.L$0 = r1     // Catch: java.lang.Exception -> L2d
            r14.L$1 = r5     // Catch: java.lang.Exception -> L2d
            r14.label = r4     // Catch: java.lang.Exception -> L2d
            vi5 r15 = r15.m(r7, r14)     // Catch: java.lang.Exception -> L2d
            if (r15 != r6) goto L65
            goto L9e
        L65:
            vi5 r15 = (defpackage.vi5) r15     // Catch: java.lang.Exception -> L2d
            d39$a r0 = new d39$a     // Catch: java.lang.Exception -> L2d
            r0.<init>(r1)     // Catch: java.lang.Exception -> L2d
            r14.L$0 = r1     // Catch: java.lang.Exception -> L2d
            r14.L$1 = r5     // Catch: java.lang.Exception -> L2d
            r14.label = r3     // Catch: java.lang.Exception -> L2d
            java.lang.Object r14 = r15.e(r0, r14)     // Catch: java.lang.Exception -> L2d
            if (r14 != r6) goto L9f
            goto L9e
        L79:
            hf3$a r0 = new hf3$a
            com.indeed.android.myjobs.data.model.APIError r3 = new com.indeed.android.myjobs.data.model.APIError
            java.lang.String r15 = r15.getMessage()
            if (r15 != 0) goto L85
            java.lang.String r15 = ""
        L85:
            java.lang.String r4 = "Exception occurred {"
            java.lang.String r15 = r4.concat(r15)
            r4 = -1
            r3.<init>(r4, r15)
            r0.<init>(r3)
            r14.L$0 = r5
            r14.L$1 = r5
            r14.label = r2
            java.lang.Object r14 = r1.a(r0, r14)
            if (r14 != r6) goto L9f
        L9e:
            return r6
        L9f:
            j6g r14 = defpackage.j6g.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d39.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
