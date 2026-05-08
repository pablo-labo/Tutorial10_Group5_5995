package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes2.dex */
public final class ek1 implements v6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BottomSheetBehavior b;

    public ek1(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.b = bottomSheetBehavior;
        this.a = i;
    }

    @Override // defpackage.v6
    public final boolean a(View view) {
        this.b.H(this.a);
        return true;
    }
}
