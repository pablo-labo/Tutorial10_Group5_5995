package defpackage;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.kbc;

/* JADX INFO: loaded from: classes3.dex */
public final class lbc extends BottomSheetBehavior.c {
    public final /* synthetic */ BottomSheetBehavior<FrameLayout> a;
    public final /* synthetic */ kbc b;

    public lbc(BottomSheetBehavior<FrameLayout> bottomSheetBehavior, kbc kbcVar) {
        this.a = bottomSheetBehavior;
        this.b = kbcVar;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
    public final void a(View view, float f) {
        kbc.a aVar = kbc.p0;
        nbc nbcVarQ = this.b.Q();
        float fAbs = Math.abs(1.0f - f);
        g4a g4aVar = nbcVarQ.b;
        ((gme) g4aVar).setValue(mbc.a((mbc) ((gme) g4aVar).getValue(), fAbs, false, false, 6));
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
    @SuppressLint({"RestrictedApi"})
    public final void b(View view, int i) {
        kbc.a aVar = kbc.p0;
        kbc kbcVar = this.b;
        this.a.F = ((mbc) ((gme) kbcVar.Q().b).getValue()).b;
        g4a g4aVar = kbcVar.Q().b;
        ((gme) g4aVar).setValue(mbc.a((mbc) ((gme) g4aVar).getValue(), 0.0f, false, i == 3, 3));
    }
}
