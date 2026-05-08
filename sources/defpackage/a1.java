package defpackage;

import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import androidx.compose.foundation.text.modifiers.b;
import androidx.fragment.app.a;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.JobSearchApplication;
import com.indeed.android.jobsearch.LaunchActivity;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.bottomnav.IanMainFragment;
import com.indeed.android.jobsearch.launch.LaunchFragment;
import com.indeed.android.jobsearch.regpromo.RegPromoFragment;
import com.indeed.android.jobsearch.tare.debug.ProfileUIPlatformDebugFragment;
import com.indeed.android.jobsearch.webview.indeedapply.IndeedApplyWebViewFragment;
import com.indeed.android.jobsearch.webview.modal.ModalWebview;
import defpackage.b5a;
import defpackage.jq7;
import defpackage.s87;
import defpackage.sp7;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a1 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a1(h64 h64Var, g64 g64Var) {
        this.a = 8;
        this.b = h64Var;
    }

    @Override // defpackage.gu5
    public final Object invoke() throws Exception {
        Object next;
        String url;
        int i = this.a;
        b5g b5gVar = b5g.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((b1) obj).l0.invoke();
                return Boolean.TRUE;
            case 1:
                sr srVar = (sr) obj;
                ((gme) srVar.Q().e).setValue(b5gVar);
                srVar.close();
                Function2<? super ps7, ? super bs7, j6g> function2 = srVar.h0;
                if (function2 != null) {
                    function2.invoke(ps7.d, null);
                }
                return j6g.a;
            case 2:
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
                return (uo7) (obj2 instanceof uo7 ? obj2 : null);
            case 3:
                ((e8a) obj).a0.k(new b5a.b(n7g.a(ie7.f, "app-tracker-post_apply-emptyappliedtabcta")));
                return j6g.a;
            case 4:
                p91 p91Var = (p91) obj;
                qf8<Object>[] qf8VarArr = p91.i0;
                ((c6f) p91Var.b0.getValue()).k(p91Var.getQ0(), false, prd.b);
                return j6g.a;
            case 5:
                ec1 ec1Var = (ec1) obj;
                int i2 = ec1.s0;
                ((tp7) cr8.p(tp7.class)).b(new sp7.g(ec1Var.P(), "refresh", null, null, 12));
                twg twgVarQ = ec1Var.Q();
                twgVarQ.h(swg.a(twgVarQ.g(), null, false, null, 0.0f, false, 29));
                ModalWebview modalWebview = ec1Var.m0;
                if (modalWebview == null) {
                    wl7.g("webview");
                    throw null;
                }
                WebBackForwardList webBackForwardListCopyBackForwardList = modalWebview.copyBackForwardList();
                webBackForwardListCopyBackForwardList.getClass();
                int currentIndex = webBackForwardListCopyBackForwardList.getCurrentIndex();
                if (currentIndex >= 0) {
                    while (true) {
                        int i3 = currentIndex - 1;
                        WebHistoryItem itemAtIndex = webBackForwardListCopyBackForwardList.getItemAtIndex(currentIndex);
                        if (!wl7.b(itemAtIndex.getUrl(), "about:blank")) {
                            url = itemAtIndex.getUrl();
                        } else if (i3 >= 0) {
                            currentIndex = i3;
                        }
                    }
                    url = null;
                } else {
                    url = null;
                }
                if (url != null) {
                    ModalWebview modalWebview2 = ec1Var.m0;
                    if (modalWebview2 == null) {
                        wl7.g("webview");
                        throw null;
                    }
                    modalWebview2.loadUrl(url);
                } else {
                    String str = ec1Var.n0;
                    if (str == null) {
                        wl7.g("modalSheetUrl");
                        throw null;
                    }
                    if (zve.U(str)) {
                        throw new Exception("Retry url and modal sheet url are null or empty");
                    }
                    ModalWebview modalWebview3 = ec1Var.m0;
                    if (modalWebview3 == null) {
                        wl7.g("webview");
                        throw null;
                    }
                    String str2 = ec1Var.n0;
                    if (str2 == null) {
                        wl7.g("modalSheetUrl");
                        throw null;
                    }
                    modalWebview3.loadUrl(str2);
                }
                return j6g.a;
            case 6:
                w02 w02Var = (w02) obj;
                x02 x02Var = (x02) w02Var.d.getValue();
                x02Var.getClass();
                Lazy<s87> lazy = s87.f;
                s87.a.a((gz4) x02Var.a.getValue(), tx5.k(x02Var.b, "native-change-country", "report-the-issue", null, 12));
                w02Var.F("nativeChangeCountrySelectorScreen", new bo0(1), new qa(w02Var, 3));
                return j6g.a;
            case 7:
                ((x1c) obj).E(qr2.a);
                return j6g.a;
            case 8:
                h64 h64Var = (h64) obj;
                Map<String, a64> map = h64Var.h;
                if (map == null) {
                    return bs4.a;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(kc9.V(map.size()));
                Iterator<T> it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    linkedHashMap.put(entry.getKey(), h64Var.a.a((a64) entry.getValue()));
                }
                return linkedHashMap;
            case DatadogLogGenerator.CRASH /* 9 */:
                gu5<j6g> gu5Var = ((ks4) obj).f;
                if (gu5Var != null) {
                    gu5Var.invoke();
                }
                return j6g.a;
            case 10:
                gu5<j6g> gu5Var2 = ((gx4) obj).i;
                if (gu5Var2 != null) {
                    gu5Var2.invoke();
                }
                return j6g.a;
            case 11:
                ut5 ut5Var = (ut5) obj;
                ut5Var.Y.i("ian-full-screen-detail-view");
                ut5Var.P();
                return j6g.a;
            case 12:
                IanMainFragment ianMainFragment = (IanMainFragment) obj;
                ianMainFragment.c.f(false, ianMainFragment.K().g());
                return j6g.a;
            case 13:
                ModalWebview modalWebviewN = ((IndeedApplyWebViewFragment) obj).N();
                r97.a.getClass();
                modalWebviewN.loadUrl(r97.b());
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                JobSearchApplication jobSearchApplication = JobSearchApplication.X;
                return j6g.a;
            case 15:
                t78 t78Var = (t78) obj;
                ((gme) t78Var.Q().e).setValue(b5gVar);
                t78Var.close();
                Function2<? super hs7, ? super js7, j6g> function22 = t78Var.h0;
                if (function22 != null) {
                    function22.invoke(hs7.c, null);
                }
                return j6g.a;
            case 16:
                LaunchFragment launchFragment = (LaunchFragment) obj;
                mka mkaVar = (mka) launchFragment.d.getValue();
                mkaVar.getClass();
                Lazy<s87> lazy2 = s87.f;
                s87.a.a((gz4) mkaVar.a.getValue(), tx5.k(mkaVar.b, "non-supported-country", "select-another-country-button", null, 12));
                ((gme) launchFragment.E().f).setValue(ex4.c);
                ((gme) launchFragment.E().V).setValue(Boolean.FALSE);
                LaunchActivity launchActivity = launchFragment.W;
                if (launchActivity == null) {
                    wl7.g("activity");
                    throw null;
                }
                lr5 lr5VarU = launchActivity.u();
                lr5VarU.getClass();
                w02 w02Var2 = new w02();
                a aVar = new a(lr5VarU);
                web.E(lr5VarU, aVar, "ChangeCountrySelectorFragment", null);
                aVar.c("ChangeCountrySelectorFragment");
                aVar.d(R.id.app_container, w02Var2, "ChangeCountrySelectorFragment", 1);
                aVar.h(false);
                web.A(w02Var2, lr5VarU, 8, 0);
                return j6g.a;
            case 17:
                return Float.valueOf(((ur8) obj).e0.e());
            case 18:
                ((Function1) obj).invoke(null);
                return j6g.a;
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                t7b t7bVar = (t7b) obj;
                if (!t7bVar.k) {
                    t7bVar.d.invoke();
                }
                return j6g.a;
            case 20:
                return new bxb(((ProfileUIPlatformDebugFragment) obj).a);
            case 21:
                RegPromoFragment regPromoFragment = (RegPromoFragment) obj;
                String string = regPromoFragment.getString(R.string.indeed_login_url);
                string.getClass();
                regPromoFragment.F(oxc.a(string, regPromoFragment.V), true);
                regPromoFragment.E("reg_promo_continue_with_google_tapped");
                return j6g.a;
            case 22:
                f8d f8dVar = (f8d) obj;
                return new n2c(f8dVar.g0, f8dVar.h0);
            case 23:
                return Float.valueOf(((vrd) obj).d0.f());
            case 24:
                x8f x8fVar = (x8f) obj;
                rq7 rq7Var = (rq7) cr8.p(rq7.class);
                lr5 lr5VarU2 = x8fVar.requireActivity().u();
                lr5VarU2.getClass();
                rq7Var.f(lr5VarU2, mh2.k(x8fVar), new jq7.i(null), "tare-debug-screen");
                return j6g.a;
            case 25:
                b bVar = (b) obj;
                bVar.t0 = null;
                us3.f(bVar).U();
                us3.f(bVar).S();
                fb4.a(bVar);
                return Boolean.TRUE;
            default:
                ModalWebview modalWebview4 = ((com.indeed.android.jobsearch.viewjob.a) obj).B0;
                if (modalWebview4 != null) {
                    return modalWebview4;
                }
                wl7.g("webview");
                throw null;
        }
    }

    public /* synthetic */ a1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
