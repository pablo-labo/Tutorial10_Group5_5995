package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.bottomsheet.b;

/* JADX INFO: loaded from: classes2.dex */
public final class ik1 extends y5 {
    public final /* synthetic */ b d;

    public ik1(b bVar) {
        this.d = bVar;
    }

    @Override // defpackage.y5
    public final void d(t6 t6Var, View view) {
        AccessibilityNodeInfo accessibilityNodeInfo = t6Var.a;
        this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        if (!this.d.Z) {
            accessibilityNodeInfo.setDismissable(false);
        } else {
            t6Var.a(1048576);
            accessibilityNodeInfo.setDismissable(true);
        }
    }

    @Override // defpackage.y5
    public final boolean g(View view, int i, Bundle bundle) {
        if (i == 1048576) {
            b bVar = this.d;
            if (bVar.Z) {
                bVar.cancel();
                return true;
            }
        }
        return super.g(view, i, bundle);
    }
}
