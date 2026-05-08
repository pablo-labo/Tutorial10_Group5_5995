package defpackage;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.datadog.android.log.Logger;
import defpackage.o0b;
import defpackage.xh8;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class p0b implements vqa, uqa, cra, dra, xh8 {
    public final nxg a;
    public final gu5<j6g> b;
    public final Lazy c;
    public final Lazy d;
    public long e;

    public static final class a extends mj8 implements gu5<gz4> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p0b p0bVar) {
            super(0);
            this.$this_inject = p0bVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [gz4, java.lang.Object] */
        @Override // defpackage.gu5
        public final gz4 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(gz4.class), a9cVar);
        }
    }

    public static final class b extends mj8 implements gu5<Logger> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p0b p0bVar) {
            super(0);
            this.$this_inject = p0bVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [com.datadog.android.log.Logger, java.lang.Object] */
        @Override // defpackage.gu5
        public final Logger invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(Logger.class), a9cVar);
        }
    }

    public p0b(nxg nxgVar, gu5<j6g> gu5Var) {
        this.a = nxgVar;
        this.b = gu5Var;
        a aVar = new a(this);
        qt8 qt8Var = qt8.a;
        this.c = boa.E(qt8Var, aVar);
        this.d = boa.E(qt8Var, new b(this));
        this.e = 200L;
    }

    @Override // defpackage.vqa
    public final void a(WebView webView, String str) {
        this.e = 200L;
        tx5 tx5Var = o0b.a;
        o0b.b((Logger) this.d.getValue(), (gz4) this.c.getValue(), o0b.a.PageStarted, this.a.a(), str, null, 200L);
        gu5<j6g> gu5Var = this.b;
        if (gu5Var != null) {
            gu5Var.invoke();
        }
    }

    @Override // defpackage.uqa
    public final void f(WebView webView, String str) {
        tx5 tx5Var = o0b.a;
        o0b.b((Logger) this.d.getValue(), (gz4) this.c.getValue(), o0b.a.PageFinished, this.a.a(), str, null, this.e);
    }

    @Override // defpackage.cra
    public final void g(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (webResourceRequest.isForMainFrame()) {
            this.e = 0L;
        }
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    @Override // defpackage.dra
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (webResourceRequest.isForMainFrame()) {
            this.e = webResourceResponse.getStatusCode();
        }
    }
}
