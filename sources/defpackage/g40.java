package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: classes.dex */
public final class g40 implements g6 {
    public final AccessibilityManager a;

    public g40(Context context) {
        Object systemService = context.getSystemService("accessibility");
        systemService.getClass();
        this.a = (AccessibilityManager) systemService;
    }

    @Override // defpackage.g6
    public final long a(long j, boolean z) {
        if (j < 2147483647L) {
            int i = z ? 7 : 3;
            int i2 = Build.VERSION.SDK_INT;
            AccessibilityManager accessibilityManager = this.a;
            if (i2 >= 29) {
                int iA = ag0.a(accessibilityManager, (int) j, i);
                if (iA == Integer.MAX_VALUE) {
                    return Long.MAX_VALUE;
                }
                return iA;
            }
            if (z && accessibilityManager.isTouchExplorationEnabled()) {
                return Long.MAX_VALUE;
            }
        }
        return j;
    }
}
