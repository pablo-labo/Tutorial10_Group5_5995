package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class bsf extends AnimatorListenerAdapter {
    public final /* synthetic */ esf a;

    public bsf(esf esfVar) {
        this.a = esfVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.o();
        animator.removeListener(this);
    }
}
