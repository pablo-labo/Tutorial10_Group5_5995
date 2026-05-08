package defpackage;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.indeed.android.jobsearch.viewjob.a;

/* JADX INFO: loaded from: classes2.dex */
public final class gqg extends BottomSheetBehavior.c {
    public final /* synthetic */ BottomSheetBehavior<FrameLayout> a;
    public final /* synthetic */ a b;

    public gqg(BottomSheetBehavior<FrameLayout> bottomSheetBehavior, a aVar) {
        this.a = bottomSheetBehavior;
        this.b = aVar;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
    public final void a(View view, float f) {
        int i = a.H0;
        lqg lqgVarQ = this.b.Q();
        ((gme) lqgVarQ.b).setValue(jqg.a(lqgVarQ.g(), false, false, false, false, null, false, null, null, Math.abs(1.0f - f), false, false, 3839));
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
    @SuppressLint({"RestrictedApi"})
    public final void b(View view, int i) {
        int i2 = a.H0;
        a aVar = this.b;
        this.a.F = aVar.Q().g().c;
        aVar.Q().h(i);
    }
}
