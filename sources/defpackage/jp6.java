package defpackage;

import android.os.Build;
import android.webkit.CookieManager;
import com.indeed.android.jobsearch.backend.util.a;
import com.indeed.android.jobsearch.bottomnav.IanMainFragment;
import defpackage.c87;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jp6 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ IanMainFragment b;

    public /* synthetic */ jp6(IanMainFragment ianMainFragment, int i) {
        this.a = i;
        this.b = ianMainFragment;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        IanMainFragment ianMainFragment = this.b;
        switch (i) {
            case 0:
                qpd qpdVarB = pnb.B(ianMainFragment);
                iwc iwcVar = fwc.a;
                d2f d2fVar = c87.a;
                String strA = c87.a.a(ez2.W);
                String str = strA == null ? "" : strA;
                String cookie = CookieManager.getInstance().getCookie(d93.g());
                String str2 = cookie == null ? "" : cookie;
                String strA2 = a.a();
                hh1.D(str, strA2 == null ? "" : strA2, str2, ((p87) pnb.B(ianMainFragment).a(null, iwcVar.b(p87.class), null)).c(), d93.c(), d93.a(), (gsa) pnb.B(ianMainFragment).a(null, iwcVar.b(gsa.class), null), new k1(ianMainFragment, 5));
                break;
            default:
                d9f d9fVarN = ianMainFragment.N();
                d9fVarN.g("reengagementModal", "allow-notifications");
                Function1<? super zs7, j6g> function1 = d9fVarN.W;
                d9fVarN.W = null;
                if (Build.VERSION.SDK_INT >= 33) {
                    ((at7) cr8.p(at7.class)).c(new hm4(function1, 1));
                }
                break;
        }
        return j6g.a;
    }
}
