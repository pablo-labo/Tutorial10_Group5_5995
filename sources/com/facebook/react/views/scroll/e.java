package com.facebook.react.views.scroll;

import android.animation.Animator;
import android.widget.FrameLayout;
import com.facebook.react.views.scroll.d;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements Animator.AnimatorListener {
    public final /* synthetic */ FrameLayout a;

    public e(FrameLayout frameLayout) {
        this.a = frameLayout;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        animator.getClass();
        ((d.c) this.a).getReactScrollViewScrollState().d = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        FrameLayout frameLayout = this.a;
        ((d.c) frameLayout).getReactScrollViewScrollState().e = true;
        d.l(frameLayout);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        animator.getClass();
        d.h reactScrollViewScrollState = ((d.c) this.a).getReactScrollViewScrollState();
        reactScrollViewScrollState.d = false;
        reactScrollViewScrollState.e = false;
    }
}
