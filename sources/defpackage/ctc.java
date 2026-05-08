package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.nio.channels.ClosedChannelException;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.Util;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes2.dex */
public final class ctc extends WebSocketListener {
    public final String a;
    public xo7 b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final OkHttpClient d;
    public boolean e;
    public boolean f;
    public WebSocket g;

    public ctc(String str, xo7 xo7Var, hh2 hh2Var) {
        this.a = str;
        this.b = xo7Var;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        builder.c(10L, timeUnit);
        builder.A = Util.b(10L, timeUnit);
        builder.e(0L, TimeUnit.MINUTES);
        this.d = new OkHttpClient(builder);
    }

    @Override // okhttp3.WebSocketListener
    public final synchronized void a(RealWebSocket realWebSocket, int i, String str) {
        realWebSocket.getClass();
        this.g = null;
        if (!this.e) {
            h();
        }
    }

    @Override // okhttp3.WebSocketListener
    public final synchronized void c(RealWebSocket realWebSocket, Exception exc) {
        if (this.g != null) {
            s55.g("ctc", "Error occurred, shutting down websocket connection: Websocket exception", exc);
            try {
                WebSocket webSocket = this.g;
                if (webSocket != null) {
                    webSocket.e(1000, "End of session");
                }
            } catch (Exception unused) {
            }
            this.g = null;
        }
        if (!this.e) {
            h();
        }
    }

    @Override // okhttp3.WebSocketListener
    public final synchronized void d(String str, RealWebSocket realWebSocket) {
        xo7 xo7Var = this.b;
        if (xo7Var != null) {
            xo7Var.b(str);
        }
    }

    @Override // okhttp3.WebSocketListener
    public final synchronized void e(RealWebSocket realWebSocket, vr1 vr1Var) {
        vr1Var.getClass();
        if (this.b != null) {
            s55.n("xo7", "Websocket received message with payload of unexpected type binary");
        }
    }

    @Override // okhttp3.WebSocketListener
    public final synchronized void f(WebSocket webSocket, Response response) {
        this.g = webSocket;
        this.f = false;
    }

    public final void g() {
        if (this.e) {
            r6.g("Can't connect closed client");
            return;
        }
        Request.Builder builder = new Request.Builder();
        builder.g(this.a);
        this.d.d(builder.b(), this);
    }

    public final void h() {
        if (this.e) {
            r6.g("Can't reconnect closed client");
            return;
        }
        if (!this.f) {
            s55.n("ctc", "Couldn't connect to \"" + this.a + "\", will silently retry");
            this.f = true;
        }
        this.c.postDelayed(new ly1(this, 4), 2000L);
    }

    public final synchronized void i(String str) {
        WebSocket webSocket = this.g;
        if (webSocket == null) {
            throw new ClosedChannelException();
        }
        webSocket.send(str);
    }
}
