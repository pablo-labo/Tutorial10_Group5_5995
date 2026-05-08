package okhttp3.logging;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.Metadata;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/logging/LoggingEventListener;", "Lokhttp3/EventListener;", "Factory", "okhttp-logging-interceptor"}, k = 1, mv = {1, 4, 0})
public final class LoggingEventListener extends EventListener {
    public long a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/logging/LoggingEventListener$Factory;", "Lokhttp3/EventListener$Factory;", "okhttp-logging-interceptor"}, k = 1, mv = {1, 4, 0})
    public static class Factory implements EventListener.Factory {
        public final HttpLoggingInterceptor.Logger a;

        public Factory() {
            HttpLoggingInterceptor$Logger$Companion$DEFAULT$1 httpLoggingInterceptor$Logger$Companion$DEFAULT$1 = HttpLoggingInterceptor.Logger.a;
            httpLoggingInterceptor$Logger$Companion$DEFAULT$1.getClass();
            this.a = httpLoggingInterceptor$Logger$Companion$DEFAULT$1;
        }
    }

    public final void a(String str) {
        long jNanoTime = (System.nanoTime() - this.a) / 1000000;
        StringBuilder sb = new StringBuilder("[");
        sb.append(jNanoTime);
        sb.append(" ms] ");
        sb.append(str);
        throw null;
    }

    @Override // okhttp3.EventListener
    public final void cacheConditionalHit(Call call, Response response) {
        call.getClass();
        response.getClass();
        a("cacheConditionalHit: " + response);
    }

    @Override // okhttp3.EventListener
    public final void cacheHit(Call call, Response response) {
        call.getClass();
        response.getClass();
        a("cacheHit: " + response);
    }

    @Override // okhttp3.EventListener
    public final void cacheMiss(Call call) {
        call.getClass();
        a("cacheMiss");
    }

    @Override // okhttp3.EventListener
    public final void callEnd(Call call) {
        call.getClass();
        a("callEnd");
    }

    @Override // okhttp3.EventListener
    public final void callFailed(Call call, IOException iOException) {
        call.getClass();
        iOException.getClass();
        a("callFailed: " + iOException);
    }

    @Override // okhttp3.EventListener
    public final void callStart(Call call) {
        call.getClass();
        this.a = System.nanoTime();
        a("callStart: " + call.getB());
    }

    @Override // okhttp3.EventListener
    public final void canceled(Call call) {
        call.getClass();
        a("canceled");
    }

    @Override // okhttp3.EventListener
    public final void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        call.getClass();
        inetSocketAddress.getClass();
        proxy.getClass();
        a("connectEnd: " + protocol);
    }

    @Override // okhttp3.EventListener
    public final void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        call.getClass();
        inetSocketAddress.getClass();
        proxy.getClass();
        iOException.getClass();
        a("connectFailed: " + protocol + ' ' + iOException);
    }

    @Override // okhttp3.EventListener
    public final void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        call.getClass();
        inetSocketAddress.getClass();
        proxy.getClass();
        a("connectStart: " + inetSocketAddress + ' ' + proxy);
    }

    @Override // okhttp3.EventListener
    public final void connectionAcquired(Call call, Connection connection) {
        call.getClass();
        connection.getClass();
        a("connectionAcquired: " + connection);
    }

    @Override // okhttp3.EventListener
    public final void connectionReleased(Call call, Connection connection) {
        call.getClass();
        connection.getClass();
        a("connectionReleased");
    }

    @Override // okhttp3.EventListener
    public final void dnsEnd(Call call, String str, List<? extends InetAddress> list) {
        call.getClass();
        str.getClass();
        list.getClass();
        a("dnsEnd: " + list);
    }

    @Override // okhttp3.EventListener
    public final void dnsStart(Call call, String str) {
        call.getClass();
        str.getClass();
        a("dnsStart: ".concat(str));
    }

    @Override // okhttp3.EventListener
    public final void proxySelectEnd(Call call, HttpUrl httpUrl, List<? extends Proxy> list) {
        call.getClass();
        httpUrl.getClass();
        list.getClass();
        a("proxySelectEnd: " + list);
    }

    @Override // okhttp3.EventListener
    public final void proxySelectStart(Call call, HttpUrl httpUrl) {
        call.getClass();
        httpUrl.getClass();
        a("proxySelectStart: " + httpUrl);
    }

    @Override // okhttp3.EventListener
    public final void requestBodyEnd(Call call, long j) {
        call.getClass();
        a("requestBodyEnd: byteCount=" + j);
    }

    @Override // okhttp3.EventListener
    public final void requestBodyStart(Call call) {
        call.getClass();
        a("requestBodyStart");
    }

    @Override // okhttp3.EventListener
    public final void requestFailed(Call call, IOException iOException) {
        call.getClass();
        iOException.getClass();
        a("requestFailed: " + iOException);
    }

    @Override // okhttp3.EventListener
    public final void requestHeadersEnd(Call call, Request request) {
        call.getClass();
        request.getClass();
        a("requestHeadersEnd");
    }

    @Override // okhttp3.EventListener
    public final void requestHeadersStart(Call call) {
        call.getClass();
        a("requestHeadersStart");
    }

    @Override // okhttp3.EventListener
    public final void responseBodyEnd(Call call, long j) {
        call.getClass();
        a("responseBodyEnd: byteCount=" + j);
    }

    @Override // okhttp3.EventListener
    public final void responseBodyStart(Call call) {
        call.getClass();
        a("responseBodyStart");
    }

    @Override // okhttp3.EventListener
    public final void responseFailed(Call call, IOException iOException) {
        call.getClass();
        iOException.getClass();
        a("responseFailed: " + iOException);
    }

    @Override // okhttp3.EventListener
    public final void responseHeadersEnd(Call call, Response response) {
        call.getClass();
        response.getClass();
        a("responseHeadersEnd: " + response);
    }

    @Override // okhttp3.EventListener
    public final void responseHeadersStart(Call call) {
        call.getClass();
        a("responseHeadersStart");
    }

    @Override // okhttp3.EventListener
    public final void satisfactionFailure(Call call, Response response) {
        call.getClass();
        response.getClass();
        a("satisfactionFailure: " + response);
    }

    @Override // okhttp3.EventListener
    public final void secureConnectEnd(Call call, Handshake handshake) {
        call.getClass();
        a("secureConnectEnd: " + handshake);
    }

    @Override // okhttp3.EventListener
    public final void secureConnectStart(Call call) {
        call.getClass();
        a("secureConnectStart");
    }
}
