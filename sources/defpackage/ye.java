package defpackage;

import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.bridge.ReadableNativeArray;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.searchoverlay.SearchOverlayFragment;
import com.indeed.android.jobsearch.tare.debug.ProfileFormsDebugFragment;
import com.indeed.android.jobsearch.webview.indeedapply.IndeedApplyWebViewFragment;
import com.indeed.android.jsmappservices.bridge.SearchType;
import com.indeed.android.profile.screens.sheets.profilesubtab.certifications.a;
import defpackage.ff6;
import defpackage.jq7;
import defpackage.s87;
import defpackage.sp7;
import defpackage.xa1;
import expo.modules.kotlin.ExpoBridgeModule;
import expo.modules.kotlin.jni.JavaScriptTypedArray;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ye implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ye(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        ps7 ps7Var = ps7.c;
        int i2 = 2;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((iba) obj).p("DESCRIPTION");
                return j6g.a;
            case 1:
                return new bxb(((jg) obj).g0);
            case 2:
                d40 d40Var = (d40) obj;
                return new Pair(d40Var.e(), d40Var.h.getValue());
            case 3:
                fx4 fx4VarE = ((y91) obj).E();
                ((gme) fx4VarE.b).setValue(dx4.a(fx4VarE.g(), false, null, true, 63));
                return j6g.a;
            case 4:
                return ((xa1.a) obj).a(":memory:");
            case 5:
                a aVar = (a) obj;
                Function2<? super ps7, ? super qr7, j6g> function2 = aVar.j0;
                aVar.j0 = null;
                if (function2 != null) {
                    function2.invoke(ps7Var, null);
                }
                aVar.Q();
                return j6g.a;
            case 6:
                lk4 lk4Var = (lk4) obj;
                lk4Var.close();
                Function1<? super ps7, j6g> function1 = lk4Var.i0;
                if (function1 != null) {
                    function1.invoke(ps7Var);
                }
                return j6g.a;
            case 7:
                com.indeed.android.profile.screens.sheets.profilesubtab.skills.a aVar2 = (com.indeed.android.profile.screens.sheets.profilesubtab.skills.a) obj;
                ((gme) aVar2.Q().e).setValue(b5g.a);
                Function2<? super ps7, ? super qs7, j6g> function22 = aVar2.k0;
                aVar2.k0 = null;
                if (function22 != null) {
                    function22.invoke(ps7.d, null);
                }
                aVar2.close();
                return j6g.a;
            case 8:
                return Boolean.valueOf(ExpoBridgeModule.installModules$lambda$0((ExpoBridgeModule) obj));
            case DatadogLogGenerator.CRASH /* 9 */:
                ff6 ff6Var = (ff6) obj;
                ArrayList arrayList = lz2.a;
                lz2.d("HamburgerMenuViewModel", "refreshData failure", false, null);
                u63.Y(ee3.p(ff6Var), ff6Var.b, null, new ff6.a.C0229a(ff6Var, null), 2);
                return j6g.a;
            case 10:
                IndeedApplyWebViewFragment indeedApplyWebViewFragment = (IndeedApplyWebViewFragment) obj;
                if (indeedApplyWebViewFragment.N().canGoBack()) {
                    indeedApplyWebViewFragment.N().goBack();
                } else {
                    indeedApplyWebViewFragment.Q().g(true);
                }
                return j6g.a;
            case 11:
                return Integer.valueOf((int) ((JavaScriptTypedArray) obj).getProperty("length").getDouble());
            case 12:
                return Integer.valueOf(((e2b) obj).o());
            case 13:
                h5b h5bVar = (h5b) obj;
                Lazy<s87> lazy = s87.f;
                s87.a.a((gz4) h5bVar.o0.getValue(), tx5.k(h5bVar.p0, "PassportSignInWebViewFragment", "report", null, 12));
                u63.Y(hh1.A(h5bVar), null, null, new i5b(h5bVar, null), 3);
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                vpb vpbVar = (vpb) obj;
                spb spbVar = vpbVar.b;
                it5.a();
                opb<vs4> opbVarB = vpbVar.b();
                spbVar.getClass();
                return new l1f(opbVarB);
            case 15:
                ProfileFormsDebugFragment profileFormsDebugFragment = (ProfileFormsDebugFragment) obj;
                rq7 rq7Var = (rq7) cr8.p(rq7.class);
                lr5 lr5VarU = profileFormsDebugFragment.requireActivity().u();
                lr5VarU.getClass();
                rq7Var.f(lr5VarU, mh2.k(profileFormsDebugFragment), new jq7.i(null), "ProfileFormsDebugFragment");
                return j6g.a;
            case 16:
                ((i1g) cr8.p(i1g.class)).a(t40.g((crb) obj), new bub());
                return j6g.a;
            case 17:
                x1c x1cVar = (x1c) obj;
                ((gme) x1cVar.V).setValue(exb.a(x1cVar.o(), null, null, null, null, false, false, false, null, false, false, false, false, false, false, 65519));
                return j6g.a;
            case 18:
                return ReadableNativeArray.localArray_delegate$lambda$0((ReadableNativeArray) obj);
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("ResumePreviewOptionsBottomSheetFragment", "close", null, null, 12));
                ((f9d) obj).close();
                return j6g.a;
            case 20:
                ((pld) obj).o(true);
                return j6g.a;
            case 21:
                SearchOverlayFragment searchOverlayFragment = (SearchOverlayFragment) obj;
                searchOverlayFragment.H().b(SearchType.c);
                SearchOverlayFragment.G(searchOverlayFragment);
                return j6g.a;
            case 22:
                int i3 = mud.t0;
                ((mud) obj).M().b.setVisibility(8);
                return j6g.a;
            case 23:
                return (mif) ((h3e) obj).d.b;
            case 24:
                ((qke) obj).b();
                return j6g.a;
            default:
                int i4 = com.indeed.android.jobsearch.viewjob.a.H0;
                return new f24((com.indeed.android.jobsearch.viewjob.a) obj, i2);
        }
    }
}
