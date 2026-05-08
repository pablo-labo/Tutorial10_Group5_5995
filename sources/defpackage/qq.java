package defpackage;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.bottomnav.IanMainFragment;
import com.indeed.android.jobsearch.searchoverlay.SearchOverlayFragment;
import com.indeed.android.jobsearch.tare.debug.TareTopNavBarDebugFragment;
import com.indeed.android.jobsearch.viewjob.a;
import com.indeed.android.jobsearch.webview.indeedapply.IndeedApplyWebViewFragment;
import defpackage.jq7;
import defpackage.os7;
import defpackage.pgd;
import defpackage.s87;
import defpackage.sp7;
import defpackage.ude;
import defpackage.ur7;
import expo.modules.video.FullscreenPlayerActivity;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qq implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qq(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        String str;
        int i = this.a;
        int i2 = 12;
        boolean zEquals = false;
        byte b = 0;
        Object obj = this.b;
        switch (i) {
            case 0:
                sq sqVar = (sq) obj;
                ((gme) sqVar.Q().e).setValue(b5g.a);
                sqVar.close();
                Function2<? super ps7, ? super yr7, j6g> function2 = sqVar.j0;
                if (function2 != null) {
                    function2.invoke(ps7.d, null);
                }
                return j6g.a;
            case 1:
                return new bxb(((dt) obj).g0);
            case 2:
                ((c9d) obj).e.invoke();
                return j6g.a;
            case 3:
                return (qtc) obj;
            case 4:
                uqe uqeVar = ((oc2) obj).h;
                if (uqeVar != null) {
                    uqeVar.h(null);
                }
                return j6g.a;
            case 5:
                return ((lu8) obj).d();
            case 6:
                Object obj2 = ((List) obj).get(2);
                obj2.getClass();
                return (Integer) obj2;
            case 7:
                h64 h64Var = (h64) obj;
                return h64Var.a.a(h64Var.g);
            case 8:
                return new bxb(((cj4) obj).g0);
            case DatadogLogGenerator.CRASH /* 9 */:
                gu5<j6g> gu5Var = ((ks4) obj).f;
                if (gu5Var != null) {
                    gu5Var.invoke();
                }
                return j6g.a;
            case 10:
                rf5 rf5VarA = rf5.a();
                String strA = ((sf5) obj).b.a();
                jjg jjgVar = rf5VarA.a.g.d;
                jjgVar.getClass();
                String strA2 = sh8.a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, strA);
                synchronized (jjgVar.g) {
                    try {
                        String reference = jjgVar.g.getReference();
                        if (strA2 != null) {
                            zEquals = strA2.equals(reference);
                        } else if (reference == null) {
                            zEquals = true;
                        }
                        if (!zEquals) {
                            jjgVar.g.set(strA2, true);
                            jjgVar.b.a(new aw7(jjgVar, 1));
                        }
                    } finally {
                    }
                }
                return rf5VarA;
            case 11:
                int i3 = FullscreenPlayerActivity.Z;
                ((FullscreenPlayerActivity) obj).setRequestedOrientation(-1);
                return j6g.a;
            case 12:
                IanMainFragment ianMainFragment = (IanMainFragment) obj;
                ianMainFragment.K().h(false);
                String str2 = ianMainFragment.K().g().c;
                ianMainFragment.c.g(str2, false);
                IanMainFragment.U(ianMainFragment, xj1.c, str2, 4);
                return j6g.a;
            case 13:
                IndeedApplyWebViewFragment indeedApplyWebViewFragment = (IndeedApplyWebViewFragment) obj;
                if (!indeedApplyWebViewFragment.M().isFinishing()) {
                    ArrayList arrayList = lz2.a;
                    lz2.d("IndeedApplyWebViewFragment", "signin-complete-action", false, null);
                    ((cya) indeedApplyWebViewFragment.D0.getValue()).a();
                }
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                ((wj7) obj).j.invoke();
                return j6g.a;
            case 15:
                ((c88) obj).j.invoke();
                return j6g.a;
            case 16:
                LazyLayoutItemAnimator.a aVar = ((LazyLayoutItemAnimator) obj).j;
                if (aVar != null) {
                    fb4.a(aVar);
                }
                return j6g.a;
            case 17:
                ((ude) obj).m(ude.c.a.a);
                return j6g.a;
            case 18:
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = (PluginGeneratedSerialDescriptor) obj;
                return Integer.valueOf(zkd.C(pluginGeneratedSerialDescriptor, (SerialDescriptor[]) pluginGeneratedSerialDescriptor.k.getValue()));
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                vpb vpbVar = (vpb) obj;
                spb spbVar = vpbVar.b;
                return vpbVar.h(spbVar.b(new sj(new je3(rv1.a, spbVar.j, b == true ? 1 : 0)), true, vpbVar.h));
            case 20:
                ((vr7) cr8.p(vr7.class)).b(t40.g((crb) obj), new os7.a(null, new jm0(i2)), new ur7.c(""));
                return j6g.a;
            case 21:
                x1c x1cVar = (x1c) obj;
                x1cVar.C(b5g.a);
                x1cVar.E(qr2.c);
                return j6g.a;
            case 22:
                f8d f8dVar = (f8d) obj;
                ((tp7) cr8.p(tp7.class)).b(new sp7.h(12, "resume-options-menu", "delete", null));
                x1c x1cVarQ = f8dVar.Q();
                String str3 = x1cVarQ.n().a;
                ((gme) x1cVarQ.Y).setValue(b5g.b);
                u63.Y(ee3.p(x1cVarQ), null, null, new y1c(x1cVarQ, str3, null), 3);
                f8dVar.close();
                return j6g.a;
            case 23:
                SearchOverlayFragment searchOverlayFragment = (SearchOverlayFragment) obj;
                searchOverlayFragment.H().f();
                searchOverlayFragment.I().i();
                return j6g.a;
            case 24:
                ((j4e) obj).j();
                return j6g.a;
            case 25:
                ((gme) ((x8f) obj).R().e).setValue(Boolean.FALSE);
                return j6g.a;
            case 26:
                TareTopNavBarDebugFragment tareTopNavBarDebugFragment = (TareTopNavBarDebugFragment) obj;
                rq7 rq7Var = (rq7) cr8.p(rq7.class);
                lr5 lr5VarU = tareTopNavBarDebugFragment.requireActivity().u();
                lr5VarU.getClass();
                rq7Var.f(lr5VarU, mh2.k(tareTopNavBarDebugFragment), new jq7.i(null), "topnav-debug-screen");
                return j6g.a;
            case 27:
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab-add-education", "refresh", null, null, 12));
                ((ei) obj).invoke();
                return j6g.a;
            default:
                a aVar2 = (a) obj;
                int i4 = a.H0;
                Lazy<s87> lazy = s87.f;
                s87.a.a(aVar2.P(), tx5.k(aVar2.t0, "view-job-bottom-sheet", "close", null, 12));
                LinkedHashMap linkedHashMap = iq6.b;
                xj1 xj1Var = xj1.b;
                Pair pair = (Pair) linkedHashMap.get(xj1Var);
                String str4 = pair != null ? (String) pair.e() : null;
                if (str4 != null) {
                    bp6 bp6Var = aVar2.l0;
                    String strA3 = pgd.n0.HomePage.a();
                    Pair pair2 = (Pair) linkedHashMap.get(xj1Var);
                    if (pair2 == null || (str = (String) pair2.d()) == null) {
                        str = "";
                    }
                    bp6Var.k(strA3, str4, str);
                    linkedHashMap.remove(xj1Var);
                    ArrayList arrayList2 = lz2.a;
                    lz2.d("view-job-bottom-sheet", l5.m("Home page ", str4, " will be shown on closing VJ"), false, null);
                }
                aVar2.R("view_job_close");
                aVar2.E();
                return j6g.a;
        }
    }
}
