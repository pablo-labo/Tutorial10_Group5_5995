package defpackage;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import defpackage.jra;
import defpackage.pgd;

/* JADX INFO: loaded from: classes2.dex */
public final class m77 implements jra {
    public final fj a;
    public final pe0 b;

    public m77(fj fjVar, pe0 pe0Var) {
        this.a = fjVar;
        this.b = pe0Var;
    }

    @Override // defpackage.jra
    public final jra.a h(WebView webView, WebResourceRequest webResourceRequest) {
        String url = webView.getUrl();
        if (url == null) {
            url = "";
        }
        String string = webResourceRequest.getUrl().toString();
        string.getClass();
        pgd pgdVarB = yhg.a.b(url, string);
        if ((pgdVarB instanceof pgd.t) || wl7.b(pgdVarB, pgd.q.b) || wl7.b(pgdVarB, pgd.p.b)) {
            this.a.invoke(Boolean.TRUE);
            return new jra.a.C0281a(pgdVarB);
        }
        if (!(pgdVarB instanceof pgd.m0) && !(pgdVarB instanceof pgd.g0) && !(pgdVarB instanceof pgd.h0)) {
            return jra.a.b.a;
        }
        this.b.invoke(string);
        return new jra.a.C0281a(pgdVarB);
    }
}
