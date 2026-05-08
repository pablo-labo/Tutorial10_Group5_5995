package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.datepicker.b;
import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes2.dex */
public final class re9 extends y5 {
    public final /* synthetic */ b d;

    public re9(b bVar) {
        this.d = bVar;
    }

    @Override // defpackage.y5
    public final void d(t6 t6Var, View view) {
        AccessibilityNodeInfo accessibilityNodeInfo = t6Var.a;
        this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        b bVar = this.d;
        accessibilityNodeInfo.setHintText(bVar.Z.getVisibility() == 0 ? bVar.getString(R.string.mtrl_picker_toggle_to_year_selection) : bVar.getString(R.string.mtrl_picker_toggle_to_day_selection));
    }
}
