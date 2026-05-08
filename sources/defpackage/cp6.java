package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import com.indeed.android.jobsearch.bottomnav.IanInitialState;
import com.indeed.android.jobsearch.bottomnav.IanMainFragment;

/* JADX INFO: loaded from: classes2.dex */
public final class cp6 {
    public final ViewPager2 a;

    public static final class a extends vr5 {
        public final IanInitialState m;

        public a(IanMainFragment ianMainFragment, IanInitialState ianInitialState) {
            super(ianMainFragment);
            this.m = ianInitialState;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final int c() {
            dd4 dd4Var = dd4.a;
            if (dd4.f()) {
                return dd4.g() ? ep6.b.size() : ep6.a.size();
            }
            return 7;
        }
    }

    public cp6(ViewPager2 viewPager2, IanMainFragment ianMainFragment, IanInitialState ianInitialState) {
        int iA;
        this.a = viewPager2;
        viewPager2.setAdapter(new a(ianMainFragment, ianInitialState));
        viewPager2.setOffscreenPageLimit(10);
        viewPager2.setUserInputEnabled(false);
        if ((ianInitialState != null ? ianInitialState.getInitialTab() : null) != null) {
            iA = a(ianInitialState.getInitialTab());
        } else {
            dd4 dd4Var = dd4.a;
            dd4.f();
            iA = 0;
        }
        viewPager2.c.a.add(new dp6(this));
        viewPager2.b(iA, false);
    }

    public static int a(xj1 xj1Var) {
        dd4 dd4Var = dd4.a;
        if (dd4.f()) {
            int iIndexOf = dd4.g() ? ep6.b.indexOf(xj1Var) : ep6.a.indexOf(xj1Var);
            if (iIndexOf > -1) {
                return iIndexOf;
            }
            throw new ArrayIndexOutOfBoundsException(l5.l("tabRouteTo: ", xj1Var.name()));
        }
        switch (xj1Var.ordinal()) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 2;
            default:
                throw new ArrayIndexOutOfBoundsException(l5.l("tabRouteTo: ", xj1Var.name()));
        }
    }
}
