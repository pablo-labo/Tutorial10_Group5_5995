package defpackage;

import android.R;
import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes3.dex */
public final class bcc {
    public boolean a;
    public boolean b;
    public String c;
    public String d;
    public boolean e;
    public ReadableMap f;
    public String g;
    public String h;

    public static final class a extends vbc {
        @Override // android.webkit.WebChromeClient
        public final Bitmap getDefaultVideoPoster() {
            return Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        }
    }

    public static final class b extends vbc {
        public final /* synthetic */ Activity d0;
        public final /* synthetic */ int e0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(wbc wbcVar, Activity activity, int i) {
            super(wbcVar);
            this.d0 = activity;
            this.e0 = i;
        }

        @Override // android.webkit.WebChromeClient
        public final Bitmap getDefaultVideoPoster() {
            return Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        }

        @Override // android.webkit.WebChromeClient
        public final void onHideCustomView() {
            if (this.b == null) {
                return;
            }
            wbc wbcVar = this.a;
            ViewGroup viewGroup = (ViewGroup) wbcVar.getThemedReactContext().a.getCurrentActivity().findViewById(R.id.content);
            if (viewGroup.getRootView() != wbcVar.getRootView()) {
                wbcVar.getRootView().setVisibility(0);
            } else {
                wbcVar.setVisibility(0);
            }
            Activity activity = this.d0;
            activity.getWindow().clearFlags(IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING);
            viewGroup.removeView(this.b);
            this.c.onCustomViewHidden();
            this.b = null;
            this.c = null;
            activity.setRequestedOrientation(this.e0);
            mkf themedReactContext = wbcVar.getThemedReactContext();
            themedReactContext.getClass();
            themedReactContext.a.removeLifecycleEventListener(this);
        }

        @Override // android.webkit.WebChromeClient
        public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            view.getClass();
            customViewCallback.getClass();
            if (this.b != null) {
                customViewCallback.onCustomViewHidden();
                return;
            }
            this.b = view;
            this.c = customViewCallback;
            Activity activity = this.d0;
            activity.setRequestedOrientation(-1);
            this.b.setSystemUiVisibility(7942);
            activity.getWindow().setFlags(IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING);
            this.b.setBackgroundColor(-16777216);
            wbc wbcVar = this.a;
            ViewGroup viewGroup = (ViewGroup) wbcVar.getThemedReactContext().a.getCurrentActivity().findViewById(R.id.content);
            viewGroup.addView(this.b, vbc.c0);
            if (viewGroup.getRootView() != wbcVar.getRootView()) {
                wbcVar.getRootView().setVisibility(8);
            } else {
                wbcVar.setVisibility(8);
            }
            mkf themedReactContext = wbcVar.getThemedReactContext();
            themedReactContext.getClass();
            themedReactContext.a.addLifecycleEventListener(this);
        }
    }

    public static void a(icc iccVar, boolean z) {
        iccVar.getClass();
        wbc webView = iccVar.getWebView();
        if (wuf.g("PAYMENT_REQUEST")) {
            cwg.setPaymentRequestEnabled(webView.getSettings(), z);
        }
    }

    public final void b(icc iccVar) {
        wbc webView = iccVar.getWebView();
        if (this.g != null) {
            webView.getSettings().setUserAgentString(this.g);
        } else if (this.h != null) {
            webView.getSettings().setUserAgentString(this.h);
        } else {
            webView.getSettings().setUserAgentString(WebSettings.getDefaultUserAgent(webView.getContext()));
        }
    }

    public final void c(wbc wbcVar) {
        Activity currentActivity = wbcVar.getThemedReactContext().a.getCurrentActivity();
        if (this.a && currentActivity != null) {
            b bVar = new b(wbcVar, currentActivity, currentActivity.getRequestedOrientation());
            bVar.Z = this.b;
            bVar.a0 = this.e;
            wbcVar.setWebChromeClient(bVar);
            return;
        }
        vbc vbcVar = (vbc) wbcVar.getWebChromeClient();
        if (vbcVar != null) {
            vbcVar.onHideCustomView();
        }
        a aVar = new a(wbcVar);
        aVar.Z = this.b;
        aVar.a0 = this.e;
        wbcVar.setWebChromeClient(aVar);
    }
}
