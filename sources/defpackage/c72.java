package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.textfield.a;

/* JADX INFO: loaded from: classes2.dex */
public final class c72 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ a a;

    public c72(a aVar) {
        this.a = aVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
