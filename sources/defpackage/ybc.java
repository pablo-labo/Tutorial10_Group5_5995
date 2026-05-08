package defpackage;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import defpackage.fcc;
import defpackage.wbc;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class ybc extends WebViewClient {
    public boolean a;
    public wbc.c b;
    public String c;
    public rbc d;

    public final WritableMap a(WebView webView, String str) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("target", icc.a(webView));
        writableMapCreateMap.putString("url", str);
        writableMapCreateMap.putBoolean("loading", (this.a || webView.getProgress() == 100) ? false : true);
        writableMapCreateMap.putString("title", webView.getTitle());
        writableMapCreateMap.putBoolean("canGoBack", webView.canGoBack());
        writableMapCreateMap.putBoolean("canGoForward", webView.canGoForward());
        return writableMapCreateMap;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        super.doUpdateVisitedHistory(webView, str, z);
        ((wbc) webView).a(webView, new iof(icc.a(webView), a(webView, str)));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        String str2;
        super.onPageFinished(webView, str);
        if (CookieManager.getInstance().getCookie(str) != null) {
            CookieManager.getInstance().flush();
        }
        if (this.a) {
            return;
        }
        wbc wbcVar = (wbc) webView;
        if (wbcVar.getSettings().getJavaScriptEnabled() && (str2 = wbcVar.a) != null && !TextUtils.isEmpty(str2)) {
            wbcVar.evaluateJavascript("(function() {\n" + wbcVar.a + ";\n})();", null);
            wbcVar.b();
        }
        int iA = icc.a(webView);
        dmc.e((ReactContext) webView.getContext(), iA).a(new gof(iA, a(webView, str)));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        String str2;
        super.onPageStarted(webView, str, bitmap);
        this.a = false;
        wbc wbcVar = (wbc) webView;
        if (!wbcVar.getSettings().getJavaScriptEnabled() || (str2 = wbcVar.b) == null || TextUtils.isEmpty(str2)) {
            return;
        }
        wbcVar.evaluateJavascript("(function() {\n" + wbcVar.b + ";\n})();", null);
        wbcVar.b();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        String str3 = this.c;
        if (str3 != null && str2.equals(str3) && i == -1 && str.equals("net::ERR_FAILED")) {
            this.c = null;
            return;
        }
        super.onReceivedError(webView, i, str, str2);
        this.a = true;
        int iA = icc.a(webView);
        dmc.e((ReactContext) webView.getContext(), iA).a(new gof(iA, a(webView, str2)));
        WritableMap writableMapA = a(webView, str2);
        writableMapA.putDouble("code", i);
        writableMapA.putString("description", str);
        int iA2 = icc.a(webView);
        dmc.e((ReactContext) webView.getContext(), iA2).a(new fof(iA2, writableMapA));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        rbc rbcVar = this.d;
        if (rbcVar != null) {
            httpAuthHandler.proceed(rbcVar.a, rbcVar.b);
        } else {
            super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webResourceRequest.isForMainFrame()) {
            WritableMap writableMapA = a(webView, webResourceRequest.getUrl().toString());
            writableMapA.putInt("statusCode", webResourceResponse.getStatusCode());
            writableMapA.putString("description", webResourceResponse.getReasonPhrase());
            int iA = icc.a(webView);
            dmc.e((ReactContext) webView.getContext(), iA).a(new w7f(iA, writableMapA));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        String url = webView.getUrl();
        String url2 = sslError.getUrl();
        sslErrorHandler.cancel();
        if (url.equalsIgnoreCase(url2)) {
            int primaryError = sslError.getPrimaryError();
            onReceivedError(webView, primaryError, "SSL error: ".concat(primaryError != 0 ? primaryError != 1 ? primaryError != 2 ? primaryError != 3 ? primaryError != 4 ? primaryError != 5 ? "Unknown SSL Error" : "A generic error occurred" : "The date of the certificate is invalid" : "The certificate authority is not trusted" : "Hostname mismatch" : "The certificate has expired" : "The certificate is not yet valid"), url2);
        } else {
            Log.w("RNCWebViewClient", "Resource blocked from loading due to SSL error. Blocked URL: " + url2);
        }
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        super.onRenderProcessGone(webView, renderProcessGoneDetail);
        if (renderProcessGoneDetail.didCrash()) {
            Log.e("RNCWebViewClient", "The WebView rendering process crashed.");
        } else {
            Log.w("RNCWebViewClient", "The WebView rendering process was killed by the system.");
        }
        if (webView == null) {
            return true;
        }
        WritableMap writableMapA = a(webView, webView.getUrl());
        writableMapA.putBoolean("didCrash", renderProcessGoneDetail.didCrash());
        int iA = icc.a(webView);
        dmc.e((ReactContext) webView.getContext(), iA).a(new uof(iA, writableMapA));
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        double d;
        AtomicReference<fcc.b.a> atomicReference;
        Double dValueOf;
        wbc wbcVar = (wbc) webView;
        if (wbcVar.getReactApplicationContext().getJavaScriptContextHolder().getContext() == 0 || wbcVar.V == null) {
            s55.n("RNCWebViewClient", "Couldn't use blocking synchronous call for onShouldStartLoadWithRequest due to debugging or missing Catalyst instance, falling back to old event-and-load.");
            this.b.a = true;
            int iA = icc.a(webView);
            dmc.e((ReactContext) webView.getContext(), iA).a(new vof(iA, a(webView, str)));
            return true;
        }
        fcc.b bVar = fcc.V;
        synchronized (bVar) {
            d = bVar.a;
            bVar.a = 1.0d + d;
            atomicReference = new AtomicReference<>(fcc.b.a.a);
            bVar.b.put(Double.valueOf(d), atomicReference);
            dValueOf = Double.valueOf(d);
        }
        WritableMap writableMapA = a(webView, str);
        writableMapA.putDouble("lockIdentifier", d);
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putMap("nativeEvent", writableMapA);
        writableNativeMap.putString("messagingModuleName", wbcVar.f);
        wbcVar.V.onShouldStartLoadWithRequest(writableNativeMap);
        try {
            synchronized (atomicReference) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                while (atomicReference.get() == fcc.b.a.a) {
                    if (SystemClock.elapsedRealtime() - jElapsedRealtime > 250) {
                        s55.n("RNCWebViewClient", "Did not receive response to shouldOverrideUrlLoading in time, defaulting to allow loading.");
                        fcc.b bVar2 = fcc.V;
                        synchronized (bVar2) {
                            bVar2.b.remove(dValueOf);
                        }
                        return false;
                    }
                    atomicReference.wait(250L);
                }
                boolean z = atomicReference.get() == fcc.b.a.b;
                fcc.b bVar3 = fcc.V;
                synchronized (bVar3) {
                    bVar3.b.remove(dValueOf);
                }
                return z;
            }
        } catch (InterruptedException e) {
            s55.g("RNCWebViewClient", "shouldOverrideUrlLoading was interrupted while waiting for result.", e);
            fcc.b bVar4 = fcc.V;
            synchronized (bVar4) {
                bVar4.b.remove(dValueOf);
                return false;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(24)
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }
}
