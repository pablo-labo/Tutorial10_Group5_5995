package defpackage;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.indeed.android.jobsearch.JobSearchApplication;
import com.indeed.android.jobsearch.webview.external.ExternalActivity;
import defpackage.lqe;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e91 extends hc1 {
    public final ExternalActivity f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e91(ExternalActivity externalActivity) {
        super(externalActivity);
        externalActivity.getClass();
        this.f = externalActivity;
    }

    @Override // defpackage.hc1
    public final void a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        JobSearchApplication jobSearchApplication = JobSearchApplication.X;
        lqe.a aVarA = lqe.a.a(this.f, this.b, webView, sslError);
        sslErrorHandler.cancel();
        if (aVarA == lqe.a.AutoCancelWithDialog) {
            this.b = null;
        }
    }

    @Override // defpackage.hc1, android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        webView.getClass();
        webResourceRequest.getClass();
        webResourceError.getClass();
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        String string = webResourceRequest.getUrl().toString();
        string.getClass();
        int errorCode = webResourceError.getErrorCode();
        String string2 = webResourceError.getDescription().toString();
        Lazy lazy = wwg.a;
        wwg.a(nxg.External, string, errorCode, string2);
    }
}
