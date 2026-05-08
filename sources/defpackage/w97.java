package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import com.datadog.android.rum.internal.instrumentation.gestures.WindowCallbackWrapper;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.webview.IndeedWebView;
import defpackage.lx5;
import defpackage.s87;
import defpackage.xh8;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class w97 extends zb1 {
    public final Function1<Intent, j6g> V;
    public final uw W;
    public final Lazy X;
    public final Lazy Y;
    public final tx5 Z;
    public final String a0;
    public final String b0;
    public final xh f;

    public w97(qa qaVar, xh xhVar, Function1 function1, uw uwVar) {
        super(qaVar, xhVar, null);
        this.f = xhVar;
        this.V = function1;
        this.W = uwVar;
        u97 u97Var = new u97(this);
        qt8 qt8Var = qt8.a;
        this.X = boa.E(qt8Var, u97Var);
        this.Y = boa.E(qt8Var, new v97(this));
        this.Z = new tx5();
        this.a0 = "indeed-file-picker";
        this.b0 = nxg.Internal.a();
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
        s87.a.a((gz4) this.X.getValue(), tx5.g(this.Z, this.a0, new zi(2, acceptTypes, strI), 2));
        return sug.a(fileChooserParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zb1
    public final String c(String str) {
        String string = ((Context) (this instanceof ai8 ? ((ai8) this).d() : (qpd) xh8.a.a().a.b).a(null, fwc.a.b(Context.class), null)).getString(R.string.app_name_pointer);
        string.getClass();
        return string;
    }

    @Override // defpackage.zb1
    public final String e() {
        return this.b0;
    }

    @Override // defpackage.zb1
    public final void f(final int i, String str, final String str2, final String str3) {
        Uri uri = Uri.parse(str);
        uri.getClass();
        r97.a.getClass();
        final String strI = wea.i(r97.j(str), uri);
        Lazy<s87> lazy = s87.f;
        s87.a.a((gz4) this.X.getValue(), this.Z.q(this.a0, new Function1() { // from class: t97
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
        s87.a.a((gz4) this.X.getValue(), tx5.i(this.Z, this.a0, WindowCallbackWrapper.BACK_DEFAULT_TARGET_NAME, new vz4(str, 1), 4));
    }

    @Override // defpackage.zb1
    public final void h(Intent intent) {
        intent.getClass();
        this.V.invoke(intent);
    }

    @Override // defpackage.zb1, android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String strMessage;
        consoleMessage.getClass();
        if (consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR && (strMessage = consoleMessage.message()) != null && strMessage.length() != 0) {
            ((vwg) this.Y.getValue()).a(consoleMessage, ((IndeedWebView) this.f.b).getUrl(), this.b0);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        str.getClass();
        callback.getClass();
        this.W.invoke(str, callback);
    }

    @Override // defpackage.zb1, android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        permissionRequest.getClass();
        permissionRequest.grant(permissionRequest.getResources());
    }
}
