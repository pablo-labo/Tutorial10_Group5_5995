package defpackage;

import android.content.Context;
import com.datadog.android.rum.internal.debug.UiRumDebugListener;
import com.facebook.react.bridge.ReactContext;
import expo.modules.fetch.FetchAndroidContextLostException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.URLConnection;
import java.nio.charset.Charset;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.ResponseBody$Companion$asResponseBody$1;
import okhttp3.internal.http.RealInterceptorChain;

/* JADX INFO: loaded from: classes3.dex */
public final class ipa implements Interceptor {
    public final WeakReference<Context> a;

    public ipa(ReactContext reactContext) {
        this.a = new WeakReference<>(reactContext);
    }

    public static Response a(Request request) {
        Response.Builder builder = new Response.Builder();
        builder.a = request;
        builder.b = Protocol.HTTP_1_1;
        builder.c = 404;
        builder.d = "File not found";
        ResponseBody.Companion companion = ResponseBody.b;
        MediaType.e.getClass();
        MediaType mediaTypeA = MediaType.Companion.a("text/plain");
        companion.getClass();
        Charset charset = a32.b;
        Charset charsetA = mediaTypeA.a(null);
        if (charsetA == null) {
            try {
                mediaTypeA = MediaType.Companion.a(mediaTypeA + "; charset=utf-8");
            } catch (IllegalArgumentException unused) {
                mediaTypeA = null;
            }
        } else {
            charset = charsetA;
        }
        zn1 zn1Var = new zn1();
        charset.getClass();
        if (14 > "File not found".length()) {
            s40.g("File not found".length(), o6.g(14, "endIndex > string.length: ", " > "));
        } else if (charset.equals(a32.b)) {
            zn1Var.P0(0, 14, "File not found");
        } else {
            byte[] bytes = "File not found".substring(0, 14).getBytes(charset);
            bytes.getClass();
            zn1Var.write(bytes, 0, bytes.length);
        }
        builder.g = new ResponseBody$Companion$asResponseBody$1(mediaTypeA, zn1Var.b, zn1Var);
        return builder.a();
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws FetchAndroidContextLostException {
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Request request = realInterceptorChain.e;
        String string = request.a.i;
        int iS = zve.S(string, "http://filesystem.local", 0, false, 2);
        if (iS >= 0) {
            string = zve.g0(string, iS, "http://filesystem.local".length() + iS, "file://").toString();
        }
        if (!wve.K(string, "file://", false)) {
            return realInterceptorChain.b(request);
        }
        MediaType mediaTypeA = null;
        if (!wve.K(string, "file:///android_asset/", false)) {
            File file = new File(string.substring(7));
            if (!file.exists()) {
                return a(request);
            }
            ResponseBody.Companion companion = ResponseBody.b;
            uqc uqcVar = new uqc(c0h.R(file));
            String name = file.getName();
            name.getClass();
            String strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(name);
            if (strGuessContentTypeFromName == null) {
                strGuessContentTypeFromName = "application/octet-stream";
            }
            MediaType.e.getClass();
            try {
                mediaTypeA = MediaType.Companion.a(strGuessContentTypeFromName);
            } catch (IllegalArgumentException unused) {
            }
            if (mediaTypeA == null) {
                MediaType.e.getClass();
                mediaTypeA = MediaType.Companion.a("application/octet-stream");
            }
            long length = file.length();
            companion.getClass();
            ResponseBody$Companion$asResponseBody$1 responseBody$Companion$asResponseBody$1 = new ResponseBody$Companion$asResponseBody$1(mediaTypeA, length, uqcVar);
            Response.Builder builder = new Response.Builder();
            builder.a = request;
            builder.b = Protocol.HTTP_1_1;
            builder.c = UiRumDebugListener.DEFAULT_ALPHA;
            builder.d = "OK";
            builder.g = responseBody$Companion$asResponseBody$1;
            return builder.a();
        }
        String strB0 = zve.b0(string, "file:///android_asset/");
        Context context = this.a.get();
        if (context == null) {
            throw new FetchAndroidContextLostException();
        }
        try {
            InputStream inputStreamOpen = context.getAssets().open(strB0);
            inputStreamOpen.getClass();
            ResponseBody.Companion companion2 = ResponseBody.b;
            uqc uqcVar2 = new uqc(c0h.S(inputStreamOpen));
            String strGuessContentTypeFromName2 = URLConnection.guessContentTypeFromName(strB0);
            if (strGuessContentTypeFromName2 == null) {
                strGuessContentTypeFromName2 = "application/octet-stream";
            }
            MediaType.e.getClass();
            try {
                mediaTypeA = MediaType.Companion.a(strGuessContentTypeFromName2);
            } catch (IllegalArgumentException unused2) {
            }
            if (mediaTypeA == null) {
                MediaType.e.getClass();
                mediaTypeA = MediaType.Companion.a("application/octet-stream");
            }
            companion2.getClass();
            ResponseBody$Companion$asResponseBody$1 responseBody$Companion$asResponseBody$12 = new ResponseBody$Companion$asResponseBody$1(mediaTypeA, -1L, uqcVar2);
            Response.Builder builder2 = new Response.Builder();
            builder2.a = request;
            builder2.b = Protocol.HTTP_1_1;
            builder2.c = UiRumDebugListener.DEFAULT_ALPHA;
            builder2.d = "OK";
            builder2.g = responseBody$Companion$asResponseBody$12;
            return builder2.a();
        } catch (IOException unused3) {
            return a(request);
        }
    }
}
