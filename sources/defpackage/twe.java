package defpackage;

import android.app.Activity;
import android.app.Application;
import android.net.Uri;
import android.os.Build;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.webview.external.b;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class twe {
    public final ViewGroup a;
    public final j30 b;
    public final View c;
    public final a d;
    public final WebView e;

    public final class a extends WebChromeClient {
        public final WebChromeClient a;
        public final /* synthetic */ twe b;

        public a(twe tweVar, WebChromeClient webChromeClient) {
            webChromeClient.getClass();
            this.b = tweVar;
            this.a = webChromeClient;
        }

        @Override // android.webkit.WebChromeClient
        public final void onCloseWindow(WebView webView) {
            webView.getClass();
            this.b.a();
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            webView.getClass();
            message.getClass();
            ArrayList arrayList = lz2.a;
            lz2.c("SubWindow", "SubWindow cannot open a new window", false, null, 12);
            return false;
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            webView.getClass();
            str.getClass();
            str2.getClass();
            jsResult.getClass();
            return this.a.onJsAlert(webView, str, str2, jsResult);
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
            webView.getClass();
            str.getClass();
            str2.getClass();
            jsResult.getClass();
            return this.a.onJsBeforeUnload(webView, str, str2, jsResult);
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            webView.getClass();
            str.getClass();
            str2.getClass();
            jsResult.getClass();
            return this.a.onJsConfirm(webView, str, str2, jsResult);
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            webView.getClass();
            str.getClass();
            str2.getClass();
            str3.getClass();
            jsPromptResult.getClass();
            return this.a.onJsPrompt(webView, str, str2, str3, jsPromptResult);
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            webView.getClass();
            valueCallback.getClass();
            fileChooserParams.getClass();
            return this.a.onShowFileChooser(webView, valueCallback, fileChooserParams);
        }
    }

    public twe(Activity activity, ViewGroup viewGroup, b bVar, WebChromeClient webChromeClient, j30 j30Var) {
        activity.getClass();
        viewGroup.getClass();
        webChromeClient.getClass();
        this.a = viewGroup;
        this.b = j30Var;
        View viewInflate = activity.getLayoutInflater().inflate(R.layout.browser_subwindow, (ViewGroup) null);
        viewInflate.getClass();
        this.c = viewInflate;
        a aVar = new a(this, webChromeClient);
        this.d = aVar;
        WebView webView = new WebView(activity);
        this.e = webView;
        webView.setWebViewClient(bVar);
        webView.setWebChromeClient(aVar);
        WebSettings settings = webView.getSettings();
        settings.getClass();
        settings.setJavaScriptEnabled(true);
        settings.setCacheMode(-1);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        if (Build.VERSION.SDK_INT >= 28) {
            String processName = Application.getProcessName();
            String packageName = webView.getContext().getPackageName();
            if (!wl7.b(packageName, processName)) {
                ArrayList arrayList = lz2.a;
                lz2.h("SubWindow", t40.l("Forced to set process name for WebView. Process Name: ", processName, " :: Package Name: ", packageName), null, 12);
                WebView.setDataDirectorySuffix(processName);
            }
        }
        ((ViewGroup) viewInflate.findViewById(R.id.subwindow_inner_container)).addView(webView, new ViewGroup.LayoutParams(-1, -1));
        ((ImageButton) viewInflate.findViewById(R.id.closeSubwindow)).setOnClickListener(new View.OnClickListener() { // from class: swe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                twe tweVar = this.a;
                tweVar.d.onCloseWindow(tweVar.e);
            }
        });
        viewGroup.addView(viewInflate, new FrameLayout.LayoutParams(-1, -1));
        webView.requestFocus();
    }

    public final void a() {
        View view = this.c;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.subwindow_inner_container);
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        this.a.removeView(view);
        this.e.destroy();
        this.b.invoke();
    }
}
