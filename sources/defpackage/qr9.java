package defpackage;

import com.indeed.android.rnmessaging.api.logging.MessagingLoggingRetrofitApiResolver;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.rnmessaging.api.logging.MessagingLoggingApi$postUserActionLog$3", f = "MessagingLoggingApi.kt", l = {72}, m = "invokeSuspend")
public final class qr9 extends c1f implements Function1<lu2<? super m6d<j6g>>, Object> {
    final /* synthetic */ yig $payload;
    int label;
    final /* synthetic */ rr9 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qr9(rr9 rr9Var, yig yigVar, lu2<? super qr9> lu2Var) {
        super(1, lu2Var);
        this.this$0 = rr9Var;
        this.$payload = yigVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new qr9(this.this$0, this.$payload, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<? super m6d<j6g>> lu2Var) {
        return ((qr9) create(lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                r7d.b(obj);
                return obj;
            }
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        MessagingLoggingRetrofitApiResolver messagingLoggingRetrofitApiResolver = this.this$0.a;
        yig yigVar = this.$payload;
        String str = yigVar.a;
        this.label = 1;
        Object objPostUserActionLog = messagingLoggingRetrofitApiResolver.postUserActionLog(str, yigVar, this);
        g13 g13Var = g13.a;
        return objPostUserActionLog == g13Var ? g13Var : objPostUserActionLog;
    }
}
