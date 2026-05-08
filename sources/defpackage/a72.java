package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.textfield.a;

/* JADX INFO: loaded from: classes2.dex */
public final class a72 extends AnimatorListenerAdapter {
    public final /* synthetic */ a a;

    public a72(a aVar) {
        this.a = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.a.setEndIconVisible(true);
    }
}
