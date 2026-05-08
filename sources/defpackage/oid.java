package defpackage;

import defpackage.vid;
import java.util.concurrent.CancellationException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.realtimemessaging.SSEClient$connect$3", f = "SSEClient.kt", l = {151}, m = "invokeSuspend")
public final class oid extends c1f implements wu5<wi5<? super vid>, Throwable, lu2<? super j6g>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ sid this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oid(sid sidVar, lu2<? super oid> lu2Var) {
        super(3, lu2Var);
        this.this$0 = sidVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            wi5 wi5Var = (wi5) this.L$0;
            Throwable th = (Throwable) this.L$1;
            gse gseVar = this.this$0.k;
            gseVar.getClass();
            gseVar.m(null, sqc.e);
            this.this$0.getClass();
            if ((!(th instanceof StreamResetException) || ((StreamResetException) th).errorCode != ErrorCode.CANCEL) && !(th instanceof CancellationException)) {
                String message = th.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                vid.d dVar = new vid.d(message);
                this.L$0 = null;
                this.label = 1;
                Object objA = wi5Var.a(dVar, this);
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
    public final Object q(wi5<? super vid> wi5Var, Throwable th, lu2<? super j6g> lu2Var) {
        oid oidVar = new oid(this.this$0, lu2Var);
        oidVar.L$0 = wi5Var;
        oidVar.L$1 = th;
        return oidVar.invokeSuspend(j6g.a);
    }
}
