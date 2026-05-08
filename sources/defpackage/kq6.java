package defpackage;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes2.dex */
public final class kq6 extends WebView.VisualStateCallback {
    public final /* synthetic */ mq6 a;

    public kq6(mq6 mq6Var) {
        this.a = mq6Var;
    }

    @Override // android.webkit.WebView.VisualStateCallback
    public final void onComplete(long j) {
        this.a.k(false);
    }
}
