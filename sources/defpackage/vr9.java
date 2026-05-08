package defpackage;

import com.indeed.android.messaging.api.messaging.logging.MessagingLoggingRetrofitApiResolver;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.api.messaging.logging.MessagingLoggingTasks$postUserActionLog$3", f = "MessagingLoggingTasks.kt", l = {52}, m = "invokeSuspend")
public final class vr9 extends c1f implements Function1<lu2<? super m6d<j6g>>, Object> {
    final /* synthetic */ xig $payload;
    int label;
    final /* synthetic */ wr9 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr9(wr9 wr9Var, xig xigVar, lu2<? super vr9> lu2Var) {
        super(1, lu2Var);
        this.this$0 = wr9Var;
        this.$payload = xigVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new vr9(this.this$0, this.$payload, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<? super m6d<j6g>> lu2Var) {
        return ((vr9) create(lu2Var)).invokeSuspend(j6g.a);
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
        MessagingLoggingRetrofitApiResolver messagingLoggingRetrofitApiResolver = ((sr9) this.this$0).a;
        xig xigVar = this.$payload;
        String str = xigVar.a;
        this.label = 1;
        Object objPostUserActionLog = messagingLoggingRetrofitApiResolver.postUserActionLog(str, xigVar, this);
        g13 g13Var = g13.a;
        return objPostUserActionLog == g13Var ? g13Var : objPostUserActionLog;
    }
}
