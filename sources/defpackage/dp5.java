package defpackage;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import defpackage.jra;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes2.dex */
public final class dp5 implements jra {
    @Override // defpackage.jra
    public final jra.a h(WebView webView, WebResourceRequest webResourceRequest) throws UnsupportedEncodingException {
        ep5 ep5Var = ep5.a;
        String string = webResourceRequest.getUrl().toString();
        string.getClass();
        ep5Var.g(string);
        return jra.a.b.a;
    }
}
