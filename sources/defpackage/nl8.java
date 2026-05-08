package defpackage;

import android.view.animation.Animation;

/* JADX INFO: loaded from: classes2.dex */
public final class nl8 implements Animation.AnimationListener {
    public final /* synthetic */ gaa a;

    public nl8(gaa gaaVar) {
        this.a = gaaVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        animation.getClass();
        this.a.a();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        animation.getClass();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        animation.getClass();
    }
}
