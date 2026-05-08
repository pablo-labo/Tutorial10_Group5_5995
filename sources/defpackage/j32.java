package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: loaded from: classes2.dex */
public final class j32 extends y5 {
    public final /* synthetic */ CheckableImageButton d;

    public j32(CheckableImageButton checkableImageButton) {
        this.d = checkableImageButton;
    }

    @Override // defpackage.y5
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.d.d);
    }

    @Override // defpackage.y5
    public final void d(t6 t6Var, View view) {
        AccessibilityNodeInfo accessibilityNodeInfo = t6Var.a;
        this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        CheckableImageButton checkableImageButton = this.d;
        t6Var.m(checkableImageButton.e);
        accessibilityNodeInfo.setChecked(checkableImageButton.d);
    }
}
