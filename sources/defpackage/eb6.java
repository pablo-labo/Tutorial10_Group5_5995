package defpackage;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import defpackage.jra;
import defpackage.pgd;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class eb6 implements jra {
    public final Function1<Boolean, j6g> a;

    /* JADX WARN: Multi-variable type inference failed */
    public eb6(Function1<? super Boolean, j6g> function1) {
        this.a = function1;
    }

    @Override // defpackage.jra
    public final jra.a h(WebView webView, WebResourceRequest webResourceRequest) {
        String url = webView.getUrl();
        if (url == null) {
            url = "";
        }
        String string = webResourceRequest.getUrl().toString();
        string.getClass();
        if (!(yhg.a.b(url, string) instanceof pgd.j)) {
            return jra.a.b.a;
        }
        this.a.invoke(Boolean.TRUE);
        return new jra.a.C0281a();
    }
}
