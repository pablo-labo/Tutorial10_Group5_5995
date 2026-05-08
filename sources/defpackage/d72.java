package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.a;

/* JADX INFO: loaded from: classes2.dex */
public final class d72 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ a a;

    public d72(a aVar) {
        this.a = aVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        CheckableImageButton checkableImageButton = this.a.c;
        checkableImageButton.setScaleX(fFloatValue);
        checkableImageButton.setScaleY(fFloatValue);
    }
}
