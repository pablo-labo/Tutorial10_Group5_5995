package defpackage;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import defpackage.jra;
import defpackage.pgd;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class c5b implements jra {
    public final wm1 a;

    public c5b(wm1 wm1Var) {
        this.a = wm1Var;
    }

    @Override // defpackage.jra
    public final jra.a h(WebView webView, WebResourceRequest webResourceRequest) throws IOException {
        r97 r97Var = r97.a;
        String string = webResourceRequest.getUrl().toString();
        string.getClass();
        r97Var.getClass();
        if (!wl7.b(r97.z(Uri.parse(string), "jsmaContinue"), "dismiss")) {
            return jra.a.b.a;
        }
        this.a.invoke();
        return new jra.a.C0281a(pgd.c.b);
    }
}
