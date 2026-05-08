package defpackage;

import com.indeed.android.myjobs.data.model.Response;
import defpackage.hf3;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.domain.usecase.WithdrawApplicationUseCase$handleWithdrawApplication$1", f = "WithdrawApplicationUseCase.kt", l = {92}, m = "invokeSuspend")
public final class b1h extends c1f implements Function2<upb<? super hf3<Response>>, lu2<? super j6g>, Object> {
    final /* synthetic */ String $encryptedAdvCandId;
    final /* synthetic */ String $from;
    final /* synthetic */ String $jobKey;
    final /* synthetic */ String $tk;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ y0h this$0;

    public static final class a<T> implements wi5 {
        public final /* synthetic */ upb<hf3<Response>> a;
        public final /* synthetic */ y0h b;
        public final /* synthetic */ String c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(upb<? super hf3<Response>> upbVar, y0h y0hVar, String str) {
            this.a = upbVar;
            this.b = y0hVar;
            this.c = str;
        }

        @Override // defpackage.wi5
        public final Object a(Object obj, lu2 lu2Var) {
            hf3 hf3Var = (hf3) obj;
            boolean z = hf3Var instanceof hf3.b;
            g13 g13Var = g13.a;
            upb<hf3<Response>> upbVar = this.a;
            if (z || (hf3Var instanceof hf3.a)) {
                Object objB = upbVar.b(lu2Var, hf3Var);
                return objB == g13Var ? objB : j6g.a;
            }
            if (!(hf3Var instanceof hf3.c)) {
                l.g();
                return null;
            }
            this.b.b.j(this.c);
            Object objB2 = upbVar.b(lu2Var, hf3Var);
            return objB2 == g13Var ? objB2 : j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1h(y0h y0hVar, String str, String str2, String str3, String str4, lu2<? super b1h> lu2Var) {
        super(2, lu2Var);
        this.this$0 = y0hVar;
        this.$jobKey = str;
        this.$encryptedAdvCandId = str2;
        this.$tk = str3;
        this.$from = str4;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        b1h b1hVar = new b1h(this.this$0, this.$jobKey, this.$encryptedAdvCandId, this.$tk, this.$from, lu2Var);
        b1hVar.L$0 = obj;
        return b1hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(upb<? super hf3<Response>> upbVar, lu2<? super j6g> lu2Var) {
        return ((b1h) create(upbVar, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        upb upbVar = (upb) this.L$0;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            y0h y0hVar = this.this$0;
            String str = this.$jobKey;
            String str2 = this.$encryptedAdvCandId;
            String str3 = this.$tk;
            String str4 = this.$from;
            y0hVar.getClass();
            a22 a22VarN = wg2.n(new d1h(y0hVar, str3, str4, str, str2, null));
            a aVar = new a(upbVar, this.this$0, this.$jobKey);
            this.L$0 = null;
            this.label = 1;
            Object objE = a22VarN.e(aVar, this);
            g13 g13Var = g13.a;
            if (objE == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        return j6g.a;
    }
}
