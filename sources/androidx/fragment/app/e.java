package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.c;
import androidx.fragment.app.r;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Animation.AnimationListener {
    public final /* synthetic */ r.b a;
    public final /* synthetic */ c b;
    public final /* synthetic */ View c;
    public final /* synthetic */ c.a d;

    public e(View view, c.a aVar, c cVar, r.b bVar) {
        this.a = bVar;
        this.b = cVar;
        this.c = view;
        this.d = aVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        animation.getClass();
        final c cVar = this.b;
        ViewGroup viewGroup = cVar.a;
        final View view = this.c;
        final c.a aVar = this.d;
        viewGroup.post(new Runnable() { // from class: oq3
            @Override // java.lang.Runnable
            public final void run() {
                cVar.a.endViewTransition(view);
                aVar.a();
            }
        });
        if (FragmentManager.K(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        animation.getClass();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        animation.getClass();
        if (FragmentManager.K(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.a + " has reached onAnimationStart.");
        }
    }
}
