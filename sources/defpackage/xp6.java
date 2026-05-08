package defpackage;

import com.indeed.android.jobsearch.bottomnav.IanMainFragment;

/* JADX INFO: loaded from: classes2.dex */
public final class xp6 implements l74 {
    public final /* synthetic */ IanMainFragment a;

    public xp6(IanMainFragment ianMainFragment) {
        this.a = ianMainFragment;
    }

    @Override // defpackage.l74
    public final void dispose() {
        IanMainFragment ianMainFragment = this.a;
        sp6 sp6Var = ianMainFragment.d0;
        if (sp6Var != null) {
            dr5 dr5Var = ianMainFragment.c0;
            if (dr5Var != null) {
                dr5Var.a.getViewTreeObserver().removeOnGlobalLayoutListener(sp6Var);
            }
            ianMainFragment.d0 = null;
        }
    }
}
