package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.datadog.android.rum.internal.instrumentation.gestures.WindowCallbackWrapper;
import defpackage.lx5;
import defpackage.s87;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class vw9 extends zb1 {
    public final z8<Intent> V;
    public final Function1<String, j6g> W;
    public final String X;
    public final Lazy Y;
    public final Lazy Z;
    public final tx5 a0;
    public final String b0;
    public final Lazy c0;
    public final gu5<String> f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw9(gu5 gu5Var, gu5 gu5Var2, z8 z8Var, wa waVar, vk3 vk3Var) {
        super(gu5Var, gu5Var2, vk3Var);
        z8Var.getClass();
        this.f = gu5Var2;
        this.V = z8Var;
        this.W = waVar;
        this.X = nxg.Internal.a();
        sw9 sw9Var = new sw9(this);
        qt8 qt8Var = qt8.a;
        this.Y = boa.E(qt8Var, sw9Var);
        this.Z = boa.E(qt8Var, new tw9(this));
        this.a0 = new tx5();
        this.b0 = "modal-file-picker";
        this.c0 = boa.E(qt8Var, new uw9(this));
    }

    @Override // defpackage.zb1
    public final Intent b(WebChromeClient.FileChooserParams fileChooserParams, String str) {
        String strI;
        String[] acceptTypes = fileChooserParams.getAcceptTypes();
        acceptTypes.getClass();
        if (str != null) {
            Uri uri = Uri.parse(str);
            uri.getClass();
            r97.a.getClass();
            strI = wea.i(r97.j(str), uri);
        } else {
            strI = "null";
        }
        Lazy<s87> lazy = s87.f;
        s87.a.a((gz4) this.Y.getValue(), tx5.g(this.a0, this.b0, new mt(8, acceptTypes, strI), 2));
        return sug.a(fileChooserParams);
    }

    @Override // defpackage.zb1
    public final String c(String str) {
        return "";
    }

    @Override // defpackage.zb1
    public final String e() {
        return this.X;
    }

    @Override // defpackage.zb1
    public final void f(final int i, String str, final String str2, final String str3) {
        Uri uri = Uri.parse(str);
        uri.getClass();
        r97.a.getClass();
        final String strI = wea.i(r97.j(str), uri);
        Lazy<s87> lazy = s87.f;
        s87.a.a((gz4) this.Y.getValue(), this.a0.q(this.b0, new Function1() { // from class: rw9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                lx5.b bVar = (lx5.b) obj;
                bVar.getClass();
                bVar.a("sourceUrl", strI);
                bVar.b("resultCode", Long.valueOf(i));
                bVar.a("resultString", str2);
                bVar.a("resultExtras", str3);
                return j6g.a;
            }
        }));
    }

    @Override // defpackage.zb1
    public final void g(String str) {
        Lazy<s87> lazy = s87.f;
        s87.a.a((gz4) this.Y.getValue(), tx5.i(this.a0, this.b0, WindowCallbackWrapper.BACK_DEFAULT_TARGET_NAME, new hv2(str, 2), 4));
    }

    @Override // defpackage.zb1
    public final void h(Intent intent) {
        intent.getClass();
        this.V.a(intent);
    }

    @Override // defpackage.zb1, android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String strMessage;
        consoleMessage.getClass();
        if (consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR && (strMessage = consoleMessage.message()) != null && strMessage.length() != 0) {
            ((vwg) this.Z.getValue()).a(consoleMessage, this.f.invoke(), this.X);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // defpackage.zb1, android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        webView.getClass();
        str.getClass();
        str2.getClass();
        jsResult.getClass();
        jsResult.confirm();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        Function1<String, j6g> function1 = this.W;
        if (function1 != null) {
            function1.invoke(String.valueOf(webView != null ? webView.getUrl() : null));
        }
    }
}
