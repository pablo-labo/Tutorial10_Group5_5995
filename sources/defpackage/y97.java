package defpackage;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebBackForwardList;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.datadog.android.log.Logger;
import com.indeed.android.jobsearch.JobSearchApplication;
import com.indeed.android.jobsearch.LaunchActivity;
import com.indeed.android.jobsearch.util.AppStartupTimes;
import com.indeed.android.jobsearch.webview.IndeedWebView;
import com.wlappdebug.r;
import defpackage.c87;
import defpackage.cd4;
import defpackage.ixg;
import defpackage.lqe;
import defpackage.o0b;
import defpackage.pgd;
import defpackage.s87;
import defpackage.s98;
import defpackage.xh8;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class y97 extends hc1 {
    public final String V;
    public final boolean W;
    public final k1 X;
    public final gu5<j6g> Y;
    public final hq6 Z;
    public final na0 a0;
    public final gu5<j6g> b0;
    public final qr c0;
    public final gu5<j6g> d0;
    public final Function1<String, j6g> e0;
    public final LaunchActivity f;
    public final gu5<j6g> f0;
    public final Function1<pgd.x, j6g> g0;
    public final Lazy h0;
    public final zk6 i0;
    public final Lazy j0;
    public String k0;
    public final d2f l0;
    public final Lazy m0;
    public final d2f n0;
    public final Lazy o0;
    public final rj0 p0;
    public long q0;

    @uh3(c = "com.indeed.android.jobsearch.webview.IndeedWebViewClient$onPageFinished$2", f = "IndeedWebViewClient.kt", l = {197}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ String $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$url = str;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$url, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            Object objC;
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                e83 e83Var = e83.a;
                String str = this.$url;
                this.label = 1;
                boolean z = e83.c;
                g13 g13Var = g13.a;
                if (z || (objC = e83Var.c(new h83(str, null), this)) != g13Var) {
                    objC = j6g.a;
                }
                if (objC == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y97(LaunchActivity launchActivity, String str, boolean z, k1 k1Var, gu5 gu5Var, hq6 hq6Var, na0 na0Var, gu5 gu5Var2, qr qrVar, gu5 gu5Var3, Function1 function1, gu5 gu5Var4, Function1 function12) {
        super(launchActivity);
        str.getClass();
        this.f = launchActivity;
        this.V = str;
        this.W = z;
        this.X = k1Var;
        this.Y = gu5Var;
        this.Z = hq6Var;
        this.a0 = na0Var;
        this.b0 = gu5Var2;
        this.c0 = qrVar;
        this.d0 = gu5Var3;
        this.e0 = function1;
        this.f0 = gu5Var4;
        this.g0 = function12;
        z97 z97Var = new z97(this);
        qt8 qt8Var = qt8.a;
        this.h0 = boa.E(qt8Var, z97Var);
        this.i0 = new zk6();
        this.j0 = boa.E(qt8Var, new aa7(this));
        this.k0 = "";
        this.l0 = new d2f(new pd1(10));
        this.m0 = boa.E(qt8Var, new ba7(this));
        this.n0 = new d2f(new jr(12));
        this.o0 = boa.E(qt8Var, new ca7(this));
        this.p0 = new rj0(launchActivity);
        this.q0 = 200L;
    }

    public static void c(WebView webView, String str) {
        if ((wve.K(str, "http://", false) || wve.K(str, "https://", false)) && (webView instanceof IndeedWebView)) {
            ((IndeedWebView) webView).setLastUrlToLoad(str);
        }
    }

    @Override // defpackage.hc1
    public final void a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        JobSearchApplication jobSearchApplication = JobSearchApplication.X;
        ((r.b) this.j0.getValue()).c("webview.ignoreSslErrors");
        lqe.a aVarA = lqe.a.a(this.f, this.b, webView, sslError);
        sslErrorHandler.cancel();
        if (aVarA == lqe.a.AutoCancelWithDialog) {
            this.b = null;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, final String str, boolean z) throws Exception {
        qr qrVar;
        webView.getClass();
        str.getClass();
        super.doUpdateVisitedHistory(webView, str, z);
        pgd pgdVarB = yhg.a.b(str, str);
        if (pgdVarB instanceof pgd.a) {
            ArrayList arrayList = lz2.a;
            lz2.d("IndeedWebViewClient", "Apply success", false, null);
            bu8 bu8Var = bu8.a;
            bu8Var.getClass();
            z zVar = bu8.g0;
            qf8<Object>[] qf8VarArr = bu8.b;
            int iIntValue = ((Number) zVar.d(qf8VarArr[16], bu8Var)).intValue();
            int iC = bu8Var.c();
            zVar.e(qf8VarArr[16], bu8Var, Integer.valueOf(iIntValue + 1));
            bu8Var.j(iIntValue == 0 ? iC + 20 : iC + 5);
        } else if (pgdVarB instanceof pgd.y) {
            r97.a.getClass();
            if (r97.s(str) && (qrVar = this.c0) != null) {
                qrVar.invoke();
            }
        }
        String cookie = CookieManager.getInstance().getCookie(str);
        if (cookie == null) {
            cookie = "";
        }
        final String str2 = cookie;
        String cookie2 = CookieManager.getInstance().getCookie(d93.g());
        final int length = cookie2 != null ? cookie2.length() : 0;
        pxc pxcVar = fz2.a;
        cookie2.getClass();
        LinkedHashMap linkedHashMapA = fz2.a(cookie2);
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMapA.entrySet()) {
            if (((Number) entry.getValue()).intValue() > 1) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        final Set setKeySet = linkedHashMap.keySet();
        final Set set = (Set) ((AtomicReference) this.n0.getValue()).getAndSet(setKeySet);
        final int andSet = ((AtomicInteger) this.l0.getValue()).getAndSet(length);
        ((gz4) this.h0.getValue()).a("page_routed", new Function1() { // from class: x97
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                y3b y3bVar = (y3b) obj;
                y3bVar.getClass();
                y3bVar.b("url", str);
                y3bVar.a(str2.length(), "cookiesLength");
                y3bVar.a(length, "indeedComMCookiesLength");
                y3bVar.a(andSet, "lastIndeedComMCookiesLength");
                y3bVar.a(r1 - r2, "cookiesLengthDifference");
                LinkedHashMap linkedHashMap2 = linkedHashMap;
                ArrayList arrayList2 = new ArrayList(linkedHashMap2.size());
                for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                    arrayList2.add(entry2.getKey() + "=" + entry2.getValue());
                }
                y3bVar.b("duplicateCookies", z92.W0(z92.o1(arrayList2), ";", null, null, null, 62));
                y3bVar.a(setKeySet.size(), "duplicateCookiesCount");
                y3bVar.a(set.size(), "prevDuplicateCookiesCount");
                return j6g.a;
            }
        });
        g3a<jz2<String>> g3aVar = ri3.a;
        gu5<j6g> gu5Var = this.b0;
        if (gu5Var != null) {
            gu5Var.invoke();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        super.onPageCommitVisible(webView, str);
        if (!pyd.h0 || u63.a0(-1, 0, 1, 2).contains(Integer.valueOf(((kr7) cr8.p(kr7.class)).e("rnhp_parent_test").a))) {
            ((t1g) cr8.p(t1g.class)).a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        String str2;
        int i;
        int i2 = 0;
        webView.getClass();
        str.getClass();
        AppStartupTimes appStartupTimes = AppStartupTimes.a;
        AppStartupTimes.a("webview_page_finished_start");
        r97.a.getClass();
        if (r97.j(str)) {
            d2f d2fVar = c87.a;
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.getClass();
            String strB = c87.a.b(cookieManager, str, ez2.b);
            String str3 = this.k0;
            if (str3 != null && !zve.U(str3) && !wl7.b(this.k0, strB)) {
                ArrayList arrayList = lz2.a;
                lz2.b("IndeedWebViewClient", l5.m("URL: ", str, " has caused a CTK change."), false, new Throwable());
            }
        }
        na0 na0Var = this.a0;
        if (na0Var != null) {
            na0Var.invoke(str);
        }
        pgd pgdVarB = yhg.a.b(str, str);
        tx5 tx5Var = o0b.a;
        boolean z = this instanceof ai8;
        o0b.b((Logger) (z ? ((ai8) this).d() : (qpd) xh8.a.a().a.b).a(null, fwc.a.b(Logger.class), null), (gz4) this.h0.getValue(), o0b.a.PageFinished, this.V, str, pgdVarB, this.q0);
        Lazy lazy = b23.a;
        if (r97.h(str) && !b23.b.getAndSet(true)) {
            ((gz4) b23.a.getValue()).a("droid_country_check", new a23(str, i2));
        }
        if (!mab.c.getAndSet(true)) {
            try {
                str2 = AppWidgetManager.getInstance((Context) mab.a.getValue()).isRequestPinAppWidgetSupported() ? "yes" : "no";
            } catch (Exception e) {
                ArrayList arrayList2 = lz2.a;
                lz2.c("PinnedWidgetCheck", "Crash when calling isRequestPinAppWidgetSupported()", false, e, 4);
                str2 = "exception";
            }
            ((gz4) mab.b.getValue()).a("pinned_widget_check", new wq9(str2, 1));
        }
        bu8 bu8Var = bu8.a;
        boolean zI = bu8Var.i();
        boolean zA = hjg.a.a();
        Lazy lazy2 = this.o0;
        if (!zI && zA) {
            ((cya) lazy2.getValue()).a();
        }
        if (!zI || zA) {
            i = 1;
        } else {
            cya cyaVar = (cya) lazy2.getValue();
            cyaVar.getClass();
            ArrayList arrayList3 = lz2.a;
            lz2.d("PULSEngine", "updateSignOutComplete()", false, null);
            Lazy<s87> lazy3 = s87.f;
            s87.a.a((gz4) cyaVar.b.getValue(), new lx5("navigation_sign_out", "navigation", "signOut", 1, cyaVar.c.a, vy5.b));
            g4a g4aVar = ((cp7) cyaVar.d.getValue()).a;
            Boolean bool = Boolean.FALSE;
            ((gme) g4aVar).setValue(bool);
            il0.a.getClass();
            rj0 rj0Var = bu8.e;
            qf8<Object>[] qf8VarArr = bu8.b;
            i = 1;
            rj0Var.f(qf8VarArr[1], bu8Var, "");
            bu8.d.f(qf8VarArr[0], bu8Var, "");
            bu8.f.b(qf8VarArr[2], bu8Var, 0L);
            bu8.V.f(qf8VarArr[3], bu8Var, "");
            bu8Var.k(false);
            bu8.X.f(qf8VarArr[5], bu8Var, "");
            bu8.Y.f(qf8VarArr[6], bu8Var, "");
            bu8.H0.b(qf8VarArr[45], bu8Var, bool);
            il0.Y.k(0);
            iq6.b.clear();
            il0.V.set(hh1.e());
            u63.Y((e13) cyaVar.W.getValue(), null, null, new dya(2, null), 3);
            ((fpb) cyaVar.f.getValue()).b(zob.SignOut);
            ((v49) cyaVar.e.getValue()).d();
        }
        ((r.b) this.j0.getValue()).c("webview.showLocales");
        LaunchActivity launchActivity = this.f;
        u63.Y(hh1.A(launchActivity), null, null, new a(str, null), 3);
        if (pgdVarB instanceof pgd.p) {
            WebBackForwardList webBackForwardListCopyBackForwardList = webView.copyBackForwardList();
            webBackForwardListCopyBackForwardList.getClass();
            if (webBackForwardListCopyBackForwardList.getSize() > i && !wl7.b(webBackForwardListCopyBackForwardList.getItemAtIndex(webBackForwardListCopyBackForwardList.getSize() - 2).getUrl(), str)) {
                webView.clearHistory();
            }
            Context context = webView.getContext();
            context.getClass();
            c87.a(context);
            p1g p1gVar = (p1g) cr8.p(p1g.class);
            lr5 lr5VarU = launchActivity.u();
            lr5VarU.getClass();
            p1gVar.b(launchActivity, lr5VarU);
            if (!pyd.h0 || u63.a0(-1, 0, 1, 2).contains(Integer.valueOf(((kr7) cr8.p(kr7.class)).e("rnhp_parent_test").a))) {
                ((t1g) cr8.p(t1g.class)).e();
                dd4 dd4Var = dd4.a;
                ad4 ad4Var = dd4.n().a;
                ad4Var.getClass();
                if (ad4Var.e(cd4.a.C1) != cd4.l0.a.getValue()) {
                    ((t1g) cr8.p(t1g.class)).b();
                }
            }
        } else if (pgdVarB instanceof pgd.q) {
            Context context2 = webView.getContext();
            context2.getClass();
            c87.a(context2);
        }
        AppStartupTimes appStartupTimes2 = AppStartupTimes.a;
        AppStartupTimes.a("webview_page_finished_end");
        md2 md2Var = new md2(2);
        md2Var.b("appTrace");
        md2Var.c(new String[]{"startup", "timeToFullDisplay"});
        ArrayList arrayList4 = (ArrayList) md2Var.a;
        jpf.c(0, z92.W0(u63.a0(arrayList4.toArray(new String[arrayList4.size()])), "|", null, null, null, 62));
        r97.a.getClass();
        if (r97.h(str)) {
            ((p1g) cr8.p(p1g.class)).a();
        }
        super.onPageFinished(webView, str);
        if (webView instanceof ac1) {
            ac1 ac1Var = (ac1) webView;
            if (ac1Var.getUrl() == null || !ac1Var.getA()) {
                return;
            }
            String strA = ixg.a.a.a();
            s98.a aVar = s98.d;
            mve mveVar = mve.a;
            webView.evaluateJavascript(l5.m("\n            (() => {\n                try {\n                    window.JSMABridgeReceiver && window.JSMABridgeReceiver.receiveWindowEvent(JSON.stringify(", aVar.b(qp1.a(mveVar, mveVar), kc9.W(new Pair("event", strA))), "));\n                    return \"Sent\";\n                } catch (error) {\n                    return JSON.stringify({ error: error.message });\n                }\n            })();\n        "), new hxg(webView, strA));
            ac1Var.a = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        String strB;
        webView.getClass();
        str.getClass();
        r97.a.getClass();
        if (r97.r(str)) {
            webView.evaluateJavascript((String) ((d2f) this.p0.b).getValue(), null);
        }
        if (r97.j(str)) {
            d2f d2fVar = c87.a;
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.getClass();
            strB = c87.a.b(cookieManager, str, ez2.b);
        } else {
            strB = null;
        }
        this.k0 = strB;
        tx5 tx5Var = o0b.a;
        o0b.b((Logger) (this instanceof ai8 ? ((ai8) this).d() : (qpd) xh8.a.a().a.b).a(null, fwc.a.b(Logger.class), null), (gz4) this.h0.getValue(), o0b.a.PageStarted, this.V, str, null, 200L);
        super.onPageStarted(webView, str, bitmap);
        this.q0 = 200L;
        gu5<j6g> gu5Var = this.f0;
        if (gu5Var != null) {
            gu5Var.invoke();
        }
    }

    @Override // defpackage.hc1, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        webView.getClass();
        webResourceRequest.getClass();
        webResourceError.getClass();
        if (!webResourceRequest.isForMainFrame()) {
            ArrayList arrayList = lz2.a;
            lz2.a("IndeedWebViewClient", "Error loading non-main-page resource", String.valueOf(webResourceRequest.getUrl()));
            return;
        }
        String string = webResourceRequest.getUrl().toString();
        string.getClass();
        int errorCode = webResourceError.getErrorCode();
        String string2 = webResourceError.getDescription().toString();
        if (errorCode == -1 && wl7.b(string2, "net::ERR_FAILED")) {
            return;
        }
        this.q0 = 0L;
        Lazy lazy = wwg.a;
        wwg.a(nxg.Internal, string, errorCode, string2);
        StringBuilder sb = new StringBuilder("description : ");
        ia.r(sb, string2, "\nurl : ", string, "\nerrorCode : ");
        sb.append(errorCode);
        String string3 = sb.toString();
        ArrayList arrayList2 = lz2.a;
        lz2.b("IndeedWebViewClient", v40.c(errorCode, "WebView Network Error, errorCode=", ", desc=", string2), false, new Throwable(string3));
        nn0 nn0Var = nn0.a;
        this.X.invoke(nn0.e() ? ex4.a : ex4.b);
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (webResourceRequest != null && webResourceRequest.isForMainFrame() && webResourceResponse != null) {
            this.q0 = webResourceResponse.getStatusCode();
        }
        this.i0.a(webResourceRequest, webResourceResponse);
        List listA0 = u63.a0(Integer.valueOf(DataOkHttpUploader.HTTP_UNAUTHORIZED), Integer.valueOf(DataOkHttpUploader.HTTP_FORBIDDEN), Integer.valueOf(DataOkHttpUploader.HTTP_TOO_MANY_REQUESTS));
        if (webResourceRequest != null && webResourceResponse != null) {
            ArrayList arrayList = lz2.a;
            Log.d("IndeedWebViewClient", "ErrorCode: " + webResourceResponse.getStatusCode() + " Url:" + webResourceRequest.getUrl(), null);
            if (webResourceRequest.isForMainFrame() && !listA0.contains(Integer.valueOf(webResourceResponse.getStatusCode()))) {
                this.X.invoke(ex4.a);
            }
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) throws UnsupportedEncodingException {
        webResourceRequest.getClass();
        if (webResourceRequest.isForMainFrame()) {
            ep5 ep5Var = ep5.a;
            String string = webResourceRequest.getUrl().toString();
            string.getClass();
            ep5Var.g(string);
        }
        if (!pyd.h0 || u63.a0(-1, 0, 1, 2).contains(Integer.valueOf(((kr7) cr8.p(kr7.class)).e("rnhp_parent_test").a))) {
            ((t1g) cr8.p(t1g.class)).c();
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0227, code lost:
    
        if (defpackage.pkf.b(r1, r0) != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0275, code lost:
    
        if (r12.W != false) goto L124;
     */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.hc1, android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView r13, android.webkit.WebResourceRequest r14) throws java.io.UnsupportedEncodingException {
        /*
            Method dump skipped, instruction units count: 985
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y97.shouldOverrideUrlLoading(android.webkit.WebView, android.webkit.WebResourceRequest):boolean");
    }
}
