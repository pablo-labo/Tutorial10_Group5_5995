package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.bottomnav.IanMainFragment;
import com.indeed.android.jobsearch.searchoverlay.SearchOverlayFragment;
import com.indeed.android.jsmappservices.bridge.SearchType;
import defpackage.f1g;
import defpackage.fr0;
import defpackage.s87;
import defpackage.sp7;
import defpackage.v94;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.sse.EventSource;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cq0 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cq0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gu5
    public final Object invoke() throws Throwable {
        int i = this.a;
        ps7 ps7Var = ps7.d;
        b5g b5gVar = b5g.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((fr0) obj).r(fr0.b.h.a);
                return j6g.a;
            case 1:
                lr5 lr5VarU = ((w02) obj).requireActivity().u();
                lr5VarU.getClass();
                web.D(lr5VarU, "ChangeCountrySelectorFragment");
                return j6g.a;
            case 2:
                ((h23) obj).close();
                return j6g.a;
            case 3:
                go1 go1Var = ((ja4) obj).j0;
                if (go1Var != null) {
                    go1Var.f(v94.a.a);
                }
                return j6g.a;
            case 4:
                rh4 rh4Var = (rh4) obj;
                rh4Var.close();
                Function1<? super ps7, j6g> function1 = rh4Var.i0;
                if (function1 != null) {
                    function1.invoke(ps7.b);
                }
                return j6g.a;
            case 5:
                nn4 nn4Var = (nn4) obj;
                ((gme) nn4Var.R().e).setValue(b5gVar);
                Function2<? super ps7, ? super vs7, j6g> function2 = nn4Var.l0;
                nn4Var.l0 = null;
                if (function2 != null) {
                    function2.invoke(ps7Var, null);
                }
                nn4Var.Q();
                return j6g.a;
            case 6:
                qj6 qj6Var = (qj6) obj;
                int i2 = qj6.r0;
                qj6Var.Y.j("HOME");
                qj6Var.c0().h(false);
                qj6Var.W(gq6.IDV_CLOSE);
                return j6g.a;
            case 7:
                IanMainFragment ianMainFragment = (IanMainFragment) obj;
                bp6 bp6Var = ianMainFragment.c;
                bp6Var.getClass();
                Lazy<s87> lazy = s87.f;
                s87.a.a(bp6Var.a(), tx5.k(bp6Var.b, "IanLogger", "refresh", null, 12));
                ianMainFragment.H().k();
                return j6g.a;
            case 8:
                ((nf9) obj).P(false);
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                ((yw9) obj).E();
                return j6g.a;
            case 10:
                vpb vpbVar = (vpb) obj;
                if (Build.VERSION.SDK_INT < 29) {
                    throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                }
                spb spbVar = vpbVar.b;
                return vpbVar.g(new w09(spbVar.i.g(), spbVar.a));
            case 11:
                ((i1g) cr8.p(i1g.class)).a(t40.g((crb) obj), new f8d());
                return j6g.a;
            case 12:
                l8c l8cVar = (l8c) obj;
                int i3 = l8c.r0;
                d8c d8cVar = (d8c) l8cVar.k0.getValue();
                s8c s8cVar = l8cVar.m0;
                d8cVar.a(s8cVar, l8cVar.Q());
                p8c p8cVar = (p8c) l8cVar.j0.getValue();
                String string = s8cVar.toString();
                boolean zQ = l8cVar.Q();
                p8cVar.getClass();
                p8c.b(string, zQ);
                if (Build.VERSION.SDK_INT < 33) {
                    l8cVar.D();
                    l8cVar.P(true);
                } else if (l8cVar.Q()) {
                    l8cVar.D();
                    l8cVar.P(false);
                } else {
                    ((gme) l8cVar.o0).setValue(Boolean.TRUE);
                    l8cVar.q0.a("android.permission.POST_NOTIFICATIONS");
                }
                return j6g.a;
            case 13:
                f8d f8dVar = (f8d) obj;
                ((tp7) cr8.p(tp7.class)).b(new sp7.h(12, "resume-options-menu", "preview", null));
                f8dVar.close();
                f1g f1gVar = (f1g) cr8.p(f1g.class);
                lr5 lr5VarU2 = f8dVar.requireActivity().u();
                lr5VarU2.getClass();
                Context contextRequireContext = f8dVar.requireContext();
                contextRequireContext.getClass();
                frg frgVar = f8dVar.j0;
                Uri uri = ((p9d) frgVar.getValue()).g().a;
                if (uri != null) {
                    String str = ((p9d) frgVar.getValue()).g().b;
                    if (str == null) {
                        str = "";
                    }
                    String str2 = f8dVar.Q().n().d;
                    f1gVar.b(lr5VarU2, contextRequireContext, new f1g.a(uri, str, str2 != null ? Long.valueOf(Long.parseLong(str2)) : null), new bo0(20));
                }
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                EventSource eventSource = ((tid) obj).b;
                if (eventSource != null) {
                    eventSource.cancel();
                }
                return j6g.a;
            case 15:
                SearchOverlayFragment searchOverlayFragment = (SearchOverlayFragment) obj;
                searchOverlayFragment.H().c(searchOverlayFragment.I().m());
                if (searchOverlayFragment.I().m() == SearchType.b) {
                    searchOverlayFragment.I().u();
                } else {
                    searchOverlayFragment.I().v();
                }
                return j6g.a;
            case 16:
                cyd cydVar = (cyd) obj;
                csf<S> csfVar = cydVar.e;
                cydVar.f = csfVar != 0 ? ((Number) csfVar.l.getValue()).longValue() : 0L;
                return j6g.a;
            case 17:
                f7e f7eVar = (f7e) obj;
                return Integer.valueOf(zkd.C(f7eVar, f7eVar.k));
            case 18:
                ((gme) ((x8f) obj).R().e).setValue(Boolean.TRUE);
                return j6g.a;
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                rgf rgfVar = (rgf) obj;
                jhf jhfVarE = rgf.e(rgfVar.m().a, cr8.c(0, rgfVar.m().a.b.length()));
                rgfVar.c.invoke(jhfVarE);
                long j = jhfVarE.b;
                rgfVar.w = new kjf(j);
                rgfVar.u = jhf.a(rgfVar.u, null, j, 5);
                rgfVar.h(true);
                return j6g.a;
            default:
                t7g t7gVar = (t7g) obj;
                ((gme) t7gVar.Q().e).setValue(b5gVar);
                t7gVar.close();
                Function2<? super ps7, ? super or7, j6g> function22 = t7gVar.j0;
                if (function22 != null) {
                    function22.invoke(ps7Var, null);
                }
                return j6g.a;
        }
    }
}
