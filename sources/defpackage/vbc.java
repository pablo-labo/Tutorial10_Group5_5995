package defpackage;

import android.content.ComponentCallbacks2;
import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.reactnativecommunity.webview.RNCWebViewModule;
import defpackage.wbc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class vbc extends WebChromeClient implements LifecycleEventListener {
    public static final FrameLayout.LayoutParams c0 = new FrameLayout.LayoutParams(-1, -1, 17);
    public String V;
    public final wbc a;
    public View b;
    public WebChromeClient.CustomViewCallback c;
    public PermissionRequest d;
    public ArrayList e;
    public GeolocationPermissions.Callback f;
    public boolean W = false;
    public final ArrayList X = new ArrayList();
    public wbc.c Y = null;
    public boolean Z = false;
    public boolean a0 = false;
    public final tk3 b0 = new tk3(this, 6);

    public class a extends WebViewClient {
        public final /* synthetic */ WebView a;

        public a(WebView webView) {
            this.a = webView;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("targetUrl", str);
            WebView webView2 = this.a;
            ((wbc) webView2).a(webView2, new tof(icc.a(webView2), writableMapCreateMap));
            return true;
        }
    }

    public vbc(wbc wbcVar) {
        this.a = wbcVar;
    }

    public final synchronized void a(List<String> list) {
        if (this.W) {
            this.X.addAll(list);
            return;
        }
        ComponentCallbacks2 currentActivity = this.a.getThemedReactContext().a.getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
        }
        if (!(currentActivity instanceof f8b)) {
            throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
        }
        this.W = true;
        ((f8b) currentActivity).x((String[]) list.toArray(new String[0]), 3, this.b0);
        this.X.clear();
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView webView2 = new WebView(webView.getContext());
        if (this.a0) {
            webView2.setWebViewClient(new a(webView));
        }
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        if (ot2.a(this.a.getThemedReactContext(), "android.permission.ACCESS_FINE_LOCATION") == 0) {
            callback.invoke(str, true, false);
            return;
        }
        this.f = callback;
        this.V = str;
        a(Collections.singletonList("android.permission.ACCESS_FINE_LOCATION"));
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
        View view = this.b;
        if (view == null || view.getSystemUiVisibility() == 7942) {
            return;
        }
        this.b.setSystemUiVisibility(7942);
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        this.e = new ArrayList();
        ArrayList arrayList = new ArrayList();
        String[] resources = permissionRequest.getResources();
        int length = resources.length;
        int i = 0;
        while (true) {
            String str = null;
            if (i >= length) {
                break;
            }
            String str2 = resources[i];
            if (str2.equals("android.webkit.resource.AUDIO_CAPTURE")) {
                str = "android.permission.RECORD_AUDIO";
            } else if (str2.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                str = "android.permission.CAMERA";
            } else if (str2.equals("android.webkit.resource.PROTECTED_MEDIA_ID")) {
                if (this.Z) {
                    this.e.add(str2);
                } else {
                    str = "android.webkit.resource.PROTECTED_MEDIA_ID";
                }
            }
            if (str != null) {
                if (ot2.a(this.a.getThemedReactContext(), str) == 0) {
                    this.e.add(str2);
                } else {
                    arrayList.add(str);
                }
            }
            i++;
        }
        if (arrayList.isEmpty()) {
            permissionRequest.grant((String[]) this.e.toArray(new String[0]));
            this.e = null;
        } else {
            this.d = permissionRequest;
            a(arrayList);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        String url = webView.getUrl();
        if (this.Y.a) {
            return;
        }
        int iA = icc.a(webView);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("target", iA);
        writableMapCreateMap.putString("title", webView.getTitle());
        writableMapCreateMap.putString("url", url);
        writableMapCreateMap.putBoolean("canGoBack", webView.canGoBack());
        writableMapCreateMap.putBoolean("canGoForward", webView.canGoForward());
        writableMapCreateMap.putDouble(ReactProgressBarViewManager.PROP_PROGRESS, i / 100.0f);
        dmc.e(this.a.getThemedReactContext(), iA).a(new hof(iA, writableMapCreateMap));
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        String[] acceptTypes = fileChooserParams.getAcceptTypes();
        boolean z = fileChooserParams.getMode() == 1;
        mkf themedReactContext = this.a.getThemedReactContext();
        themedReactContext.getClass();
        return ((RNCWebViewModule) themedReactContext.a.getNativeModule(RNCWebViewModule.class)).startPhotoPickerIntent(valueCallback, acceptTypes, z, fileChooserParams.isCaptureEnabled());
    }
}
