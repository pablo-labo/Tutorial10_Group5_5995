package defpackage;

import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebViewClient;
import androidx.compose.ui.platform.ComposeView;
import com.indeed.android.jobsearch.LaunchActivity;
import com.indeed.android.jobsearch.webview.IndeedWebView;
import com.indeed.android.jobsearch.webview.javascript.JavaScriptInterface;
import com.indeed.android.jsmappservices.bridge.BridgeDispatcher;
import defpackage.cd4;
import defpackage.xh8;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class mq6 implements xh8 {
    public IndeedWebView V;
    public ComposeView W;
    public ComposeView X;
    public w97 Y;
    public ComposeView Z;
    public final String a;
    public final d2f a0;
    public final String b;
    public long b0;
    public final Function1<String, j6g> c;
    public boolean c0;
    public final gu5<j6g> d;
    public boolean d0;
    public final gu5<j6g> e;
    public final String e0;
    public final fx4 f;
    public final bp6 f0;

    /* JADX WARN: Multi-variable type inference failed */
    public mq6(String str, String str2, Function1<? super String, j6g> function1, gu5<j6g> gu5Var, gu5<j6g> gu5Var2, fx4 fx4Var) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = function1;
        this.d = gu5Var;
        this.e = gu5Var2;
        this.f = fx4Var;
        this.a0 = new d2f(new ag3(4));
        this.b0 = -1L;
        this.e0 = "about:blank";
        this.f0 = new bp6();
    }

    public static void j(mq6 mq6Var, LaunchActivity launchActivity, hq6 hq6Var, IndeedWebView indeedWebView, ComposeView composeView, ComposeView composeView2, boolean z, gu5 gu5Var, Function1 function1, Function1 function12, Function1 function13, Function1 function14, nt5 nt5Var, a3 a3Var, la laVar, ComposeView composeView3, Function1 function15, int i) {
        boolean z2 = (i & 32) != 0 ? false : z;
        nt5 nt5Var2 = (i & 2048) != 0 ? null : nt5Var;
        a3 a3Var2 = (i & 4096) != 0 ? null : a3Var;
        la laVar2 = (i & 8192) != 0 ? null : laVar;
        ComposeView composeView4 = (i & 16384) == 0 ? composeView3 : null;
        indeedWebView.c();
        indeedWebView.setDownloadListener(new o87(launchActivity));
        dd4 dd4Var = dd4.a;
        if (dd4.l()) {
            t8e t8eVar = vme.a;
            indeedWebView.addJavascriptInterface(new sqf(), "SnowplowWebInterface");
            indeedWebView.addJavascriptInterface(new tqf(), "SnowplowWebInterfaceV2");
        }
        ad4 ad4Var = dd4.n().a;
        ad4Var.getClass();
        if (ad4Var.e(cd4.a.E2) == cd4.e4.a.getValue()) {
            indeedWebView.post(new m50(indeedWebView, 7));
        }
        int i2 = 6;
        WebViewClient y97Var = new y97(launchActivity, mq6Var.a, z2, new k1(mq6Var, i2), gu5Var, hq6Var, new na0(mq6Var, 9), mq6Var.d, new qr(mq6Var, i2), nt5Var2, a3Var2, laVar2, function15);
        w97 w97Var = new w97(new qa(launchActivity, 2), new xh(indeedWebView, i2), function1, new uw(launchActivity, 4));
        indeedWebView.setWebViewClient(y97Var);
        indeedWebView.setWebChromeClient(w97Var);
        indeedWebView.addJavascriptInterface(new JavaScriptInterface(launchActivity, hh1.A(launchActivity)), "Android");
        indeedWebView.addJavascriptInterface(new BridgeDispatcher(launchActivity, indeedWebView, new km1(1, r97.a, r97.class, "isJsmaJsBridgeAllowed", "isJsmaJsBridgeAllowed(Ljava/lang/String;)Z", 0), new lm1(launchActivity, function12, function13, function14)), "jsmNativeInterfaceV2");
        mq6Var.c0 = true;
        mq6Var.V = indeedWebView;
        mq6Var.W = composeView;
        mq6Var.X = composeView2;
        mq6Var.Y = w97Var;
        mq6Var.Z = composeView4;
    }

    public final String a() {
        IndeedWebView indeedWebView = this.V;
        String url = null;
        String url2 = indeedWebView != null ? indeedWebView.getUrl() : null;
        ComposeView composeView = this.W;
        if ((composeView == null || composeView.getVisibility() != 0) && !wl7.b(url2, this.e0)) {
            return url2;
        }
        IndeedWebView indeedWebView2 = this.V;
        if (indeedWebView2 == null) {
            return "";
        }
        String str = (2 & 2) != 0 ? "about:blank" : null;
        str.getClass();
        WebBackForwardList webBackForwardListCopyBackForwardList = indeedWebView2.copyBackForwardList();
        webBackForwardListCopyBackForwardList.getClass();
        int currentIndex = webBackForwardListCopyBackForwardList.getCurrentIndex();
        if (currentIndex >= 0) {
            while (true) {
                int i = currentIndex - 1;
                WebHistoryItem itemAtIndex = webBackForwardListCopyBackForwardList.getItemAtIndex(currentIndex);
                if (!wl7.b(itemAtIndex.getUrl(), str)) {
                    url = itemAtIndex.getUrl();
                    break;
                }
                if (i < 0) {
                    break;
                }
                currentIndex = i;
            }
        }
        return url == null ? "" : url;
    }

    public final String b() {
        IndeedWebView indeedWebView = this.V;
        if (indeedWebView != null) {
            return indeedWebView.getUrl();
        }
        return null;
    }

    public final void c() {
        ComposeView composeView = this.W;
        if (composeView != null) {
            composeView.setVisibility(8);
        }
        IndeedWebView indeedWebView = this.V;
        if (indeedWebView != null) {
            indeedWebView.setVisibility(0);
        }
        ComposeView composeView2 = this.Z;
        if (composeView2 != null) {
            composeView2.setVisibility(0);
        }
    }

    public final boolean e() {
        String strA = a();
        if (strA == null || strA.length() == 0) {
            return false;
        }
        r97.a.getClass();
        return r97.x(strA);
    }

    public final boolean f() {
        String strA = a();
        if (strA == null || strA.length() == 0) {
            return false;
        }
        r97.a.getClass();
        return r97.l(strA);
    }

    public final boolean g() {
        String strA = a();
        if (strA == null || strA.length() == 0) {
            return false;
        }
        zo6.a.getClass();
        return zo6.e(strA, this.b);
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    public final void h(String str, boolean z, boolean z2) {
        str.getClass();
        c();
        if (z2) {
            k(true);
        }
        this.c0 = z;
        IndeedWebView indeedWebView = this.V;
        if (indeedWebView != null) {
            indeedWebView.loadUrl(str);
        }
    }

    public final void i() {
        String url;
        c();
        IndeedWebView indeedWebView = this.V;
        if (indeedWebView == null) {
            return;
        }
        WebBackForwardList webBackForwardListCopyBackForwardList = indeedWebView.copyBackForwardList();
        webBackForwardListCopyBackForwardList.getClass();
        int currentIndex = webBackForwardListCopyBackForwardList.getCurrentIndex();
        if (currentIndex >= 0) {
            while (true) {
                int i = currentIndex - 1;
                WebHistoryItem itemAtIndex = webBackForwardListCopyBackForwardList.getItemAtIndex(currentIndex);
                if (!wl7.b(itemAtIndex.getUrl(), "about:blank")) {
                    url = itemAtIndex.getUrl();
                    break;
                } else if (i < 0) {
                    break;
                } else {
                    currentIndex = i;
                }
            }
            url = null;
        } else {
            url = null;
        }
        gq6 gq6Var = gq6.ERROR_RETRY;
        if (url != null) {
            zo6.a.getClass();
            indeedWebView.loadUrl(zo6.g(url, gq6Var));
        } else {
            zo6.a.getClass();
            h(zo6.g(this.b, gq6Var), true, true);
        }
    }

    public final void k(boolean z) {
        ComposeView composeView = this.X;
        if (z) {
            if (composeView != null) {
                composeView.setVisibility(0);
            }
            IndeedWebView indeedWebView = this.V;
            if (indeedWebView != null) {
                indeedWebView.setVisibility(8);
                return;
            }
            return;
        }
        if (composeView != null) {
            composeView.setVisibility(8);
        }
        IndeedWebView indeedWebView2 = this.V;
        if (indeedWebView2 != null) {
            indeedWebView2.setVisibility(0);
        }
    }

    public final boolean l(String str, gu5<j6g> gu5Var) {
        if (this.d0) {
            return false;
        }
        if (str != null) {
            h(str, true, true);
            gu5Var.invoke();
        } else {
            zo6.a.getClass();
            String str2 = zo6.e;
            String str3 = this.b;
            if (wl7.b(str3, str2) || wl7.b(str3, zo6.f)) {
                ComposeView composeView = this.X;
                if (composeView != null) {
                    composeView.setVisibility(8);
                }
            } else if (!wl7.b(str3, "")) {
                h(str3, true, true);
                gu5Var.invoke();
            }
        }
        this.d0 = true;
        return true;
    }
}
