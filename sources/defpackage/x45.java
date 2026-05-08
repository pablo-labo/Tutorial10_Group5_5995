package defpackage;

import android.webkit.WebView;
import com.indeed.android.jobsearch.webview.external.ExternalActivity;
import com.indeed.android.jobsearch.webview.external.ExternalWebView;

/* JADX INFO: loaded from: classes2.dex */
public final class x45 extends wpa {
    public final /* synthetic */ ExternalActivity d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x45(ExternalActivity externalActivity) {
        super(true);
        this.d = externalActivity;
    }

    @Override // defpackage.wpa
    public final void b() {
        ExternalActivity externalActivity = this.d;
        twe tweVar = externalActivity.z0;
        if (tweVar != null) {
            WebView webView = tweVar.e;
            if (webView != null && webView.canGoBack()) {
                webView.goBack();
                return;
            }
            twe tweVar2 = externalActivity.z0;
            if (tweVar2 != null) {
                tweVar2.a();
                return;
            }
            return;
        }
        ExternalWebView externalWebView = externalActivity.w0;
        if (externalWebView == null) {
            wl7.g("externalWebView");
            throw null;
        }
        if (!externalWebView.canGoBack()) {
            externalActivity.finish();
            return;
        }
        ExternalWebView externalWebView2 = externalActivity.w0;
        if (externalWebView2 != null) {
            externalWebView2.goBack();
        } else {
            wl7.g("externalWebView");
            throw null;
        }
    }
}
