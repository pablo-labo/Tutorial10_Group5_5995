package defpackage;

import com.indeed.android.myjobs.data.model.Response;
import defpackage.y0h;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.domain.usecase.WithdrawApplicationUseCase$invoke$2", f = "WithdrawApplicationUseCase.kt", l = {47, 54}, m = "invokeSuspend")
public final class c1h extends c1f implements Function2<upb<? super hf3<Response>>, lu2<? super j6g>, Object> {
    final /* synthetic */ y0h.a $param;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ y0h this$0;

    public static final class a<T> implements wi5 {
        public final /* synthetic */ upb<hf3<Response>> a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(upb<? super hf3<Response>> upbVar) {
            this.a = upbVar;
        }

        @Override // defpackage.wi5
        public final Object a(Object obj, lu2 lu2Var) {
            Object objB = this.a.b(lu2Var, (hf3) obj);
            return objB == g13.a ? objB : j6g.a;
        }
    }

    public static final class b<T> implements wi5 {
        public final /* synthetic */ upb<hf3<Response>> a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(upb<? super hf3<Response>> upbVar) {
            this.a = upbVar;
        }

        @Override // defpackage.wi5
        public final Object a(Object obj, lu2 lu2Var) {
            Object objB = this.a.b(lu2Var, (hf3) obj);
            return objB == g13.a ? objB : j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1h(y0h.a aVar, y0h y0hVar, lu2<? super c1h> lu2Var) {
        super(2, lu2Var);
        this.$param = aVar;
        this.this$0 = y0hVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        c1h c1hVar = new c1h(this.$param, this.this$0, lu2Var);
        c1hVar.L$0 = obj;
        return c1hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(upb<? super hf3<Response>> upbVar, lu2<? super j6g> lu2Var) {
        return ((c1h) create(upbVar, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0083, code lost:
    
        if (r13.e(r3, r12) == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00aa, code lost:
    
        if (r13.e(r2, r12) == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ac, code lost:
    
        return r1;
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
            if (r1 == 0) goto L26
            if (r1 == r3) goto Lf
            if (r1 != r2) goto L20
        Lf:
            java.lang.Object r0 = r12.L$3
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r12.L$2
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r12 = r12.L$1
            com.indeed.android.myjobs.data.model.UserJobStatus r12 = (com.indeed.android.myjobs.data.model.UserJobStatus) r12
            defpackage.r7d.b(r13)
            goto Lad
        L20:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r12)
            return r4
        L26:
            defpackage.r7d.b(r13)
            y0h$a r13 = r12.$param
            com.indeed.android.myjobs.data.model.dto.SavedJobsDto r13 = r13.a
            com.indeed.android.myjobs.data.model.UserJobStatus r13 = r13.getSelfReportedStatus()
            y0h$a r1 = r12.$param
            com.indeed.android.myjobs.data.model.dto.SavedJobsDto r1 = r1.a
            java.lang.String r7 = r1.getJobkey()
            y0h$a r1 = r12.$param
            com.indeed.android.myjobs.data.model.dto.SavedJobsDto r1 = r1.a
            java.lang.String r8 = r1.getEncryptedAdvCandId()
            if (r8 == 0) goto Lb0
            int r1 = r8.length()
            if (r1 != 0) goto L4a
            goto Lb0
        L4a:
            g13 r1 = defpackage.g13.a
            if (r13 == 0) goto L58
            java.lang.String r13 = r13.getStatus()
            int r13 = r13.length()
            if (r13 != 0) goto L5b
        L58:
            r9 = r8
            r8 = r7
            goto L86
        L5b:
            y0h r6 = r12.this$0
            y0h$a r13 = r12.$param
            java.lang.String r9 = r13.b
            r6.getClass()
            b1h r5 = new b1h
            r11 = 0
            java.lang.String r10 = "app-tracker-webapp"
            r5.<init>(r6, r7, r8, r9, r10, r11)
            a22 r13 = defpackage.wg2.n(r5)
            c1h$b r3 = new c1h$b
            r3.<init>(r0)
            r12.L$0 = r4
            r12.L$1 = r4
            r12.L$2 = r4
            r12.L$3 = r4
            r12.label = r2
            java.lang.Object r12 = r13.e(r3, r12)
            if (r12 != r1) goto Lad
            goto Lac
        L86:
            y0h r7 = r12.this$0
            y0h$a r6 = r12.$param
            r7.getClass()
            a1h r5 = new a1h
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            a22 r13 = defpackage.wg2.n(r5)
            c1h$a r2 = new c1h$a
            r2.<init>(r0)
            r12.L$0 = r4
            r12.L$1 = r4
            r12.L$2 = r4
            r12.L$3 = r4
            r12.label = r3
            java.lang.Object r12 = r13.e(r2, r12)
            if (r12 != r1) goto Lad
        Lac:
            return r1
        Lad:
            j6g r12 = defpackage.j6g.a
            return r12
        Lb0:
            java.util.ArrayList r12 = defpackage.lz2.a
            java.lang.String r12 = "WithdrawApplicationUseCase"
            r13 = 0
            java.lang.String r0 = "encryptedAdvCandId is  empty or Null "
            defpackage.w40.n(r0, r12, r0, r13)
            j6g r12 = defpackage.j6g.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c1h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
