package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import defpackage.hc1;
import defpackage.xh8;
import defpackage.ya1;
import java.net.URISyntaxException;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ia1 extends WebViewClient implements xh8 {
    public final gu5<Activity> a;

    /* JADX WARN: Multi-variable type inference failed */
    public ia1(gu5<? extends Activity> gu5Var) {
        this.a = gu5Var;
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        ixg.b(webView, this.a.invoke(), renderProcessGoneDetail, "BaseModalWebViewClient");
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) throws URISyntaxException {
        webView.getClass();
        webResourceRequest.getClass();
        Uri url = webResourceRequest.getUrl();
        if (url == null) {
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        ya1 ya1VarA = wb1.a(url);
        boolean z = ya1VarA instanceof ya1.d;
        gu5<Activity> gu5Var = this.a;
        if (z) {
            ya1.d dVar = (ya1.d) ya1VarA;
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            String str = dVar.a;
            intent.putExtra("android.intent.extra.EMAIL", new String[]{str != null ? str : ""});
            intent.putExtra("android.intent.extra.SUBJECT", dVar.b);
            intent.putExtra("android.intent.extra.CC", dVar.c);
            intent.putExtra("android.intent.extra.TEXT", dVar.d);
            Lazy lazy = pkf.a;
            pkf.a(gu5Var.invoke(), intent);
            return true;
        }
        if (ya1VarA instanceof ya1.i) {
            Intent intent2 = new Intent("android.intent.action.DIAL", url);
            Lazy lazy2 = pkf.a;
            pkf.a(gu5Var.invoke(), intent2);
            return true;
        }
        if (ya1VarA instanceof ya1.h) {
            Intent intent3 = new Intent("android.intent.action.SENDTO", url);
            Lazy lazy3 = pkf.a;
            pkf.a(gu5Var.invoke(), intent3);
            return true;
        }
        if (ya1VarA instanceof ya1.e) {
            Lazy<gz4> lazy4 = hc1.e;
            Context context = webView.getContext();
            context.getClass();
            hc1.a.b(context, url, (ya1.e) ya1VarA);
            return true;
        }
        if (!(ya1VarA instanceof ya1.a)) {
            if (!(ya1VarA instanceof ya1.c) && !wl7.b(ya1VarA, ya1.f.a) && !wl7.b(ya1VarA, ya1.b.a)) {
                return false;
            }
            Lazy lazy5 = pkf.a;
            pkf.b(gu5Var.invoke(), url);
            return true;
        }
        Lazy lazy6 = pkf.a;
        Activity activityInvoke = gu5Var.invoke();
        boolean zHasGesture = webResourceRequest.hasGesture();
        String url2 = webView.getUrl();
        String str2 = url2 != null ? url2 : "";
        String string = url.toString();
        string.getClass();
        pkf.c(activityInvoke, zHasGesture, str2, string);
        return true;
    }
}
