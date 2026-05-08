package defpackage;

import com.indeed.android.backendservices.common.api.ApiError;
import defpackage.ho7;
import java.util.List;
import kotlin.jvm.functions.Function2;
import okhttp3.Request;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.utils.MessagingLogger$emitInitiateConversationImpression$1", f = "MessagingLogger.kt", l = {107}, m = "invokeSuspend")
public final class nr9 extends c1f implements Function2<String, lu2<? super j6g>, Object> {
    final /* synthetic */ String $conversationSid;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ lr9 this$0;

    public static final /* synthetic */ class a extends qv5 implements Function2<ApiError, Request, j6g> {
        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(ApiError apiError, Request request) {
            ApiError apiError2 = apiError;
            apiError2.getClass();
            lr9.a((lr9) this.receiver, apiError2, request);
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr9(lr9 lr9Var, String str, lu2<? super nr9> lu2Var) {
        super(2, lu2Var);
        this.this$0 = lr9Var;
        this.$conversationSid = str;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        nr9 nr9Var = new nr9(this.this$0, this.$conversationSid, lu2Var);
        nr9Var.L$0 = obj;
        return nr9Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, lu2<? super j6g> lu2Var) {
        return ((nr9) create(str, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            sr9 sr9Var = this.this$0.a;
            ho7.a aVar = ho7.Companion;
            List listZ = u63.Z(this.$conversationSid);
            List listZ2 = u63.Z(new Integer(0));
            List listZ3 = u63.Z(new Integer(0));
            jo7 jo7Var = new jo7(null, null, null, null, u63.Z(Boolean.FALSE), null, null, null, null, listZ2, null, u63.Z(""), listZ3, 14319);
            this.this$0.getClass();
            m47 m47Var = new m47(str, listZ, jo7Var, lr9.b(null));
            a aVar2 = new a(2, this.this$0, lr9.class, "callbackLogError", "callbackLogError(Lcom/indeed/android/backendservices/common/api/ApiError;Lokhttp3/Request;)V", 0);
            this.L$0 = null;
            this.label = 1;
            Object objD = sr9Var.d(m47Var, aVar2, this);
            g13 g13Var = g13.a;
            if (objD == g13Var) {
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
