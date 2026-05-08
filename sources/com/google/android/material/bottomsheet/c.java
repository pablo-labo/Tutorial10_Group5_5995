package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.oj0;

/* JADX INFO: loaded from: classes2.dex */
public class c extends oj0 {
    public boolean f0;

    public class a extends BottomSheetBehavior.c {
        public a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void a(View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void b(View view, int i) {
            if (i == 5) {
                c.this.M();
            }
        }
    }

    @Override // androidx.fragment.app.f
    public final void D() {
        if (N(false)) {
            return;
        }
        F(false, false);
    }

    @Override // androidx.fragment.app.f
    public final void E() {
        if (N(true)) {
            return;
        }
        super.E();
    }

    @Override // defpackage.oj0, androidx.fragment.app.f
    public Dialog H(Bundle bundle) {
        return new b(getContext(), G());
    }

    public final void M() {
        if (this.f0) {
            super.E();
        } else {
            F(false, false);
        }
    }

    public final boolean N(boolean z) {
        Dialog dialog = this.a0;
        if (!(dialog instanceof b)) {
            return false;
        }
        b bVar = (b) dialog;
        BottomSheetBehavior<FrameLayout> bottomSheetBehaviorH = bVar.h();
        if (!bottomSheetBehaviorH.D || !bVar.Y) {
            return false;
        }
        this.f0 = z;
        if (bottomSheetBehaviorH.G == 5) {
            M();
            return true;
        }
        Dialog dialog2 = this.a0;
        if (dialog2 instanceof b) {
            b bVar2 = (b) dialog2;
            bVar2.f.B(bVar2.e0);
        }
        bottomSheetBehaviorH.s(new a());
        bottomSheetBehaviorH.H(5);
        return true;
    }
}
