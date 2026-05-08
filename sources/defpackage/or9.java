package defpackage;

import com.indeed.android.rnmessaging.api.logging.MessagingLoggingRetrofitApiResolver;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.rnmessaging.api.logging.MessagingLoggingApi$postImpressionLog$3", f = "MessagingLoggingApi.kt", l = {56}, m = "invokeSuspend")
public final class or9 extends c1f implements Function1<lu2<? super m6d<j6g>>, Object> {
    final /* synthetic */ n47 $payload;
    int label;
    final /* synthetic */ rr9 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or9(rr9 rr9Var, n47 n47Var, lu2<? super or9> lu2Var) {
        super(1, lu2Var);
        this.this$0 = rr9Var;
        this.$payload = n47Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new or9(this.this$0, this.$payload, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<? super m6d<j6g>> lu2Var) {
        return ((or9) create(lu2Var)).invokeSuspend(j6g.a);
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
        n47 n47Var = this.$payload;
        String str = n47Var.a;
        this.label = 1;
        Object objPostImpressionLog = messagingLoggingRetrofitApiResolver.postImpressionLog(str, n47Var, this);
        g13 g13Var = g13.a;
        return objPostImpressionLog == g13Var ? g13Var : objPostImpressionLog;
    }
}
