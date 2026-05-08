package defpackage;

import android.app.Activity;
import android.webkit.WebView;
import androidx.media3.session.j;
import androidx.media3.session.q;
import androidx.media3.session.r;
import androidx.media3.session.s;
import androidx.media3.session.v;
import androidx.media3.session.x;
import com.datadog.android.rum.internal.monitor.DatadogRumMonitor;
import com.datadog.android.rum.tracking.ActivityViewTrackingStrategy;
import com.facebook.react.bridge.Promise;
import com.indeed.android.myjobs.rnnextstepsdashboard.RNNextStepsDashboardModule;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.functions.Function1;
import org.webrtc.VideoFileRenderer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p9(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ActivityViewTrackingStrategy.onActivityStopped$lambda$2((ActivityViewTrackingStrategy) obj2, (Activity) obj);
                break;
            case 1:
                WebView webView = (WebView) obj;
                if (((Boolean) ((nt5) obj2).invoke()).booleanValue()) {
                    webView.evaluateJavascript("(function() {\n    function findCookiesAnchor() {\n        var el = document.getElementById('Cookies');\n        if (el) return el;\n\n        el = document.querySelector('[name=\"Cookies\"]');\n        if (el) return el;\n\n        el = document.querySelector('a[href*=\"#Cookies\"]');\n        if (el) return el;\n\n        var headings = document.querySelectorAll('h1, h2, h3, h4');\n        for (var i = 0; i < headings.length; i++) {\n            if (headings[i].textContent.indexOf('Cookies') !== -1) {\n                return headings[i];\n            }\n        }\n        return null;\n    }\n\n    var maxAttempts = 20;\n    var attempt = 0;\n    function tryScroll() {\n        var anchor = findCookiesAnchor();\n        if (anchor) {\n            var rect = anchor.getBoundingClientRect();\n            var absoluteTop = rect.top + window.scrollY;\n            window.scrollTo(0, absoluteTop);\n        } else if (++attempt < maxAttempts) {\n            setTimeout(tryScroll, 200);\n        }\n    }\n    tryScroll();\n})();", null);
                    break;
                }
                break;
            case 2:
                DatadogRumMonitor.getCurrentSessionId$lambda$2((DatadogRumMonitor) obj2, (Function1) obj);
                break;
            case 3:
                ((s) obj2).g.m1((r.d) obj, Integer.MIN_VALUE, 11, x.o1(new o6(14)));
                break;
            case 4:
                r rVar = (r) obj;
                q.a aVar = (q.a) ((v) obj2).a().V.remove(rVar);
                if (aVar != null) {
                    sg9 sg9Var = aVar.a;
                    if (!sg9Var.cancel(false)) {
                        try {
                            ((j) aw5.J1(sg9Var)).T0();
                        } catch (CancellationException | ExecutionException e) {
                            zkd.U("MediaController", "MediaController future failed (so we couldn't release it)", e);
                        }
                    }
                }
                rVar.a.v = null;
                break;
            case 5:
                RNNextStepsDashboardModule.close$lambda$2((RNNextStepsDashboardModule) obj2, (Promise) obj);
                break;
            case 6:
                ((VideoFileRenderer) obj2).lambda$release$2((CountDownLatch) obj);
                break;
            default:
                ((Promise) obj2).reject("E_OPERATION_ERROR", (String) obj);
                break;
        }
    }
}
