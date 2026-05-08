package defpackage;

import androidx.navigation.e;
import defpackage.xh8;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class sra implements m2g, xh8 {
    public final dc a;

    public sra(dc dcVar) {
        this.a = dcVar;
    }

    @Override // defpackage.m2g
    public final void a(e eVar) {
        eVar.getClass();
        Integer numC = r03.r().c("Onboarding", 0, "OnboardingShownCount");
        r03.r().a((numC != null ? numC.intValue() : 0) + 1, "Onboarding", "OnboardingShownCount");
        r03.r().i(System.currentTimeMillis(), "Onboarding", "LastShownTimestamp");
        int i = ((kr7) cr8.p(kr7.class)).e("jso_rn_onboarding_tst").a;
        List listE0 = ut0.E0(new String[]{(i >= 3 || (i >= 2 && ((kr7) cr8.p(kr7.class)).e("jso_crowtaxo_m3_tst").a < 0)) ? "mag_onboarding_reactnative" : "mag_onboarding_v"});
        k2g k2gVar = (k2g) cr8.p(k2g.class);
        bi3 bi3Var = bi3.c;
        bi3Var.getClass();
        k2gVar.a(new lx5("show_flow", "other", "showFlow", 1, listE0, new sy5(true, "metRequirements", bi3Var)));
        this.a.invoke(eVar);
    }

    @Override // defpackage.m2g
    public final boolean b(n2g n2gVar) {
        int i;
        ArrayList arrayList = lz2.a;
        boolean z = false;
        lz2.d("OnboardingTriggerConditionHelper", "show onboarding condition params: " + n2gVar + " " + cr8.d, false, null);
        int i2 = ((kr7) cr8.p(kr7.class)).e("jso_rn_onboarding_tst").a;
        boolean z2 = (i2 >= 3 || (i2 >= 2 && ((kr7) cr8.p(kr7.class)).e("jso_crowtaxo_m3_tst").a < 0)) && ((bp7) cr8.p(bp7.class)).e() && cr8.q() && (cr8.o() || cr8.n());
        int i3 = ((kr7) cr8.p(kr7.class)).e("jso_rn_onboarding_tst").a;
        String str = "mag_onboarding_reactnative";
        tx5 tx5Var = new tx5((i3 >= 3 || (i3 >= 2 && ((kr7) cr8.p(kr7.class)).e("jso_crowtaxo_m3_tst").a < 0)) ? "mag_onboarding_reactnative" : "mag_onboarding_v");
        int i4 = ((kr7) cr8.p(kr7.class)).e("jso_rn_onboarding_tst").a;
        boolean z3 = i4 >= 3 || (i4 >= 2 && ((kr7) cr8.p(kr7.class)).e("jso_crowtaxo_m3_tst").a < 0);
        if (((bp7) cr8.p(bp7.class)).e() && cr8.q() && z3) {
            z = true;
        }
        if (z && cr8.o()) {
            ((k2g) cr8.p(k2g.class)).a(tx5.s(tx5Var, "eligibleForFirstOnboarding"));
        } else if (z && cr8.n()) {
            ((k2g) cr8.p(k2g.class)).a(tx5.s(tx5Var, "eligibleForAdditionalOnboarding"));
        } else {
            ((k2g) cr8.p(k2g.class)).a(tx5.s(tx5Var, "notEligibleForOnboarding"));
        }
        if (z2) {
            int i5 = ((kr7) cr8.p(kr7.class)).e("jso_rn_onboarding_tst").a;
            if (i5 < 3 && (i5 < 2 || ((kr7) cr8.p(kr7.class)).e("jso_crowtaxo_m3_tst").a >= 0)) {
                str = "mag_onboarding_v";
            }
            List listE0 = ut0.E0(new String[]{str});
            k2g k2gVar = (k2g) cr8.p(k2g.class);
            r50 r50Var = r50.c;
            r50Var.getClass();
            k2gVar.a(new lx5("show_flow", "other", "showFlow", 1, listE0, new ty5("onboardingReadyToPresent", r50Var)));
            return z2;
        }
        if (((bp7) cr8.p(bp7.class)).e() && ((i = ((kr7) cr8.p(kr7.class)).e("jso_rn_onboarding_tst").a) >= 3 || (i >= 2 && ((kr7) cr8.p(kr7.class)).e("jso_crowtaxo_m3_tst").a < 0))) {
            int i6 = ((kr7) cr8.p(kr7.class)).e("jso_rn_onboarding_tst").a;
            if (i6 < 3 && (i6 < 2 || ((kr7) cr8.p(kr7.class)).e("jso_crowtaxo_m3_tst").a >= 0)) {
                str = "mag_onboarding_v";
            }
            tx5 tx5Var2 = new tx5(str);
            if (!cr8.x()) {
                ((k2g) cr8.p(k2g.class)).a(tx5.r(tx5Var2, "frequencyLimit"));
            }
            if (!cr8.w()) {
                ((k2g) cr8.p(k2g.class)).a(tx5.r(tx5Var2, "timeLimit"));
            }
            if (!cr8.q()) {
                ((k2g) cr8.p(k2g.class)).a(tx5.r(tx5Var2, "sawRegPromo"));
            }
        }
        return z2;
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
