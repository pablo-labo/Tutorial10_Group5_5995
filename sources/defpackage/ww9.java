package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import defpackage.jra;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ww9 extends ia1 {
    public final List<xw9> b;
    public final hq6 c;
    public final gu5<j6g> d;
    public final boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww9(ArrayList arrayList, gu5 gu5Var, hq6 hq6Var, gu5 gu5Var2, boolean z) {
        super(gu5Var);
        arrayList.getClass();
        this.b = arrayList;
        this.c = hq6Var;
        this.d = gu5Var2;
        this.e = z;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        webView.getClass();
        str.getClass();
        super.doUpdateVisitedHistory(webView, str, z);
        List<xw9> list = this.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof i84) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((i84) it.next()).i(webView, str, z);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        super.onPageCommitVisible(webView, str);
        List<xw9> list = this.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof tqa) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((tqa) it.next()).onPageCommitVisible(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        super.onPageFinished(webView, str);
        List<xw9> list = this.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof uqa) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((uqa) it.next()).f(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        webView.getClass();
        str.getClass();
        super.onPageStarted(webView, str, bitmap);
        List<xw9> list = this.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof vqa) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((vqa) it.next()).a(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        webView.getClass();
        webResourceRequest.getClass();
        webResourceError.getClass();
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        List<xw9> list = this.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof cra) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((cra) it.next()).g(webView, webResourceRequest, webResourceError);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        webView.getClass();
        webResourceRequest.getClass();
        webResourceResponse.getClass();
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        List<xw9> list = this.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof dra) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((dra) it.next()).onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }
    }

    @Override // android.webkit.WebViewClient
    @SuppressLint({"WebViewClientOnReceivedSslError"})
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        webView.getClass();
        sslErrorHandler.getClass();
        sslError.getClass();
        List<xw9> list = this.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof era) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int iOrdinal = ((era) it.next()).c(webView, sslError).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    sslErrorHandler.proceed();
                    return;
                } else if (iOrdinal == 2) {
                    sslErrorHandler.cancel();
                    return;
                } else {
                    l.g();
                    return;
                }
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        webView.getClass();
        webResourceRequest.getClass();
        List<xw9> list = this.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof qee) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((qee) it.next()).j(webView, webResourceRequest);
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // defpackage.ia1, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) throws UnsupportedEncodingException {
        webView.getClass();
        webResourceRequest.getClass();
        if (this.e) {
            String string = webResourceRequest.getUrl().toString();
            string.getClass();
            iq6 iq6Var = iq6.a;
            hq6 hq6Var = this.c;
            if (hq6Var != null && hq6Var.e(string) && hq6Var.B(string)) {
                this.d.invoke();
                return true;
            }
        }
        String string2 = webResourceRequest.getUrl().toString();
        string2.getClass();
        ep5.a.g(string2);
        List<xw9> list = this.b;
        ArrayList<jra> arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof jra) {
                arrayList.add(obj);
            }
        }
        for (jra jraVar : arrayList) {
            jra.a aVarH = jraVar.h(webView, webResourceRequest);
            if (aVarH instanceof jra.a.C0281a) {
                ArrayList arrayList2 = lz2.a;
                lz2.d("ModalWebViewClient", "@@shouldOverrideUrlLoading url=" + webResourceRequest.getUrl() + " was handled by " + fwc.a.b(jraVar.getClass()).r(), false, null);
                return true;
            }
            if (!wl7.b(aVarH, jra.a.b.a)) {
                l.g();
                return false;
            }
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }
}
