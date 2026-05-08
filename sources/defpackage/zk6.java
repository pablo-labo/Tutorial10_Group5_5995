package defpackage;

import android.net.Uri;
import android.webkit.CookieManager;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.datadog.android.log.Logger;
import com.datadog.android.okhttp.trace.TracingInterceptor;
import com.datadog.android.rum.internal.utils.ViewUtilsKt;
import com.indeed.android.backendservices.common.api.ApiError;
import com.indeed.android.backendservices.common.api.ErrorData;
import defpackage.cd4;
import defpackage.dm6;
import defpackage.rk6;
import defpackage.sp7;
import defpackage.xh8;
import defpackage.zl6;
import java.util.Map;
import kotlin.Pair;
import okhttp3.HttpUrl;
import okhttp3.Request;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes2.dex */
public final class zk6 implements xh8 {
    public static void b(ApiError apiError, Request request) {
        String code;
        String str;
        HttpUrl httpUrl;
        String str2;
        byte b;
        boolean z;
        long size;
        String code2;
        HttpUrl httpUrl2;
        apiError.getClass();
        dd4 dd4Var = dd4.a;
        ad4 ad4Var = dd4.n().a;
        ad4Var.getClass();
        int iE = ad4Var.e(cd4.a.z1);
        int value = cd4.c0.a.getValue();
        String str3 = ViewUtilsKt.UNKNOWN_DESTINATION_URL;
        long j = 0;
        if (iE != value) {
            tp7 tp7Var = (tp7) cr8.p(tp7.class);
            String str4 = (request == null || (httpUrl = request.a) == null) ? ViewUtilsKt.UNKNOWN_DESTINATION_URL : httpUrl.i;
            String str5 = (request == null || (str = request.b) == null) ? ViewUtilsKt.UNKNOWN_DESTINATION_URL : str;
            cq7 cq7Var = new cq7(System.currentTimeMillis(), request != null ? request.c.size() : 0L, 0L, ViewUtilsKt.UNKNOWN_DESTINATION_URL);
            long jCurrentTimeMillis = System.currentTimeMillis();
            ErrorData error = apiError.getError();
            if (error != null && (code = error.getCode()) != null) {
                j = Long.parseLong(code);
            }
            dq7 dq7Var = new dq7(jCurrentTimeMillis, 0L, 0L, "application/json", 0L, j);
            String message = apiError.getCause().getMessage();
            if (message != null) {
                str3 = message;
            }
            tp7Var.b(new sp7.d(str4, str5, cq7Var, dq7Var, "Http Api received an error response: ".concat(str3)));
            return;
        }
        tp7 tp7Var2 = (tp7) cr8.p(tp7.class);
        rk6.a aVar = new rk6.a(rk6.a, rk6.b);
        String str6 = (request == null || (httpUrl2 = request.a) == null) ? ViewUtilsKt.UNKNOWN_DESTINATION_URL : httpUrl2.i;
        g.f[] fVarArr = aVar.b;
        g.f fVar = fVarArr[2];
        aVar.e = str6;
        boolean[] zArr = aVar.c;
        zArr[2] = true;
        if (request == null || (str2 = request.b) == null) {
            str2 = ViewUtilsKt.UNKNOWN_DESTINATION_URL;
        }
        g.f fVar2 = fVarArr[3];
        aVar.f = str2;
        zArr[3] = true;
        zl6.a aVar2 = new zl6.a(zl6.a, zl6.b);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        g.f[] fVarArr2 = aVar2.b;
        g.f fVar3 = fVarArr2[0];
        aVar2.e = jCurrentTimeMillis2;
        boolean[] zArr2 = aVar2.c;
        zArr2[0] = true;
        if (request != null) {
            b = 2;
            z = true;
            size = request.c.size();
        } else {
            b = 2;
            z = true;
            size = 0;
        }
        g.f fVar4 = fVarArr2[z ? 1 : 0];
        aVar2.f = size;
        zArr2[z ? 1 : 0] = z;
        g.f fVar5 = fVarArr2[b];
        aVar2.g = 0L;
        zArr2[b] = z;
        g.f fVar6 = fVarArr2[3];
        aVar2.h = ViewUtilsKt.UNKNOWN_DESTINATION_URL;
        zArr2[3] = z;
        aVar.g = null;
        zArr[4] = false;
        aVar.g = aVar2;
        dm6.a aVar3 = new dm6.a(dm6.a, dm6.b);
        long jCurrentTimeMillis3 = System.currentTimeMillis();
        g.f[] fVarArr3 = aVar3.b;
        g.f fVar7 = fVarArr3[0];
        aVar3.e = jCurrentTimeMillis3;
        boolean[] zArr3 = aVar3.c;
        zArr3[0] = z;
        g.f fVar8 = fVarArr3[z ? 1 : 0];
        aVar3.f = 0L;
        zArr3[z ? 1 : 0] = z;
        g.f fVar9 = fVarArr3[b];
        aVar3.g = 0L;
        zArr3[b] = z;
        g.f fVar10 = fVarArr3[3];
        aVar3.h = "application/json";
        zArr3[3] = z;
        g.f fVar11 = fVarArr3[4];
        aVar3.i = 0L;
        zArr3[4] = z;
        ErrorData error2 = apiError.getError();
        if (error2 != null && (code2 = error2.getCode()) != null) {
            j = Long.parseLong(code2);
        }
        g.f fVar12 = fVarArr3[5];
        aVar3.j = j;
        zArr3[5] = z;
        aVar.h = null;
        zArr[5] = false;
        aVar.h = aVar3;
        String message2 = apiError.getCause().getMessage();
        if (message2 != null) {
            str3 = message2;
        }
        String strConcat = "Http Api received an error response: ".concat(str3);
        g.f fVar13 = fVarArr[6];
        aVar.i = strConcat;
        zArr[6] = z;
        tp7Var2.c(aVar.c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        Uri url;
        long j;
        long length;
        String str;
        Map<String, String> responseHeaders;
        String str2;
        Map<String, String> responseHeaders2;
        Map<String, String> responseHeaders3;
        String str3;
        Long lC;
        Map<String, String> responseHeaders4;
        g.f[] fVarArr;
        long size;
        String str4;
        Map<String, String> responseHeaders5;
        String str5;
        Map<String, String> responseHeaders6;
        Map<String, String> responseHeaders7;
        String str6;
        Long lC2;
        Map<String, String> responseHeaders8;
        if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) {
            return;
        }
        String string = url.toString();
        string.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String cookie = CookieManager.getInstance().getCookie(string);
        r97.a.getClass();
        if (!r97.j(string)) {
            string = wea.i(false, url);
        }
        Logger.i$default((Logger) (this instanceof ai8 ? ((ai8) this).d() : (qpd) xh8.a.a().a.b).a(null, fwc.a.b(Logger.class), null), "webviewReceiveError", null, lc9.a0(new Pair("method", webResourceRequest.getMethod()), new Pair("responseStatusCode", webResourceResponse != null ? Long.valueOf(webResourceResponse.getStatusCode()) : null), new Pair("urlType", yhg.a.b(string, string).a.a())), 2, null);
        dd4 dd4Var = dd4.a;
        ad4 ad4Var = dd4.n().a;
        ad4Var.getClass();
        if (ad4Var.e(cd4.a.z1) != cd4.c0.a.getValue()) {
            tp7 tp7Var = (tp7) cr8.p(tp7.class);
            String method = webResourceRequest.getMethod();
            String str7 = method == null ? ViewUtilsKt.UNKNOWN_DESTINATION_URL : method;
            long size2 = webResourceRequest.getRequestHeaders() != null ? r8.size() : 0L;
            if (cookie != null) {
                j = size2;
                length = cookie.length();
            } else {
                j = size2;
                length = 0;
            }
            Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
            cq7 cq7Var = new cq7(jCurrentTimeMillis, j, length, requestHeaders != null ? requestHeaders.get("referer") : null);
            long size3 = (webResourceResponse == null || (responseHeaders4 = webResourceResponse.getResponseHeaders()) == null) ? 0L : responseHeaders4.size();
            long jLongValue = (webResourceResponse == null || (responseHeaders3 = webResourceResponse.getResponseHeaders()) == null || (str3 = responseHeaders3.get("Content-Length")) == null || (lC = vve.C(str3)) == null) ? 0L : lC.longValue();
            if (webResourceResponse == null || (responseHeaders2 = webResourceResponse.getResponseHeaders()) == null || (str = responseHeaders2.get(TracingInterceptor.HEADER_CT)) == null) {
                str = ViewUtilsKt.UNKNOWN_DESTINATION_URL;
            }
            tp7Var.b(new sp7.d(string, str7, cq7Var, new dq7(jCurrentTimeMillis, size3, jLongValue, str, (webResourceResponse == null || (responseHeaders = webResourceResponse.getResponseHeaders()) == null || (str2 = responseHeaders.get("Set-Cookie")) == null) ? 0L : str2.length(), webResourceResponse != null ? webResourceResponse.getStatusCode() : -1L), "Android webview received an error response"));
            return;
        }
        tp7 tp7Var2 = (tp7) cr8.p(tp7.class);
        rk6.a aVar = new rk6.a(rk6.a, rk6.b);
        g.f[] fVarArr2 = aVar.b;
        g.f fVar = fVarArr2[2];
        aVar.e = string;
        boolean[] zArr = aVar.c;
        zArr[2] = true;
        String method2 = webResourceRequest.getMethod();
        String str8 = method2 == null ? ViewUtilsKt.UNKNOWN_DESTINATION_URL : method2;
        g.f fVar2 = fVarArr2[3];
        aVar.f = str8;
        zArr[3] = true;
        zl6.a aVar2 = new zl6.a(zl6.a, zl6.b);
        g.f[] fVarArr3 = aVar2.b;
        g.f fVar3 = fVarArr3[0];
        aVar2.e = jCurrentTimeMillis;
        boolean[] zArr2 = aVar2.c;
        zArr2[0] = true;
        Map<String, String> requestHeaders2 = webResourceRequest.getRequestHeaders();
        if (requestHeaders2 != null) {
            fVarArr = fVarArr3;
            size = requestHeaders2.size();
        } else {
            fVarArr = fVarArr3;
            size = 0;
        }
        g.f fVar4 = fVarArr[1];
        aVar2.f = size;
        zArr2[1] = true;
        long length2 = cookie != null ? cookie.length() : 0L;
        g.f fVar5 = fVarArr[2];
        aVar2.g = length2;
        zArr2[2] = true;
        Map<String, String> requestHeaders3 = webResourceRequest.getRequestHeaders();
        String str9 = requestHeaders3 != null ? requestHeaders3.get("referer") : null;
        htc.b(fVarArr[3], str9);
        aVar2.h = str9;
        zArr2[3] = true;
        aVar.g = null;
        zArr[4] = false;
        aVar.g = aVar2;
        dm6.a aVar3 = new dm6.a(dm6.a, dm6.b);
        g.f[] fVarArr4 = aVar3.b;
        g.f fVar6 = fVarArr4[0];
        aVar3.e = jCurrentTimeMillis;
        boolean[] zArr3 = aVar3.c;
        zArr3[0] = true;
        long size4 = (webResourceResponse == null || (responseHeaders8 = webResourceResponse.getResponseHeaders()) == null) ? 0L : responseHeaders8.size();
        g.f fVar7 = fVarArr4[1];
        aVar3.f = size4;
        zArr3[1] = true;
        long jLongValue2 = (webResourceResponse == null || (responseHeaders7 = webResourceResponse.getResponseHeaders()) == null || (str6 = responseHeaders7.get("Content-Length")) == null || (lC2 = vve.C(str6)) == null) ? 0L : lC2.longValue();
        g.f fVar8 = fVarArr4[2];
        aVar3.g = jLongValue2;
        zArr3[2] = true;
        if (webResourceResponse == null || (responseHeaders6 = webResourceResponse.getResponseHeaders()) == null || (str4 = responseHeaders6.get(TracingInterceptor.HEADER_CT)) == null) {
            str4 = ViewUtilsKt.UNKNOWN_DESTINATION_URL;
        }
        g.f fVar9 = fVarArr4[3];
        aVar3.h = str4;
        zArr3[3] = true;
        long length3 = (webResourceResponse == null || (responseHeaders5 = webResourceResponse.getResponseHeaders()) == null || (str5 = responseHeaders5.get("Set-Cookie")) == null) ? 0L : str5.length();
        g.f fVar10 = fVarArr4[4];
        aVar3.i = length3;
        zArr3[4] = true;
        long statusCode = webResourceResponse != null ? webResourceResponse.getStatusCode() : -1L;
        g.f fVar11 = fVarArr4[5];
        aVar3.j = statusCode;
        zArr3[5] = true;
        aVar.h = null;
        zArr[5] = false;
        aVar.h = aVar3;
        g.f fVar12 = fVarArr2[6];
        aVar.i = "Android webview received an error response";
        zArr[6] = true;
        tp7Var2.c(aVar.c());
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
