package com.facebook.react.devsupport;

import android.os.Handler;
import android.os.Looper;
import com.facebook.jni.HybridData;
import com.facebook.react.devsupport.CxxInspectorPackagerConnection;
import com.facebook.soloader.SoLoader;
import defpackage.f84;
import defpackage.hn6;
import defpackage.l5;
import java.io.Closeable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.Util;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0003\r\u000e\u000fJ\u0010\u0010\u0003\u001a\u00020\u0002H\u0096 ¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H\u0096 ¢\u0006\u0004\b\u0005\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096 ¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection;", "Lhn6;", "Lj6g;", "connect", "()V", "closeQuietly", "", "event", "sendEventToAllConnections", "(Ljava/lang/String;)V", "Lcom/facebook/jni/HybridData;", "mHybridData", "Lcom/facebook/jni/HybridData;", "WebSocketDelegate", "IWebSocket", "DelegateImpl", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CxxInspectorPackagerConnection implements hn6 {

    @f84
    private final HybridData mHybridData;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl;", "", "", "urlParam", "Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;", "delegate", "Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$IWebSocket;", "connectWebSocket", "(Ljava/lang/String;Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;)Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$IWebSocket;", "Ljava/lang/Runnable;", "runnable", "", "delayMs", "Lj6g;", "scheduleCallback", "(Ljava/lang/Runnable;J)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DelegateImpl {
        public final OkHttpClient a;
        public final Handler b;

        public static final class a implements IWebSocket {
            public final /* synthetic */ RealWebSocket a;

            public a(RealWebSocket realWebSocket) {
                this.a = realWebSocket;
            }

            @Override // com.facebook.react.devsupport.CxxInspectorPackagerConnection.IWebSocket, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                this.a.e(1000, "End of session");
            }

            @Override // com.facebook.react.devsupport.CxxInspectorPackagerConnection.IWebSocket
            public final void send(String str) {
                str.getClass();
                this.a.send(str);
            }
        }

        public static final class b extends WebSocketListener {
            public final /* synthetic */ WebSocketDelegate b;

            public b(WebSocketDelegate webSocketDelegate) {
                this.b = webSocketDelegate;
            }

            @Override // okhttp3.WebSocketListener
            public final void a(RealWebSocket realWebSocket, int i, String str) {
                realWebSocket.getClass();
                final WebSocketDelegate webSocketDelegate = this.b;
                DelegateImpl.this.scheduleCallback(new Runnable() { // from class: com.facebook.react.devsupport.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        CxxInspectorPackagerConnection.WebSocketDelegate webSocketDelegate2 = webSocketDelegate;
                        webSocketDelegate2.didClose();
                        webSocketDelegate2.close();
                    }
                }, 0L);
            }

            @Override // okhttp3.WebSocketListener
            public final void c(RealWebSocket realWebSocket, final Exception exc) {
                final WebSocketDelegate webSocketDelegate = this.b;
                DelegateImpl.this.scheduleCallback(new Runnable() { // from class: com.facebook.react.devsupport.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        String message = exc.getMessage();
                        if (message == null) {
                            message = "<Unknown error>";
                        }
                        CxxInspectorPackagerConnection.WebSocketDelegate webSocketDelegate2 = webSocketDelegate;
                        webSocketDelegate2.didFailWithError(null, message);
                        webSocketDelegate2.close();
                    }
                }, 0L);
            }

            @Override // okhttp3.WebSocketListener
            public final void d(final String str, RealWebSocket realWebSocket) {
                final WebSocketDelegate webSocketDelegate = this.b;
                DelegateImpl.this.scheduleCallback(new Runnable() { // from class: com.facebook.react.devsupport.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        webSocketDelegate.didReceiveMessage(str);
                    }
                }, 0L);
            }

            @Override // okhttp3.WebSocketListener
            public final void f(WebSocket webSocket, Response response) {
                final WebSocketDelegate webSocketDelegate = this.b;
                DelegateImpl.this.scheduleCallback(new Runnable() { // from class: com.facebook.react.devsupport.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        webSocketDelegate.didOpen();
                    }
                }, 0L);
            }
        }

        public DelegateImpl() {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            builder.c(10L, timeUnit);
            builder.A = Util.b(10L, timeUnit);
            builder.e(0L, TimeUnit.MINUTES);
            this.a = new OkHttpClient(builder);
            this.b = new Handler(Looper.getMainLooper());
        }

        @f84
        public final IWebSocket connectWebSocket(String urlParam, WebSocketDelegate delegate) {
            delegate.getClass();
            if (urlParam == null) {
                l5.q("Required value was null.");
                return null;
            }
            Request.Builder builder = new Request.Builder();
            builder.g(urlParam);
            return new a(this.a.d(builder.b(), new b(delegate)));
        }

        @f84
        public final void scheduleCallback(Runnable runnable, long delayMs) {
            runnable.getClass();
            this.b.postDelayed(runnable, delayMs);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bc\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$IWebSocket;", "Ljava/io/Closeable;", "", "message", "Lj6g;", "send", "(Ljava/lang/String;)V", "close", "()V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface IWebSocket extends Closeable {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        void close();

        void send(String message);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0086 ¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0086 ¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\nH\u0086 ¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nH\u0086 ¢\u0006\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;", "Ljava/io/Closeable;", "Lcom/facebook/jni/HybridData;", "mHybridData", "<init>", "(Lcom/facebook/jni/HybridData;)V", "", "posixCode", "", "error", "Lj6g;", "didFailWithError", "(Ljava/lang/Integer;Ljava/lang/String;)V", "message", "didReceiveMessage", "(Ljava/lang/String;)V", "didOpen", "()V", "didClose", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @f84
    public static final class WebSocketDelegate implements Closeable {
        public final HybridData a;

        @f84
        public WebSocketDelegate(HybridData hybridData) {
            hybridData.getClass();
            this.a = hybridData;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.a.resetNative();
        }

        public final native void didClose();

        public final native void didFailWithError(Integer posixCode, String error);

        public final native void didOpen();

        public final native void didReceiveMessage(String message);
    }

    static {
        SoLoader.l("react_devsupportjni");
    }

    public CxxInspectorPackagerConnection(String str, String str2, String str3) {
        str3.getClass();
        this.mHybridData = initHybrid(str, str2, str3, new DelegateImpl());
    }

    private static final native HybridData initHybrid(String str, String str2, String str3, DelegateImpl delegateImpl);

    @Override // defpackage.hn6
    public native void closeQuietly();

    public native void connect();

    @Override // defpackage.hn6
    public native void sendEventToAllConnections(String event);
}
