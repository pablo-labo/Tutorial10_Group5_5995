package defpackage;

import defpackage.uid;
import java.util.concurrent.CancellationException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.utils.SSEClient$connect$3", f = "SSEClient.kt", l = {319}, m = "invokeSuspend")
public final class pid extends c1f implements wu5<wi5<? super uid>, Throwable, lu2<? super j6g>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ tid this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pid(tid tidVar, lu2<? super pid> lu2Var) {
        super(3, lu2Var);
        this.this$0 = tidVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        wi5 wi5Var = (wi5) this.L$0;
        Throwable th = (Throwable) this.L$1;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            this.this$0.getClass();
            if ((!(th instanceof StreamResetException) || ((StreamResetException) th).errorCode != ErrorCode.CANCEL) && !(th instanceof CancellationException)) {
                String message = th.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                uid.a aVar = new uid.a(message);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                Object objA = wi5Var.a(aVar, this);
                g13 g13Var = g13.a;
                if (objA == g13Var) {
                    return g13Var;
                }
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

    @Override // defpackage.wu5
    public final Object q(wi5<? super uid> wi5Var, Throwable th, lu2<? super j6g> lu2Var) {
        pid pidVar = new pid(this.this$0, lu2Var);
        pidVar.L$0 = wi5Var;
        pidVar.L$1 = th;
        return pidVar.invokeSuspend(j6g.a);
    }
}
