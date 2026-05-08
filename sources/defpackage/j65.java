package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class j65 extends btg {

    public static class a extends AnimatorListenerAdapter {
        public final View a;
        public boolean b = false;

        public a(View view) {
            this.a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            lsg lsgVar = jsg.a;
            View view = this.a;
            lsgVar.W(view, 1.0f);
            if (this.b) {
                view.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            WeakHashMap<View, prg> weakHashMap = epg.a;
            View view = this.a;
            if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
                this.b = true;
                view.setLayerType(2, null);
            }
        }
    }

    public j65(int i) {
        this.m0 = i;
    }

    public final ObjectAnimator L(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        jsg.a.W(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, jsg.b, f2);
        objectAnimatorOfFloat.addListener(new a(view));
        c(new i65(view));
        return objectAnimatorOfFloat;
    }

    @Override // defpackage.esf
    public final void i(usf usfVar) {
        btg.J(usfVar);
        usfVar.a.put("android:fade:transitionAlpha", Float.valueOf(jsg.a.U(usfVar.b)));
    }
}
