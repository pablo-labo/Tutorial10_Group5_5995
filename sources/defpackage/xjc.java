package defpackage;

import android.graphics.Rect;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes2.dex */
public final class xjc {
    public static final Rect a = new Rect();

    public static final void a(ViewGroup viewGroup, Rect rect) {
        rect.getClass();
        ViewParent parent = viewGroup.getParent();
        if (parent == null) {
            rect.setEmpty();
            return;
        }
        if (parent instanceof wjc) {
            wjc wjcVar = (wjc) parent;
            if (wjcVar.getRemoveClippedSubviews()) {
                Rect rect2 = a;
                wjcVar.getClippingRect(rect2);
                if (!rect2.intersect(viewGroup.getLeft(), viewGroup.getTop() + ((int) viewGroup.getTranslationY()), viewGroup.getRight(), viewGroup.getBottom() + ((int) viewGroup.getTranslationY()))) {
                    rect.setEmpty();
                    return;
                }
                rect2.offset(-viewGroup.getLeft(), -viewGroup.getTop());
                rect2.offset(-((int) viewGroup.getTranslationX()), -((int) viewGroup.getTranslationY()));
                rect2.offset(viewGroup.getScrollX(), viewGroup.getScrollY());
                rect.set(rect2);
                return;
            }
        }
        viewGroup.getDrawingRect(rect);
    }
}
