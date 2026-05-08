package defpackage;

import android.webkit.WebView;
import com.indeed.android.jobsearch.LaunchActivity;
import com.indeed.android.jobsearch.webview.modal.ModalWebview;
import com.indeed.android.jsmappservices.bridge.BridgeDispatcher;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class k98 implements ora, vqa {
    public final LaunchActivity a;
    public final rj0 b;

    public k98(LaunchActivity launchActivity) {
        launchActivity.getClass();
        this.a = launchActivity;
        this.b = new rj0(launchActivity);
    }

    @Override // defpackage.vqa
    public final void a(WebView webView, String str) {
        r97.a.getClass();
        if (r97.r(str)) {
            webView.evaluateJavascript((String) ((d2f) this.b.b).getValue(), null);
        }
    }

    @Override // defpackage.ora
    public final void b(ModalWebview modalWebview, Function1 function1, Function1 function12, Function1 function13) {
        modalWebview.getClass();
        modalWebview.addJavascriptInterface(new BridgeDispatcher(this.a, modalWebview, new a14(r97.a, 1), new j98(this, function1, function12, function13)), "jsmNativeInterfaceV2");
    }
}
