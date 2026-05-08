package defpackage;

import kotlin.jvm.functions.Function2;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.sse.RealEventSource;
import okhttp3.sse.EventSource;
import okhttp3.sse.EventSources;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.realtimemessaging.SSEClient$connect$1", f = "SSEClient.kt", l = {118}, m = "invokeSuspend")
public final class kid extends c1f implements Function2<upb<? super vid>, lu2<? super j6g>, Object> {
    final /* synthetic */ String $path;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ sid this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kid(sid sidVar, String str, lu2<? super kid> lu2Var) {
        super(2, lu2Var);
        this.this$0 = sidVar;
        this.$path = str;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        kid kidVar = new kid(this.this$0, this.$path, lu2Var);
        kidVar.L$0 = obj;
        return kidVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(upb<? super vid> upbVar, lu2<? super j6g> lu2Var) {
        return ((kid) create(upbVar, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            upb upbVar = (upb) this.L$0;
            sid sidVar = this.this$0;
            sidVar.c.a("Connect called. Current state: " + sidVar.k.getValue() + ". Setting state to CONNECTING.");
            gse gseVar = this.this$0.k;
            gseVar.getClass();
            gseVar.m(null, sqc.b);
            sid sidVar2 = this.this$0;
            sidVar2.getClass();
            sidVar2.f = 0L;
            String strK = t40.k(sidVar2.b, this.$path);
            this.this$0.c.a("Connecting to ".concat(strK));
            Request.Builder builder = new Request.Builder();
            builder.g(strK);
            Request requestB = builder.b();
            sid sidVar3 = this.this$0;
            hg hgVar = new hg(upbVar, 7);
            vv vvVar = new vv(upbVar, 21);
            hp0 hp0Var = new hp0(upbVar, 13);
            sidVar3.getClass();
            qid qidVar = new qid(sidVar3, hgVar, hp0Var, vvVar);
            sid sidVar4 = this.this$0;
            boolean z = sidVar4.g;
            EventSource eventSource = sidVar4.d;
            if (z) {
                sidVar4.e = eventSource;
            } else if (eventSource != null) {
                eventSource.cancel();
            }
            sid sidVar5 = this.this$0;
            OkHttpClient okHttpClient = sidVar5.a;
            int i2 = EventSources.a;
            okHttpClient.getClass();
            int i3 = EventSources.a;
            if (requestB.c.a("Accept") == null) {
                Request.Builder builderB = requestB.b();
                builderB.a("Accept", "text/event-stream");
                requestB = builderB.b();
            }
            RealEventSource realEventSource = new RealEventSource(requestB, qidVar);
            OkHttpClient.Builder builderE = okHttpClient.e();
            EventListener eventListener = EventListener.NONE;
            eventListener.getClass();
            byte[] bArr = Util.a;
            builderE.e = new g9(eventListener, 12);
            RealCall realCall = new RealCall(new OkHttpClient(builderE), requestB, false);
            realEventSource.b = realCall;
            realCall.R0(realEventSource);
            sidVar5.d = realEventSource;
            wm1 wm1Var = new wm1(this.this$0, 17);
            this.label = 1;
            Object objA = lpb.a(upbVar, wm1Var, this);
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
