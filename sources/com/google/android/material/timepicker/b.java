package com.google.android.material.timepicker;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.indeed.android.jobsearch.R;
import defpackage.t6;
import defpackage.y5;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends y5 {
    public final /* synthetic */ ClockFaceView d;

    public b(ClockFaceView clockFaceView) {
        this.d = clockFaceView;
    }

    @Override // defpackage.y5
    public final void d(t6 t6Var, View view) {
        AccessibilityNodeInfo accessibilityNodeInfo = t6Var.a;
        this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (iIntValue > 0) {
            accessibilityNodeInfo.setTraversalAfter(this.d.q0.get(iIntValue - 1));
        }
        t6Var.q(t6.f.a(0, 1, iIntValue, view.isSelected(), 1));
    }
}
