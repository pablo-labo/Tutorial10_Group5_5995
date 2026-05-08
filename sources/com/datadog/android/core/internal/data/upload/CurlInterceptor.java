package com.datadog.android.core.internal.data.upload;

import android.util.Log;
import defpackage.bs4;
import defpackage.j6g;
import defpackage.mj8;
import defpackage.u63;
import defpackage.zn1;
import defpackage.zr4;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\u0012B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/CurlInterceptor;", "Lokhttp3/Interceptor;", "", "printBody", "Lkotlin/Function1;", "", "Lj6g;", "output", "<init>", "(ZLkotlin/jvm/functions/Function1;)V", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "Z", "Lkotlin/jvm/functions/Function1;", "Companion", "CurlBuilder", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class CurlInterceptor implements Interceptor {
    private static final String CONTENT_TYPE = "Content-Type";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String FORMAT_BODY = "-d '%1$s'";
    private static final String FORMAT_HEADER = "-H \"%1$s:%2$s\"";
    private static final String FORMAT_METHOD = "-X %1$s";
    private static final String FORMAT_URL = "\"%1$s\"";
    private final Function1<String, j6g> output;
    private final boolean printBody;

    public /* synthetic */ CurlInterceptor(boolean z, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? AnonymousClass1.INSTANCE : function1);
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        chain.getClass();
        Request e = chain.getE();
        this.output.invoke(new CurlBuilder(e.b().b(), this.printBody).toCommand());
        return chain.b(e);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/CurlInterceptor$Companion;", "", "()V", "CONTENT_TYPE", "", "FORMAT_BODY", "FORMAT_HEADER", "FORMAT_METHOD", "FORMAT_URL", "peekBody", "body", "Lokhttp3/RequestBody;", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String peekBody(RequestBody body) {
            if (body == null) {
                return null;
            }
            try {
                zn1 zn1Var = new zn1();
                Charset charsetDefaultCharset = Charset.defaultCharset();
                charsetDefaultCharset.getClass();
                body.writeTo(zn1Var);
                return zn1Var.h0(zn1Var.b, charsetDefaultCharset);
            } catch (IOException e) {
                return "Error while reading body: " + e;
            } catch (IllegalArgumentException e2) {
                return "Error while reading body: " + e2;
            }
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.data.upload.CurlInterceptor$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lj6g;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class AnonymousClass1 extends mj8 implements Function1<String, j6g> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            str.getClass();
            Log.i("Curl", str);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ j6g invoke(String str) {
            invoke2(str);
            return j6g.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CurlInterceptor(boolean z, Function1<? super String, j6g> function1) {
        function1.getClass();
        this.printBody = z;
        this.output = function1;
    }

    public CurlInterceptor() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006BQ\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u001a\b\u0002\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000f0\u000e\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0010J\u0006\u0010\u001b\u001a\u00020\bJ\u0012\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u000f*\u00020\fH\u0002R\u0013\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R#\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/CurlInterceptor$CurlBuilder;", "", "request", "Lokhttp3/Request;", "printBody", "", "(Lokhttp3/Request;Z)V", "url", "", "method", "contentType", "requestBody", "Lokhttp3/RequestBody;", "headers", "", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokhttp3/RequestBody;Ljava/util/Map;Z)V", "getContentType", "()Ljava/lang/String;", "getHeaders", "()Ljava/util/Map;", "getMethod", "getPrintBody", "()Z", "getRequestBody", "()Lokhttp3/RequestBody;", "getUrl", "toCommand", "toParts", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class CurlBuilder {
        private final String contentType;
        private final Map<String, List<String>> headers;
        private final String method;
        private final boolean printBody;
        private final RequestBody requestBody;
        private final String url;

        /* JADX WARN: Illegal instructions before constructor call */
        public CurlBuilder(Request request, boolean z) {
            MediaType c;
            request.getClass();
            String str = request.a.i;
            String str2 = request.b;
            RequestBody requestBody = request.d;
            this(str, str2, (requestBody == null || (c = requestBody.getC()) == null) ? null : c.a, request.d, request.c.f(), z);
        }

        private final List<String> toParts(RequestBody requestBody) {
            if (!(requestBody instanceof MultipartBody)) {
                return this.printBody ? u63.Z(String.format(Locale.US, CurlInterceptor.FORMAT_BODY, Arrays.copyOf(new Object[]{CurlInterceptor.INSTANCE.peekBody(requestBody)}, 1))) : zr4.a;
            }
            ArrayList arrayList = new ArrayList();
            for (MultipartBody.Part part : ((MultipartBody) requestBody).b) {
                for (Map.Entry entry : part.a.f().entrySet()) {
                    arrayList.add(String.format(Locale.US, CurlInterceptor.FORMAT_HEADER, Arrays.copyOf(new Object[]{(String) entry.getKey(), (List) entry.getValue()}, 2)));
                }
                if (this.printBody) {
                    arrayList.add(String.format(Locale.US, CurlInterceptor.FORMAT_BODY, Arrays.copyOf(new Object[]{CurlInterceptor.INSTANCE.peekBody(part.b)}, 1)));
                }
            }
            return arrayList;
        }

        public final String getContentType() {
            return this.contentType;
        }

        public final Map<String, List<String>> getHeaders() {
            return this.headers;
        }

        public final String getMethod() {
            return this.method;
        }

        public final boolean getPrintBody() {
            return this.printBody;
        }

        public final RequestBody getRequestBody() {
            return this.requestBody;
        }

        public final String getUrl() {
            return this.url;
        }

        public final String toCommand() {
            List<String> parts;
            StringBuilder sb = new StringBuilder("curl ");
            Locale locale = Locale.US;
            String str = this.method;
            locale.getClass();
            String upperCase = str.toUpperCase(locale);
            upperCase.getClass();
            sb.append(String.format(locale, CurlInterceptor.FORMAT_METHOD, Arrays.copyOf(new Object[]{upperCase}, 1)));
            sb.append(' ');
            for (Map.Entry<String, List<String>> entry : this.headers.entrySet()) {
                String key = entry.getKey();
                Iterator<T> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    sb.append(String.format(Locale.US, CurlInterceptor.FORMAT_HEADER, Arrays.copyOf(new Object[]{key, (String) it.next()}, 2)));
                    sb.append(' ');
                }
            }
            if (this.contentType != null && !this.headers.containsKey("Content-Type")) {
                sb.append(String.format(Locale.US, CurlInterceptor.FORMAT_HEADER, Arrays.copyOf(new Object[]{"Content-Type", this.contentType}, 2)));
                sb.append(' ');
            }
            RequestBody requestBody = this.requestBody;
            if (requestBody != null && (parts = toParts(requestBody)) != null) {
                Iterator<T> it2 = parts.iterator();
                while (it2.hasNext()) {
                    sb.append((String) it2.next());
                    sb.append(' ');
                }
            }
            sb.append(String.format(Locale.US, CurlInterceptor.FORMAT_URL, Arrays.copyOf(new Object[]{this.url}, 1)));
            return sb.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CurlBuilder(String str, String str2, String str3, RequestBody requestBody, Map<String, ? extends List<String>> map, boolean z) {
            str.getClass();
            str2.getClass();
            map.getClass();
            this.url = str;
            this.method = str2;
            this.contentType = str3;
            this.requestBody = requestBody;
            this.headers = map;
            this.printBody = z;
        }

        public /* synthetic */ CurlBuilder(String str, String str2, String str3, RequestBody requestBody, Map map, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : requestBody, (i & 16) != 0 ? bs4.a : map, z);
        }
    }
}
