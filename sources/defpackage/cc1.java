package defpackage;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.b;
import com.indeed.android.jobsearch.viewjob.a;
import com.indeed.android.jobsearch.webview.modal.ModalWebview;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cc1 implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v81 b;

    public /* synthetic */ cc1(v81 v81Var, int i) {
        this.a = i;
        this.b = v81Var;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        int i = this.a;
        v81 v81Var = this.b;
        switch (i) {
            case 0:
                ec1 ec1Var = (ec1) v81Var;
                b bVar = ec1Var.p0;
                if (bVar == null) {
                    wl7.g("bottomSheetDialog");
                    throw null;
                }
                BottomSheetBehavior<FrameLayout> bottomSheetBehaviorH = bVar.h();
                ModalWebview modalWebview = ec1Var.m0;
                if (modalWebview != null) {
                    bottomSheetBehaviorH.F = modalWebview.getScrollY() <= 10;
                    return;
                } else {
                    wl7.g("webview");
                    throw null;
                }
            default:
                a aVar = (a) v81Var;
                int i2 = a.H0;
                lqg lqgVarQ = aVar.Q();
                ModalWebview modalWebview2 = aVar.B0;
                if (modalWebview2 == null) {
                    wl7.g("webview");
                    throw null;
                }
                ((gme) lqgVarQ.b).setValue(jqg.a(lqgVarQ.g(), false, false, modalWebview2.getScrollY() <= 10, false, null, false, null, null, 0.0f, false, false, 4091));
                b bVar2 = aVar.o0;
                if (bVar2 != null) {
                    bVar2.h().F = aVar.Q().g().c;
                    return;
                } else {
                    wl7.g("bottomSheetDialog");
                    throw null;
                }
        }
    }
}
