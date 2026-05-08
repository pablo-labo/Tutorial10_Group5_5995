package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import androidx.appcompat.app.a;
import com.indeed.android.jobsearch.webview.external.ExternalActivity;
import com.indeed.android.jobsearch.webview.external.ExternalWebView;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class i55 extends e91 {
    public final ExternalActivity V;
    public String W;

    public i55(ExternalActivity externalActivity) {
        super(externalActivity);
        this.V = externalActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        d2f d2fVar = c87.a;
        CookieManager.getInstance().flush();
        boolean zIsEmpty = TextUtils.isEmpty(null);
        ExternalActivity externalActivity = this.V;
        if (!zIsEmpty && !TextUtils.isEmpty(null)) {
            externalActivity.getClass();
            ArrayList arrayList = lz2.a;
            lz2.d("ExternalActivity", "Loading JavaScript in ExternalActivity: ".concat("javascript:null"), false, null);
            ExternalWebView externalWebView = externalActivity.w0;
            if (externalWebView == null) {
                wl7.g("externalWebView");
                throw null;
            }
            externalWebView.loadUrl("javascript:null");
        }
        ExternalWebView externalWebView2 = externalActivity.w0;
        if (externalWebView2 == null) {
            wl7.g("externalWebView");
            throw null;
        }
        externalActivity.F0 = externalWebView2.canGoForward();
        externalActivity.invalidateOptionsMenu();
        externalActivity.E0 = false;
        externalActivity.invalidateOptionsMenu();
        externalActivity.D0 = true;
        externalActivity.invalidateOptionsMenu();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        webView.getClass();
        str.getClass();
        String host = Uri.parse(str).getHost();
        if (host == null) {
            return;
        }
        ExternalActivity externalActivity = this.V;
        if (!externalActivity.isFinishing()) {
            externalActivity.E0 = true;
            externalActivity.invalidateOptionsMenu();
            externalActivity.D0 = false;
            externalActivity.invalidateOptionsMenu();
            a aVarY = externalActivity.y();
            if (aVarY != null) {
                aVarY.t(host);
            }
        }
        if (this.W != null || ((Set) e87.c.getValue()).contains(host)) {
            return;
        }
        this.W = str;
    }

    @Override // defpackage.hc1, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        webView.getClass();
        webResourceRequest.getClass();
        return !this.V.isFinishing() && super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }
}
