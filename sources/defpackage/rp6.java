package defpackage;

import com.indeed.android.jobsearch.bottomnav.IanMainFragment;
import defpackage.et7;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rp6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ IanMainFragment b;

    public /* synthetic */ rp6(IanMainFragment ianMainFragment, int i) {
        this.a = i;
        this.b = ianMainFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        IanMainFragment ianMainFragment = this.b;
        switch (i) {
            case 0:
                ((String) obj).getClass();
                d9f d9fVarN = ianMainFragment.N();
                d9fVarN.g("push-notification-primer", "skip-for-now");
                Function1<? super et7, j6g> function1 = d9fVarN.V;
                d9fVarN.V = null;
                if (function1 != null) {
                    function1.invoke(new et7.b(ft7.a));
                }
                break;
            default:
                Boolean bool = (Boolean) ((jz2) obj).a();
                if (bool != null) {
                    if (bool.booleanValue()) {
                        ianMainFragment.c.getClass();
                        q6.n("ian-hamburger-menu", null, null, 6, (tp7) cr8.p(tp7.class));
                        ff6 ff6VarH = ianMainFragment.H();
                        ((gme) ff6VarH.Y).setValue(Boolean.TRUE);
                        ff6VarH.d.k(new jz2<>(j6g.a));
                    } else {
                        ((gme) ianMainFragment.H().Y).setValue(Boolean.FALSE);
                    }
                    ianMainFragment.S(1, zr4.a);
                }
                break;
        }
        return j6g.a;
    }
}
