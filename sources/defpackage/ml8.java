package defpackage;

import android.view.animation.Animation;

/* JADX INFO: loaded from: classes2.dex */
public final class ml8 implements Animation.AnimationListener {
    public final /* synthetic */ ol8 a;
    public final /* synthetic */ int b;

    public ml8(ol8 ol8Var, int i) {
        this.a = ol8Var;
        this.b = i;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        animation.getClass();
        this.a.d.remove(this.b);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        animation.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        animation.getClass();
        this.a.d.put(this.b, (xl8) animation);
    }
}
