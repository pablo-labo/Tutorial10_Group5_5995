package defpackage;

import android.transition.Transition;

/* JADX INFO: loaded from: classes.dex */
public final class gs5 implements Transition.TransitionListener {
    public final /* synthetic */ tm1 a;

    public gs5(tm1 tm1Var) {
        this.a = tm1Var;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        this.a.run();
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
    }
}
