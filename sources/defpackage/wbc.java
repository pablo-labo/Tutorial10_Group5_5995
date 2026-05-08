package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.views.scroll.f;
import com.facebook.react.views.scroll.g;
import com.reactnativecommunity.webview.RNCWebViewMessagingModule;
import defpackage.al1;
import defpackage.ywg;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class wbc extends WebView implements LifecycleEventListener {
    public RNCWebViewMessagingModule V;
    public ybc W;
    public String a;
    public boolean a0;
    public String b;
    public hra b0;
    public d c;
    public boolean c0;
    public xbc d;
    public boolean d0;
    public boolean e;
    public c e0;
    public String f;
    public List<Map<String, String>> f0;
    public WebChromeClient g0;
    public String h0;

    public class a extends ActionMode.Callback2 {
        public final /* synthetic */ ActionMode.Callback a;

        /* JADX INFO: renamed from: wbc$a$a, reason: collision with other inner class name */
        public class C0466a implements ValueCallback<String> {
            public final /* synthetic */ MenuItem a;
            public final /* synthetic */ WritableMap b;
            public final /* synthetic */ ActionMode c;

            public C0466a(MenuItem menuItem, WritableMap writableMap, ActionMode actionMode) {
                this.a = menuItem;
                this.b = writableMap;
                this.c = actionMode;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(String str) {
                String string;
                String str2 = str;
                wbc wbcVar = wbc.this;
                Map<String, String> map = wbcVar.f0.get(this.a.getItemId());
                String str3 = map.get("label");
                WritableMap writableMap = this.b;
                writableMap.putString("label", str3);
                writableMap.putString("key", map.get("key"));
                try {
                    string = new JSONObject(str2).getString("selection");
                } catch (JSONException unused) {
                    string = "";
                }
                writableMap.putString("selectedText", string);
                wbcVar.a(wbcVar, new dof(icc.a(wbcVar), writableMap));
                this.c.finish();
            }
        }

        public a(ActionMode.Callback callback) {
            this.a = callback;
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            wbc.this.evaluateJavascript("(function(){return {selection: window.getSelection().toString()} })()", new C0466a(menuItem, Arguments.createMap(), actionMode));
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            int i = 0;
            while (true) {
                wbc wbcVar = wbc.this;
                if (i >= wbcVar.f0.size()) {
                    return true;
                }
                menu.add(0, i, i, wbcVar.f0.get(i).get("label"));
                i++;
            }
        }

        @Override // android.view.ActionMode.Callback
        public final void onDestroyActionMode(ActionMode actionMode) {
        }

        @Override // android.view.ActionMode.Callback2
        public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
            ActionMode.Callback callback = this.a;
            if (callback instanceof ActionMode.Callback2) {
                ((ActionMode.Callback2) callback).onGetContentRect(actionMode, view, rect);
            } else {
                super.onGetContentRect(actionMode, view, rect);
            }
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ wbc a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public b(wbc wbcVar, String str, String str2) {
            this.a = wbcVar;
            this.b = str;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            wbc wbcVar = wbc.this;
            RNCWebViewMessagingModule rNCWebViewMessagingModule = wbcVar.V;
            ybc ybcVar = wbcVar.W;
            if (ybcVar == null) {
                return;
            }
            String str = this.b;
            wbc wbcVar2 = this.a;
            WritableMap writableMapA = ybcVar.a(wbcVar2, str);
            writableMapA.putString("data", this.c);
            if (rNCWebViewMessagingModule == null) {
                wbcVar.a(wbcVar2, new jof(icc.a(wbcVar2), writableMapA));
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putMap("nativeEvent", writableMapA);
            writableNativeMap.putString("messagingModuleName", wbcVar.f);
            rNCWebViewMessagingModule.onMessage(writableNativeMap);
        }
    }

    public static class c {
        public boolean a;
    }

    public class d {
        public wbc a;

        @JavascriptInterface
        public void postMessage(String str) {
            wbc wbcVar = this.a;
            if (wbcVar.getMessagingEnabled()) {
                wbcVar.post(new o4(2, this, str));
            } else {
                s55.n("RNCWebViewBridge", "ReactNativeWebView.postMessage method was called but messaging is disabled. Pass an onMessage handler to the WebView.");
            }
        }
    }

    public final void a(WebView webView, ox4 ox4Var) {
        dmc.e(getThemedReactContext(), icc.a(webView)).a(ox4Var);
    }

    public final void b() {
        if (getSettings().getJavaScriptEnabled()) {
            StringBuilder sb = new StringBuilder("(function(){\n    window.ReactNativeWebView = window.ReactNativeWebView || {};\n    window.ReactNativeWebView.injectedObjectJson = function () { return ");
            sb.append(this.h0 == null ? null : l6.i(new StringBuilder("`"), this.h0, "`"));
            sb.append("; };\n})();");
            evaluateJavascript(sb.toString(), null);
        }
    }

    public final void c(String str, String str2) {
        RNCWebViewMessagingModule rNCWebViewMessagingModule = this.V;
        getThemedReactContext();
        if (this.W != null) {
            post(new b(this, str2, str));
            return;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("data", str);
        if (rNCWebViewMessagingModule == null) {
            a(this, new jof(icc.a(this), writableMapCreateMap));
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putMap("nativeEvent", writableMapCreateMap);
        writableNativeMap.putString("messagingModuleName", this.f);
        rNCWebViewMessagingModule.onMessage(writableNativeMap);
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        WebChromeClient webChromeClient = this.g0;
        if (webChromeClient != null) {
            webChromeClient.onHideCustomView();
        }
        super.destroy();
    }

    public boolean getMessagingEnabled() {
        return this.e;
    }

    public ybc getRNCWebViewClient() {
        return this.W;
    }

    public ReactApplicationContext getReactApplicationContext() {
        return getThemedReactContext().a;
    }

    public mkf getThemedReactContext() {
        return (mkf) getContext();
    }

    @Override // android.webkit.WebView
    public WebChromeClient getWebChromeClient() {
        return this.g0;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
        setWebViewClient(null);
        destroy();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.c0) {
            if (this.b0 == null) {
                this.b0 = new hra();
            }
            if (this.b0.a(i, i2)) {
                hra hraVar = this.b0;
                float f = hraVar.c;
                float f2 = hraVar.d;
                int iComputeHorizontalScrollRange = computeHorizontalScrollRange();
                int iComputeVerticalScrollRange = computeVerticalScrollRange();
                int width = getWidth();
                int height = getHeight();
                pgb<f> pgbVar = f.k;
                a(this, f.a.a(-1, icc.a(this), g.d, i, i2, f, f2, iComputeHorizontalScrollRange, iComputeVerticalScrollRange, width, height));
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.a0) {
            a(this, new gt2(icc.a(this), i, i2));
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.d0) {
            requestDisallowInterceptTouchEvent(true);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBasicAuthCredential(rbc rbcVar) {
        this.W.d = rbcVar;
    }

    public void setHasScrollEvent(boolean z) {
        this.c0 = z;
    }

    public void setIgnoreErrFailedForThisURL(String str) {
        this.W.c = str;
    }

    public void setInjectedJavaScriptObject(String str) {
        this.h0 = str;
        b();
    }

    public void setMenuCustomItems(List<Map<String, String>> list) {
        this.f0 = list;
    }

    @SuppressLint({"AddJavascriptInterface"})
    public void setMessagingEnabled(boolean z) {
        if (this.e == z) {
            return;
        }
        this.e = z;
        if (z) {
            if (wuf.g("WEB_MESSAGE_LISTENER")) {
                if (this.d == null) {
                    this.d = new xbc(this);
                    HashSet hashSet = new HashSet(1);
                    Object obj = new Object[]{"*"}[0];
                    Objects.requireNonNull(obj);
                    if (!hashSet.add(obj)) {
                        l5.q(t40.i(obj, "duplicate element: "));
                        return;
                    }
                    Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
                    xbc xbcVar = this.d;
                    int i = uwg.a;
                    if (!xwg.e.d()) {
                        b0.u("This method is not supported by the current version of the framework and the current WebView APK");
                        return;
                    }
                    ywg.b.a.g(this).addWebMessageListener("ReactNativeWebView", (String[]) setUnmodifiableSet.toArray(new String[0]), new al1.a(new tug(xbcVar)));
                }
            } else if (this.c == null) {
                d dVar = new d();
                dVar.a = this;
                this.c = dVar;
                addJavascriptInterface(dVar, "ReactNativeWebView");
            }
            b();
        }
    }

    public void setNestedScrollEnabled(boolean z) {
        this.d0 = z;
    }

    public void setSendContentSizeChangeEvents(boolean z) {
        this.a0 = z;
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        this.g0 = webChromeClient;
        super.setWebChromeClient(webChromeClient);
        if (webChromeClient instanceof vbc) {
            ((vbc) webChromeClient).Y = this.e0;
        }
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof ybc) {
            ybc ybcVar = (ybc) webViewClient;
            this.W = ybcVar;
            ybcVar.b = this.e0;
        }
    }

    @Override // android.view.View
    public final ActionMode startActionMode(ActionMode.Callback callback, int i) {
        return this.f0 == null ? super.startActionMode(callback, i) : super.startActionMode(new a(callback), i);
    }
}
