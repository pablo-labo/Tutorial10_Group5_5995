package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class h0h implements View.OnAttachStateChangeListener {
    public final /* synthetic */ uqe a;

    public h0h(uqe uqeVar) {
        this.a = uqeVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        this.a.h(null);
    }
}
