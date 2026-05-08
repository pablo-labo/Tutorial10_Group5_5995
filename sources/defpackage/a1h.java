package defpackage;

import com.indeed.android.myjobs.data.model.Response;
import defpackage.hf3;
import defpackage.y0h;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.domain.usecase.WithdrawApplicationUseCase$handleNoSelfReportedStatus$1", f = "WithdrawApplicationUseCase.kt", l = {69, 69}, m = "invokeSuspend")
public final class a1h extends c1f implements Function2<upb<? super hf3<Response>>, lu2<? super j6g>, Object> {
    final /* synthetic */ String $encryptedAdvCandId;
    final /* synthetic */ String $jobKey;
    final /* synthetic */ y0h.a $param;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ y0h this$0;

    public static final class a<T> implements wi5 {
        public final /* synthetic */ y0h a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ y0h.a d;
        public final /* synthetic */ upb<hf3<Response>> e;

        /* JADX WARN: Multi-variable type inference failed */
        public a(y0h y0hVar, String str, String str2, y0h.a aVar, upb<? super hf3<Response>> upbVar) {
            this.a = y0hVar;
            this.b = str;
            this.c = str2;
            this.d = aVar;
            this.e = upbVar;
        }

        @Override // defpackage.wi5
        public final Object a(Object obj, lu2 lu2Var) {
            hf3 hf3Var = (hf3) obj;
            boolean z = hf3Var instanceof hf3.c;
            g13 g13Var = g13.a;
            upb<hf3<Response>> upbVar = this.e;
            if (z) {
                y0h y0hVar = this.a;
                f88 f88Var = y0hVar.b;
                String str = this.b;
                f88Var.k(str, "APPLIED");
                Object objE = wg2.n(new b1h(y0hVar, str, this.c, this.d.b, "app-tracker-webapp", null)).e(new z0h(upbVar), lu2Var);
                return objE == g13Var ? objE : j6g.a;
            }
            if ((hf3Var instanceof hf3.b) || (hf3Var instanceof hf3.a)) {
                Object objB = upbVar.b(lu2Var, hf3Var);
                return objB == g13Var ? objB : j6g.a;
            }
            l.g();
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1h(y0h.a aVar, y0h y0hVar, String str, String str2, lu2<? super a1h> lu2Var) {
        super(2, lu2Var);
        this.$param = aVar;
        this.this$0 = y0hVar;
        this.$jobKey = str;
        this.$encryptedAdvCandId = str2;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        a1h a1hVar = new a1h(this.$param, this.this$0, this.$jobKey, this.$encryptedAdvCandId, lu2Var);
        a1hVar.L$0 = obj;
        return a1hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(upb<? super hf3<Response>> upbVar, lu2<? super j6g> lu2Var) {
        return ((a1h) create(upbVar, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f2, code lost:
    
        if (((defpackage.vi5) r0).e(r1, r10) == r9) goto L25;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a1h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
