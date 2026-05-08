package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes2.dex */
public final class pca implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ oca b;

    public pca(oca ocaVar, float f) {
        this.b = ocaVar;
        this.a = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.b.b(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.a);
    }
}
