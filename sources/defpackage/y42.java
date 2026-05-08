package defpackage;

import android.animation.ValueAnimator;
import defpackage.a52;

/* JADX INFO: loaded from: classes.dex */
public final class y42 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ a52.a a;
    public final /* synthetic */ a52 b;

    public y42(a52 a52Var, a52.a aVar) {
        this.b = a52Var;
        this.a = aVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        a52.a aVar = this.a;
        a52.d(fFloatValue, aVar);
        a52 a52Var = this.b;
        a52Var.a(fFloatValue, aVar, false);
        a52Var.invalidateSelf();
    }
}
