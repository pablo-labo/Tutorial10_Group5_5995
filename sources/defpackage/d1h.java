package defpackage;

import com.indeed.android.myjobs.data.model.Response;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.domain.usecase.WithdrawApplicationUseCase$withdrawApplication$1", f = "WithdrawApplicationUseCase.kt", l = {142, 148}, m = "invokeSuspend")
public final class d1h extends c1f implements Function2<upb<? super hf3<Response>>, lu2<? super j6g>, Object> {
    final /* synthetic */ String $encryptedAdvCandId;
    final /* synthetic */ String $from;
    final /* synthetic */ String $jobKey;
    final /* synthetic */ String $tk;
    private /* synthetic */ Object L$0;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1h(y0h y0hVar, String str, String str2, String str3, String str4, lu2<? super d1h> lu2Var) {
        super(2, lu2Var);
        this.this$0 = y0hVar;
        this.$tk = str;
        this.$from = str2;
        this.$jobKey = str3;
        this.$encryptedAdvCandId = str4;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        d1h d1hVar = new d1h(this.this$0, this.$tk, this.$from, this.$jobKey, this.$encryptedAdvCandId, lu2Var);
        d1hVar.L$0 = obj;
        return d1hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(upb<? super hf3<Response>> upbVar, lu2<? super j6g> lu2Var) {
        return ((d1h) create(upbVar, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        if (((defpackage.vi5) r14).e(r13, r12) == r5) goto L15;
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
            r2 = 0
            r3 = 2
            r4 = 1
            g13 r5 = defpackage.g13.a
            if (r1 == 0) goto L20
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L15
            defpackage.r7d.b(r14)
            goto L56
        L15:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r13)
            return r2
        L1b:
            defpackage.r7d.b(r14)
            r12 = r13
            goto L44
        L20:
            defpackage.r7d.b(r14)
            y0h r14 = r13.this$0
            i88 r6 = r14.a
            java.lang.String r7 = r13.$tk
            java.lang.String r8 = r13.$from
            java.lang.String r9 = r13.$jobKey
            java.lang.String r10 = r13.$encryptedAdvCandId
            com.indeed.android.myjobs.data.model.WithdrawApplicationRequest r11 = new com.indeed.android.myjobs.data.model.WithdrawApplicationRequest
            java.lang.String r14 = "WITHDRAW"
            java.lang.String r1 = "Withdraw application"
            r11.<init>(r14, r1)
            r13.L$0 = r0
            r13.label = r4
            r12 = r13
            vi5 r14 = r6.q(r7, r8, r9, r10, r11, r12)
            if (r14 != r5) goto L44
            goto L55
        L44:
            vi5 r14 = (defpackage.vi5) r14
            d1h$a r13 = new d1h$a
            r13.<init>(r0)
            r12.L$0 = r2
            r12.label = r3
            java.lang.Object r13 = r14.e(r13, r12)
            if (r13 != r5) goto L56
        L55:
            return r5
        L56:
            j6g r13 = defpackage.j6g.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d1h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
