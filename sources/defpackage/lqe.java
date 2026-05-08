package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.WebView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.c;
import com.datadog.android.log.Logger;
import com.indeed.android.jobsearch.R;
import defpackage.pgd;
import defpackage.xh8;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class lqe implements xh8 {
    public static final lqe a;
    public static final Lazy b;

    public enum a {
        AutoCancelWithDialog("autocancel-dialog"),
        AutoCancelSilently("autocancel-silent");

        private final String logValue;

        a(String str) {
            this.logValue = str;
        }

        public final String a() {
            return this.logValue;
        }
    }

    public static final class b extends mj8 implements gu5<gz4> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(lqe lqeVar) {
            super(0);
            this.$this_inject = lqeVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [gz4, java.lang.Object] */
        @Override // defpackage.gu5
        public final gz4 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(gz4.class), a9cVar);
        }
    }

    static {
        lqe lqeVar = new lqe();
        a = lqeVar;
        b = boa.E(qt8.a, new b(lqeVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a a(Activity activity, String str, final WebView webView, final SslError sslError) {
        final a aVar;
        String strI;
        String strI2;
        String url;
        activity.getClass();
        String url2 = webView.getUrl() != null ? webView.getUrl() : sslError.getUrl();
        ArrayList arrayList = lz2.a;
        int primaryError = sslError.getPrimaryError();
        String url3 = webView.getUrl();
        String url4 = sslError.getUrl();
        StringBuilder sbJ = m6.j(primaryError, "Autocanceling loading resources with SSL error ", ".  webview url: ", url3, "  error url: ");
        sbJ.append(url4);
        pgd.n0 n0Var = null;
        lz2.c("SslErrorHelper", sbJ.toString(), true, null, 8);
        if (str == null || !str.equals(sslError.getUrl())) {
            aVar = a.AutoCancelSilently;
        } else {
            if (!activity.isFinishing()) {
                String string = activity.getString(R.string.security_dialog_message);
                int primaryError2 = sslError.getPrimaryError();
                String strValueOf = primaryError2 != 0 ? primaryError2 != 1 ? primaryError2 != 2 ? primaryError2 != 3 ? primaryError2 != 4 ? primaryError2 != 5 ? String.valueOf(primaryError2) : "SSL_INVALID" : "SSL_DATE_INVALID" : "SSL_UNTRUSTED" : "SSL_IDMISMATCH" : "SSL_EXPIRED" : "SSL_NOTYETVALID";
                String str2 = string + "\n\n" + strValueOf + "\n" + sslError.getUrl();
                c.a aVar2 = new c.a(activity);
                AlertController.b bVar = aVar2.a;
                bVar.d = bVar.a.getText(R.string.security_dialog_title);
                bVar.f = str2;
                aVar2.setPositiveButton(android.R.string.ok, null).b();
            }
            aVar = a.AutoCancelWithDialog;
        }
        if (url2 == null || url2.length() == 0) {
            lz2.c("SslErrorHelper", "onReceivedSslError: " + sslError.getPrimaryError() + " " + aVar, false, null, 12);
        } else {
            lz2.a("SslErrorHelper", "onReceivedSslError: " + sslError.getPrimaryError() + " " + aVar, url2);
        }
        Logger logger = (Logger) (this instanceof ai8 ? ((ai8) this).d() : (qpd) xh8.a.a().a.b).a(null, fwc.a.b(Logger.class), null);
        Pair pair = new Pair("error_code", String.valueOf(sslError.getPrimaryError()));
        if (webView.getUrl() != null) {
            Uri uri = Uri.parse(webView.getUrl());
            uri.getClass();
            strI = wea.i(false, uri);
        } else {
            strI = null;
        }
        Pair pair2 = new Pair("webview_url", strI);
        if (sslError.getUrl() != null) {
            Uri uri2 = Uri.parse(sslError.getUrl());
            uri2.getClass();
            strI2 = wea.i(false, uri2);
        } else {
            strI2 = null;
        }
        Pair pair3 = new Pair("error_url", strI2);
        Pair pair4 = new Pair("user_interaction_type", aVar.toString());
        if (str != null && (url = webView.getUrl()) != null) {
            n0Var = yhg.a.b(str, url).a;
        }
        Logger.i$default(logger, "droidSslError", null, lc9.a0(pair, pair2, pair3, pair4, new Pair("urlType", n0Var)), 2, null);
        ((gz4) b.getValue()).a("droid_ssl_error", new Function1() { // from class: kqe
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                y3b y3bVar = (y3b) obj;
                y3bVar.getClass();
                SslError sslError2 = sslError;
                y3bVar.a(sslError2.getPrimaryError(), "error_code");
                String url5 = webView.getUrl();
                if (url5 != null) {
                    Uri uri3 = Uri.parse(url5);
                    uri3.getClass();
                    y3bVar.b("webview_url", wea.i(false, uri3));
                }
                String url6 = sslError2.getUrl();
                if (url6 != null) {
                    Uri uri4 = Uri.parse(url6);
                    uri4.getClass();
                    y3bVar.b("error_url", wea.i(false, uri4));
                }
                y3bVar.b("user_interaction_type", aVar.a());
                return j6g.a;
            }
        });
        return aVar;
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
