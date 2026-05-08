package defpackage;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import defpackage.hc1;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class esc implements cra {
    public final Function1<ex4, j6g> a;

    /* JADX WARN: Multi-variable type inference failed */
    public esc(Function1<? super ex4, j6g> function1) {
        this.a = function1;
    }

    @Override // defpackage.cra
    public final void g(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (!webResourceRequest.isForMainFrame()) {
            ArrayList arrayList = lz2.a;
            lz2.a("ReceivedMainFrameHttpErrorInterruptComponent", "Error loading non-main-page resource", String.valueOf(webResourceRequest.getUrl()));
            return;
        }
        String string = webResourceRequest.getUrl().toString();
        string.getClass();
        int errorCode = wuf.g("WEB_RESOURCE_ERROR_GET_CODE") ? webResourceError.getErrorCode() : 0;
        String string2 = wuf.g("WEB_RESOURCE_ERROR_GET_DESCRIPTION") ? webResourceError.getDescription().toString() : "";
        Lazy<gz4> lazy = hc1.e;
        String strA = hc1.a.a(errorCode, string2, string);
        Lazy lazy2 = wwg.a;
        wwg.a(nxg.Internal, string, errorCode, string2);
        ArrayList arrayList2 = lz2.a;
        lz2.b("ReceivedMainFrameHttpErrorInterruptComponent", v40.c(errorCode, "WebView Network Error, errorCode=", ", desc=", string2), false, new Throwable(strA));
        webView.loadUrl("about:blank");
        nn0 nn0Var = nn0.a;
        this.a.invoke(nn0.e() ? ex4.a : ex4.b);
    }
}
