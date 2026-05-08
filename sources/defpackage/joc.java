package defpackage;

import android.animation.Animator;
import android.widget.FrameLayout;
import com.facebook.react.views.scroll.d;
import com.facebook.react.views.scroll.g;

/* JADX INFO: loaded from: classes2.dex */
public final class joc implements Animator.AnimatorListener {
    public final /* synthetic */ FrameLayout a;

    public joc(FrameLayout frameLayout) {
        this.a = frameLayout;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        animator.getClass();
        d.c(this.a, g.f, 0.0f, 0.0f);
        animator.removeListener(this);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        d.c(this.a, g.f, 0.0f, 0.0f);
        animator.removeListener(this);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        animator.getClass();
    }
}
