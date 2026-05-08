package defpackage;

import android.annotation.SuppressLint;
import android.webkit.WebView;
import com.indeed.android.jobsearch.LaunchActivity;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.webview.javascript.JavaScriptInterface;
import com.indeed.android.jobsearch.webview.modal.ModalWebview;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class s0b implements ora, uqa {
    public final JavaScriptInterface a;

    @SuppressLint({"HandlerLeak"})
    public final r0b b;

    public s0b(LaunchActivity launchActivity, qv8 qv8Var, eqg eqgVar) {
        this.a = new JavaScriptInterface(launchActivity, qv8Var);
        new g3a();
        this.b = new r0b(eqgVar);
    }

    @Override // defpackage.ora
    public final void b(ModalWebview modalWebview, Function1 function1, Function1 function12, Function1 function13) {
        modalWebview.getClass();
        modalWebview.addJavascriptInterface(this.a, "Android");
    }

    @Override // defpackage.uqa
    public final void f(WebView webView, String str) {
        JavaScriptInterface javaScriptInterface = this.a;
        javaScriptInterface.getClass();
        r0b r0bVar = this.b;
        r0bVar.getClass();
        int iIncrementAndGet = javaScriptInterface.c.incrementAndGet();
        Map<String, l98> map = javaScriptInterface.d;
        map.getClass();
        map.put(String.valueOf(iIncrementAndGet), r0bVar);
        String string = webView.getResources().getString(R.string.jscall_wrapper);
        string.getClass();
        String string2 = webView.getResources().getString(R.string.jscall_getPageMetadata);
        string2.getClass();
        webView.loadUrl("javascript:".concat(new pxc("\\s+").e(String.format(string, Arrays.copyOf(new Object[]{string2, Integer.valueOf(iIncrementAndGet), "#jsCallError:"}, 3)), " ")));
    }
}
