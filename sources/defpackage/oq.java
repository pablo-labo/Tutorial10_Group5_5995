package defpackage;

import android.content.Context;
import android.location.Geocoder;
import android.net.Uri;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.imagepipeline.producers.LocalExifThumbnailProducer;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.searchoverlay.SearchOverlayFragment;
import com.indeed.android.jobsearch.webview.indeedapply.IndeedApplyWebViewFragment;
import com.indeed.android.jsmappservices.util.LocationSensor;
import defpackage.f1g;
import defpackage.jq7;
import defpackage.pld;
import defpackage.s87;
import defpackage.sp7;
import defpackage.xh8;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oq implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oq(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        KSerializer<?>[] kSerializerArrChildSerializers;
        int i = this.a;
        ps7 ps7Var = ps7.d;
        b5g b5gVar = b5g.a;
        int i2 = 12;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new bxb(((sq) obj).g0);
            case 1:
                dt dtVar = (dt) obj;
                ((gme) ((yvb) dtVar.h0.getValue()).e).setValue(b5gVar);
                dtVar.close();
                Function1<? super ps7, j6g> function1 = dtVar.i0;
                if (function1 != null) {
                    function1.invoke(ps7Var);
                }
                return j6g.a;
            case 2:
                p91 p91Var = (p91) obj;
                qf8<Object>[] qf8VarArr = p91.i0;
                p91Var.a0();
                ((c6f) p91Var.b0.getValue()).k(p91Var.getR0(), true, prd.a);
                return j6g.a;
            case 3:
                return ((xb1) obj).h();
            case 4:
                ((w02) obj).G().i("");
                return j6g.a;
            case 5:
                h64 h64Var = (h64) obj;
                return h64Var.a.a(h64Var.f);
            case 6:
                gi4 gi4Var = (gi4) obj;
                ((gme) gi4Var.R().e).setValue(b5gVar);
                gi4Var.Q(ps7Var, null);
                return j6g.a;
            case 7:
                gu5<j6g> gu5Var = ((ks4) obj).f;
                if (gu5Var != null) {
                    gu5Var.invoke();
                }
                return j6g.a;
            case 8:
                vq5 vq5Var = ((ut5) obj).a0;
                vq5Var.getClass();
                vq5Var.b.setVisibility(8);
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                cu5 cu5Var = (cu5) obj;
                return new bu5(cu5Var, cu5Var.a);
            case 10:
                qj6 qj6Var = (qj6) obj;
                int i3 = qj6.r0;
                bp6 bp6Var = qj6Var.Y;
                bp6Var.getClass();
                Lazy<s87> lazy = s87.f;
                s87.a.a(bp6Var.a(), tx5.k(bp6Var.b, "ian-main-screen", "top-nav-sign-in", null, 12));
                qj6Var.e0();
                return j6g.a;
            case 11:
                IndeedApplyWebViewFragment indeedApplyWebViewFragment = (IndeedApplyWebViewFragment) obj;
                Lazy<s87> lazy2 = s87.f;
                s87.a.a(indeedApplyWebViewFragment.P(), tx5.i(indeedApplyWebViewFragment.t0, "IndeedApplyWebViewFragment", "discard-application-dialog-cancel", null, 12));
                indeedApplyWebViewFragment.Q().g(false);
                return j6g.a;
            case 12:
                wj7 wj7Var = (wj7) obj;
                if (!wj7Var.u) {
                    wj7Var.i.invoke();
                }
                return j6g.a;
            case 13:
                xh8 xh8Var = (LocationSensor) obj;
                Context context = (Context) (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8.a.a().a.b).a(null, fwc.a.b(Context.class), null);
                h97 h97VarB = ((ep7) cr8.p(ep7.class)).b();
                return new Geocoder(context, new Locale(h97VarB.b, h97VarB.a));
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                return new bxb(((o99) obj).g0);
            case 15:
                return ((yw9) obj).N().getUrl();
            case 16:
                return ((h5b) obj).M();
            case 17:
                sw5<?> sw5Var = ((PluginGeneratedSerialDescriptor) obj).b;
                return (sw5Var == null || (kSerializerArrChildSerializers = sw5Var.childSerializers()) == null) ? ypd.V : kSerializerArrChildSerializers;
            case 18:
                vpb vpbVar = (vpb) obj;
                spb spbVar = vpbVar.b;
                return vpbVar.i(new u09(spbVar.i.h(), spbVar.j, spbVar.b), new olf[]{new LocalExifThumbnailProducer(spbVar.i.i(), spbVar.j, spbVar.a)});
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                crb crbVar = (crb) obj;
                f1g f1gVar = (f1g) cr8.p(f1g.class);
                lr5 lr5VarG = t40.g(crbVar);
                Context contextRequireContext = crbVar.requireContext();
                contextRequireContext.getClass();
                Uri uri = crbVar.R().g().a;
                if (uri != null) {
                    String str = crbVar.R().g().b;
                    String str2 = str != null ? str : "";
                    String str3 = crbVar.Q().n().d;
                    f1gVar.b(lr5VarG, contextRequireContext, new f1g.a(uri, str2, str3 != null ? Long.valueOf(Long.parseLong(str3)) : null), new qr0(i2));
                }
                return j6g.a;
            case 20:
                int i4 = fyb.n0;
                bp6 bp6Var2 = ((fyb) obj).Y;
                bp6Var2.getClass();
                Lazy<s87> lazy3 = s87.f;
                s87.a.a(bp6Var2.a(), tx5.k(bp6Var2.b, "ian-main-screen", "top-nav-hamburger-menu", null, 12));
                ((j2g) cr8.p(j2g.class)).a();
                return j6g.a;
            case 21:
                ((gme) ((x1c) obj).Y).setValue(b5gVar);
                return j6g.a;
            case 22:
                rq7 rq7Var = (rq7) cr8.p(rq7.class);
                lr5 lr5VarU = ((xac) obj).requireActivity().u();
                lr5VarU.getClass();
                rq7Var.b(lr5VarU, new iq0(11));
                return j6g.a;
            case 23:
                f8d f8dVar = (f8d) obj;
                rq7 rq7Var2 = (rq7) cr8.p(rq7.class);
                lr5 lr5VarU2 = f8dVar.requireActivity().u();
                lr5VarU2.getClass();
                rq7Var2.i(lr5VarU2, new ji(f8dVar, 9));
                return j6g.a;
            case 24:
                ((pld) obj).q(new pld.c.b());
                return j6g.a;
            case 25:
                SearchOverlayFragment searchOverlayFragment = (SearchOverlayFragment) obj;
                searchOverlayFragment.H().b(searchOverlayFragment.I().m());
                SearchOverlayFragment.G(searchOverlayFragment);
                return j6g.a;
            case 26:
                mud mudVar = (mud) obj;
                int i5 = mud.t0;
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("SearchTabFragment", "profile", u63.Z("searchCategories"), null, 8));
                rq7 rq7Var3 = (rq7) cr8.p(rq7.class);
                lr5 lr5VarU3 = mudVar.requireActivity().u();
                lr5VarU3.getClass();
                rq7Var3.f(lr5VarU3, mh2.k(mudVar), jq7.u.INSTANCE, "SearchTabFragment");
                return j6g.a;
            case 27:
                return Integer.valueOf(((p5f) obj).a.size());
            default:
                x8f x8fVar = (x8f) obj;
                x8fVar.close();
                i1g i1gVar = (i1g) cr8.p(i1g.class);
                lr5 lr5VarU4 = x8fVar.requireActivity().u();
                lr5VarU4.getClass();
                i1gVar.e(lr5VarU4, new pec());
                return j6g.a;
        }
    }
}
