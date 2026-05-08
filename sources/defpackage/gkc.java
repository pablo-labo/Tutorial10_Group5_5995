package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.facebook.react.uimanager.b;
import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes2.dex */
public final class gkc extends y5 {
    @Override // defpackage.y5
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        view.getClass();
        accessibilityEvent.getClass();
        super.c(view, accessibilityEvent);
        Object tag = view.getTag(R.id.accessibility_role);
        if (tag instanceof b.c) {
            accessibilityEvent.setClassName(b.c.e((b.c) tag));
        }
    }

    @Override // defpackage.y5
    public final void d(t6 t6Var, View view) {
        view.getClass();
        this.a.onInitializeAccessibilityNodeInfo(view, t6Var.a);
        b.c cVarC = b.c.c(view);
        if (cVarC != null) {
            t6Var.n(b.c.e(cVarC));
        }
    }
}
