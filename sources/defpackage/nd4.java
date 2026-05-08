package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.textfield.b;

/* JADX INFO: loaded from: classes2.dex */
public final class nd4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ b a;

    public nd4(b bVar) {
        this.a = bVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
