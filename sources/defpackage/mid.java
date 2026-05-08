package defpackage;

import com.indeed.android.reactnative.rntarebridge.RNTareBridge;
import com.indeed.android.realtimemessaging.models.MandatoryReconnectionException;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.realtimemessaging.SSEClient$connect$2", f = "SSEClient.kt", l = {138}, m = "invokeSuspend")
public final class mid extends c1f implements Function2<Throwable, lu2<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ sid this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mid(sid sidVar, lu2<? super mid> lu2Var) {
        super(2, lu2Var);
        this.this$0 = sidVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        mid midVar = new mid(this.this$0, lu2Var);
        midVar.L$0 = obj;
        return midVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Throwable th, lu2<? super Boolean> lu2Var) {
        return ((mid) create(th, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            r7d.b(obj);
            Throwable th = (Throwable) this.L$0;
            this.this$0.getClass();
            boolean z2 = th instanceof StreamResetException;
            sqc sqcVar = sqc.e;
            if ((z2 && ((StreamResetException) th).errorCode == ErrorCode.CANCEL) || (th instanceof CancellationException)) {
                this.this$0.c.a("Connection is cancelled");
                gse gseVar = this.this$0.k;
                gseVar.getClass();
                gseVar.m(null, sqcVar);
            } else {
                boolean z3 = th instanceof MandatoryReconnectionException;
                sid sidVar = this.this$0;
                sqc sqcVar2 = sqc.d;
                if (z3) {
                    gse gseVar2 = sidVar.k;
                    gseVar2.getClass();
                    gseVar2.m(null, sqcVar2);
                    return Boolean.valueOf(z);
                }
                int i2 = sidVar.i;
                dad dadVar = sidVar.h;
                if (i2 < dadVar.c) {
                    double dPow = Math.pow(dadVar.b, i2) * ((double) dadVar.a);
                    iic.a.getClass();
                    int iMin = (int) Math.min((iic.b.a().nextDouble() * ((double) ((int) (((double) sidVar.h.d) * dPow)))) + dPow, r11.e);
                    sid sidVar2 = this.this$0;
                    RNTareBridge.g gVar = sidVar2.c;
                    StringBuilder sbF = uz.f("Retrying attempt ", sidVar2.i + 1, "/", sidVar2.h.c, " after ");
                    sbF.append(iMin);
                    sbF.append(" ms. Setting state to CLOSED.");
                    gVar.a(sbF.toString());
                    gse gseVar3 = this.this$0.k;
                    gseVar3.getClass();
                    gseVar3.m(null, sqcVar2);
                    this.label = 1;
                    Object objB = ls3.b(iMin, this);
                    g13 g13Var = g13.a;
                    if (objB == g13Var) {
                        return g13Var;
                    }
                } else {
                    sidVar.c.b("Max retry attempts reached or non-retriable error in retry. Setting state to SHUTDOWN.");
                    gse gseVar4 = this.this$0.k;
                    gseVar4.getClass();
                    gseVar4.m(null, sqcVar);
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }
        if (i != 1) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        this.this$0.i++;
        return Boolean.valueOf(z);
    }
}
