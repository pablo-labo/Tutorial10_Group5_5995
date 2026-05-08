package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class nrg implements RecyclerView.o {
    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void a(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) nVar).width == -1 && ((ViewGroup.MarginLayoutParams) nVar).height == -1) {
            return;
        }
        r6.g("Pages must fill the whole ViewPager2 (use match_parent)");
    }
}
