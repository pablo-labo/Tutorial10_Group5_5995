package defpackage;

import android.content.Context;
import android.view.WindowInsets;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.swmansion.rnscreens.a;
import com.swmansion.rnscreens.b;
import com.swmansion.rnscreens.d;
import com.swmansion.rnscreens.e;

/* JADX INFO: loaded from: classes3.dex */
public final class ird extends CoordinatorLayout implements rnc {
    public final e q0;
    public final reb r0;
    public final hrd s0;

    public ird(Context context, e eVar) {
        reb rebVar = new reb();
        super(context, null);
        this.q0 = eVar;
        this.r0 = rebVar;
        this.s0 = new hrd(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        if (getVisibility() != 4) {
            super.clearFocus();
        }
    }

    public final e getFragment$react_native_screens_release() {
        return this.q0;
    }

    @Override // defpackage.rnc
    public qeb getPointerEvents() {
        return this.r0.a;
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        windowInsetsOnApplyWindowInsets.getClass();
        return windowInsetsOnApplyWindowInsets;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        e eVar = this.q0;
        if (iee.b(eVar.l())) {
            a aVarL = eVar.l();
            if (iee.b(aVarL) && (aVarL.V instanceof d)) {
                if (z) {
                    aVarL.b(aVarL.getWidth(), aVarL.getHeight(), aVarL.getTop());
                }
                pqd pqdVar = aVarL.r0;
                if (pqdVar != null) {
                    aVarL.getLeft();
                    aVarL.getTop();
                    aVarL.getRight();
                    aVarL.getBottom();
                    b bVar = aVarL.V;
                    bVar.getClass();
                    pqdVar.j(bVar.getHeight());
                }
            }
        }
    }

    @Override // android.view.View
    public final void startAnimation(Animation animation) {
        animation.getClass();
        e eVar = this.q0;
        grd grdVar = new grd(eVar);
        grdVar.setDuration(animation.getDuration());
        boolean z = animation instanceof AnimationSet;
        hrd hrdVar = this.s0;
        if (z && !eVar.isRemoving()) {
            AnimationSet animationSet = (AnimationSet) animation;
            animationSet.addAnimation(grdVar);
            animationSet.setAnimationListener(hrdVar);
            super.startAnimation(animationSet);
            return;
        }
        AnimationSet animationSet2 = new AnimationSet(true);
        animationSet2.addAnimation(animation);
        animationSet2.addAnimation(grdVar);
        animationSet2.setAnimationListener(hrdVar);
        super.startAnimation(animationSet2);
    }
}
