package defpackage;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes2.dex */
public final class gsc implements dra {
    public final fj2 a;

    public gsc(fj2 fj2Var) {
        this.a = fj2Var;
    }

    @Override // defpackage.dra
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.a.invoke(webResourceRequest, webResourceResponse);
    }
}
