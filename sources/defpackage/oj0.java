package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.f;

/* JADX INFO: loaded from: classes.dex */
public class oj0 extends f {
    @Override // androidx.fragment.app.f
    public Dialog H(Bundle bundle) {
        return new nj0(getContext(), G());
    }

    @Override // androidx.fragment.app.f
    public final void J(Dialog dialog, int i) {
        if (!(dialog instanceof nj0)) {
            super.J(dialog, i);
            return;
        }
        nj0 nj0Var = (nj0) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        nj0Var.d().n(1);
    }
}
