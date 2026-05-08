package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.net.Uri;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.LaunchActivity;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.bottomnav.IanMainFragment;
import com.indeed.android.jobsearch.regpromo.RegPromoFragment;
import com.indeed.android.jobsearch.searchoverlay.SearchOverlayFragment;
import com.indeed.android.jobsearch.webview.indeedapply.IndeedApplyWebViewFragment;
import com.indeed.android.jsmappservices.bridge.SearchType;
import com.indeed.android.profile.screens.sheets.profilesubtab.links.a;
import defpackage.jq7;
import defpackage.m17;
import defpackage.qn9;
import defpackage.s8;
import defpackage.s87;
import defpackage.sp7;
import defpackage.t8;
import defpackage.ude;
import defpackage.yj3;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oe implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oe(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r3v13, types: [pn9] */
    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        int i2 = 1;
        Object obj = this.b;
        switch (i) {
            case 0:
                re reVar = (re) obj;
                ((gme) reVar.Q().e).setValue(b5g.a);
                reVar.close();
                Function2<? super ps7, ? super qr7, j6g> function2 = reVar.j0;
                if (function2 != null) {
                    function2.invoke(ps7.d, null);
                }
                return j6g.a;
            case 1:
                ((ude) obj).m(ude.c.w.a);
                return j6g.a;
            case 2:
                ((tp7) cr8.p(tp7.class)).b(new sp7.h(12, "messagingAttachmentBanner", "PHOTOS", null));
                int iA = s8.a.a();
                t8.b.C0422b c0422b = t8.b.C0422b.a;
                c0422b.getClass();
                s8.a.a();
                cab cabVar = new cab();
                cabVar.a = t8.d.a;
                cabVar.b = iA;
                cabVar.c = false;
                cabVar.d = c0422b;
                ((ra9) obj).a(cabVar);
                return j6g.a;
            case 3:
                LaunchActivity launchActivity = ((ec1) obj).o0;
                if (launchActivity != null) {
                    return launchActivity;
                }
                wl7.g("activity");
                throw null;
            case 4:
                og2 og2Var = (og2) obj;
                List<? extends gu5<? extends List<? extends yj3.a>>> list = og2Var.e;
                ArrayList arrayList = new ArrayList();
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    w92.w0(arrayList, list.get(i3).invoke());
                }
                og2Var.e = zr4.a;
                return arrayList;
            case 5:
                a aVar = (a) obj;
                return Boolean.valueOf(!wl7.b(aVar.R().v().b0.get(aVar.R().v().a0.a) != null ? r13.b : null, r0.v().a0.b));
            case 6:
                ((dme) ((ut5) obj).M().W).h(0);
                return j6g.a;
            case 7:
                IanMainFragment ianMainFragment = (IanMainFragment) obj;
                ((gme) ((jn0) ianMainFragment.l0.getValue()).b).setValue(Boolean.FALSE);
                ((in0) ianMainFragment.e.getValue()).getClass();
                ((tp7) cr8.p(tp7.class)).b(new sp7.b("homePage", "suggestAppUpgradeDismiss", u63.Z("suggestUpgradePrompt"), null, 8));
                return j6g.a;
            case 8:
                qn9.a aVar2 = new qn9.a();
                final Context context = ((m17.a) obj).a;
                final double d = 0.2d;
                try {
                    Object systemService = context.getSystemService((Class<Object>) ActivityManager.class);
                    systemService.getClass();
                    if (((ActivityManager) systemService).isLowRamDevice()) {
                        d = 0.15d;
                    }
                } catch (Exception unused) {
                }
                if (0.0d > d || d > 1.0d) {
                    l5.q("percent must be in the range [0.0, 1.0].");
                    return null;
                }
                aVar2.a = new gu5() { // from class: pn9
                    @Override // defpackage.gu5
                    public final Object invoke() {
                        int largeMemoryClass;
                        Context context2 = context;
                        try {
                            Object systemService2 = context2.getSystemService((Class<Object>) ActivityManager.class);
                            systemService2.getClass();
                            ActivityManager activityManager = (ActivityManager) systemService2;
                            largeMemoryClass = (context2.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                        } catch (Exception unused2) {
                            largeMemoryClass = IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        }
                        return Long.valueOf((long) (d * ((long) largeMemoryClass) * 1048576));
                    }
                };
                xrc xrcVar = new xrc();
                pn9 pn9Var = aVar2.a;
                if (pn9Var != null) {
                    long jLongValue = ((Number) pn9Var.invoke()).longValue();
                    return new nrc(jLongValue > 0 ? new trc(jLongValue, xrcVar) : new qs4(xrcVar), xrcVar);
                }
                r6.g("maxSizeBytesFactory == null");
                return null;
            case DatadogLogGenerator.CRASH /* 9 */:
                return ((IndeedApplyWebViewFragment) obj).M();
            case 10:
                ((c88) obj).t.invoke();
                return j6g.a;
            case 11:
                LaunchActivity launchActivity2 = (LaunchActivity) obj;
                int i4 = LaunchActivity.e1;
                ((ua6) launchActivity2.z0.getValue()).c(false, new k1(launchActivity2, 10));
                return j6g.a;
            case 12:
                ((udf) obj).onCancel();
                return j6g.a;
            case 13:
                ArrayList arrayList2 = ((r1a) obj).e;
                if (!arrayList2.isEmpty()) {
                    Object obj2 = arrayList2.get(0);
                    float fC = ((g3b) obj2).a.i.c();
                    int size2 = arrayList2.size() - 1;
                    if (1 <= size2) {
                        while (true) {
                            Object obj3 = arrayList2.get(i2);
                            float fC2 = ((g3b) obj3).a.i.c();
                            if (Float.compare(fC, fC2) < 0) {
                                obj2 = obj3;
                                fC = fC2;
                            }
                            if (i2 != size2) {
                                i2++;
                            }
                        }
                    }
                    obj = obj2;
                }
                g3b g3bVar = (g3b) obj;
                return Float.valueOf(g3bVar != null ? g3bVar.a.i.c() : 0.0f);
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                nn0 nn0Var = nn0.a;
                String string = ((h5b) obj).getString(R.string.indeed_login_url);
                string.getClass();
                return nn0.c(string, Uri.parse(d93.g().concat("INTERCEPT")).buildUpon().appendQueryParameter("jsmaContinue", "dismiss").toString());
            case 15:
                crb crbVar = (crb) obj;
                Context contextRequireContext = crbVar.requireContext();
                contextRequireContext.getClass();
                g7b g7bVar = new g7b(contextRequireContext);
                Context contextRequireContext2 = crbVar.requireContext();
                contextRequireContext2.getClass();
                return new q9d(g7bVar, new qq2(contextRequireContext2));
            case 16:
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-preferences-tab", "remote-preference", null, null, 12));
                ((Function1) obj).invoke(pjb.f);
                return j6g.a;
            case 17:
                RegPromoFragment regPromoFragment = (RegPromoFragment) obj;
                rq7 rq7Var = (rq7) cr8.p(rq7.class);
                lr5 lr5VarU = regPromoFragment.requireActivity().u();
                lr5VarU.getClass();
                rq7Var.f(lr5VarU, mh2.k(regPromoFragment), jq7.t.INSTANCE, "reg-promo-native");
                regPromoFragment.E("privacy-policy");
                return j6g.a;
            case 18:
                SearchOverlayFragment searchOverlayFragment = (SearchOverlayFragment) obj;
                aud audVarH = searchOverlayFragment.H();
                audVarH.getClass();
                Lazy<s87> lazy = s87.f;
                s87.a.a(audVarH.a(), tx5.k(audVarH.b, ak2.M(SearchType.c), "profile-location", null, 12));
                cud cudVarI = searchOverlayFragment.I();
                String str = cudVarI.l().a;
                String str2 = cudVarI.l0;
                if (str2 == null) {
                    str2 = "";
                }
                cudVarI.r(new jud(str, str2), kud.V, null, null);
                return j6g.a;
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                x8f x8fVar = (x8f) obj;
                rq7 rq7Var2 = (rq7) cr8.p(rq7.class);
                lr5 lr5VarU2 = x8fVar.requireActivity().u();
                lr5VarU2.getClass();
                rq7Var2.f(lr5VarU2, mh2.k(x8fVar), jq7.o.INSTANCE, "tare-debug-screen");
                return j6g.a;
            case 20:
                return new bxb(((igg) obj).g0);
            default:
                int i5 = com.indeed.android.jobsearch.viewjob.a.H0;
                lqg lqgVarQ = ((com.indeed.android.jobsearch.viewjob.a) obj).Q();
                ((gme) lqgVarQ.b).setValue(jqg.a(lqgVarQ.g(), false, false, false, false, null, false, null, null, 0.0f, false, false, 2047));
                return j6g.a;
        }
    }
}
