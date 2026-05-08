package defpackage;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.g;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ig5 implements vs5 {
    public final Set<Activity> a = Collections.newSetFromMap(new WeakHashMap());
    public volatile boolean b;

    @Override // defpackage.vs5
    public final void g(g gVar) {
        if (!this.b && this.a.add(gVar)) {
            View decorView = gVar.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new hg5(this, decorView));
        }
    }
}
