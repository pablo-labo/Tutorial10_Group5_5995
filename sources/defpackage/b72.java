package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.textfield.a;

/* JADX INFO: loaded from: classes2.dex */
public final class b72 extends AnimatorListenerAdapter {
    public final /* synthetic */ a a;

    public b72(a aVar) {
        this.a = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.a.setEndIconVisible(false);
    }
}
