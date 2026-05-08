package okhttp3.internal.sse;

import defpackage.j6g;
import defpackage.wl7;
import java.io.IOException;
import kotlin.Metadata;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.sse.ServerSentEventReader;
import okhttp3.sse.EventSource;
import okhttp3.sse.EventSourceListener;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/sse/RealEventSource;", "Lokhttp3/sse/EventSource;", "Lokhttp3/internal/sse/ServerSentEventReader$Callback;", "Lokhttp3/Callback;", "okhttp-sse"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RealEventSource implements EventSource, ServerSentEventReader.Callback, Callback {
    public final EventSourceListener a;
    public RealCall b;

    public RealEventSource(Request request, EventSourceListener eventSourceListener) {
        this.a = eventSourceListener;
    }

    @Override // okhttp3.sse.EventSource
    public final void cancel() {
        RealCall realCall = this.b;
        if (realCall != null) {
            realCall.cancel();
        } else {
            wl7.g("call");
            throw null;
        }
    }

    @Override // okhttp3.Callback
    public final void h(Call call, IOException iOException) {
        this.a.c(this, iOException);
    }

    @Override // okhttp3.Callback
    public final void p(Call call, Response response) {
        try {
            boolean zH = response.h();
            EventSourceListener eventSourceListener = this.a;
            if (!zH) {
                eventSourceListener.c(this, null);
                response.close();
                return;
            }
            ResponseBody responseBody = response.V;
            responseBody.getClass();
            MediaType c = responseBody.getC();
            if (c != null && c.b.equals("text") && c.c.equals("event-stream")) {
                RealCall realCall = this.b;
                if (realCall == null) {
                    wl7.g("call");
                    throw null;
                }
                realCall.k();
                Response.Builder builderP = response.p();
                builderP.g = Util.c;
                Response responseA = builderP.a();
                ServerSentEventReader serverSentEventReader = new ServerSentEventReader(responseBody.getE(), this);
                try {
                    eventSourceListener.d(this, responseA);
                    do {
                    } while (serverSentEventReader.a());
                    eventSourceListener.a(this);
                    j6g j6gVar = j6g.a;
                    response.close();
                    return;
                } catch (Exception e) {
                    eventSourceListener.c(this, e);
                    response.close();
                    return;
                }
            }
            eventSourceListener.c(this, new IllegalStateException("Invalid content-type: " + responseBody.getC()));
            response.close();
        } finally {
        }
    }
}
