package defpackage;

import android.content.Intent;
import android.net.Uri;
import androidx.compose.foundation.e;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.uimanager.ViewManager;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.bottomnav.IanMainFragment;
import com.indeed.android.jobsearch.launch.LaunchFragment;
import com.indeed.android.jobsearch.regpromo.RegPromoFragment;
import com.indeed.android.jobsearch.searchoverlay.SearchOverlayFragment;
import com.indeed.android.jobsearch.viewjob.a;
import com.indeed.android.jsmappservices.bridge.SearchType;
import com.indeed.android.profile.screens.sheets.profilesubtab.skills.b;
import defpackage.c87;
import defpackage.eq7;
import defpackage.oq7;
import defpackage.s87;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z0 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        ts3 ts3Var;
        int i = this.a;
        ps7 ps7Var = ps7.b;
        hs7 hs7Var = hs7.c;
        b5g b5gVar = b5g.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                b1 b1Var = (b1) obj;
                pa7 pa7Var = (pa7) om2.a(b1Var, e.a);
                if (!(pa7Var instanceof ua7)) {
                    de7.a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. You can also use ComposeFoundationFlags.isNonComposedClickableEnabled to temporarily opt-out; note that this flag will be removed in a future release and is only intended to be a temporary migration aid. The Indication instance provided here was: " + pa7Var);
                }
                ua7 ua7Var = b1Var.n0;
                ua7 ua7Var2 = (ua7) pa7Var;
                b1Var.n0 = ua7Var2;
                if (ua7Var != null && !wl7.b(ua7Var2, ua7Var) && ((ts3Var = b1Var.p0) != null || !b1Var.v0)) {
                    if (ts3Var != null) {
                        b1Var.d2(ts3Var);
                    }
                    b1Var.p0 = null;
                    b1Var.k2();
                }
                break;
            case 1:
                break;
            case 2:
                dt dtVar = (dt) obj;
                dtVar.close();
                Function1<? super ps7, j6g> function1 = dtVar.i0;
                if (function1 != null) {
                    function1.invoke(ps7Var);
                }
                break;
            case 3:
                u63.Y((e13) obj, null, null, new br0(2, null), 3);
                break;
            case 4:
                break;
            case 5:
                w02 w02Var = (w02) obj;
                x02 x02Var = (x02) w02Var.d.getValue();
                x02Var.getClass();
                Lazy<s87> lazy = s87.f;
                s87.a.a((gz4) x02Var.a.getValue(), tx5.k(x02Var.b, "native-change-country", "refresh", null, 12));
                h12 h12VarG = w02Var.G();
                h12VarG.k(i12.a(h12VarG.g(), null, null, null, null, null, null, n12.b, false, 191));
                u63.Y(ee3.p(h12VarG), h12VarG.b, null, new g12(h12VarG, null), 2);
                break;
            case 6:
                c52 c52Var = (c52) obj;
                break;
            case 7:
                ((kdf) obj).close();
                break;
            case 8:
                gu5<j6g> gu5Var = ((ks4) obj).f;
                if (gu5Var != null) {
                    gu5Var.invoke();
                }
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                ((IanMainFragment) obj).K().h(false);
                break;
            case 10:
                wj7 wj7Var = (wj7) obj;
                if (!wj7Var.v) {
                    wj7Var.j.invoke();
                }
                break;
            case 11:
                ((Function1) obj).invoke(new oq7.e(new eq7.c(new jhb(0))));
                break;
            case 12:
                h78 h78Var = (h78) obj;
                ((gme) h78Var.R().e).setValue(b5gVar);
                h78Var.Q(hs7Var, null);
                break;
            case 13:
                hg6 hg6Var = (LaunchFragment) obj;
                d2f d2fVar = c87.a;
                String strA = c87.a.a(ez2.b);
                if (strA == null) {
                }
                break;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                ((o99) obj).close();
                break;
            case 15:
                b bVar = (b) obj;
                if (bVar.k0) {
                    List<zie> list = bVar.Q().v().R;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (!((zie) obj2).e) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(t92.r0(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(jsb.j((zie) it.next()));
                    }
                    Function2<? super ps7, ? super List<qs7>, j6g> function2 = bVar.l0;
                    bVar.l0 = null;
                    bVar.close();
                    if (function2 != null) {
                        function2.invoke(ps7.a, arrayList2);
                    }
                } else {
                    List<zie> list2 = bVar.Q().v().Q;
                    ArrayList arrayList3 = new ArrayList(t92.r0(list2, 10));
                    Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(jsb.j((zie) it2.next()));
                    }
                    Function2<? super ps7, ? super List<qs7>, j6g> function22 = bVar.l0;
                    bVar.l0 = null;
                    bVar.close();
                    if (function22 != null) {
                        function22.invoke(ps7Var, arrayList3);
                    }
                }
                break;
            case 16:
                ((t7b) obj).d.invoke();
                break;
            case 17:
                it5.a();
                break;
            case 18:
                RegPromoFragment regPromoFragment = (RegPromoFragment) obj;
                String string = regPromoFragment.getString(R.string.indeed_login_url);
                string.getClass();
                regPromoFragment.F(oxc.a(string, regPromoFragment.V).concat("&from=reg-promo-native"), false);
                regPromoFragment.E("sign-in");
                break;
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                izc izcVar = (izc) obj;
                ((gme) izcVar.R().e).setValue(b5gVar);
                izcVar.Q(hs7Var, null);
                break;
            case 20:
                break;
            case 21:
                SearchOverlayFragment searchOverlayFragment = (SearchOverlayFragment) obj;
                aud audVarH = searchOverlayFragment.H();
                audVarH.getClass();
                Lazy<s87> lazy2 = s87.f;
                s87.a.a(audVarH.a(), tx5.k(audVarH.b, ak2.M(SearchType.c), "app-settings", null, 12));
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", searchOverlayFragment.requireContext().getPackageName(), null));
                searchOverlayFragment.startActivity(intent);
                break;
            case 22:
                ((ae0) obj).f = false;
                break;
            case 23:
                ((gme) ((x8f) obj).R().e).setValue(Boolean.FALSE);
                break;
            case 24:
                khg khgVar = (khg) obj;
                y13 y13Var = new y13();
                tqc tqcVar = new tqc(y13Var);
                khgVar.c(tqcVar, false);
                tqcVar.flush();
                long j = y13Var.a;
                Iterator<T> it3 = khgVar.a.values().iterator();
                long jA = 0;
                while (it3.hasNext()) {
                    jA += ((zgg) it3.next()).a();
                }
                break;
            case 25:
                int i2 = a.H0;
                ((a) obj).E();
                break;
            default:
                Iterator it4 = ((ArrayList) obj).iterator();
                while (it4.hasNext()) {
                    ((ViewManager) it4.next()).trimMemory();
                }
                break;
        }
        return j6g.a;
    }
}
