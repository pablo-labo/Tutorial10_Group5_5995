package defpackage;

import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.bridge.ReadableNativeMap;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.searchoverlay.SearchOverlayFragment;
import com.indeed.android.jobsearch.updatedterms.BlockingToSFragment;
import com.indeed.android.jobsearch.webview.indeedapply.IndeedApplyWebViewFragment;
import com.indeed.android.jsmappservices.bridge.SearchType;
import com.indeed.android.profile.screens.sheets.profilesubtab.militaryservice.a;
import com.indeed.android.profile.screens.sheets.profilesubtab.skills.b;
import defpackage.b5a;
import defpackage.jq7;
import defpackage.os7;
import defpackage.p2e;
import defpackage.s87;
import defpackage.sp7;
import defpackage.ude;
import defpackage.ur7;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.jvm.functions.Function2;
import okhttp3.CookieJar;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vv implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vv(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new bxb(((wv) obj).g0);
            case 1:
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("BlockingToSFragment", "terms-link", null, null, 12));
                String strB = zwc.b();
                lr5 lr5VarU = ((BlockingToSFragment) obj).requireActivity().u();
                lr5VarU.getClass();
                ka2.H(strB, true, false, lr5VarU);
                return j6g.a;
            case 2:
                return new igf((dwa) obj);
            case 3:
                o03 o03Var = (o03) obj;
                ((lu8) o03Var.h0.w.b).r.b(o03Var.m0.e);
                j6g j6gVar = j6g.a;
                return Boolean.TRUE;
            case 4:
                bj4 bj4Var = (bj4) obj;
                ((gme) bj4Var.R().e).setValue(b5g.a);
                bj4Var.Q(ps7.d, null);
                return j6g.a;
            case 5:
                ((a) obj).Q(ps7.c, null);
                return j6g.a;
            case 6:
                CookieJar cookieJar = ((OkHttpClient) ((z35) obj).c.getValue()).Y;
                cookieJar.getClass();
                return (dz2) cookieJar;
            case 7:
                ut5 ut5Var = (ut5) obj;
                ut5Var.Y.i("ian-full-screen-detail-view");
                ut5Var.P();
                return j6g.a;
            case 8:
                qj6 qj6Var = (qj6) obj;
                int i2 = qj6.r0;
                bp6 bp6Var = qj6Var.Y;
                bp6Var.getClass();
                Lazy<s87> lazy = s87.f;
                s87.a.a(bp6Var.a(), tx5.k(bp6Var.b, "ian-main-screen", "top-nav-notifications", null, 12));
                qj6Var.d0().c.k(new jz2<>(Boolean.TRUE));
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                ((IndeedApplyWebViewFragment) obj).O();
                return j6g.a;
            case 10:
                b bVar = (b) obj;
                if (bVar.k0) {
                    vr7 vr7Var = (vr7) cr8.p(vr7.class);
                    lr5 lr5VarU2 = bVar.requireActivity().u();
                    lr5VarU2.getClass();
                    vr7Var.b(lr5VarU2, new os7.d(null, new e45(bVar, 5)), ur7.b.a);
                } else {
                    vr7 vr7Var2 = (vr7) cr8.p(vr7.class);
                    lr5 lr5VarU3 = bVar.requireActivity().u();
                    lr5VarU3.getClass();
                    vr7Var2.b(lr5VarU3, new os7.d(null, new fj2(10, (byte) 0)), ur7.a.a);
                }
                return j6g.a;
            case 11:
                bq9 bq9Var = (bq9) obj;
                int i3 = bq9.p0;
                bq9Var.Y.i("MESSAGES");
                bq9Var.Y();
                return j6g.a;
            case 12:
                ((e8a) obj).a0.k(new b5a.a());
                return j6g.a;
            case 13:
                ((ude) obj).m(ude.c.e0.a);
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                fma fmaVar = (fma) obj;
                int i4 = fma.s0;
                fmaVar.Y.j("NOTIFICATIONS");
                if (fma.d0()) {
                    cma cmaVarB0 = fmaVar.b0();
                    ((gme) cmaVarB0.d).setValue(Boolean.FALSE);
                    cmaVarB0.l();
                } else {
                    fmaVar.c0().h(false);
                }
                fmaVar.W(gq6.IDV_CLOSE);
                return j6g.a;
            case 15:
                ura uraVar = (ura) obj;
                int i5 = ura.l0;
                uraVar.k0.a("android.permission.POST_NOTIFICATIONS");
                uraVar.D();
                m91 m91Var = uraVar.j0;
                if (m91Var != null) {
                    m91Var.invoke(Boolean.TRUE);
                    return j6g.a;
                }
                wl7.g("callback");
                throw null;
            case 16:
                return f13.a(((cya) obj).a);
            case 17:
                vpb vpbVar = (vpb) obj;
                z1b z1bVar = vpbVar.e;
                spb spbVar = vpbVar.b;
                it5.a();
                return new skf(vpbVar.j(spbVar.a()), z1bVar);
            case 18:
                crb crbVar = (crb) obj;
                crbVar.Q().s(crbVar.getActivity(), mh2.k(crbVar));
                return j6g.a;
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                g3a<jz2<j6g>> g3aVar = ((x1c) obj).n0;
                j6g j6gVar2 = j6g.a;
                g3aVar.k(new jz2<>(j6gVar2));
                return j6gVar2;
            case 20:
                return ReadableNativeMap.localMap_delegate$lambda$2((ReadableNativeMap) obj);
            case 21:
                ((upb) obj).k(null);
                return j6g.a;
            case 22:
                SearchOverlayFragment searchOverlayFragment = (SearchOverlayFragment) obj;
                aud audVarH = searchOverlayFragment.H();
                audVarH.getClass();
                Lazy<s87> lazy2 = s87.f;
                s87.a.a(audVarH.a(), tx5.k(audVarH.b, ak2.M(SearchType.c), "profile-location", null, 12));
                cud cudVarI = searchOverlayFragment.I();
                String str = cudVarI.l().a;
                String str2 = cudVarI.l0;
                if (str2 == null) {
                    str2 = "";
                }
                cudVarI.r(new jud(str, str2), kud.V, null, null);
                return j6g.a;
            case 23:
                j4e j4eVar = (j4e) obj;
                p4e p4eVar = j4eVar.a;
                ArrayList arrayListJ = p4eVar.j(j4eVar.k());
                if (!arrayListJ.isEmpty()) {
                    k3a k3aVar = j59.a;
                    k3a k3aVar2 = new k3a();
                    int size = arrayListJ.size();
                    p2e p2eVar = null;
                    p2e p2eVar2 = null;
                    for (int i6 = 0; i6 < size; i6++) {
                        uzd uzdVar = (uzd) arrayListJ.get(i6);
                        p2e p2eVarL = uzdVar.l();
                        if (p2eVarL != null) {
                            if (p2eVar == null) {
                                p2eVar = p2eVarL;
                            }
                            long jI = uzdVar.i();
                            int iD = k3aVar2.d(jI);
                            Object[] objArr = k3aVar2.c;
                            Object obj2 = objArr[iD];
                            k3aVar2.b[iD] = jI;
                            objArr[iD] = p2eVarL;
                            p2eVar2 = p2eVarL;
                        }
                    }
                    if (k3aVar2.e != 0) {
                        if (p2eVar != p2eVar2) {
                            p2eVar.getClass();
                            p2e.a aVar = p2eVar.a;
                            p2eVar2.getClass();
                            p2eVar = new p2e(aVar, p2eVar2.b, false);
                        }
                        ((gme) p4eVar.k).setValue(k3aVar2);
                        j4eVar.d.invoke(p2eVar);
                        j4eVar.u = null;
                    }
                }
                return j6g.a;
            case 24:
                x8f x8fVar = (x8f) obj;
                rq7 rq7Var = (rq7) cr8.p(rq7.class);
                lr5 lr5VarU4 = x8fVar.requireActivity().u();
                lr5VarU4.getClass();
                rq7Var.f(lr5VarU4, mh2.k(x8fVar), jq7.c0.INSTANCE, "tare-debug-screen");
                return j6g.a;
            default:
                g1h g1hVar = (g1h) obj;
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-preferences-tab-edit-work-areas-preference", "close-work-areas-preference", null, null, 12));
                g1hVar.close();
                Function2<? super hs7, ? super us7, j6g> function2 = g1hVar.g0;
                if (function2 != null) {
                    function2.invoke(hs7.c, null);
                }
                return j6g.a;
        }
    }
}
