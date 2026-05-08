package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Runnable {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ k b;

    public d(k kVar, ArrayList arrayList) {
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
                kVar.n.remove(arrayList);
                return;
            }
            k.a aVar = (k.a) it.next();
            ArrayList<RecyclerView.b0> arrayList2 = kVar.r;
            long j = kVar.f;
            RecyclerView.b0 b0Var = aVar.a;
            View view = b0Var == null ? null : b0Var.a;
            RecyclerView.b0 b0Var2 = aVar.b;
            View view2 = b0Var2 != null ? b0Var2.a : null;
            if (view != null) {
                ViewPropertyAnimator duration = view.animate().setDuration(j);
                arrayList2.add(aVar.a);
                duration.translationX(aVar.e - aVar.c);
                duration.translationY(aVar.f - aVar.d);
                duration.alpha(0.0f).setListener(new i(kVar, aVar, duration, view)).start();
            }
            if (view2 != null) {
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
                arrayList2.add(aVar.b);
                viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new j(kVar, aVar, viewPropertyAnimatorAnimate, view2)).start();
            }
        }
    }
}
