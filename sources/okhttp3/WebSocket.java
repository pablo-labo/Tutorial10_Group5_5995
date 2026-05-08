package okhttp3;

import defpackage.vr1;
import kotlin.Metadata;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/WebSocket;", "", "Factory", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface WebSocket {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/WebSocket$Factory;", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Factory {
        RealWebSocket d(Request request, WebSocketListener webSocketListener);
    }

    boolean a(vr1 vr1Var);

    boolean e(int i, String str);

    boolean send(String str);
}
