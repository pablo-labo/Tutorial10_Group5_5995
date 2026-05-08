package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes.dex */
public final class d extends ViewPager2.e {
    public final /* synthetic */ ViewPager2 a;

    public d(ViewPager2 viewPager2) {
        this.a = viewPager2;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public final void a(int i) {
        if (i == 0) {
            this.a.d();
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public final void c(int i) {
        ViewPager2 viewPager2 = this.a;
        if (viewPager2.d != i) {
            viewPager2.d = i;
            viewPager2.l0.a();
        }
    }
}
