package com.facebook.react.modules.websocket;

import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.facebook.fbreact.specs.NativeWebSocketModuleSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapBuilder;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import defpackage.akb;
import defpackage.l5;
import defpackage.la3;
import defpackage.nmc;
import defpackage.r6;
import defpackage.s55;
import defpackage.tp5;
import defpackage.vr1;
import defpackage.wve;
import defpackage.zve;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadPoolExecutor;
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
@nmc(name = "WebSocketModule")
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 <2\u00020\u0001:\u0002=>B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010!\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\b2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J)\u0010%\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010\u00062\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b*\u0010(J\u001d\u0010*\u001a\u00020\n2\u0006\u0010,\u001a\u00020+2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b*\u0010-J\u0017\u0010.\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\n2\u0006\u00102\u001a\u00020\u001fH\u0016¢\u0006\u0004\b3\u0010/R \u00106\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u000205048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R \u00108\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0017048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00107R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006?"}, d2 = {"Lcom/facebook/react/modules/websocket/WebSocketModule;", "Lcom/facebook/fbreact/specs/NativeWebSocketModuleSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "eventName", "Lcom/facebook/react/bridge/ReadableMap;", "params", "Lj6g;", "sendEvent", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V", "", "id", "message", "notifyWebSocketFailed", "(ILjava/lang/String;)V", "uri", "getCookie", "(Ljava/lang/String;)Ljava/lang/String;", "invalidate", "()V", "Lcom/facebook/react/modules/websocket/WebSocketModule$b;", "contentHandler", "setContentHandler", "(ILcom/facebook/react/modules/websocket/WebSocketModule$b;)V", "url", "Lcom/facebook/react/bridge/ReadableArray;", "protocols", "options", "", "socketID", "connect", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;D)V", "code", "reason", "close", "(DLjava/lang/String;D)V", "send", "(Ljava/lang/String;D)V", "base64String", "sendBinary", "Lvr1;", "byteString", "(Lvr1;I)V", "ping", "(D)V", "addListener", "(Ljava/lang/String;)V", "count", "removeListeners", "", "Lokhttp3/WebSocket;", "webSocketConnections", "Ljava/util/Map;", "contentHandlers", "Ltp5;", "cookieHandler", "Ltp5;", "Companion", "b", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WebSocketModule extends NativeWebSocketModuleSpec {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final String NAME = "WebSocketModule";
    private static la3 customClientBuilder;
    private final Map<Integer, b> contentHandlers;
    private final tp5 cookieHandler;
    private final Map<Integer, WebSocket> webSocketConnections;

    /* JADX INFO: renamed from: com.facebook.react.modules.websocket.WebSocketModule$a, reason: from kotlin metadata */
    public static final class Companion {
        /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final java.lang.String a(com.facebook.react.modules.websocket.WebSocketModule.Companion r5, java.lang.String r6) {
            /*
                r5.getClass()
                java.net.URI r5 = new java.net.URI     // Catch: java.net.URISyntaxException -> L89
                r5.<init>(r6)     // Catch: java.net.URISyntaxException -> L89
                java.lang.String r0 = r5.getScheme()     // Catch: java.net.URISyntaxException -> L89
                if (r0 == 0) goto L50
                int r1 = r0.hashCode()     // Catch: java.net.URISyntaxException -> L89
                r2 = 3804(0xedc, float:5.33E-42)
                java.lang.String r3 = "http"
                if (r1 == r2) goto L48
                r2 = 118039(0x1cd17, float:1.65408E-40)
                java.lang.String r4 = "https"
                if (r1 == r2) goto L3d
                r2 = 3213448(0x310888, float:4.503E-39)
                if (r1 == r2) goto L31
                r2 = 99617003(0x5f008eb, float:2.2572767E-35)
                if (r1 == r2) goto L2a
                goto L50
            L2a:
                boolean r0 = r0.equals(r4)     // Catch: java.net.URISyntaxException -> L89
                if (r0 != 0) goto L38
                goto L50
            L31:
                boolean r0 = r0.equals(r3)     // Catch: java.net.URISyntaxException -> L89
                if (r0 != 0) goto L38
                goto L50
            L38:
                java.lang.String r3 = r5.getScheme()     // Catch: java.net.URISyntaxException -> L89
                goto L52
            L3d:
                java.lang.String r1 = "wss"
                boolean r0 = r0.equals(r1)     // Catch: java.net.URISyntaxException -> L89
                if (r0 != 0) goto L46
                goto L50
            L46:
                r3 = r4
                goto L52
            L48:
                java.lang.String r1 = "ws"
                boolean r0 = r0.equals(r1)     // Catch: java.net.URISyntaxException -> L89
                if (r0 != 0) goto L52
            L50:
                java.lang.String r3 = ""
            L52:
                int r0 = r5.getPort()     // Catch: java.net.URISyntaxException -> L89
                r1 = -1
                if (r0 == r1) goto L75
                java.lang.String r0 = "%s://%s:%s"
                java.lang.String r1 = r5.getHost()     // Catch: java.net.URISyntaxException -> L89
                int r5 = r5.getPort()     // Catch: java.net.URISyntaxException -> L89
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.net.URISyntaxException -> L89
                java.lang.Object[] r5 = new java.lang.Object[]{r3, r1, r5}     // Catch: java.net.URISyntaxException -> L89
                r1 = 3
                java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r1)     // Catch: java.net.URISyntaxException -> L89
                java.lang.String r5 = java.lang.String.format(r0, r5)     // Catch: java.net.URISyntaxException -> L89
                return r5
            L75:
                java.lang.String r0 = "%s://%s"
                java.lang.String r5 = r5.getHost()     // Catch: java.net.URISyntaxException -> L89
                java.lang.Object[] r5 = new java.lang.Object[]{r3, r5}     // Catch: java.net.URISyntaxException -> L89
                r1 = 2
                java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r1)     // Catch: java.net.URISyntaxException -> L89
                java.lang.String r5 = java.lang.String.format(r0, r5)     // Catch: java.net.URISyntaxException -> L89
                return r5
            L89:
                java.lang.String r5 = "Unable to set "
                java.lang.String r0 = " as default origin header"
                java.lang.String r5 = defpackage.l5.m(r5, r6, r0)
                defpackage.l5.q(r5)
                r5 = 0
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.websocket.WebSocketModule.Companion.a(com.facebook.react.modules.websocket.WebSocketModule$a, java.lang.String):java.lang.String");
        }
    }

    public interface b {
        void a(String str, WritableMap writableMap);

        void b(vr1 vr1Var, WritableMap writableMap);
    }

    public static final class c extends WebSocketListener {
        public final /* synthetic */ int b;

        public c(int i) {
            this.b = i;
        }

        @Override // okhttp3.WebSocketListener
        public final void a(RealWebSocket realWebSocket, int i, String str) {
            realWebSocket.getClass();
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.getClass();
            ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
            readableMapBuilder.put("id", this.b);
            readableMapBuilder.put("code", i);
            readableMapBuilder.put("reason", str);
            WebSocketModule.this.sendEvent("websocketClosed", writableMapCreateMap);
        }

        @Override // okhttp3.WebSocketListener
        public final void b(RealWebSocket realWebSocket, int i, String str) {
            realWebSocket.e(i, str);
        }

        @Override // okhttp3.WebSocketListener
        public final void c(RealWebSocket realWebSocket, Exception exc) {
            WebSocketModule.this.notifyWebSocketFailed(this.b, exc.getMessage());
        }

        @Override // okhttp3.WebSocketListener
        public final void d(String str, RealWebSocket realWebSocket) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.getClass();
            int i = this.b;
            writableMapCreateMap.putInt("id", i);
            writableMapCreateMap.putString("type", "text");
            WebSocketModule webSocketModule = WebSocketModule.this;
            b bVar = (b) webSocketModule.contentHandlers.get(Integer.valueOf(i));
            if (bVar != null) {
                bVar.a(str, writableMapCreateMap);
            } else {
                writableMapCreateMap.putString("data", str);
            }
            webSocketModule.sendEvent("websocketMessage", writableMapCreateMap);
        }

        @Override // okhttp3.WebSocketListener
        public final void e(RealWebSocket realWebSocket, vr1 vr1Var) {
            vr1Var.getClass();
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.getClass();
            int i = this.b;
            writableMapCreateMap.putInt("id", i);
            writableMapCreateMap.putString("type", "binary");
            WebSocketModule webSocketModule = WebSocketModule.this;
            b bVar = (b) webSocketModule.contentHandlers.get(Integer.valueOf(i));
            if (bVar != null) {
                bVar.b(vr1Var, writableMapCreateMap);
            } else {
                writableMapCreateMap.putString("data", vr1Var.a());
            }
            webSocketModule.sendEvent("websocketMessage", writableMapCreateMap);
        }

        @Override // okhttp3.WebSocketListener
        public final void f(WebSocket webSocket, Response response) {
            WebSocketModule webSocketModule = WebSocketModule.this;
            Map map = webSocketModule.webSocketConnections;
            int i = this.b;
            map.put(Integer.valueOf(i), webSocket);
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.getClass();
            ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
            readableMapBuilder.put("id", i);
            String strA = response.f.a("Sec-WebSocket-Protocol");
            if (strA == null) {
                strA = "";
            }
            readableMapBuilder.put("protocol", strA);
            webSocketModule.sendEvent("websocketOpen", writableMapCreateMap);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.getClass();
        this.webSocketConnections = new ConcurrentHashMap();
        this.contentHandlers = new ConcurrentHashMap();
        this.cookieHandler = new tp5();
    }

    public static final /* synthetic */ la3 access$getCustomClientBuilder$cp() {
        return null;
    }

    public static final /* synthetic */ void access$setCustomClientBuilder$cp(la3 la3Var) {
    }

    private final String getCookie(String uri) {
        try {
            List<String> list = this.cookieHandler.get(new URI(Companion.a(INSTANCE, uri)), new HashMap()).get("Cookie");
            List<String> list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                return list.get(0);
            }
            return null;
        } catch (IOException unused) {
            l5.q(l5.l("Unable to get cookie from ", uri));
            return null;
        } catch (URISyntaxException unused2) {
            l5.q(l5.l("Unable to get cookie from ", uri));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyWebSocketFailed(int id, String message) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.getClass();
        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
        readableMapBuilder.put("id", id);
        readableMapBuilder.put("message", message);
        sendEvent("websocketFailed", writableMapCreateMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendEvent(String eventName, ReadableMap params) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.getClass();
        if (reactApplicationContext.hasActiveReactInstance()) {
            reactApplicationContext.emitDeviceEvent(eventName, params);
        }
    }

    public static final void setCustomClientBuilder(la3 la3Var) {
        INSTANCE.getClass();
        access$setCustomClientBuilder$cp(la3Var);
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void addListener(String eventName) {
        eventName.getClass();
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void close(double code, String reason, double socketID) {
        int i = (int) socketID;
        WebSocket webSocket = this.webSocketConnections.get(Integer.valueOf(i));
        if (webSocket == null) {
            return;
        }
        try {
            webSocket.e((int) code, reason);
            this.webSocketConnections.remove(Integer.valueOf(i));
            this.contentHandlers.remove(Integer.valueOf(i));
        } catch (Exception e) {
            s55.g("ReactNative", "Could not close WebSocket connection for id " + i, e);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void connect(String url, ReadableArray protocols, ReadableMap options, double socketID) {
        boolean z;
        url.getClass();
        int i = (int) socketID;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        builder.c(10L, timeUnit);
        builder.A = Util.b(10L, timeUnit);
        builder.e(0L, TimeUnit.MINUTES);
        INSTANCE.getClass();
        access$getCustomClientBuilder$cp();
        OkHttpClient okHttpClient = new OkHttpClient(builder);
        Request.Builder builder2 = new Request.Builder();
        builder2.f(Object.class, Integer.valueOf(i));
        builder2.g(url);
        String cookie = getCookie(url);
        if (cookie != null) {
            builder2.a("Cookie", cookie);
        }
        if (options != null && options.hasKey("headers") && options.getType("headers") == ReadableType.Map) {
            ReadableMap map = options.getMap("headers");
            if (map == null) {
                r6.g("Required value was null.");
                return;
            }
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map.keySetIterator();
            z = false;
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                if (ReadableType.String == map.getType(strNextKey)) {
                    if (wve.E(strNextKey, "origin", true)) {
                        z = true;
                    }
                    String string = map.getString(strNextKey);
                    if (string == null) {
                        akb.n(l5.m("value for name ", strNextKey, " == null"));
                        return;
                    }
                    builder2.a(strNextKey, string);
                } else {
                    s55.n("ReactNative", "Ignoring: requested " + strNextKey + ", value not a string");
                }
            }
        } else {
            z = false;
        }
        if (!z) {
            builder2.a("origin", Companion.a(INSTANCE, url));
        }
        if (protocols != null && protocols.size() > 0) {
            StringBuilder sb = new StringBuilder("");
            int size = protocols.size();
            for (int i2 = 0; i2 < size; i2++) {
                String string2 = protocols.getString(i2);
                String string3 = string2 != null ? zve.s0(string2).toString() : null;
                if (!(string3 == null || string3.length() == 0) && !zve.L(string3, ",", false)) {
                    sb.append(string3);
                    sb.append(",");
                }
            }
            if (sb.length() > 0) {
                sb.replace(sb.length() - 1, sb.length(), "");
                builder2.a("Sec-WebSocket-Protocol", sb.toString());
            }
        }
        okHttpClient.d(builder2.b(), new c(i));
        ((ThreadPoolExecutor) okHttpClient.a.a()).shutdown();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        Iterator<WebSocket> it = this.webSocketConnections.values().iterator();
        while (it.hasNext()) {
            it.next().e(1001, null);
        }
        this.webSocketConnections.clear();
        this.contentHandlers.clear();
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void ping(double socketID) {
        int i = (int) socketID;
        WebSocket webSocket = this.webSocketConnections.get(Integer.valueOf(i));
        if (webSocket != null) {
            try {
                webSocket.a(vr1.c);
                return;
            } catch (Exception e) {
                notifyWebSocketFailed(i, e.getMessage());
                return;
            }
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.getClass();
        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
        readableMapBuilder.put("id", i);
        readableMapBuilder.put("message", "client is null");
        sendEvent("websocketFailed", writableMapCreateMap);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.getClass();
        ReadableMapBuilder readableMapBuilder2 = new ReadableMapBuilder(writableMapCreateMap2);
        readableMapBuilder2.put("id", i);
        readableMapBuilder2.put("code", 0);
        readableMapBuilder2.put("reason", "client is null");
        sendEvent("websocketClosed", writableMapCreateMap2);
        this.webSocketConnections.remove(Integer.valueOf(i));
        this.contentHandlers.remove(Integer.valueOf(i));
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void removeListeners(double count) {
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void send(String message, double socketID) {
        message.getClass();
        int i = (int) socketID;
        WebSocket webSocket = this.webSocketConnections.get(Integer.valueOf(i));
        if (webSocket != null) {
            try {
                webSocket.send(message);
                return;
            } catch (Exception e) {
                notifyWebSocketFailed(i, e.getMessage());
                return;
            }
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.getClass();
        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
        readableMapBuilder.put("id", i);
        readableMapBuilder.put("message", "client is null");
        sendEvent("websocketFailed", writableMapCreateMap);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.getClass();
        ReadableMapBuilder readableMapBuilder2 = new ReadableMapBuilder(writableMapCreateMap2);
        readableMapBuilder2.put("id", i);
        readableMapBuilder2.put("code", 0);
        readableMapBuilder2.put("reason", "client is null");
        sendEvent("websocketClosed", writableMapCreateMap2);
        this.webSocketConnections.remove(Integer.valueOf(i));
        this.contentHandlers.remove(Integer.valueOf(i));
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void sendBinary(String base64String, double socketID) {
        base64String.getClass();
        int i = (int) socketID;
        WebSocket webSocket = this.webSocketConnections.get(Integer.valueOf(i));
        if (webSocket != null) {
            try {
                vr1 vr1Var = vr1.c;
                vr1 vr1VarA = vr1.a.a(base64String);
                if (vr1VarA == null) {
                    throw new IllegalStateException("bytes == null");
                }
                webSocket.a(vr1VarA);
                return;
            } catch (Exception e) {
                notifyWebSocketFailed(i, e.getMessage());
                return;
            }
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.getClass();
        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
        readableMapBuilder.put("id", i);
        readableMapBuilder.put("message", "client is null");
        sendEvent("websocketFailed", writableMapCreateMap);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.getClass();
        ReadableMapBuilder readableMapBuilder2 = new ReadableMapBuilder(writableMapCreateMap2);
        readableMapBuilder2.put("id", i);
        readableMapBuilder2.put("code", 0);
        readableMapBuilder2.put("reason", "client is null");
        sendEvent("websocketClosed", writableMapCreateMap2);
        this.webSocketConnections.remove(Integer.valueOf(i));
        this.contentHandlers.remove(Integer.valueOf(i));
    }

    public final void setContentHandler(int id, b contentHandler) {
        Map<Integer, b> map = this.contentHandlers;
        if (contentHandler != null) {
            map.put(Integer.valueOf(id), contentHandler);
        } else {
            map.remove(Integer.valueOf(id));
        }
    }

    public final void sendBinary(vr1 byteString, int id) {
        byteString.getClass();
        WebSocket webSocket = this.webSocketConnections.get(Integer.valueOf(id));
        if (webSocket == null) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.getClass();
            ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
            readableMapBuilder.put("id", id);
            readableMapBuilder.put("message", "client is null");
            sendEvent("websocketFailed", writableMapCreateMap);
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            writableMapCreateMap2.getClass();
            ReadableMapBuilder readableMapBuilder2 = new ReadableMapBuilder(writableMapCreateMap2);
            readableMapBuilder2.put("id", id);
            readableMapBuilder2.put("code", 0);
            readableMapBuilder2.put("reason", "client is null");
            sendEvent("websocketClosed", writableMapCreateMap2);
            this.webSocketConnections.remove(Integer.valueOf(id));
            this.contentHandlers.remove(Integer.valueOf(id));
            return;
        }
        try {
            webSocket.a(byteString);
        } catch (Exception e) {
            notifyWebSocketFailed(id, e.getMessage());
        }
    }
}
