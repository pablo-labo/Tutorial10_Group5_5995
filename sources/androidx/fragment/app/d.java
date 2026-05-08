package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.c;
import androidx.fragment.app.r;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AnimatorListenerAdapter {
    public final /* synthetic */ c a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ r.b d;
    public final /* synthetic */ c.a e;

    public d(c cVar, View view, boolean z, r.b bVar, c.a aVar) {
        this.a = cVar;
        this.b = view;
        this.c = z;
        this.d = bVar;
        this.e = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        ViewGroup viewGroup = this.a.a;
        View view = this.b;
        viewGroup.endViewTransition(view);
        boolean z = this.c;
        r.b bVar = this.d;
        if (z) {
            r.b.EnumC0035b enumC0035b = bVar.a;
            view.getClass();
            enumC0035b.a(view);
        }
        this.e.a();
        if (FragmentManager.K(2)) {
            Log.v("FragmentManager", "Animator from operation " + bVar + " has ended.");
        }
    }
}
