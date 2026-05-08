package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.gsg;

/* JADX INFO: loaded from: classes2.dex */
public final class dk1 implements gsg.b {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ BottomSheetBehavior b;

    public dk1(BottomSheetBehavior bottomSheetBehavior, boolean z) {
        this.b = bottomSheetBehavior;
        this.a = z;
    }

    @Override // gsg.b
    public final rzg a(View view, rzg rzgVar, gsg.c cVar) {
        int iD = rzgVar.d();
        BottomSheetBehavior bottomSheetBehavior = this.b;
        bottomSheetBehavior.s = iD;
        boolean zC = gsg.c(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z = bottomSheetBehavior.n;
        if (z) {
            int iA = rzgVar.a();
            bottomSheetBehavior.r = iA;
            paddingBottom = iA + cVar.d;
        }
        if (bottomSheetBehavior.o) {
            paddingLeft = (zC ? cVar.c : cVar.a) + rzgVar.b();
        }
        if (bottomSheetBehavior.p) {
            paddingRight = rzgVar.c() + (zC ? cVar.a : cVar.c);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        boolean z2 = this.a;
        if (z2) {
            bottomSheetBehavior.l = rzgVar.a.i().d;
        }
        if (!z && !z2) {
            return rzgVar;
        }
        bottomSheetBehavior.P();
        return rzgVar;
    }
}
