package defpackage;

import com.apollographql.apollo.exception.ApolloNetworkException;
import com.apollographql.apollo.exception.ApolloWebSocketClosedException;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes.dex */
public final class ur3 extends WebSocketListener {
    public final /* synthetic */ yd2 a;
    public final /* synthetic */ go1 b;

    public ur3(yd2 yd2Var, go1 go1Var) {
        this.a = yd2Var;
        this.b = go1Var;
    }

    @Override // okhttp3.WebSocketListener
    public final void a(RealWebSocket realWebSocket, int i, String str) {
        realWebSocket.getClass();
        this.b.k(null);
    }

    @Override // okhttp3.WebSocketListener
    public final void b(RealWebSocket realWebSocket, int i, String str) {
        this.a.O(j6g.a);
        this.b.n(new ApolloWebSocketClosedException(i, str), false);
    }

    @Override // okhttp3.WebSocketListener
    public final void c(RealWebSocket realWebSocket, Exception exc) {
        this.a.O(j6g.a);
        this.b.n(new ApolloNetworkException(exc, "Web socket communication error"), false);
    }

    @Override // okhttp3.WebSocketListener
    public final void d(String str, RealWebSocket realWebSocket) {
        this.b.f(str);
    }

    @Override // okhttp3.WebSocketListener
    public final void e(RealWebSocket realWebSocket, vr1 vr1Var) {
        vr1Var.getClass();
        this.b.f(vr1Var.A());
    }

    @Override // okhttp3.WebSocketListener
    public final void f(WebSocket webSocket, Response response) {
        this.a.O(j6g.a);
    }
}
