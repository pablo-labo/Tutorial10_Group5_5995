package com.facebook.react.modules.network;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import com.datadog.android.okhttp.trace.TracingInterceptor;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.facebook.fbreact.specs.NativeNetworkingAndroidSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableArrayBuilder;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import defpackage.cbe;
import defpackage.dz2;
import defpackage.e3c;
import defpackage.fpa;
import defpackage.g3c;
import defpackage.j6g;
import defpackage.je6;
import defpackage.jga;
import defpackage.la3;
import defpackage.nmc;
import defpackage.ojh;
import defpackage.q3d;
import defpackage.q6;
import defpackage.r3d;
import defpackage.r40;
import defpackage.r6;
import defpackage.s55;
import defpackage.t92;
import defpackage.tp5;
import defpackage.uqc;
import defpackage.wl7;
import defpackage.wve;
import defpackage.z92;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.CookieJar;
import okhttp3.Dispatcher;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.JavaNetCookieJar;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$2;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.ResponseBody$Companion$asResponseBody$1;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.http.RealInterceptorChain;

/* JADX INFO: loaded from: classes2.dex */
@nmc(name = "Networking")
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\f\b\u0007\u0018\u0000 q2\u00020\u0001:\u0004rstuB1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fB#\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\u000fB!\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\u0010B\u001b\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\"\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u001fH\u0000¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b#\u0010\u0019J\u0017\u0010&\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u001bH\u0000¢\u0006\u0004\b%\u0010\u001dJ\u0017\u0010(\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u001fH\u0000¢\u0006\u0004\b'\u0010!J[\u00106\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+2\b\u0010.\u001a\u0004\u0018\u00010-2\b\u00100\u001a\u0004\u0018\u00010/2\u0006\u00101\u001a\u00020\u00042\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020+2\u0006\u00105\u001a\u000202H\u0016¢\u0006\u0004\b6\u00107J[\u0010;\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00042\b\u0010*\u001a\u0004\u0018\u00010\u00042\u0006\u00109\u001a\u0002082\b\u0010.\u001a\u0004\u0018\u00010-2\b\u00100\u001a\u0004\u0018\u00010/2\u0006\u00101\u001a\u00020\u00042\u0006\u00103\u001a\u0002022\u0006\u0010:\u001a\u0002082\u0006\u00105\u001a\u000202¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00122\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010A\u001a\u00020\u00122\u0006\u0010@\u001a\u00020?H\u0017¢\u0006\u0004\bA\u0010BJ\u0019\u0010D\u001a\u00020\u00122\b\u0010C\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u00020\u00122\u0006\u0010F\u001a\u00020+H\u0016¢\u0006\u0004\bG\u0010>J#\u0010J\u001a\u0004\u0018\u00010H2\b\u0010I\u001a\u0004\u0018\u00010H2\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\bJ\u0010KJ\u001f\u0010N\u001a\u00020\u00122\u0006\u00109\u001a\u0002082\u0006\u0010M\u001a\u00020LH\u0002¢\u0006\u0004\bN\u0010OJ\u0017\u0010P\u001a\u00020\u00122\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\bP\u0010QJ\u0017\u0010R\u001a\u00020\u00122\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\bR\u0010QJ\u000f\u0010S\u001a\u00020\u0012H\u0002¢\u0006\u0004\bS\u0010\u0014J\u0017\u0010T\u001a\u00020\u00122\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\bT\u0010QJ)\u0010X\u001a\u0004\u0018\u00010W2\u0006\u0010U\u001a\u00020-2\u0006\u0010V\u001a\u00020\u00042\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\bX\u0010YJ%\u0010]\u001a\u0004\u0018\u00010\\2\b\u0010Z\u001a\u0004\u0018\u00010-2\b\u0010[\u001a\u0004\u0018\u00010/H\u0002¢\u0006\u0004\b]\u0010^R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010_R\u0014\u0010a\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010cR\u0018\u0010e\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u001a\u0010h\u001a\b\u0012\u0004\u0012\u0002080g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u001a\u0010k\u001a\b\u0012\u0004\u0012\u00020\u001b0j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u001a\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00160j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010lR\u001a\u0010n\u001a\b\u0012\u0004\u0012\u00020\u001f0j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010lR\u0016\u0010o\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010p¨\u0006v"}, d2 = {"Lcom/facebook/react/modules/network/NetworkingModule;", "Lcom/facebook/fbreact/specs/NativeNetworkingAndroidSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "", "defaultUserAgent", "Lokhttp3/OkHttpClient;", "client", "", "Ljga;", "networkInterceptorCreators", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;Lokhttp3/OkHttpClient;Ljava/util/List;)V", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;Lokhttp3/OkHttpClient;)V", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;)V", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;)V", "Lj6g;", "initialize", "()V", "invalidate", "Lcom/facebook/react/modules/network/NetworkingModule$d;", "handler", "addUriHandler$ReactAndroid_release", "(Lcom/facebook/react/modules/network/NetworkingModule$d;)V", "addUriHandler", "Lcom/facebook/react/modules/network/NetworkingModule$b;", "addRequestBodyHandler$ReactAndroid_release", "(Lcom/facebook/react/modules/network/NetworkingModule$b;)V", "addRequestBodyHandler", "Lcom/facebook/react/modules/network/NetworkingModule$c;", "addResponseHandler$ReactAndroid_release", "(Lcom/facebook/react/modules/network/NetworkingModule$c;)V", "addResponseHandler", "removeUriHandler$ReactAndroid_release", "removeUriHandler", "removeRequestBodyHandler$ReactAndroid_release", "removeRequestBodyHandler", "removeResponseHandler$ReactAndroid_release", "removeResponseHandler", "method", "url", "", "requestIdAsDouble", "Lcom/facebook/react/bridge/ReadableArray;", "headers", "Lcom/facebook/react/bridge/ReadableMap;", "data", "responseType", "", "useIncrementalUpdates", "timeoutAsDouble", "withCredentials", "sendRequest", "(Ljava/lang/String;Ljava/lang/String;DLcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;ZDZ)V", "", "requestId", "timeout", "sendRequestInternal", "(Ljava/lang/String;Ljava/lang/String;ILcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;ZIZ)V", "abortRequest", "(D)V", "Lcom/facebook/react/bridge/Callback;", "callback", "clearCookies", "(Lcom/facebook/react/bridge/Callback;)V", "eventName", "addListener", "(Ljava/lang/String;)V", "count", "removeListeners", "Lokhttp3/RequestBody;", "requestBody", "wrapRequestBodyWithProgressEmitter", "(Lokhttp3/RequestBody;I)Lokhttp3/RequestBody;", "Lokhttp3/ResponseBody;", "responseBody", "readWithProgress", "(ILokhttp3/ResponseBody;)V", "addRequest", "(I)V", "removeRequest", "cancelAllRequests", "cancelRequest", "body", "contentType", "Lokhttp3/MultipartBody$Builder;", "constructMultipartBody", "(Lcom/facebook/react/bridge/ReadableArray;Ljava/lang/String;I)Lokhttp3/MultipartBody$Builder;", "headersArray", "requestData", "Lokhttp3/Headers;", "extractHeaders", "(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;)Lokhttp3/Headers;", "Lokhttp3/OkHttpClient;", "Ltp5;", "cookieHandler", "Ltp5;", "Ljava/lang/String;", "Ldz2;", "cookieJarContainer", "Ldz2;", "", "requestIds", "Ljava/util/Set;", "", "requestBodyHandlers", "Ljava/util/List;", "uriHandlers", "responseHandlers", "shuttingDown", "Z", "Companion", "d", "b", "c", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NetworkingModule extends NativeNetworkingAndroidSpec {
    private static final int CHUNK_TIMEOUT_NS = 100000000;
    private static final String CONTENT_ENCODING_HEADER_NAME = "content-encoding";
    private static final String CONTENT_TYPE_HEADER_NAME = "content-type";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final int MAX_CHUNK_SIZE_BETWEEN_FLUSHES = 8192;
    public static final String NAME = "Networking";
    private static final String REQUEST_BODY_KEY_BASE64 = "base64";
    private static final String REQUEST_BODY_KEY_FORMDATA = "formData";
    private static final String REQUEST_BODY_KEY_STRING = "string";
    private static final String REQUEST_BODY_KEY_URI = "uri";
    private static final String TAG = "Networking";
    private static final String USER_AGENT_HEADER_NAME = "user-agent";
    private static la3 customClientBuilder;
    private final OkHttpClient client;
    private final tp5 cookieHandler;
    private dz2 cookieJarContainer;
    private final String defaultUserAgent;
    private final List<b> requestBodyHandlers;
    private final Set<Integer> requestIds;
    private final List<c> responseHandlers;
    private boolean shuttingDown;
    private final List<d> uriHandlers;

    /* JADX INFO: renamed from: com.facebook.react.modules.network.NetworkingModule$a, reason: from kotlin metadata */
    public static final class Companion {
    }

    public interface b {
        boolean a(ReadableMap readableMap);

        RequestBody$Companion$toRequestBody$2 b(ReadableMap readableMap, String str);
    }

    public interface c {
        boolean a(String str);

        WritableMap b(ResponseBody responseBody);
    }

    public interface d {
        WritableMap a(Uri uri);

        boolean b(Uri uri, String str);
    }

    public static final class e implements Interceptor {
        public final /* synthetic */ String a;
        public final /* synthetic */ ReactApplicationContext b;
        public final /* synthetic */ int c;

        public e(String str, ReactApplicationContext reactApplicationContext, int i) {
            this.a = str;
            this.b = reactApplicationContext;
            this.c = i;
        }

        @Override // okhttp3.Interceptor
        public final Response intercept(Interceptor.Chain chain) {
            RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
            Response responseB = realInterceptorChain.b(realInterceptorChain.e);
            ResponseBody responseBody = responseB.V;
            if (responseBody == null) {
                r6.g("Required value was null.");
                return null;
            }
            g3c g3cVar = new g3c(responseBody, new f(this.a, this.b, this.c));
            Response.Builder builderP = responseB.p();
            builderP.g = g3cVar;
            return builderP.a();
        }
    }

    public static final class f {
        public long a = System.nanoTime();
        public final /* synthetic */ String b;
        public final /* synthetic */ ReactApplicationContext c;
        public final /* synthetic */ int d;

        public f(String str, ReactApplicationContext reactApplicationContext, int i) {
            this.b = str;
            this.c = reactApplicationContext;
            this.d = i;
        }
    }

    public static final class g implements Callback {
        public final /* synthetic */ int b;
        public final /* synthetic */ ReactApplicationContext c;
        public final /* synthetic */ String d;
        public final /* synthetic */ boolean e;

        public g(int i, ReactApplicationContext reactApplicationContext, String str, boolean z) {
            this.b = i;
            this.c = reactApplicationContext;
            this.d = str;
            this.e = z;
        }

        @Override // okhttp3.Callback
        public final void h(Call call, IOException iOException) {
            NetworkingModule networkingModule = NetworkingModule.this;
            if (networkingModule.shuttingDown) {
                return;
            }
            int i = this.b;
            networkingModule.removeRequest(i);
            String message = iOException.getMessage();
            if (message == null) {
                message = "Error while executing request: ".concat(iOException.getClass().getSimpleName());
            }
            ojh.v(this.c, i, message, iOException);
        }

        @Override // okhttp3.Callback
        public final void p(Call call, Response response) {
            String str;
            c cVar;
            Headers headers = response.f;
            Request request = response.a;
            NetworkingModule networkingModule = NetworkingModule.this;
            if (networkingModule.shuttingDown) {
                return;
            }
            int i = this.b;
            networkingModule.removeRequest(i);
            int i2 = response.d;
            NetworkingModule.INSTANCE.getClass();
            Bundle bundle = new Bundle();
            int size = headers.size();
            for (int i3 = 0; i3 < size; i3++) {
                String strB = headers.b(i3);
                if (bundle.containsKey(strB)) {
                    bundle.putString(strB, bundle.getString(strB) + ", " + headers.g(i3));
                } else {
                    bundle.putString(strB, headers.g(i3));
                }
            }
            WritableMap writableMapFromBundle = Arguments.fromBundle(bundle);
            writableMapFromBundle.getClass();
            String str2 = request.a.i;
            ReactApplicationContext reactApplicationContext = this.c;
            if (reactApplicationContext != null) {
                WritableArray writableArrayCreateArray = Arguments.createArray();
                writableArrayCreateArray.pushInt(i);
                writableArrayCreateArray.pushInt(i2);
                writableArrayCreateArray.pushMap(writableMapFromBundle);
                writableArrayCreateArray.pushString(str2);
                j6g j6gVar = j6g.a;
                reactApplicationContext.emitDeviceEvent("didReceiveNetworkResponse", writableArrayCreateArray);
            }
            try {
                ResponseBody responseBody$Companion$asResponseBody$1 = response.V;
                MediaType mediaTypeA = null;
                if (responseBody$Companion$asResponseBody$1 == null) {
                    ojh.v(reactApplicationContext, i, "Response body is null", null);
                    return;
                }
                String strA = headers.a("Content-Encoding");
                if (strA == null) {
                    strA = null;
                }
                if ("gzip".equalsIgnoreCase(strA)) {
                    je6 je6Var = new je6(responseBody$Companion$asResponseBody$1.getE());
                    String strA2 = headers.a(TracingInterceptor.HEADER_CT);
                    if (strA2 == null) {
                        strA2 = null;
                    }
                    if (strA2 != null) {
                        MediaType.e.getClass();
                        try {
                            mediaTypeA = MediaType.Companion.a(strA2);
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                    ResponseBody.Companion companion = ResponseBody.b;
                    uqc uqcVar = new uqc(je6Var);
                    companion.getClass();
                    responseBody$Companion$asResponseBody$1 = new ResponseBody$Companion$asResponseBody$1(mediaTypeA, -1L, uqcVar);
                }
                Iterator it = networkingModule.responseHandlers.iterator();
                do {
                    boolean zHasNext = it.hasNext();
                    str = this.d;
                    if (!zHasNext) {
                        if (this.e && str.equals("text")) {
                            networkingModule.readWithProgress(i, responseBody$Companion$asResponseBody$1);
                            ojh.w(reactApplicationContext, i);
                            return;
                        }
                        String strV = "";
                        if (str.equals("text")) {
                            try {
                                strV = responseBody$Companion$asResponseBody$1.v();
                            } catch (IOException e) {
                                if (!wve.E(request.b, "HEAD", true)) {
                                    ojh.v(reactApplicationContext, i, e.getMessage(), e);
                                }
                            }
                        } else if (str.equals(NetworkingModule.REQUEST_BODY_KEY_BASE64)) {
                            strV = Base64.encodeToString(responseBody$Companion$asResponseBody$1.h(), 2);
                        }
                        if (reactApplicationContext != null) {
                            WritableArray writableArrayCreateArray2 = Arguments.createArray();
                            writableArrayCreateArray2.getClass();
                            ReadableArrayBuilder readableArrayBuilder = new ReadableArrayBuilder(writableArrayCreateArray2);
                            readableArrayBuilder.add(i);
                            readableArrayBuilder.add(strV);
                            j6g j6gVar2 = j6g.a;
                            reactApplicationContext.emitDeviceEvent("didReceiveNetworkData", writableArrayCreateArray2);
                        }
                        ojh.w(reactApplicationContext, i);
                        return;
                    }
                    cVar = (c) it.next();
                } while (!cVar.a(str));
                WritableMap writableMapB = cVar.b(responseBody$Companion$asResponseBody$1);
                if (reactApplicationContext != null) {
                    WritableArray writableArrayCreateArray3 = Arguments.createArray();
                    writableArrayCreateArray3.pushInt(i);
                    writableArrayCreateArray3.pushMap(writableMapB);
                    j6g j6gVar3 = j6g.a;
                    reactApplicationContext.emitDeviceEvent("didReceiveNetworkData", writableArrayCreateArray3);
                }
                ojh.w(reactApplicationContext, i);
            } catch (IOException e2) {
                ojh.v(reactApplicationContext, i, e2.getMessage(), e2);
            }
        }
    }

    public static final class h {
        public long a = System.nanoTime();
        public final /* synthetic */ ReactApplicationContext b;
        public final /* synthetic */ int c;

        public h(ReactApplicationContext reactApplicationContext, int i) {
            this.b = reactApplicationContext;
            this.c = i;
        }

        public final void a(long j, long j2, boolean z) {
            long jNanoTime = System.nanoTime();
            if (!z) {
                Companion companion = NetworkingModule.INSTANCE;
                long j3 = this.a;
                companion.getClass();
                if (j3 + 100000000 >= jNanoTime) {
                    return;
                }
            }
            ReactApplicationContext reactApplicationContext = this.b;
            if (reactApplicationContext != null) {
                WritableArray writableArrayCreateArray = Arguments.createArray();
                writableArrayCreateArray.getClass();
                ReadableArrayBuilder readableArrayBuilder = new ReadableArrayBuilder(writableArrayCreateArray);
                readableArrayBuilder.add(this.c);
                readableArrayBuilder.add((int) j);
                readableArrayBuilder.add((int) j2);
                j6g j6gVar = j6g.a;
                reactApplicationContext.emitDeviceEvent("didSendNetworkData", writableArrayCreateArray);
            }
            this.a = jNanoTime;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkingModule(ReactApplicationContext reactApplicationContext, String str, OkHttpClient okHttpClient, List<? extends jga> list) {
        super(reactApplicationContext);
        reactApplicationContext.getClass();
        okHttpClient.getClass();
        this.cookieHandler = new tp5();
        this.requestIds = new HashSet();
        this.requestBodyHandlers = new ArrayList();
        this.uriHandlers = new ArrayList();
        this.responseHandlers = new ArrayList();
        if (list != null) {
            OkHttpClient.Builder builderE = okHttpClient.e();
            Iterator<? extends jga> it = list.iterator();
            while (it.hasNext()) {
                Interceptor interceptorCreate = it.next().create();
                interceptorCreate.getClass();
                builderE.d.add(interceptorCreate);
            }
            okHttpClient = new OkHttpClient(builderE);
        }
        this.client = okHttpClient;
        CookieJar cookieJar = okHttpClient.Y;
        this.cookieJarContainer = cookieJar instanceof dz2 ? (dz2) cookieJar : null;
        this.defaultUserAgent = str;
    }

    public static final /* synthetic */ la3 access$getCustomClientBuilder$cp() {
        return null;
    }

    public static final /* synthetic */ void access$setCustomClientBuilder$cp(la3 la3Var) {
    }

    private final synchronized void addRequest(int requestId) {
        this.requestIds.add(Integer.valueOf(requestId));
    }

    private final synchronized void cancelAllRequests() {
        try {
            Iterator<Integer> it = this.requestIds.iterator();
            while (it.hasNext()) {
                cancelRequest(it.next().intValue());
            }
            this.requestIds.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void cancelRequest(int requestId) {
        List<Call> listUnmodifiableList;
        List<Call> listUnmodifiableList2;
        OkHttpClient okHttpClient = this.client;
        Integer numValueOf = Integer.valueOf(requestId);
        okHttpClient.getClass();
        Dispatcher dispatcher = okHttpClient.a;
        synchronized (dispatcher) {
            try {
                ArrayDeque<RealCall.AsyncCall> arrayDeque = dispatcher.c;
                ArrayList arrayList = new ArrayList(t92.r0(arrayDeque, 10));
                Iterator<RealCall.AsyncCall> it = arrayDeque.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().c);
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
                listUnmodifiableList.getClass();
            } finally {
            }
        }
        for (Call call : listUnmodifiableList) {
            if (numValueOf.equals(Object.class.cast(call.getB().e.get(Object.class)))) {
                call.cancel();
                return;
            }
        }
        synchronized (dispatcher) {
            try {
                ArrayDeque<RealCall> arrayDeque2 = dispatcher.e;
                ArrayDeque<RealCall.AsyncCall> arrayDeque3 = dispatcher.d;
                ArrayList arrayList2 = new ArrayList(t92.r0(arrayDeque3, 10));
                Iterator<RealCall.AsyncCall> it2 = arrayDeque3.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(it2.next().c);
                }
                listUnmodifiableList2 = Collections.unmodifiableList(z92.h1(arrayDeque2, arrayList2));
                listUnmodifiableList2.getClass();
            } finally {
            }
        }
        for (Call call2 : listUnmodifiableList2) {
            if (numValueOf.equals(Object.class.cast(call2.getB().e.get(Object.class)))) {
                call2.cancel();
                return;
            }
        }
    }

    private final MultipartBody.Builder constructMultipartBody(ReadableArray body, String contentType, int requestId) {
        MediaType mediaTypeA;
        MediaType mediaTypeA2;
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        MultipartBody.Builder builder = new MultipartBody.Builder(0);
        MediaType.e.getClass();
        contentType.getClass();
        try {
            mediaTypeA = MediaType.Companion.a(contentType);
        } catch (IllegalArgumentException unused) {
            mediaTypeA = null;
        }
        if (mediaTypeA == null) {
            ojh.v(reactApplicationContextIfActiveOrWarn, requestId, "Invalid media type.", null);
            return null;
        }
        builder.b(mediaTypeA);
        int size = body.size();
        for (int i = 0; i < size; i++) {
            ReadableMap map = body.getMap(i);
            if (map == null) {
                ojh.v(reactApplicationContextIfActiveOrWarn, requestId, "Unrecognized FormData part.", null);
                return null;
            }
            Headers headersExtractHeaders = extractHeaders(map.getArray("headers"), null);
            if (headersExtractHeaders == null) {
                ojh.v(reactApplicationContextIfActiveOrWarn, requestId, "Missing or invalid header format for FormData part.", null);
                return null;
            }
            String strA = headersExtractHeaders.a(CONTENT_TYPE_HEADER_NAME);
            if (strA != null) {
                MediaType.e.getClass();
                try {
                    mediaTypeA2 = MediaType.Companion.a(strA);
                } catch (IllegalArgumentException unused2) {
                    mediaTypeA2 = null;
                }
                Headers.Builder builderD = headersExtractHeaders.d();
                builderD.g(CONTENT_TYPE_HEADER_NAME);
                headersExtractHeaders = builderD.e();
            } else {
                mediaTypeA2 = null;
            }
            boolean zHasKey = map.hasKey(REQUEST_BODY_KEY_STRING);
            ArrayList arrayList = builder.c;
            if (zHasKey && map.getString(REQUEST_BODY_KEY_STRING) != null) {
                String string = map.getString(REQUEST_BODY_KEY_STRING);
                if (string == null) {
                    string = "";
                }
                RequestBody.INSTANCE.getClass();
                RequestBody$Companion$toRequestBody$2 requestBody$Companion$toRequestBody$2A = RequestBody.Companion.a(string, mediaTypeA2);
                MultipartBody.Part.c.getClass();
                arrayList.add(MultipartBody.Part.Companion.a(headersExtractHeaders, requestBody$Companion$toRequestBody$2A));
            } else if (!map.hasKey(REQUEST_BODY_KEY_URI) || map.getString(REQUEST_BODY_KEY_URI) == null) {
                ojh.v(reactApplicationContextIfActiveOrWarn, requestId, "Unrecognized FormData part.", null);
                j6g j6gVar = j6g.a;
            } else {
                if (mediaTypeA2 == null) {
                    ojh.v(reactApplicationContextIfActiveOrWarn, requestId, "Binary FormData part needs a content-type header.", null);
                    return null;
                }
                String string2 = map.getString(REQUEST_BODY_KEY_URI);
                if (string2 == null) {
                    ojh.v(reactApplicationContextIfActiveOrWarn, requestId, "Body must have a valid file uri", null);
                    return null;
                }
                ReactApplicationContext reactApplicationContext = getReactApplicationContext();
                reactApplicationContext.getClass();
                InputStream inputStreamC = r3d.c(reactApplicationContext, string2);
                if (inputStreamC == null) {
                    ojh.v(reactApplicationContextIfActiveOrWarn, requestId, "Could not retrieve file for uri ".concat(string2), null);
                    return null;
                }
                q3d q3dVar = new q3d(mediaTypeA2, inputStreamC);
                MultipartBody.Part.c.getClass();
                arrayList.add(MultipartBody.Part.Companion.a(headersExtractHeaders, q3dVar));
            }
        }
        return builder;
    }

    private final Headers extractHeaders(ReadableArray headersArray, ReadableMap requestData) {
        String str;
        if (headersArray == null) {
            return null;
        }
        Headers.Builder builder = new Headers.Builder();
        int size = headersArray.size();
        for (int i = 0; i < size; i++) {
            ReadableArray array = headersArray.getArray(i);
            if (array == null || array.size() != 2) {
                return null;
            }
            String string = array.getString(0);
            if (string != null) {
                StringBuilder sb = new StringBuilder(string.length());
                int length = string.length();
                boolean z = false;
                for (int i2 = 0; i2 < length; i2++) {
                    char cCharAt = string.charAt(i2);
                    if (wl7.c(cCharAt, 32) <= 0 || wl7.c(cCharAt, 127) >= 0) {
                        z = true;
                    } else {
                        sb.append(cCharAt);
                    }
                }
                if (z) {
                    string = sb.toString();
                }
            }
            String string2 = array.getString(1);
            if (string == null || string2 == null) {
                return null;
            }
            builder.d(string, string2);
        }
        if (builder.f(USER_AGENT_HEADER_NAME) == null && (str = this.defaultUserAgent) != null) {
            builder.a(USER_AGENT_HEADER_NAME, str);
        }
        if (requestData == null || !requestData.hasKey(REQUEST_BODY_KEY_STRING)) {
            builder.g(CONTENT_ENCODING_HEADER_NAME);
        }
        return builder.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void readWithProgress(int requestId, ResponseBody responseBody) throws IOException {
        long j;
        Charset charsetA;
        long d2 = -1;
        try {
            responseBody.getClass();
            g3c g3cVar = (g3c) responseBody;
            j = g3cVar.f;
            try {
                d2 = g3cVar.c.getD();
            } catch (ClassCastException unused) {
            }
        } catch (ClassCastException unused2) {
            j = -1;
        }
        if (responseBody.getC() == null) {
            charsetA = StandardCharsets.UTF_8;
        } else {
            MediaType c2 = responseBody.getC();
            charsetA = c2 != null ? c2.a(StandardCharsets.UTF_8) : null;
            if (charsetA == null) {
                r40.g(responseBody.getC(), "Null character set for Content-Type: ");
                return;
            }
        }
        charsetA.getClass();
        cbe cbeVar = new cbe();
        CharsetDecoder charsetDecoderNewDecoder = charsetA.newDecoder();
        charsetDecoderNewDecoder.getClass();
        cbeVar.a = charsetDecoderNewDecoder;
        InputStream inputStreamA = responseBody.a();
        try {
            byte[] bArr = new byte[MAX_CHUNK_SIZE_BETWEEN_FLUSHES];
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
            while (true) {
                int i = inputStreamA.read(bArr);
                if (i == -1) {
                    return;
                }
                String strA = cbeVar.a(i, bArr);
                if (reactApplicationContextIfActiveOrWarn != null) {
                    WritableArray writableArrayCreateArray = Arguments.createArray();
                    writableArrayCreateArray.getClass();
                    ReadableArrayBuilder readableArrayBuilder = new ReadableArrayBuilder(writableArrayCreateArray);
                    readableArrayBuilder.add(requestId);
                    readableArrayBuilder.add(strA);
                    readableArrayBuilder.add((int) j);
                    readableArrayBuilder.add((int) d2);
                    j6g j6gVar = j6g.a;
                    reactApplicationContextIfActiveOrWarn.emitDeviceEvent("didReceiveNetworkIncrementalData", writableArrayCreateArray);
                }
            }
        } finally {
            inputStreamA.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void removeRequest(int requestId) {
        this.requestIds.remove(Integer.valueOf(requestId));
    }

    public static final void setCustomClientBuilder(la3 la3Var) {
        INSTANCE.getClass();
        access$setCustomClientBuilder$cp(la3Var);
    }

    private final RequestBody wrapRequestBodyWithProgressEmitter(RequestBody requestBody, int requestId) {
        if (requestBody == null) {
            return null;
        }
        return new e3c(requestBody, new h(getReactApplicationContextIfActiveOrWarn(), requestId));
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void abortRequest(double requestIdAsDouble) {
        int i = (int) requestIdAsDouble;
        cancelRequest(i);
        removeRequest(i);
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void addListener(String eventName) {
    }

    public final void addRequestBodyHandler$ReactAndroid_release(b handler) {
        handler.getClass();
        this.requestBodyHandlers.add(handler);
    }

    public final void addResponseHandler$ReactAndroid_release(c handler) {
        handler.getClass();
        this.responseHandlers.add(handler);
    }

    public final void addUriHandler$ReactAndroid_release(d handler) {
        handler.getClass();
        this.uriHandlers.add(handler);
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    @ReactMethod
    public void clearCookies(final com.facebook.react.bridge.Callback callback) {
        callback.getClass();
        tp5 tp5Var = this.cookieHandler;
        tp5Var.getClass();
        CookieManager cookieManagerA = tp5Var.a();
        if (cookieManagerA != null) {
            cookieManagerA.removeAllCookies(new ValueCallback() { // from class: sp5
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    callback.invoke((Boolean) obj);
                }
            });
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        dz2 dz2Var = this.cookieJarContainer;
        if (dz2Var != null) {
            dz2Var.c(new JavaNetCookieJar(this.cookieHandler));
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        this.shuttingDown = true;
        cancelAllRequests();
        this.cookieHandler.getClass();
        dz2 dz2Var = this.cookieJarContainer;
        if (dz2Var != null) {
            dz2Var.a();
        }
        this.requestBodyHandlers.clear();
        this.responseHandlers.clear();
        this.uriHandlers.clear();
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void removeListeners(double count) {
    }

    public final void removeRequestBodyHandler$ReactAndroid_release(b handler) {
        handler.getClass();
        this.requestBodyHandlers.remove(handler);
    }

    public final void removeResponseHandler$ReactAndroid_release(c handler) {
        handler.getClass();
        this.responseHandlers.remove(handler);
    }

    public final void removeUriHandler$ReactAndroid_release(d handler) {
        handler.getClass();
        this.uriHandlers.remove(handler);
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void sendRequest(String method, String url, double requestIdAsDouble, ReadableArray headers, ReadableMap data, String responseType, boolean useIncrementalUpdates, double timeoutAsDouble, boolean withCredentials) {
        q6.m(method, url, responseType);
        int i = (int) requestIdAsDouble;
        try {
            sendRequestInternal(method, url, i, headers, data, responseType, useIncrementalUpdates, (int) timeoutAsDouble, withCredentials);
        } catch (Throwable th) {
            s55.g("Networking", "Failed to send url request: ".concat(url), th);
            ojh.v(getReactApplicationContextIfActiveOrWarn(), i, th.getMessage(), th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void sendRequestInternal(java.lang.String r17, java.lang.String r18, int r19, com.facebook.react.bridge.ReadableArray r20, com.facebook.react.bridge.ReadableMap r21, java.lang.String r22, boolean r23, int r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 677
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.network.NetworkingModule.sendRequestInternal(java.lang.String, java.lang.String, int, com.facebook.react.bridge.ReadableArray, com.facebook.react.bridge.ReadableMap, java.lang.String, boolean, int, boolean):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NetworkingModule(ReactApplicationContext reactApplicationContext, String str, OkHttpClient okHttpClient) {
        this(reactApplicationContext, str, okHttpClient, null);
        reactApplicationContext.getClass();
        okHttpClient.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NetworkingModule(ReactApplicationContext reactApplicationContext) {
        reactApplicationContext.getClass();
        Context applicationContext = reactApplicationContext.getApplicationContext();
        applicationContext.getClass();
        this(reactApplicationContext, null, fpa.a(applicationContext), null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NetworkingModule(ReactApplicationContext reactApplicationContext, List<? extends jga> list) {
        reactApplicationContext.getClass();
        Context applicationContext = reactApplicationContext.getApplicationContext();
        applicationContext.getClass();
        this(reactApplicationContext, null, fpa.a(applicationContext), list);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NetworkingModule(ReactApplicationContext reactApplicationContext, String str) {
        reactApplicationContext.getClass();
        Context applicationContext = reactApplicationContext.getApplicationContext();
        applicationContext.getClass();
        this(reactApplicationContext, str, fpa.a(applicationContext), null);
    }
}
