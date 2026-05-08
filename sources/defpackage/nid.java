package defpackage;

import android.util.Log;
import com.indeed.android.messaging.utils.MandatoryReconnectionException;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.utils.SSEClient$connect$2", f = "SSEClient.kt", l = {307}, m = "invokeSuspend")
public final class nid extends c1f implements Function2<Throwable, lu2<? super Boolean>, Object> {
    int I$0;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ tid this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nid(tid tidVar, lu2<? super nid> lu2Var) {
        super(2, lu2Var);
        this.this$0 = tidVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        nid nidVar = new nid(this.this$0, lu2Var);
        nidVar.L$0 = obj;
        return nidVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Throwable th, lu2<? super Boolean> lu2Var) {
        return ((nid) create(th, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th = (Throwable) this.L$0;
        int i = this.label;
        boolean z = false;
        if (i == 0) {
            r7d.b(obj);
            this.this$0.getClass();
            if (((th instanceof StreamResetException) && ((StreamResetException) th).errorCode == ErrorCode.CANCEL) || (th instanceof CancellationException)) {
                ArrayList arrayList = lz2.a;
                Log.d("SSEClient", "Connection is cancelled", null);
                return Boolean.valueOf(z);
            }
            if (!(th instanceof MandatoryReconnectionException)) {
                tid tidVar = this.this$0;
                int i2 = tidVar.g;
                cad cadVar = tidVar.f;
                if (i2 >= cadVar.c) {
                    ArrayList arrayList2 = lz2.a;
                    lz2.d("SSEClient", "Over max attempts, closing connection", false, null);
                    throw th;
                }
                double dPow = Math.pow(cadVar.b, i2) * ((double) cadVar.a);
                iic.a.getClass();
                int iMin = (int) Math.min((iic.b.a().nextDouble() * ((double) ((int) (((double) tidVar.f.d) * dPow)))) + dPow, r12.e);
                ArrayList arrayList3 = lz2.a;
                Log.d("SSEClient", k20.l("Reconnecting in ", iMin, this.this$0.g, " ms, retryAttempt: "), null);
                this.L$0 = null;
                this.I$0 = iMin;
                this.label = 1;
                Object objB = ls3.b(iMin, this);
                g13 g13Var = g13.a;
                if (objB == g13Var) {
                    return g13Var;
                }
            }
            z = true;
            return Boolean.valueOf(z);
        }
        if (i != 1) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        tid tidVar2 = this.this$0;
        tidVar2.e = false;
        tidVar2.g++;
        z = true;
        return Boolean.valueOf(z);
    }
}
