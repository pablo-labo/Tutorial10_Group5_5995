package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import androidx.fragment.app.g;
import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n0c implements wu5 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ vu5 d;

    public /* synthetic */ n0c(gu5 gu5Var, gu5 gu5Var2, gu5 gu5Var3, o97 o97Var) {
        this.b = gu5Var;
        this.d = gu5Var2;
        this.c = gu5Var3;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.c;
        vu5 vu5Var = this.d;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                final g gVar = (g) obj5;
                final wu5 wu5Var = (wu5) vu5Var;
                final svb svbVar = (svb) obj4;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    q1c.d(bh2.c(-1487210566, new b1c(gVar, wu5Var, 0), bVar), bVar, 6);
                    q1c.d(bh2.c(-470631645, new wu5() { // from class: c1c
                        @Override // defpackage.wu5
                        public final Object q(Object obj6, Object obj7, Object obj8) {
                            b bVar2 = (b) obj7;
                            int iIntValue2 = ((Integer) obj8).intValue();
                            ((pb2) obj6).getClass();
                            if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                g gVar2 = gVar;
                                boolean zX = bVar2.x(gVar2);
                                wu5 wu5Var2 = wu5Var;
                                boolean zK = zX | bVar2.K(wu5Var2);
                                svb svbVar2 = svbVar;
                                boolean zX2 = zK | bVar2.x(svbVar2);
                                Object objV = bVar2.v();
                                if (zX2 || objV == b.a.a) {
                                    objV = new bzb(0, wu5Var2, svbVar2, gVar2);
                                    bVar2.p(objV);
                                }
                                q1c.c(48, (gu5) objV, bVar2, "Edit Education", true);
                            } else {
                                bVar2.D();
                            }
                            return j6g.a;
                        }
                    }, bVar), bVar, 6);
                    q1c.d(bh2.c(-159240574, new hr4(3, gVar, wu5Var), bVar), bVar, 6);
                } else {
                    bVar.D();
                }
                break;
            case 1:
                g gVar2 = (g) obj5;
                svb svbVar2 = (svb) obj4;
                wu5 wu5Var2 = (wu5) vu5Var;
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    boolean zX = bVar2.x(gVar2) | bVar2.x(svbVar2) | bVar2.K(wu5Var2);
                    Object objV = bVar2.v();
                    if (zX || objV == b.a.a) {
                        objV = new q6a(5, gVar2, svbVar2, wu5Var2);
                        bVar2.p(objV);
                    }
                    q1c.c(48, (gu5) objV, bVar2, "Edit Summary", true);
                } else {
                    bVar2.D();
                }
                break;
            default:
                gu5 gu5Var = (gu5) obj5;
                gu5 gu5Var2 = (gu5) vu5Var;
                gu5 gu5Var3 = (gu5) obj4;
                b bVar3 = (b) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((il5) obj).getClass();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    e.a aVar = e.a.b;
                    gxc.h(R.string.reg_promo_footer_text_terms, gu5Var, "regPromoFooterTerms", f.j(aVar, 0.0f, 0.0f, 8.0f, 0.0f, 11), bVar3, 384, 0);
                    gxc.h(R.string.reg_promo_footer_text_cookie_policy, gu5Var2, "regPromoCookiePolicy", f.j(aVar, 0.0f, 0.0f, 8.0f, 0.0f, 11), bVar3, 384, 0);
                    gxc.h(R.string.reg_promo_footer_text_privacy_policy, gu5Var3, "regPromoPrivacyPolicy", null, bVar3, 384, 8);
                } else {
                    bVar3.D();
                }
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ n0c(g gVar, wu5 wu5Var, svb svbVar) {
        this.b = gVar;
        this.d = wu5Var;
        this.c = svbVar;
    }

    public /* synthetic */ n0c(g gVar, svb svbVar, wu5 wu5Var) {
        this.b = gVar;
        this.c = svbVar;
        this.d = wu5Var;
    }
}
