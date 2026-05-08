package defpackage;

import com.indeed.android.messaging.api.messaging.MessagingRetrofitApiResolver;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.api.messaging.MessagingTasks$getInitiateConversation$3", f = "MessagingTasks.kt", l = {120}, m = "invokeSuspend")
public final class cs9 extends c1f implements Function1<lu2<? super m6d<rd7>>, Object> {
    final /* synthetic */ String $token;
    int label;
    final /* synthetic */ gs9 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cs9(gs9 gs9Var, String str, lu2<? super cs9> lu2Var) {
        super(1, lu2Var);
        this.this$0 = gs9Var;
        this.$token = str;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new cs9(this.this$0, this.$token, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<? super m6d<rd7>> lu2Var) {
        return ((cs9) create(lu2Var)).invokeSuspend(j6g.a);
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
        MessagingRetrofitApiResolver messagingRetrofitApiResolverC = this.this$0.c();
        String str = this.$token;
        this.label = 1;
        Object initiateConversation = messagingRetrofitApiResolverC.getInitiateConversation(str, this);
        g13 g13Var = g13.a;
        return initiateConversation == g13Var ? g13Var : initiateConversation;
    }
}
