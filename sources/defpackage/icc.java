package defpackage;

import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class icc extends FrameLayout {
    public final wbc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icc(mkf mkfVar, wbc wbcVar) {
        super(mkfVar);
        mkfVar.getClass();
        wbcVar.setBackgroundColor(0);
        addView(wbcVar);
        View childAt = getChildAt(0);
        childAt.getClass();
        this.a = (wbc) childAt;
    }

    public static final int a(WebView webView) {
        webView.getClass();
        Object parent = webView.getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view != null) {
            return view.getId();
        }
        return -1;
    }

    public final wbc getWebView() {
        return this.a;
    }
}
