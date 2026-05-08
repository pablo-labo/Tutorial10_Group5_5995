package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.net.http.SslError;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.c;
import com.indeed.android.jobsearch.R;
import defpackage.xh8;
import defpackage.ya1;
import java.net.URISyntaxException;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hc1 extends WebViewClient implements xh8 {
    public static final Lazy<gz4> e = boa.E(qt8.a, new b(new a()));
    public final Activity a;
    public String b;
    public final Lazy c;
    public c d;

    public static final class a implements xh8 {
        public static String a(int i, String str, String str2) {
            str.getClass();
            return "description : " + str + "\nurl : " + str2 + "\nerrorCode : " + i;
        }

        public static void b(final Context context, final Uri uri, ya1.e eVar) {
            final String str = eVar.a;
            final String str2 = eVar.b;
            hc1.e.getValue().a("launch_market_url", new Function1() { // from class: gc1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Context context2 = context;
                    y3b y3bVar = (y3b) obj;
                    y3bVar.getClass();
                    String str3 = str;
                    y3bVar.b("id", str3 == null ? "" : str3);
                    String str4 = str2;
                    y3bVar.b("referrer", str4 != null ? str4 : "");
                    if (wl7.b(str3, "com.indeed.android.jobsearch")) {
                        y3bVar.a(1L, "launching");
                        Intent intent = new Intent("android.intent.action.VIEW");
                        Uri.Builder builderBuildUpon = Uri.parse("https://play.google.com/store/apps/details").buildUpon();
                        builderBuildUpon.appendQueryParameter("id", str3);
                        if (str4 != null) {
                            builderBuildUpon.appendQueryParameter("referrer", str4);
                        }
                        intent.setData(builderBuildUpon.build());
                        intent.setPackage("com.android.vending");
                        try {
                            context2.startActivity(intent);
                            y3bVar.a(1L, "launch_succeeded");
                        } catch (Exception e) {
                            ArrayList arrayList = lz2.a;
                            lz2.c("BaseWebViewClient", p6.d(uri, "Launching Market URL failed: "), false, e, 4);
                            y3bVar.a(0L, "launch_succeeded");
                        }
                    } else {
                        y3bVar.a(0L, "launching");
                    }
                    return j6g.a;
                }
            });
        }

        @Override // defpackage.xh8
        public final vh8 getKoin() {
            return xh8.a.a();
        }
    }

    public static final class b extends mj8 implements gu5<gz4> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a aVar) {
            super(0);
            this.$this_inject = aVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [gz4, java.lang.Object] */
        @Override // defpackage.gu5
        public final gz4 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(gz4.class), a9cVar);
        }
    }

    public hc1(k19 k19Var) {
        k19Var.getClass();
        this.a = k19Var;
        this.c = boa.E(qt8.a, new ic1(this));
    }

    public abstract void a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError);

    public final void b(final Activity activity) {
        c cVar;
        c.a aVar = new c.a(activity);
        String string = activity.getString(R.string.webview_render_error_message);
        AlertController.b bVar = aVar.a;
        bVar.f = string;
        aVar.a(activity.getString(R.string.webview_render_error_positive_button), new DialogInterface.OnClickListener() { // from class: fc1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                hc1 hc1Var = this.a;
                c cVar2 = hc1Var.d;
                if (cVar2 != null) {
                    cVar2.dismiss();
                }
                hc1Var.d = null;
                activity.finishAndRemoveTask();
            }
        });
        bVar.m = false;
        this.d = aVar.create();
        try {
            if (activity.isFinishing() || activity.isDestroyed() || (cVar = this.d) == null) {
                return;
            }
            cVar.show();
        } catch (Exception e2) {
            ArrayList arrayList = lz2.a;
            lz2.b("BaseWebViewClient", "Failed to show WebView error alert", false, e2);
            activity.finishAndRemoveTask();
        }
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        webView.getClass();
        webResourceRequest.getClass();
        webResourceError.getClass();
        if (!webResourceRequest.isForMainFrame()) {
            ArrayList arrayList = lz2.a;
            lz2.a("BaseWebViewClient", "Error loading non-main-page resource", String.valueOf(webResourceRequest.getUrl()));
            return;
        }
        String string = webResourceRequest.getUrl().toString();
        string.getClass();
        int errorCode = webResourceError.getErrorCode();
        String string2 = webResourceError.getDescription().toString();
        Throwable th = new Throwable(a.a(errorCode, string2, string));
        ArrayList arrayList2 = lz2.a;
        lz2.b("BaseWebViewClient", v40.c(errorCode, "onReceivedError, errorCode=", ", desc=", string2), false, th);
        webView.loadUrl("about:blank");
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        webView.getClass();
        sslErrorHandler.getClass();
        sslError.getClass();
        a(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        Object obj;
        Activity activity = this.a;
        PackageInfo packageInfoA = uwg.a(activity);
        if (packageInfoA == null || (obj = packageInfoA.versionName) == null) {
            obj = 0;
        }
        String str = "onRenderProcessGone didCrash=" + (renderProcessGoneDetail != null ? Boolean.valueOf(renderProcessGoneDetail.didCrash()) : null) + " rendererPriorityAtExit=" + (renderProcessGoneDetail != null ? Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit()) : null) + " WebViewPackageVersion " + obj + " WebViewUrl " + (webView != null ? webView.getUrl() : null);
        ArrayList arrayList = lz2.a;
        w40.n(str, "BaseWebViewClient", str, false);
        if (webView != null && webView.getUrl() != null) {
            try {
                ViewParent parent = webView.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(webView);
                }
                webView.clearHistory();
                webView.clearCache(true);
                webView.onPause();
                webView.removeAllViews();
                webView.destroy();
                b(activity);
            } catch (Exception e2) {
                ArrayList arrayList2 = lz2.a;
                lz2.b("BaseWebViewClient", "Error handling render process gone", false, e2);
                b(activity);
            }
        }
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
        Activity activity = this.a;
        if (z) {
            ya1.d dVar = (ya1.d) ya1VarA;
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            String str = dVar.a;
            intent.putExtra("android.intent.extra.EMAIL", new String[]{str != null ? str : ""});
            intent.putExtra("android.intent.extra.SUBJECT", dVar.b);
            intent.putExtra("android.intent.extra.CC", dVar.c);
            intent.putExtra("android.intent.extra.TEXT", dVar.d);
            pkf.a(activity, intent);
            return true;
        }
        if (ya1VarA instanceof ya1.i) {
            pkf.a(activity, new Intent("android.intent.action.DIAL", url));
            return true;
        }
        if (ya1VarA instanceof ya1.h) {
            pkf.a(activity, new Intent("android.intent.action.SENDTO", url));
            return true;
        }
        if (ya1VarA instanceof ya1.e) {
            Context context = webView.getContext();
            context.getClass();
            a.b(context, url, (ya1.e) ya1VarA);
            return true;
        }
        if (!(ya1VarA instanceof ya1.a)) {
            if ((ya1VarA instanceof ya1.c) || wl7.b(ya1VarA, ya1.f.a) || wl7.b(ya1VarA, ya1.b.a)) {
                pkf.b(activity, url);
                return true;
            }
            this.b = url.toString();
            return false;
        }
        Lazy lazy = pkf.a;
        boolean zHasGesture = webResourceRequest.hasGesture();
        String url2 = webView.getUrl();
        String str2 = url2 != null ? url2 : "";
        String string = url.toString();
        string.getClass();
        pkf.c(activity, zHasGesture, str2, string);
        return true;
    }
}
