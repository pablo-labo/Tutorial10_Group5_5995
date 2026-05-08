package defpackage;

import android.content.Intent;
import android.view.inputmethod.BaseInputConnection;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.LaunchActivity;
import com.indeed.android.jobsearch.launch.LaunchFragment;
import com.indeed.android.jobsearch.regpromo.RegPromoFragment;
import com.indeed.android.jobsearch.searchoverlay.SearchOverlayFragment;
import com.indeed.android.jobsearch.tare.debug.ProfileUIPlatformDebugFragment;
import com.indeed.android.jobsearch.viewjob.a;
import com.indeed.android.jsmappservices.bridge.SearchType;
import com.indeed.android.messaging.data.MessagingDatabase_Impl;
import com.indeed.android.messaging.data.conversations.ConversationDao_Impl;
import defpackage.jq7;
import defpackage.ls7;
import defpackage.mt7;
import defpackage.s87;
import defpackage.sp7;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class le implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ le(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        Object obj;
        Object next;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return new bxb(((re) obj2).g0);
            case 1:
                int i2 = ec1.s0;
                twg twgVarQ = ((ec1) obj2).Q();
                twgVarQ.h(swg.a(twgVarQ.g(), null, false, null, 0.0f, false, 15));
                return j6g.a;
            case 2:
                ((Function1) obj2).invoke(0);
                return j6g.a;
            case 3:
                gu5<j6g> gu5Var = ((ks4) obj2).h;
                if (gu5Var != null) {
                    gu5Var.invoke();
                }
                return j6g.a;
            case 4:
                gu5<j6g> gu5Var2 = ((gx4) obj2).i;
                if (gu5Var2 != null) {
                    gu5Var2.invoke();
                }
                return j6g.a;
            case 5:
                ut5 ut5Var = (ut5) obj2;
                ut5Var.Y.j("ian-full-screen-detail-view");
                ut5Var.Q();
                return j6g.a;
            case 6:
                c88 c88Var = (c88) obj2;
                c88Var.n.invoke(c88Var.b);
                return j6g.a;
            case 7:
                LaunchFragment launchFragment = (LaunchFragment) obj2;
                Lazy<s87> lazy = s87.f;
                s87.a.a((gz4) launchFragment.c.getValue(), tx5.k(launchFragment.e, "LaunchFragment", "retry", null, 12));
                ((gme) launchFragment.E().f).setValue(ex4.c);
                ((gme) launchFragment.E().V).setValue(Boolean.FALSE);
                launchFragment.startActivity(new Intent(launchFragment.requireContext(), (Class<?>) LaunchActivity.class).addFlags(32768).addFlags(268435456));
                LaunchActivity launchActivity = launchFragment.W;
                if (launchActivity != null) {
                    launchActivity.finish();
                    return j6g.a;
                }
                wl7.g("activity");
                throw null;
            case 8:
                return new BaseInputConnection(((mu8) obj2).a, false);
            case DatadogLogGenerator.CRASH /* 9 */:
                ((h89) obj2).e2();
                return j6g.a;
            case 10:
                return new ConversationDao_Impl((MessagingDatabase_Impl) obj2);
            case 11:
                sx9 sx9Var = (sx9) obj2;
                gk0 gk0VarB = sx9Var.b();
                ohd ohdVar = gk0VarB.b;
                try {
                    obj = gk0VarB.a.a.get(fy4.class);
                    break;
                } catch (Exception unused) {
                    obj = null;
                }
                fy4 fy4Var = (fy4) obj;
                if (fy4Var == null) {
                    return null;
                }
                dy9 dy9Var = ohdVar.c;
                dy9Var.getClass();
                Iterator it = dy9Var.b.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (((zx9) next).a == sx9Var) {
                        }
                    } else {
                        next = null;
                    }
                }
                zx9 zx9Var = next instanceof zx9 ? (zx9) next : null;
                if (zx9Var != null) {
                    return new af8(zx9Var, fy4Var, ohdVar.a);
                }
                l5.q("Cannot create an event emitter for the module that isn't present in the module registry.");
                return null;
            case 12:
                ((t7b) obj2).e.invoke();
                return j6g.a;
            case 13:
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab", "edit-language", null, null, 12));
                ((Function2) obj2).invoke(hvb.Z, "");
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                ProfileUIPlatformDebugFragment profileUIPlatformDebugFragment = (ProfileUIPlatformDebugFragment) obj2;
                rq7 rq7Var = (rq7) cr8.p(rq7.class);
                lr5 lr5VarU = profileUIPlatformDebugFragment.requireActivity().u();
                lr5VarU.getClass();
                rq7Var.f(lr5VarU, mh2.k(profileUIPlatformDebugFragment), new jq7.i(null), "ProfileUIPlatformDebugFragment");
                return j6g.a;
            case 15:
                RegPromoFragment regPromoFragment = (RegPromoFragment) obj2;
                rq7 rq7Var2 = (rq7) cr8.p(rq7.class);
                lr5 lr5VarU2 = regPromoFragment.requireActivity().u();
                lr5VarU2.getClass();
                rq7Var2.f(lr5VarU2, mh2.k(regPromoFragment), jq7.j.INSTANCE, "reg-promo-native");
                regPromoFragment.E("claims");
                return j6g.a;
            case 16:
                ((izc) obj2).Q(hs7.a, new ls7(null, ls7.a.b));
                return j6g.a;
            case 17:
                zrd zrdVar = (zrd) obj2;
                return Boolean.valueOf(((dme) zrdVar.a).e() < zrdVar.f());
            case 18:
                SearchOverlayFragment searchOverlayFragment = (SearchOverlayFragment) obj2;
                searchOverlayFragment.H().e(SearchType.b);
                searchOverlayFragment.I().r(searchOverlayFragment.I().l(), kud.a, null, null);
                return j6g.a;
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                x8f x8fVar = (x8f) obj2;
                List<String> list = bud.a;
                String strA = bud.a(((p87) x8fVar.g0.getValue()).h(), new jud("Bartender", "Seattle, WA"), SearchType.b, kud.a, "Bartender", "Seattle, WA", null, null, null);
                rq7 rq7Var3 = (rq7) cr8.p(rq7.class);
                lr5 lr5VarU3 = x8fVar.requireActivity().u();
                lr5VarU3.getClass();
                rq7Var3.f(lr5VarU3, mh2.k(x8fVar), new jq7.a0(new mt7.b(strA)), "tare-debug-screen");
                return j6g.a;
            default:
                a aVar = (a) obj2;
                int i3 = a.H0;
                Lazy<s87> lazy2 = s87.f;
                s87.a.a(aVar.P(), tx5.k(aVar.t0, "view-job-bottom-sheet", "report", null, 12));
                u63.Y(hh1.A(aVar), null, null, new fqg(aVar, null), 3);
                return j6g.a;
        }
    }
}
