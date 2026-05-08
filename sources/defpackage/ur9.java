package defpackage;

import com.indeed.android.messaging.api.messaging.logging.MessagingLoggingRetrofitApiResolver;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.api.messaging.logging.MessagingLoggingTasks$postPageLoadLog$3", f = "MessagingLoggingTasks.kt", l = {20}, m = "invokeSuspend")
public final class ur9 extends c1f implements Function1<lu2<? super m6d<j6g>>, Object> {
    final /* synthetic */ l0b $payload;
    int label;
    final /* synthetic */ wr9 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur9(wr9 wr9Var, l0b l0bVar, lu2<? super ur9> lu2Var) {
        super(1, lu2Var);
        this.this$0 = wr9Var;
        this.$payload = l0bVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new ur9(this.this$0, this.$payload, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<? super m6d<j6g>> lu2Var) {
        return ((ur9) create(lu2Var)).invokeSuspend(j6g.a);
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
        l0b l0bVar = this.$payload;
        String str = l0bVar.a;
        this.label = 1;
        Object objPostPageLoadLog = messagingLoggingRetrofitApiResolver.postPageLoadLog(str, l0bVar, this);
        g13 g13Var = g13.a;
        return objPostPageLoadLog == g13Var ? g13Var : objPostPageLoadLog;
    }
}
