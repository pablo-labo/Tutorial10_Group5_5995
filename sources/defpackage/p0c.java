package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import androidx.fragment.app.g;
import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p0c implements wu5 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ vu5 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p0c(gu5 gu5Var, gu5 gu5Var2, gu5 gu5Var3, o97 o97Var) {
        this.b = gu5Var;
        this.c = gu5Var2;
        this.d = gu5Var3;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.d;
        vu5 vu5Var = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                g gVar = (g) obj5;
                wu5 wu5Var = (wu5) vu5Var;
                svb svbVar = (svb) obj4;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    q1c.d(bh2.c(-1436525573, new h1c(gVar, wu5Var, 1), bVar), bVar, 6);
                    q1c.d(bh2.c(-419946652, new rb1(3, gVar, wu5Var, svbVar), bVar), bVar, 6);
                    q1c.d(bh2.c(-108555581, new u0c(gVar, wu5Var, 1), bVar), bVar, 6);
                } else {
                    bVar.D();
                }
                break;
            default:
                gu5 gu5Var = (gu5) obj5;
                gu5 gu5Var2 = (gu5) vu5Var;
                gu5 gu5Var3 = (gu5) obj4;
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((il5) obj).getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    e.a aVar = e.a.b;
                    nxc.b(f.j(aVar, 0.0f, 4.0f, 8.0f, 4.0f, 1), R.string.reg_promo_footer_text_terms, gu5Var, "regPromoFooterTerms", 0.0f, bVar2, 3072, 16);
                    nxc.b(f.j(aVar, 0.0f, 4.0f, 8.0f, 4.0f, 1), R.string.reg_promo_footer_text_cookie_policy, gu5Var2, "regPromoCookiePolicy", 0.0f, bVar2, 3072, 16);
                    nxc.b(f.j(aVar, 0.0f, 4.0f, 0.0f, 4.0f, 5), R.string.reg_promo_footer_text_privacy_policy, gu5Var3, "regPromoPrivacyPolicy", 0.0f, bVar2, 3072, 16);
                } else {
                    bVar2.D();
                }
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ p0c(g gVar, wu5 wu5Var, svb svbVar) {
        this.b = gVar;
        this.c = wu5Var;
        this.d = svbVar;
    }
}
