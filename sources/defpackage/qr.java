package defpackage;

import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import androidx.fragment.app.Fragment;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.bottomnav.IanMainFragment;
import com.indeed.android.jobsearch.launch.LaunchFragment;
import com.indeed.android.jobsearch.regpromo.RegPromoFragment;
import com.indeed.android.jobsearch.searchoverlay.SearchOverlayFragment;
import com.indeed.android.jobsearch.viewjob.a;
import com.indeed.android.jobsearch.webview.modal.ModalWebview;
import com.indeed.android.jsmappservices.bridge.SearchType;
import com.indeed.android.messaging.data.MessagingDatabase_Impl;
import com.indeed.android.messaging.data.events.EventDao_Impl;
import defpackage.jq7;
import defpackage.s87;
import defpackage.xh8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qr implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qr(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gu5
    public final Object invoke() throws Exception {
        String url;
        int i = this.a;
        b5g b5gVar = b5g.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new bxb(((sr) obj).j0);
            case 1:
                return web.q((Object[]) obj);
            case 2:
                p91 p91Var = (p91) obj;
                qf8<Object>[] qf8VarArr = p91.i0;
                dd4 dd4Var = dd4.a;
                if (dd4.b()) {
                    p91Var.H(false);
                } else {
                    p91Var.J(false);
                }
                return j6g.a;
            case 3:
                gu5<j6g> gu5Var = ((ks4) obj).h;
                if (gu5Var != null) {
                    gu5Var.invoke();
                }
                return j6g.a;
            case 4:
                ut5 ut5Var = (ut5) obj;
                bp6 bp6Var = ut5Var.Y;
                bp6Var.getClass();
                Lazy<s87> lazy = s87.f;
                s87.a.a(bp6Var.a(), tx5.k(bp6Var.b, "ian-post-apply-banner", "close", null, 12));
                ut5Var.N().h(false);
                return j6g.a;
            case 5:
                IanMainFragment ianMainFragment = (IanMainFragment) obj;
                ((yof) ianMainFragment.V.getValue()).a("ian-main-screen");
                ((apf) ianMainFragment.n0.getValue()).g();
                return j6g.a;
            case 6:
                mq6 mq6Var = (mq6) obj;
                d2f d2fVar = mq6Var.a0;
                if (bu8.a.h()) {
                    ((w1g) (mq6Var instanceof ai8 ? ((ai8) mq6Var).d() : (qpd) xh8.a.a().a.b).a(null, fwc.a.b(w1g.class), null)).a((e13) d2fVar.getValue(), new vz0(5));
                } else {
                    u63.Y((e13) d2fVar.getValue(), null, null, new lq6(mq6Var, null), 3);
                }
                return j6g.a;
            case 7:
                List<Fragment> listF = ((lr5) obj).c.f();
                listF.getClass();
                ArrayList arrayList = new ArrayList();
                for (Fragment fragment : listF) {
                    List<Fragment> listF2 = fragment.getChildFragmentManager().c.f();
                    listF2.getClass();
                    w92.w0(arrayList, z92.h1(u63.Z(fragment), listF2));
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (obj2 instanceof ihc) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (obj3 instanceof pec) {
                        arrayList3.add(obj3);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : arrayList) {
                    if (obj4 instanceof x8f) {
                        arrayList4.add(obj4);
                    }
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((ihc) it.next()).close();
                }
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    ((pec) it2.next()).close();
                }
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    ((x8f) it3.next()).close();
                }
                return j6g.a;
            case 8:
                ((c88) obj).k.invoke();
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                ((gme) ((LaunchFragment) obj).E().c0).setValue(Boolean.FALSE);
                return j6g.a;
            case 10:
                ur8 ur8Var = (ur8) obj;
                return Float.valueOf(ur8Var.e0.d() - ur8Var.e0.a());
            case 11:
                return new ooa(((h89) obj).r0);
            case 12:
                o99 o99Var = (o99) obj;
                ((gme) o99Var.Q().e).setValue(b5gVar);
                o99Var.close();
                return j6g.a;
            case 13:
                return new EventDao_Impl((MessagingDatabase_Impl) obj);
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                i5a i5aVar = (i5a) obj;
                i5aVar.Y = null;
                i5aVar.Z = false;
                return j6g.a;
            case 15:
                t7b t7bVar = (t7b) obj;
                if (!t7bVar.l) {
                    t7bVar.e.invoke();
                }
                return j6g.a;
            case 16:
                return Float.valueOf(((cme) ((g7c) obj).f).g() * 0.5f);
            case 17:
                RegPromoFragment regPromoFragment = (RegPromoFragment) obj;
                rq7 rq7Var = (rq7) cr8.p(rq7.class);
                lr5 lr5VarU = regPromoFragment.requireActivity().u();
                lr5VarU.getClass();
                rq7Var.f(lr5VarU, mh2.k(regPromoFragment), jq7.c0.INSTANCE, "reg-promo-native");
                regPromoFragment.E("terms-of-service");
                return j6g.a;
            case 18:
                d1d d1dVar = (d1d) obj;
                ((gme) d1dVar.Q().e).setValue(b5gVar);
                d1dVar.close();
                Function2<? super hs7, ? super xs7, j6g> function2 = d1dVar.h0;
                if (function2 != null) {
                    function2.invoke(hs7.c, null);
                }
                return j6g.a;
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                return Boolean.valueOf(((dme) ((zrd) obj).a).e() > 0);
            case 20:
                SearchOverlayFragment searchOverlayFragment = (SearchOverlayFragment) obj;
                searchOverlayFragment.H().b(SearchType.b);
                SearchOverlayFragment.G(searchOverlayFragment);
                return j6g.a;
            case 21:
                ube ubeVar = (ube) obj;
                g4a g4aVar = ubeVar.c;
                if (((kie) ((gme) g4aVar).getValue()).a == 9205357640488583168L || kie.e(((kie) ((gme) g4aVar).getValue()).a)) {
                    return null;
                }
                return ubeVar.a.b(((kie) ((gme) g4aVar).getValue()).a);
            case 22:
                ((qke) obj).dismiss();
                return Boolean.TRUE;
            case 23:
                x8f x8fVar = (x8f) obj;
                rq7 rq7Var2 = (rq7) cr8.p(rq7.class);
                lr5 lr5VarU2 = x8fVar.requireActivity().u();
                lr5VarU2.getClass();
                rq7Var2.f(lr5VarU2, mh2.k(x8fVar), jq7.q.INSTANCE, "tare-debug-screen");
                return j6g.a;
            default:
                a aVar = (a) obj;
                int i2 = a.H0;
                Lazy<s87> lazy2 = s87.f;
                s87.a.a(aVar.P(), tx5.k(aVar.t0, "view-job-bottom-sheet", "retry", null, 12));
                lqg lqgVarQ = aVar.Q();
                ((gme) lqgVarQ.b).setValue(jqg.a(lqgVarQ.g(), true, true, false, false, null, true, null, null, 0.0f, false, false, 4052));
                ModalWebview modalWebview = aVar.B0;
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
                    ModalWebview modalWebview2 = aVar.B0;
                    if (modalWebview2 == null) {
                        wl7.g("webview");
                        throw null;
                    }
                    modalWebview2.loadUrl(url);
                } else {
                    String str = aVar.C0;
                    if (str == null) {
                        wl7.g("viewJobUrl");
                        throw null;
                    }
                    if (zve.U(str)) {
                        throw new Exception("Retry url and ViewJob url are null or empty");
                    }
                    ModalWebview modalWebview3 = aVar.B0;
                    if (modalWebview3 == null) {
                        wl7.g("webview");
                        throw null;
                    }
                    String str2 = aVar.C0;
                    if (str2 == null) {
                        wl7.g("viewJobUrl");
                        throw null;
                    }
                    modalWebview3.loadUrl(str2);
                }
                return j6g.a;
        }
    }
}
