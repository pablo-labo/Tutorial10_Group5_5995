package defpackage;

import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class qh1 extends FrameLayout {
    public final void setBlockDescendantFocus(boolean z) {
        if (z) {
            setImportantForAccessibility(4);
            setDescendantFocusability(393216);
            setFocusable(0);
        } else {
            setImportantForAccessibility(0);
            setDescendantFocusability(262144);
            setFocusable(16);
        }
    }
}
