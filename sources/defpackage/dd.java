package defpackage;

import android.content.Context;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.uimanager.ViewManager;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.indeed.android.jobsearch.bottomnav.IanMainFragment;
import com.indeed.android.jobsearch.searchoverlay.SearchOverlayFragment;
import com.indeed.android.jobsearch.webview.indeedapply.IndeedApplyWebViewFragment;
import com.indeed.android.jsmappservices.util.LocationSensor;
import defpackage.jq7;
import defpackage.os7;
import defpackage.rsc;
import defpackage.s87;
import defpackage.sp7;
import defpackage.ude;
import defpackage.ur7;
import expo.modules.video.FullscreenPlayerActivity;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.jvm.functions.Function2;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dd implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dd(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        int i = this.a;
        b5g b5gVar = b5g.a;
        int i2 = 12;
        byte b = 0;
        ArrayList arrayList = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                fd fdVar = (fd) obj;
                ((gme) fdVar.Q().e).setValue(b5gVar);
                fdVar.close();
                Function2<? super ps7, ? super pr7, j6g> function2 = fdVar.j0;
                if (function2 != null) {
                    function2.invoke(ps7.d, null);
                }
                break;
            case 1:
                ((fr0) obj).p(true);
                break;
            case 2:
                qf8<Object>[] qf8VarArr = p91.i0;
                ((dme) ((jq6) ((p91) obj).a0.getValue()).W).h(0);
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                nn4 nn4Var = (nn4) obj;
                Function2<? super ps7, ? super vs7, j6g> function22 = nn4Var.l0;
                nn4Var.l0 = null;
                if (function22 != null) {
                    function22.invoke(ps7.c, null);
                }
                nn4Var.Q();
                break;
            case 6:
                sf5 sf5Var = (sf5) obj;
                FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(sf5Var.a);
                String strA = sf5Var.b.a();
                mhh mhhVar = firebaseAnalytics.a;
                mhhVar.getClass();
                mhhVar.c(new uih(mhhVar, strA));
                break;
            case 7:
                int i3 = FullscreenPlayerActivity.Z;
                ((FullscreenPlayerActivity) obj).finish();
                break;
            case 8:
                qj6 qj6Var = (qj6) obj;
                int i4 = qj6.r0;
                bp6 bp6Var = qj6Var.Y;
                bp6Var.getClass();
                Lazy<s87> lazy = s87.f;
                s87.a.a(bp6Var.a(), tx5.k(bp6Var.b, "HOME", "top-nav-profile", null, 12));
                rq7 rq7Var = (rq7) cr8.p(rq7.class);
                lr5 lr5VarU = qj6Var.requireActivity().u();
                lr5VarU.getClass();
                rq7Var.f(lr5VarU, mh2.k(qj6Var), jq7.u.INSTANCE, "HomeTabWebViewFragment");
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                IanMainFragment ianMainFragment = (IanMainFragment) obj;
                bp6 bp6Var2 = ianMainFragment.c;
                bp6Var2.getClass();
                Lazy<s87> lazy2 = s87.f;
                s87.a.a(bp6Var2.a(), tx5.k(bp6Var2.b, "ian-post-apply-banner", "close", null, 12));
                ianMainFragment.K().h(false);
                break;
            case 10:
                IndeedApplyWebViewFragment indeedApplyWebViewFragment = (IndeedApplyWebViewFragment) obj;
                ((yof) indeedApplyWebViewFragment.r0.getValue()).a("IndeedApplyWebViewFragment");
                ((apf) indeedApplyWebViewFragment.o0.getValue()).g();
                break;
            case 11:
                Context context = (Context) ((LocationSensor) obj).a.getValue();
                int i5 = d29.a;
                break;
            case 12:
                ((o99) obj).close();
                break;
            case 13:
                ((ude) obj).m(ude.c.b.a);
                break;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                sw5<?> sw5Var = ((PluginGeneratedSerialDescriptor) obj).b;
                if (sw5Var != null && (kSerializerArrTypeParametersSerializers = sw5Var.typeParametersSerializers()) != null) {
                    arrayList = new ArrayList(kSerializerArrTypeParametersSerializers.length);
                    for (KSerializer<?> kSerializer : kSerializerArrTypeParametersSerializers) {
                        arrayList.add(kSerializer.getDescriptor());
                    }
                }
                break;
            case 15:
                vpb vpbVar = (vpb) obj;
                spb spbVar = vpbVar.b;
                break;
            case 16:
                ((vr7) cr8.p(vr7.class)).b(t40.g((crb) obj), new os7.g(null, new im0(i2, b == true ? 1 : 0)), new ur7.c(""));
                break;
            case 17:
                ((tp7) cr8.p(tp7.class)).b(new sp7.h(12, "resume-options-menu", "replace-file", null));
                ((ra9) obj).a(q92.d);
                break;
            case 18:
                SearchOverlayFragment searchOverlayFragment = (SearchOverlayFragment) obj;
                searchOverlayFragment.H().f();
                cud cudVarI = searchOverlayFragment.I();
                rsc rscVarK = cudVarI.k();
                rsc.a aVar = rscVarK instanceof rsc.a ? (rsc.a) rscVarK : null;
                if (aVar != null) {
                    ((gme) cudVarI.j0).setValue(rsc.a.b(aVar, null, 3));
                }
                break;
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                ndf ndfVar = (ndf) obj;
                if (ndfVar.c0) {
                }
                break;
            case 20:
                break;
            case 21:
                Iterator it = ((ArrayList) obj).iterator();
                while (it.hasNext()) {
                    ((ViewManager) it.next()).invalidate();
                }
                break;
            default:
                j3h j3hVar = (j3h) obj;
                ((gme) j3hVar.Q().e).setValue(b5gVar);
                j3hVar.close();
                Function2<? super hs7, ? super ws7, j6g> function23 = j3hVar.h0;
                if (function23 != null) {
                    function23.invoke(hs7.c, null);
                }
                break;
        }
        return j6g.a;
    }
}
