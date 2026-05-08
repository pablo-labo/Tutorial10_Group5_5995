package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.widget.FrameLayout;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.bridge.ReadableNativeMap;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.searchoverlay.SearchOverlayFragment;
import com.indeed.android.jobsearch.webview.indeedapply.IndeedApplyWebViewFragment;
import com.indeed.android.jsmappservices.bridge.SearchType;
import com.indeed.android.profile.screens.sheets.profilesubtab.skills.a;
import com.indeed.android.profile.screens.sheets.profilesubtab.skills.b;
import defpackage.fr0;
import defpackage.jq7;
import defpackage.kfb;
import defpackage.s87;
import defpackage.sp7;
import java.io.IOException;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oa implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oa(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gu5
    public final Object invoke() throws IOException {
        hne hneVar;
        int i = this.a;
        ps7 ps7Var = ps7.d;
        b5g b5gVar = b5g.a;
        int i2 = 12;
        Object obj = this.b;
        switch (i) {
            case 0:
                ra raVar = (ra) obj;
                ((gme) ((yvb) raVar.i0.getValue()).e).setValue(b5gVar);
                raVar.close();
                Function1<? super ps7, j6g> function1 = raVar.j0;
                if (function1 != null) {
                    function1.invoke(ps7Var);
                }
                return j6g.a;
            case 1:
                jg jgVar = (jg) obj;
                jgVar.close();
                Function1<? super ps7, j6g> function12 = jgVar.i0;
                if (function12 != null) {
                    function12.invoke(ps7.b);
                }
                return j6g.a;
            case 2:
                return new bxb(((nr) obj).i0);
            case 3:
                ((fr0) obj).r(new fr0.b.C0240b());
                return j6g.a;
            case 4:
                o03 o03Var = (o03) obj;
                lu8 lu8Var = o03Var.h0;
                sm5 sm5Var = o03Var.n0;
                boolean z = o03Var.i0;
                if (!lu8Var.b()) {
                    sm5.b(sm5Var);
                } else if (!z && (hneVar = lu8Var.c) != null) {
                    hneVar.b();
                }
                return Boolean.TRUE;
            case 5:
                rh4 rh4Var = (rh4) obj;
                ((gme) rh4Var.Q().e).setValue(b5gVar);
                rh4Var.close();
                Function1<? super ps7, j6g> function13 = rh4Var.i0;
                if (function13 != null) {
                    function13.invoke(ps7Var);
                }
                return j6g.a;
            case 6:
                return new bxb(((al4) obj).g0);
            case 7:
                ((tl4) obj).Q(ps7.c, null);
                return j6g.a;
            case 8:
                a aVar = (a) obj;
                yvb.n(aVar.Q(), aVar.j0, null, null, null, 14);
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                return f13.a(((z35) obj).b().f.a.d1(new c13("expo.modules.fetch.CoroutineScope")));
            case 10:
                ut5 ut5Var = (ut5) obj;
                bp6 bp6Var = ut5Var.Y;
                bp6Var.getClass();
                Lazy<s87> lazy = s87.f;
                s87.a.a(bp6Var.a(), tx5.k(bp6Var.b, "ian-full-screen-detail-view", "top-nav-home", null, 12));
                ut5Var.Q();
                return j6g.a;
            case 11:
                qj6 qj6Var = (qj6) obj;
                int i3 = qj6.r0;
                qj6Var.Y.i("HOME");
                qj6Var.Y();
                return j6g.a;
            case 12:
                FrameLayout frameLayout = (FrameLayout) obj;
                frameLayout.post(new aj6(frameLayout, 1));
                return j6g.a;
            case 13:
                IndeedApplyWebViewFragment indeedApplyWebViewFragment = (IndeedApplyWebViewFragment) obj;
                Lazy<s87> lazy2 = s87.f;
                s87.a.a(indeedApplyWebViewFragment.P(), tx5.k(indeedApplyWebViewFragment.t0, "IndeedApplyWebViewFragment", "report", null, 12));
                u63.Y(hh1.A(indeedApplyWebViewFragment), null, null, new r77(indeedApplyWebViewFragment, null), 3);
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                bn7 bn7Var = (bn7) obj;
                boolean z2 = bn7Var.f0;
                bn7Var.f0 = true;
                if (i6a.i()) {
                    u63.Y(ee3.p(bn7Var), null, null, new en7(bn7Var, true, true, null), 3);
                }
                if (z2) {
                    bn7Var.e0.b("Invitations", ee3.p(bn7Var));
                }
                return j6g.a;
            case 15:
                b bVar = (b) obj;
                yvb.n(bVar.Q(), bVar.k0, null, null, new z0(bVar, 15), 6);
                return j6g.a;
            case 16:
                ura uraVar = (ura) obj;
                int i4 = ura.l0;
                uraVar.D();
                m91 m91Var = uraVar.j0;
                if (m91Var != null) {
                    m91Var.invoke(Boolean.FALSE);
                    return j6g.a;
                }
                wl7.g("callback");
                throw null;
            case 17:
                ((t7b) obj).j.invoke();
                return j6g.a;
            case 18:
                mfb mfbVar = (mfb) obj;
                f7e f7eVarB = i7e.b("kotlinx.serialization.Polymorphic", kfb.a.a, new SerialDescriptor[0], new hp0(mfbVar, i2));
                yd8<T> yd8Var = mfbVar.a;
                yd8Var.getClass();
                return new pt2(f7eVarB, yd8Var);
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                vpb vpbVar = (vpb) obj;
                z1b z1bVar = vpbVar.e;
                spb spbVar = vpbVar.b;
                it5.a();
                return new skf(vpbVar.j(new k09(spbVar.i.h(), spbVar.j, spbVar.a)), z1bVar);
            case 20:
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("rich-profile-http-error-screen", "refresh", null, null, 12));
                ((crb) obj).S();
                return j6g.a;
            case 21:
                ((ra9) obj).a(q92.d);
                return j6g.a;
            case 22:
                return ReadableNativeMap.localTypeMap_delegate$lambda$3((ReadableNativeMap) obj);
            case 23:
                ((upb) obj).k(null);
                return j6g.a;
            case 24:
                return wkd.c((jrg) obj);
            case 25:
                SearchOverlayFragment searchOverlayFragment = (SearchOverlayFragment) obj;
                aud audVarH = searchOverlayFragment.H();
                audVarH.getClass();
                Lazy<s87> lazy3 = s87.f;
                s87.a.a(audVarH.a(), tx5.k(audVarH.b, ak2.M(SearchType.c), "app-settings", null, 12));
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", searchOverlayFragment.requireContext().getPackageName(), null));
                searchOverlayFragment.startActivity(intent);
                return j6g.a;
            default:
                x8f x8fVar = (x8f) obj;
                rq7 rq7Var = (rq7) cr8.p(rq7.class);
                lr5 lr5VarU = x8fVar.requireActivity().u();
                lr5VarU.getClass();
                rq7Var.f(lr5VarU, mh2.k(x8fVar), jq7.t.INSTANCE, "tare-debug-screen");
                return j6g.a;
        }
    }
}
