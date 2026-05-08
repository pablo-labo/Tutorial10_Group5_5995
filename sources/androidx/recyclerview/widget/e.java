package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ k b;

    public e(k kVar, ArrayList arrayList) {
        this.b = kVar;
        this.a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.a;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            k kVar = this.b;
            if (!zHasNext) {
                arrayList.clear();
                kVar.l.remove(arrayList);
                return;
            }
            RecyclerView.b0 b0Var = (RecyclerView.b0) it.next();
            kVar.getClass();
            View view = b0Var.a;
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            kVar.o.add(b0Var);
            viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(kVar.c).setListener(new g(view, viewPropertyAnimatorAnimate, kVar, b0Var)).start();
        }
    }
}
