package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class k0h implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ xsc b;

    public k0h(View view, xsc xscVar) {
        this.a = view;
        this.b = xscVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.removeOnAttachStateChangeListener(this);
        this.b.x();
    }
}
