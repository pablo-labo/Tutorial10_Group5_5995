package defpackage;

import android.util.Base64;
import com.indeed.android.backendservices.common.api.ApiError;
import defpackage.ho7;
import kotlin.jvm.functions.Function2;
import okhttp3.Request;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.utils.MessagingLogger$emitConversationSelected$1", f = "MessagingLogger.kt", l = {132}, m = "invokeSuspend")
public final class mr9 extends c1f implements Function2<String, lu2<? super j6g>, Object> {
    final /* synthetic */ String $conversationId;
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
    public mr9(lr9 lr9Var, String str, lu2<? super mr9> lu2Var) {
        super(2, lu2Var);
        this.this$0 = lr9Var;
        this.$conversationId = str;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        mr9 mr9Var = new mr9(this.this$0, this.$conversationId, lu2Var);
        mr9Var.L$0 = obj;
        return mr9Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, lu2<? super j6g> lu2Var) {
        return ((mr9) create(str, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            sr9 sr9Var = this.this$0.a;
            p7 p7Var = p7.b;
            ho7.a aVar = ho7.Companion;
            String str2 = this.$conversationId;
            str2.getClass();
            byte[] bytes = "CONVERSATION_SERVICE_ENCRYPTED///".concat(str2).getBytes(a32.b);
            bytes.getClass();
            String strEncodeToString = Base64.encodeToString(bytes, 2);
            strEncodeToString.getClass();
            xig xigVar = new xig(str, p7Var, strEncodeToString, new nz((String) null, (String) null, (String) null, (String) null, (bs0) null, 31));
            a aVar2 = new a(2, this.this$0, lr9.class, "callbackLogError", "callbackLogError(Lcom/indeed/android/backendservices/common/api/ApiError;Lokhttp3/Request;)V", 0);
            this.L$0 = null;
            this.label = 1;
            Object objT = sr9Var.T(xigVar, aVar2, this);
            g13 g13Var = g13.a;
            if (objT == g13Var) {
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
