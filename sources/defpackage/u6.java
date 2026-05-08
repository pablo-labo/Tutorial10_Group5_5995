package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class u6 {
    public final AccessibilityNodeProvider a;

    public static class a extends AccessibilityNodeProvider {
        public final u6 a;

        public a(u6 u6Var) {
            this.a = u6Var;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            t6 t6VarB = this.a.b(i);
            if (t6VarB == null) {
                return null;
            }
            return t6VarB.a;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            this.a.getClass();
            return null;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo findFocus(int i) {
            t6 t6VarC = this.a.c(i);
            if (t6VarC == null) {
                return null;
            }
            return t6VarC.a;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final boolean performAction(int i, int i2, Bundle bundle) {
            return this.a.d(i, i2, bundle);
        }
    }

    public static class b extends a {
        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.a.a(i, new t6(accessibilityNodeInfo), str, bundle);
        }
    }

    public u6() {
        this.a = new b(this);
    }

    public void a(int i, t6 t6Var, String str, Bundle bundle) {
    }

    public t6 b(int i) {
        return null;
    }

    public t6 c(int i) {
        return null;
    }

    public boolean d(int i, int i2, Bundle bundle) {
        return false;
    }

    public u6(AccessibilityNodeProvider accessibilityNodeProvider) {
        this.a = accessibilityNodeProvider;
    }
}
