package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.animation.Animation;
import com.swmansion.rnscreens.a;
import com.swmansion.rnscreens.d;
import com.swmansion.rnscreens.e;

/* JADX INFO: loaded from: classes3.dex */
public final class hrd implements Animation.AnimationListener {
    public final /* synthetic */ ird a;

    public hrd(ird irdVar) {
        this.a = irdVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        animation.getClass();
        e fragment$react_native_screens_release = this.a.getFragment$react_native_screens_release();
        fragment$react_native_screens_release.G(true);
        View view = fragment$react_native_screens_release.getView();
        ViewParent parent = view != null ? view.getParent() : null;
        if (parent instanceof d) {
            d dVar = (d) parent;
            if (!dVar.f0) {
                dVar.j();
            }
        }
        a aVarL = fragment$react_native_screens_release.l();
        if (aVarL.h0) {
            aVarL.h0 = false;
            a.c(aVarL);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        animation.getClass();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        animation.getClass();
        this.a.getFragment$react_native_screens_release().G(false);
    }
}
