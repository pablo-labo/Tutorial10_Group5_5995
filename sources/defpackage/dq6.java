package defpackage;

import com.indeed.android.jobsearch.bottomnav.IanMainFragment;

/* JADX INFO: loaded from: classes2.dex */
public final class dq6 implements goa<jz2<? extends Boolean>> {
    public final /* synthetic */ IanMainFragment a;

    public dq6(IanMainFragment ianMainFragment) {
        this.a = ianMainFragment;
    }

    @Override // defpackage.goa
    public final void d(jz2<? extends Boolean> jz2Var) {
        Boolean boolA = jz2Var.a();
        if (boolA != null) {
            ((gme) ((jn0) this.a.l0.getValue()).b).setValue(boolA);
        }
    }
}
