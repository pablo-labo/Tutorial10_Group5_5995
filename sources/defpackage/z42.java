package defpackage;

import android.animation.Animator;
import defpackage.a52;

/* JADX INFO: loaded from: classes.dex */
public final class z42 implements Animator.AnimatorListener {
    public final /* synthetic */ a52.a a;
    public final /* synthetic */ a52 b;

    public z42(a52 a52Var, a52.a aVar) {
        this.b = a52Var;
        this.a = aVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        a52 a52Var = this.b;
        a52.a aVar = this.a;
        a52Var.a(1.0f, aVar, true);
        aVar.k = aVar.e;
        aVar.l = aVar.f;
        aVar.m = aVar.g;
        aVar.a((aVar.j + 1) % aVar.i.length);
        if (!a52Var.f) {
            a52Var.e += 1.0f;
            return;
        }
        a52Var.f = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        if (aVar.n) {
            aVar.n = false;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.e = 0.0f;
    }
}
