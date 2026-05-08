package defpackage;

import android.view.ViewParent;

/* JADX INFO: loaded from: classes2.dex */
public final class zo7 implements oqa {
    public volatile int a = -1;
    public ViewParent b;

    public final void a(int i, ViewParent viewParent) {
        this.a = i;
        ViewParent viewParent2 = this.b;
        if (viewParent2 != null) {
            viewParent2.requestDisallowInterceptTouchEvent(false);
        }
        this.b = null;
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(true);
            this.b = viewParent;
        }
    }
}
