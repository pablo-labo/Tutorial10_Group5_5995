package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.ze9;

/* JADX INFO: loaded from: classes2.dex */
public final class ck1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ BottomSheetBehavior a;

    public ck1(BottomSheetBehavior bottomSheetBehavior) {
        this.a = bottomSheetBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ze9 ze9Var = this.a.i;
        if (ze9Var != null) {
            ze9.b bVar = ze9Var.a;
            if (bVar.i != fFloatValue) {
                bVar.i = fFloatValue;
                ze9Var.e = true;
                ze9Var.invalidateSelf();
            }
        }
    }
}
