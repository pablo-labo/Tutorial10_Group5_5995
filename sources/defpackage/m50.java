package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import com.datadog.android.ndk.internal.DatadogNdkCrashHandler;
import com.facebook.react.modules.debug.DevSettingsModule;
import com.google.firebase.installations.a;
import com.indeed.android.jobsearch.webview.IndeedWebView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m50(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((gu5) obj).invoke();
                break;
            case 1:
                View viewFocusSearch = ((ViewGroup) obj).focusSearch(130);
                if (viewFocusSearch != null) {
                    viewFocusSearch.requestFocus();
                }
                break;
            case 2:
                DatadogNdkCrashHandler.prepareData$lambda$0((DatadogNdkCrashHandler) obj);
                break;
            case 3:
                DevSettingsModule.reload$lambda$0((DevSettingsModule) obj);
                break;
            case 4:
                ((m45) obj).measureAndLayout();
                break;
            case 5:
                ((a) obj).b();
                break;
            case 6:
                ((uqg) obj).invoke();
                break;
            default:
                IndeedWebView indeedWebView = (IndeedWebView) obj;
                if (!wuf.g("WEB_AUTHENTICATION")) {
                    ArrayList arrayList = lz2.a;
                    lz2.h("WebViewUtils", "WebAuthn is not supported in WebView", null, 12);
                } else {
                    WebSettings settings = indeedWebView.getSettings();
                    if (!xwg.f.d()) {
                        b0.u("This method is not supported by the current version of the framework and the current WebView APK");
                    } else {
                        cwg.a(settings).j();
                    }
                }
                break;
        }
    }
}
