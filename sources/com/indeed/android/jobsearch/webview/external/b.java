package com.indeed.android.jobsearch.webview.external;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import defpackage.a9c;
import defpackage.ad1;
import defpackage.ai8;
import defpackage.boa;
import defpackage.e91;
import defpackage.fwc;
import defpackage.gu5;
import defpackage.gz4;
import defpackage.mj8;
import defpackage.o0b;
import defpackage.qpd;
import defpackage.qt8;
import defpackage.wve;
import defpackage.xh8;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends e91 {
    public final WebViewClient V;
    public final a W;
    public final Lazy X;
    public WebView Y;
    public final AtomicBoolean Z;
    public final AtomicBoolean a0;

    public static final class a {
        public final String a;
        public final boolean b;

        public a(String str, boolean z) {
            this.a = str;
            this.b = z;
        }
    }

    /* JADX INFO: renamed from: com.indeed.android.jobsearch.webview.external.b$b, reason: collision with other inner class name */
    public static final class C0172b extends mj8 implements gu5<gz4> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0172b(b bVar) {
            super(0);
            this.$this_inject = bVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [gz4, java.lang.Object] */
        @Override // defpackage.gu5
        public final gz4 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(gz4.class), a9cVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ExternalActivity externalActivity, WebViewClient webViewClient, a aVar) {
        super(externalActivity);
        externalActivity.getClass();
        webViewClient.getClass();
        this.V = webViewClient;
        this.W = aVar;
        this.X = boa.E(qt8.a, new C0172b(this));
        this.Z = new AtomicBoolean();
        this.a0 = new AtomicBoolean();
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        webView.getClass();
        str.getClass();
        this.V.doUpdateVisitedHistory(webView, str, z);
    }

    @Override // android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        webView.getClass();
        message.getClass();
        message2.getClass();
        this.V.onFormResubmission(webView, message, message2);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        WebView webView2;
        webView.getClass();
        str.getClass();
        this.Y = webView;
        if (!TextUtils.isEmpty(null) && !TextUtils.isEmpty(null) && (webView2 = this.Y) != null) {
            webView2.loadUrl("javascript:null");
        }
        if ((wve.K(str, "https://", false) || wve.K(str, "http://", false)) && !this.a0.getAndSet(true)) {
            ((gz4) this.X.getValue()).a("droid_subwindow_page_load", new ad1(3, o0b.a.PageFinished, this, str));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        webView.getClass();
        str.getClass();
        this.Y = webView;
        if ((wve.K(str, "https://", false) || wve.K(str, "http://", false)) && !this.Z.getAndSet(true)) {
            ((gz4) this.X.getValue()).a("droid_subwindow_page_load", new ad1(3, o0b.a.PageStarted, this, str));
        }
    }

    @Override // defpackage.e91, defpackage.hc1, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        webView.getClass();
        webResourceRequest.getClass();
        webResourceError.getClass();
        this.V.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        webView.getClass();
        httpAuthHandler.getClass();
        str.getClass();
        str2.getClass();
        this.V.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    @Override // defpackage.hc1, android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        webView.getClass();
        sslErrorHandler.getClass();
        sslError.getClass();
        this.V.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        webView.getClass();
        keyEvent.getClass();
        this.V.onUnhandledKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        webView.getClass();
        keyEvent.getClass();
        return this.V.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // defpackage.hc1, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        webView.getClass();
        webResourceRequest.getClass();
        return this.V.shouldOverrideUrlLoading(webView, webResourceRequest);
    }
}
