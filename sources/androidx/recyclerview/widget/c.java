package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ k b;

    public c(k kVar, ArrayList arrayList) {
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
                kVar.m.remove(arrayList);
                return;
            }
            k.b bVar = (k.b) it.next();
            RecyclerView.b0 b0Var = bVar.a;
            int i = bVar.b;
            int i2 = bVar.c;
            int i3 = bVar.d;
            int i4 = bVar.e;
            kVar.getClass();
            View view = b0Var.a;
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (i5 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i6 != 0) {
                view.animate().translationY(0.0f);
            }
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            kVar.p.add(b0Var);
            viewPropertyAnimatorAnimate.setDuration(kVar.e).setListener(new h(kVar, b0Var, i5, view, i6, viewPropertyAnimatorAnimate)).start();
        }
    }
}
