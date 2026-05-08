package defpackage;

import android.view.View;
import com.google.android.material.navigation.NavigationBarView;

/* JADX INFO: loaded from: classes2.dex */
public final class bk1 extends NavigationBarView {

    @Deprecated
    public interface a extends NavigationBarView.a {
    }

    @Deprecated
    public interface b extends NavigationBarView.b {
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 5;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i2) != 1073741824 && suggestedMinimumHeight > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), getPaddingBottom() + getPaddingTop() + suggestedMinimumHeight), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        zj1 zj1Var = (zj1) getMenuView();
        if (zj1Var.A0 != z) {
            zj1Var.setItemHorizontalTranslationEnabled(z);
            getPresenter().j(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(a aVar) {
        setOnItemReselectedListener(aVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(b bVar) {
        setOnItemSelectedListener(bVar);
    }
}
