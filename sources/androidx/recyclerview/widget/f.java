package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AnimatorListenerAdapter {
    public final /* synthetic */ RecyclerView.b0 a;
    public final /* synthetic */ ViewPropertyAnimator b;
    public final /* synthetic */ View c;
    public final /* synthetic */ k d;

    public f(View view, ViewPropertyAnimator viewPropertyAnimator, k kVar, RecyclerView.b0 b0Var) {
        this.d = kVar;
        this.a = b0Var;
        this.b = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        this.c.setAlpha(1.0f);
        k kVar = this.d;
        RecyclerView.b0 b0Var = this.a;
        kVar.c(b0Var);
        kVar.q.remove(b0Var);
        kVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.d.getClass();
    }
}
