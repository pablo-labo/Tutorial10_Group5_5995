package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes2.dex */
public final class dp6 extends ViewPager2.e {
    public final /* synthetic */ cp6 a;

    public dp6(cp6 cp6Var) {
        this.a = cp6Var;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public final void c(int i) {
        for (int i2 = 0; i2 < 7; i2++) {
            ViewPager2 viewPager2 = this.a.a;
            View childAt = viewPager2.getChildAt(0);
            if (childAt == null) {
                throw new IndexOutOfBoundsException("Index: 0, Size: " + viewPager2.getChildCount());
            }
            RecyclerView.b0 b0VarI = ((RecyclerView) childAt).I(i2);
            if (b0VarI != null) {
                View view = b0VarI.a;
                if (i2 == i) {
                    view.setVisibility(0);
                    view.requestFocus(130);
                } else {
                    view.setVisibility(8);
                }
            }
        }
    }
}
