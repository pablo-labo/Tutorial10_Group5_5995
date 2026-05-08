package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class gmc implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ fmc b;

    public gmc(fmc fmcVar, View view) {
        this.b = fmcVar;
        this.a = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.removeOnAttachStateChangeListener(this);
        this.b.h.k(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
