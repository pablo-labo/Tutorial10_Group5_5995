package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.textfield.b;

/* JADX INFO: loaded from: classes2.dex */
public final class qd4 extends AnimatorListenerAdapter {
    public final /* synthetic */ b a;

    public qd4(b bVar) {
        this.a = bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        b bVar = this.a;
        bVar.c.setChecked(bVar.k);
        bVar.q.start();
    }
}
