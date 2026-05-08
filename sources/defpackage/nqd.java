package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes3.dex */
public final class nqd extends BottomSheetBehavior.c {
    public final /* synthetic */ pqd a;

    public nqd(pqd pqdVar) {
        this.a = pqdVar;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
    public final void a(View view, float f) {
        float fMax = Math.max(f, 0.0f);
        pqd pqdVar = this.a;
        pqdVar.d = fMax;
        if (pqdVar.c) {
            return;
        }
        pqdVar.i(pqdVar.b, pqdVar.getReactHeight(), pqd.h(pqdVar, pqdVar.d), pqdVar.e);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
    public final void b(View view, int i) {
        if (i == 3 || i == 4 || i == 5 || i == 6) {
            if (i == 3 || i == 4 || i == 6) {
                pqd pqdVar = this.a;
                pqdVar.i(pqdVar.b, pqdVar.getReactHeight(), pqdVar.l(i), pqdVar.e);
            }
        }
    }
}
