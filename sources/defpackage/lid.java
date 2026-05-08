package defpackage;

import android.util.Log;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.sse.RealEventSource;
import okhttp3.sse.EventSource;
import okhttp3.sse.EventSources;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.utils.SSEClient$connect$1", f = "SSEClient.kt", l = {290}, m = "invokeSuspend")
public final class lid extends c1f implements Function2<upb<? super uid>, lu2<? super j6g>, Object> {
    final /* synthetic */ String $path;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ tid this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lid(tid tidVar, String str, lu2<? super lid> lu2Var) {
        super(2, lu2Var);
        this.this$0 = tidVar;
        this.$path = str;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        lid lidVar = new lid(this.this$0, this.$path, lu2Var);
        lidVar.L$0 = obj;
        return lidVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(upb<? super uid> upbVar, lu2<? super j6g> lu2Var) {
        return ((lid) create(upbVar, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        upb upbVar = (upb) this.L$0;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            tid tidVar = this.this$0;
            tidVar.getClass();
            tidVar.d = 0L;
            String strL = l5.l("https://encserv.indeed.com/", this.$path);
            ArrayList arrayList = lz2.a;
            Log.d("SSEClient", "Connecting to ".concat(strL), null);
            Request.Builder builder = new Request.Builder();
            builder.g(strL);
            Request requestB = builder.b();
            tid tidVar2 = this.this$0;
            ma maVar = new ma(upbVar, 15);
            oa oaVar = new oa(upbVar, 23);
            ji jiVar = new ji(upbVar, 10);
            tidVar2.getClass();
            rid ridVar = new rid(tidVar2, maVar, jiVar, oaVar);
            tid tidVar3 = this.this$0;
            boolean z = tidVar3.e;
            EventSource eventSource = tidVar3.b;
            if (z) {
                tidVar3.c = eventSource;
            } else if (eventSource != null) {
                eventSource.cancel();
            }
            tid tidVar4 = this.this$0;
            OkHttpClient okHttpClient = tidVar4.a;
            int i2 = EventSources.a;
            okHttpClient.getClass();
            int i3 = EventSources.a;
            if (requestB.c.a("Accept") == null) {
                Request.Builder builderB = requestB.b();
                builderB.a("Accept", "text/event-stream");
                requestB = builderB.b();
            }
            RealEventSource realEventSource = new RealEventSource(requestB, ridVar);
            OkHttpClient.Builder builderE = okHttpClient.e();
            EventListener eventListener = EventListener.NONE;
            eventListener.getClass();
            byte[] bArr = Util.a;
            builderE.e = new g9(eventListener, 12);
            RealCall realCall = new RealCall(new OkHttpClient(builderE), requestB, false);
            realEventSource.b = realCall;
            realCall.R0(realEventSource);
            tidVar4.b = realEventSource;
            cq0 cq0Var = new cq0(this.this$0, 14);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 1;
            Object objA = lpb.a(upbVar, cq0Var, this);
            g13 g13Var = g13.a;
            if (objA == g13Var) {
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
