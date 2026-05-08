package defpackage;

import android.app.Activity;
import android.net.http.SslError;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import defpackage.era;
import defpackage.jra;
import defpackage.lqe;
import defpackage.xh8;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class lf6 implements era, jra, xh8 {
    public final Activity a;
    public String b;

    public lf6(Activity activity) {
        activity.getClass();
        this.a = activity;
    }

    @Override // defpackage.era
    public final era.a c(WebView webView, SslError sslError) {
        if (lqe.a.a(this.a, this.b, webView, sslError) == lqe.a.AutoCancelWithDialog) {
            this.b = null;
            ArrayList arrayList = lz2.a;
            Log.d("HandleSslErrorComponent", "mainPageUrl has been handled", null);
        }
        return era.a.b;
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    @Override // defpackage.jra
    public final jra.a h(WebView webView, WebResourceRequest webResourceRequest) {
        this.b = webResourceRequest.getUrl().toString();
        return jra.a.b.a;
    }
}
