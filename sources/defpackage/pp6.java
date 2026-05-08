package defpackage;

import android.os.Build;
import com.indeed.android.jobsearch.bottomnav.IanMainFragment;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pp6 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ IanMainFragment b;

    public /* synthetic */ pp6(IanMainFragment ianMainFragment, int i) {
        this.a = i;
        this.b = ianMainFragment;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        IanMainFragment ianMainFragment = this.b;
        switch (i) {
            case 0:
                d9f d9fVarN = ianMainFragment.N();
                d9fVarN.g("push-notification-primer", "allow-notifications");
                Function1<? super et7, j6g> function1 = d9fVarN.V;
                d9fVarN.V = null;
                jw0 jw0Var = function1 != null ? new jw0(function1, 3) : null;
                if (Build.VERSION.SDK_INT >= 33) {
                    at7 at7Var = (at7) cr8.p(at7.class);
                    at7Var.e(jw0Var);
                }
                break;
            default:
                ((gme) ianMainFragment.H().a0).setValue(Boolean.TRUE);
                break;
        }
        return j6g.a;
    }
}
