package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* JADX INFO: loaded from: classes.dex */
public final class wr5 extends FragmentManager.k {
    public final /* synthetic */ Fragment a;
    public final /* synthetic */ FrameLayout b;

    public wr5(vr5 vr5Var, Fragment fragment, FrameLayout frameLayout) {
        this.a = fragment;
        this.b = frameLayout;
    }

    @Override // androidx.fragment.app.FragmentManager.k
    public final void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        if (fragment == this.a) {
            fragmentManager.i0(this);
            vr5.n(view, this.b);
        }
    }
}
