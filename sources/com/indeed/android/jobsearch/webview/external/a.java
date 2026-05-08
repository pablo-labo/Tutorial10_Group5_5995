package com.indeed.android.jobsearch.webview.external;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.datadog.android.rum.internal.instrumentation.gestures.WindowCallbackWrapper;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.webview.external.b;
import defpackage.boa;
import defpackage.e8;
import defpackage.fy;
import defpackage.gz4;
import defpackage.h55;
import defpackage.i55;
import defpackage.ig;
import defpackage.ixg;
import defpackage.iy2;
import defpackage.j30;
import defpackage.l12;
import defpackage.lx5;
import defpackage.lz2;
import defpackage.nxg;
import defpackage.qt8;
import defpackage.s87;
import defpackage.sug;
import defpackage.twe;
import defpackage.tx5;
import defpackage.wl7;
import defpackage.wve;
import defpackage.zb1;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends zb1 {
    public final Lazy V;
    public final tx5 W;
    public final String X;
    public final String Y;
    public final ExternalActivity f;

    /* JADX INFO: renamed from: com.indeed.android.jobsearch.webview.external.a$a, reason: collision with other inner class name */
    public static final class C0171a extends WebViewClient {
        public final /* synthetic */ WebView a;
        public final /* synthetic */ a b;

        public C0171a(WebView webView, a aVar) {
            this.a = webView;
            this.b = aVar;
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            webView.getClass();
            str.getClass();
            ArrayList arrayList = lz2.a;
            lz2.d("ExternalWebChromeClient", "onPageStarted url: ".concat(str), false, null);
            if (wve.K(str, "http:", false) || wve.K(str, "https:", false)) {
                lz2.d("ExternalWebChromeClient", "Got target URL to load from onPageStarted: ".concat(str), false, null);
                this.a.loadUrl(str);
            }
        }

        @Override // android.webkit.WebViewClient
        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            ixg.b(webView, this.b.f, renderProcessGoneDetail, "ExternalWebChromeClient");
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            webView.getClass();
            webResourceRequest.getClass();
            Uri url = webResourceRequest.getUrl();
            String string = url != null ? url.toString() : null;
            if (string == null) {
                string = "";
            }
            ArrayList arrayList = lz2.a;
            lz2.d("ExternalWebChromeClient", "shouldOverrideUrlLoading url: ".concat(string), false, null);
            if (!wve.K(string, "http:", false) && !wve.K(string, "https:", false)) {
                return false;
            }
            lz2.d("ExternalWebChromeClient", "Got target URL to load from shouldOverrideUrlLoading: ".concat(string), false, null);
            this.a.loadUrl(string);
            return true;
        }
    }

    public a(ExternalActivity externalActivity, fy fyVar) {
        super(new ig(externalActivity, 7), fyVar, null);
        this.f = externalActivity;
        this.V = boa.E(qt8.a, new h55(this));
        this.W = new tx5();
        this.X = "external-file-picker";
        this.Y = nxg.External.a();
    }

    @Override // defpackage.zb1
    public final Intent b(WebChromeClient.FileChooserParams fileChooserParams, String str) {
        Lazy<s87> lazy = s87.f;
        s87.a.a((gz4) this.V.getValue(), tx5.g(this.W, this.X, new l12(str, 1), 2));
        return sug.a(fileChooserParams);
    }

    @Override // defpackage.zb1
    public final String c(String str) {
        ExternalActivity externalActivity = this.f;
        try {
            URL url = new URL(str);
            String string = externalActivity.getString(R.string.js_dialog_title, url.getProtocol() + "://" + url.getHost());
            string.getClass();
            return string;
        } catch (MalformedURLException unused) {
            String string2 = externalActivity.getString(R.string.js_dialog_title, str);
            string2.getClass();
            return string2;
        }
    }

    @Override // defpackage.zb1
    public final String e() {
        return this.Y;
    }

    @Override // defpackage.zb1
    public final void f(final int i, final String str, final String str2, final String str3) {
        Lazy<s87> lazy = s87.f;
        s87.a.a((gz4) this.V.getValue(), this.W.q(this.X, new Function1() { // from class: g55
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                lx5.b bVar = (lx5.b) obj;
                bVar.getClass();
                Uri uri = Uri.parse(str);
                uri.getClass();
                bVar.a("sourceUrl", wea.i(false, uri));
                bVar.b("resultCode", Long.valueOf(i));
                bVar.a("resultString", str2);
                bVar.a("resultExtras", str3);
                return j6g.a;
            }
        }));
    }

    @Override // defpackage.zb1
    public final void g(String str) {
        Lazy<s87> lazy = s87.f;
        s87.a.a((gz4) this.V.getValue(), tx5.i(this.W, this.X, WindowCallbackWrapper.BACK_DEFAULT_TARGET_NAME, new iy2(str, 1), 4));
    }

    @Override // defpackage.zb1
    public final void h(Intent intent) {
        intent.getClass();
        this.f.G0.a(intent);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        webView.getClass();
        message.getClass();
        if (!z2) {
            ArrayList arrayList = lz2.a;
            lz2.d("ExternalWebChromeClient", "SubWindow requested, but wasn't user gesture initiated, so denying", false, null);
            return false;
        }
        ExternalActivity externalActivity = this.f;
        if (externalActivity.isFinishing()) {
            return false;
        }
        if (!z) {
            WebView webView2 = new WebView(externalActivity);
            webView2.setWebViewClient(new C0171a(webView, this));
            Object obj = message.obj;
            obj.getClass();
            ((WebView.WebViewTransport) obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }
        String url = webView.getUrl();
        if (url == null) {
            url = "";
        }
        b.a aVar = new b.a(url, z);
        Object obj2 = message.obj;
        obj2.getClass();
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) obj2;
        twe tweVar = externalActivity.z0;
        if (tweVar != null) {
            tweVar.a();
        }
        e8 e8Var = externalActivity.v0;
        if (e8Var == null) {
            wl7.g("binding");
            throw null;
        }
        FrameLayout frameLayout = e8Var.c;
        frameLayout.getClass();
        i55 i55Var = externalActivity.x0;
        if (i55Var == null) {
            wl7.g("externalWebViewClient");
            throw null;
        }
        b bVar = new b(externalActivity, i55Var, aVar);
        a aVar2 = externalActivity.y0;
        if (aVar2 == null) {
            wl7.g("externalWebChromeClient");
            throw null;
        }
        twe tweVar2 = new twe(externalActivity, frameLayout, bVar, aVar2, new j30(externalActivity, 5));
        externalActivity.z0 = tweVar2;
        webViewTransport.setWebView(tweVar2.e);
        message.sendToTarget();
        return true;
    }
}
