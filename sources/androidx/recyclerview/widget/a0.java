package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.r6;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class a0 extends RecyclerView.p {
    public RecyclerView a;
    public final a b = new a();

    public class a extends RecyclerView.r {
        public boolean a = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void a(RecyclerView recyclerView, int i) {
            if (i == 0 && this.a) {
                this.a = false;
                a0.this.d();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void b(RecyclerView recyclerView, int i, int i2) {
            if (i == 0 && i2 == 0) {
                return;
            }
            this.a = true;
        }
    }

    public final void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        a aVar = this.b;
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.Z0;
            if (arrayList != null) {
                arrayList.remove(aVar);
            }
            this.a.setOnFlingListener(null);
        }
        this.a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                r6.g("An instance of OnFlingListener already set.");
                return;
            }
            this.a.j(aVar);
            this.a.setOnFlingListener(this);
            new Scroller(this.a.getContext(), new DecelerateInterpolator());
            d();
        }
    }

    public abstract int[] b(RecyclerView.m mVar, View view);

    @SuppressLint({"UnknownNullness"})
    public abstract View c(RecyclerView.m mVar);

    public final void d() {
        RecyclerView.m layoutManager;
        View viewC;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewC = c(layoutManager)) == null) {
            return;
        }
        int[] iArrB = b(layoutManager, viewC);
        int i = iArrB[0];
        if (i == 0 && iArrB[1] == 0) {
            return;
        }
        this.a.i0(i, iArrB[1], false);
    }
}
