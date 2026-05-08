package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class st5 extends wpa {
    public final /* synthetic */ ut5 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public st5(ut5 ut5Var) {
        super(true);
        this.d = ut5Var;
    }

    @Override // defpackage.wpa
    public final void b() {
        ArrayList arrayList = lz2.a;
        lz2.d("FsdvWebViewFragment", "OnBackPressedCallback.handleOnBackPressed", false, null);
        ut5 ut5Var = this.d;
        ut5Var.Y.h("ian-full-screen-detail-view");
        ut5Var.P();
    }
}
