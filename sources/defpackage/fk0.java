package defpackage;

import android.content.Context;
import android.net.Uri;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.backendservices.data.IndeedAppDatabase;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.launch.LaunchFragment;
import com.indeed.android.jobsearch.regpromo.RegPromoFragment;
import com.indeed.android.jobsearch.searchoverlay.SearchOverlayFragment;
import com.indeed.android.jobsearch.webview.indeedapply.IndeedApplyWebViewFragment;
import com.indeed.android.jsmappservices.bridge.SearchType;
import com.indeed.android.profile.screens.sheets.profilesubtab.links.a;
import com.indeed.android.profile.screens.sheets.profilesubtab.skills.b;
import defpackage.ls7;
import defpackage.s87;
import defpackage.sp7;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fk0 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fk0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        Object next;
        z13 z13Var;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Iterator it = ((gk0) obj).b.c.b.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (((zx9) next).a instanceof uo7) {
                        }
                    } else {
                        next = null;
                    }
                }
                zx9 zx9Var = (zx9) next;
                Object obj2 = zx9Var != null ? zx9Var.a : null;
                if (!(obj2 instanceof uo7)) {
                    obj2 = null;
                }
                uo7 uo7Var = (uo7) obj2;
                if (uo7Var != null) {
                    return uo7Var.c;
                }
                return null;
            case 1:
                ec1 ec1Var = (ec1) obj;
                int i2 = ec1.s0;
                ((tp7) cr8.p(tp7.class)).b(new sp7.g(ec1Var.P(), "report-the-issue", null, null, 12));
                u63.Y(hh1.A(ec1Var), null, null, new dc1(ec1Var, null), 3);
                return j6g.a;
            case 2:
                h12 h12VarG = ((w02) obj).G();
                h12VarG.k(i12.a(h12VarG.g(), null, null, null, null, null, null, null, false, 127));
                return j6g.a;
            case 3:
                ((c52) obj).close();
                return j6g.a;
            case 4:
                gr2 gr2Var = (gr2) obj;
                yz7 yz7VarM = ((x1c) gr2Var.f.getValue()).m();
                jhf jhfVar = yz7VarM.d;
                String str = jhfVar != null ? jhfVar.a.b : null;
                String strD = (str == null || zve.U(str) || (z13Var = yz7VarM.i) == null) ? null : bg.d(z13Var.a, "+", str);
                String str2 = yz7VarM.b;
                String str3 = yz7VarM.c;
                String str4 = yz7VarM.k;
                Locale locale = yz7VarM.h;
                gr2Var.b = new fs7(str2, str3, strD, str4, locale != null ? locale.getCountry() : null, yz7VarM.j, yz7VarM.l);
                return j6g.a;
            case 5:
                ((gi4) obj).Q(ps7.c, null);
                return j6g.a;
            case 6:
                a aVar = (a) obj;
                aVar.R().C();
                aVar.Q(ps7.d, null);
                return j6g.a;
            case 7:
                ut5 ut5Var = (ut5) obj;
                bp6 bp6Var = ut5Var.Y;
                bp6Var.getClass();
                Lazy<s87> lazy = s87.f;
                s87.a.a(bp6Var.a(), tx5.k(bp6Var.b, "ian-full-screen-detail-view", "top-nav-home", null, 12));
                ut5Var.Q();
                return j6g.a;
            case 8:
                String str5 = ((IndeedApplyWebViewFragment) obj).z0;
                if (str5 != null) {
                    return Uri.parse(str5).getQueryParameter("jobKey");
                }
                wl7.g("indeedApplyUrl");
                throw null;
            case DatadogLogGenerator.CRASH /* 9 */:
                ((c88) obj).H.invoke();
                return j6g.a;
            case 10:
                LaunchFragment launchFragment = (LaunchFragment) obj;
                Lazy<s87> lazy2 = s87.f;
                s87.a.a((gz4) launchFragment.c.getValue(), tx5.k(launchFragment.e, "LaunchFragment", "report-the-issue", null, 12));
                u63.Y(hh1.A(launchFragment), null, null, new al8(launchFragment, null), 3);
                return j6g.a;
            case 11:
                return Float.valueOf(((ur8) obj).e0.b());
            case 12:
                b bVar = (b) obj;
                yvb yvbVarQ = bVar.Q();
                ((gme) yvbVarQ.d).setValue(svb.a(yvbVarQ.v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -1, 8257535));
                u63.Y(ee3.p(yvbVarQ), null, null, new lwb(yvbVarQ, null), 3);
                ((gme) ((f51) bVar.j0.getValue()).m0).setValue(zr4.a);
                return j6g.a;
            case 13:
                return Float.valueOf(((iy3) obj).t1(125.0f));
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                i5a i5aVar = (i5a) obj;
                return new f8a((gsa) i5aVar.c.getValue(), (IndeedAppDatabase) i5aVar.d.getValue());
            case 15:
                RegPromoFragment regPromoFragment = (RegPromoFragment) obj;
                String string = regPromoFragment.getString(R.string.indeed_passport_register_endpoint);
                string.getClass();
                regPromoFragment.F(oxc.a(string, regPromoFragment.V).concat("&from=reg-promo-native"), false);
                regPromoFragment.E("create-an-account");
                return j6g.a;
            case 16:
                ((izc) obj).Q(hs7.a, new ls7(null, ls7.a.a));
                return j6g.a;
            case 17:
                f8d f8dVar = (f8d) obj;
                Context contextRequireContext = f8dVar.requireContext();
                contextRequireContext.getClass();
                g7b g7bVar = new g7b(contextRequireContext);
                Context contextRequireContext2 = f8dVar.requireContext();
                contextRequireContext2.getClass();
                return new q9d(g7bVar, new qq2(contextRequireContext2));
            case 18:
                SearchOverlayFragment searchOverlayFragment = (SearchOverlayFragment) obj;
                searchOverlayFragment.H().c(SearchType.b);
                searchOverlayFragment.I().u();
                return j6g.a;
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                return new lh7(((ph7) obj).a());
            default:
                com.indeed.android.jobsearch.viewjob.a aVar2 = (com.indeed.android.jobsearch.viewjob.a) obj;
                int i3 = com.indeed.android.jobsearch.viewjob.a.H0;
                Lazy<s87> lazy3 = s87.f;
                s87.a.a(aVar2.P(), tx5.k(aVar2.t0, "view-job-bottom-sheet", "share", null, 12));
                nn0 nn0Var = nn0.a;
                Context contextRequireContext3 = aVar2.requireContext();
                contextRequireContext3.getClass();
                jde jdeVar = aVar2.w0;
                nn0.f(contextRequireContext3, jdeVar != null ? jdeVar.a : null, jdeVar != null ? jdeVar.b : null);
                return j6g.a;
        }
    }
}
