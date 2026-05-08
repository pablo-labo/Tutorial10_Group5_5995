package defpackage;

import android.view.View;
import defpackage.epg;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class hsg implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        WeakHashMap<View, prg> weakHashMap = epg.a;
        epg.c.c(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
