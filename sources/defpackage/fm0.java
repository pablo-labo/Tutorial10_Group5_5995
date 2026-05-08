package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.bridge.DynamicFromMap;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.JobSearchApplication;
import com.indeed.android.jobsearch.R;
import com.wlappdebug.r;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fm0 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ fm0(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                qpd qpdVar = (qpd) obj;
                qpdVar.getClass();
                ((v3b) obj2).getClass();
                iwc iwcVar = fwc.a;
                return new fr0((fp0) qpdVar.a(null, iwcVar.b(fp0.class), null), (vz5) qpdVar.a(null, iwcVar.b(vz5.class), null), (bkd) qpdVar.a(null, iwcVar.b(bkd.class), null), (tjd) qpdVar.a(null, iwcVar.b(tjd.class), null), (g26) qpdVar.a(null, iwcVar.b(g26.class), null), (s0a) qpdVar.a(null, iwcVar.b(s0a.class), null), (w56) qpdVar.a(null, iwcVar.b(w56.class), null), (c39) qpdVar.a(null, iwcVar.b(c39.class), null), (a06) qpdVar.a(null, iwcVar.b(a06.class), null), (x29) qpdVar.a(null, iwcVar.b(x29.class), null), (vjd) qpdVar.a(null, iwcVar.b(vjd.class), null), (g06) qpdVar.a(null, iwcVar.b(g06.class), null), (g85) qpdVar.a(null, iwcVar.b(g85.class), null), (h39) qpdVar.a(null, iwcVar.b(h39.class), null));
            case 1:
                ((Integer) obj2).getClass();
                wo0.f(ka2.L(1), (b) obj);
                return j6g.a;
            case 2:
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ev6.a(fv6.W1, null, null, zq6.Xs, 0L, ak2.I(R.string.messaging_attachment_remove, bVar), null, bVar, 3078, 86);
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 3:
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ev6.a(fv6.y0, null, null, null, 0L, ak2.I(R.string.messaging_attachment_add, bVar2), null, bVar2, 6, 94);
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 4:
                b bVar3 = (b) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    vq6.b(z2b.a(R.drawable.ic_idl_close_24, 0, bVar3), ak2.I(R.string.desc_close, bVar3), f.a(g.n(e.a.b, 24.0f), "CloseButton"), eu6.k, bVar3, 384, 0);
                } else {
                    bVar3.D();
                }
                return j6g.a;
            case 5:
                b bVar4 = (b) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (bVar4.o(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ev6.a(fv6.o7, null, null, zq6.Md, 0L, "", null, bVar4, 199686, 86);
                } else {
                    bVar4.D();
                }
                return j6g.a;
            case 6:
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                int iOrdinal = ((ep7) cr8.p(ep7.class)).a().ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    return "https://itadeliveryservice.sandbox.qa.indeed.net";
                }
                if (iOrdinal == 2) {
                    return "https://itad.indeed.com";
                }
                l.g();
                return null;
            case 7:
                return Double.valueOf(DynamicFromMap.asDouble$lambda$2((ReadableMap) obj, (String) obj2));
            case 8:
                JobSearchApplication jobSearchApplication = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new tga();
            case DatadogLogGenerator.CRASH /* 9 */:
                JobSearchApplication jobSearchApplication2 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new f3g();
            case 10:
                qpd qpdVar2 = (qpd) obj;
                JobSearchApplication jobSearchApplication3 = JobSearchApplication.X;
                qpdVar2.getClass();
                ((v3b) obj2).getClass();
                return new r.b(ee3.i(qpdVar2));
            case 11:
                qpd qpdVar3 = (qpd) obj;
                JobSearchApplication jobSearchApplication4 = JobSearchApplication.X;
                qpdVar3.getClass();
                ((v3b) obj2).getClass();
                hpb.Companion.getClass();
                return new ed4(new ad4(hpb.c), (nm0) qpdVar3.a(null, fwc.a.b(nm0.class), null));
            case 12:
                ((ps7) obj).getClass();
                return j6g.a;
            case 13:
                return Integer.valueOf(((pl7) obj).w(((Integer) obj2).intValue()));
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                ((Integer) obj2).getClass();
                klb.a(ka2.L(1), (b) obj);
                return j6g.a;
            case 15:
                ((ps7) obj).getClass();
                return j6g.a;
            case 16:
                ((Integer) obj2).getClass();
                vwc.a(ka2.L(7), (b) obj);
                return j6g.a;
            case 17:
                vld vldVar = (vld) obj;
                vbe vbeVar = (vbe) obj2;
                return u63.k(wld.a(new da2(vbeVar.a), wld.p, vldVar), wld.a(new ooa(vbeVar.b), wld.r, vldVar), Float.valueOf(vbeVar.c));
            case 18:
                return Integer.valueOf(((bx8) obj2).a);
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new ssb();
            case 20:
                qpd qpdVar4 = (qpd) obj;
                qpdVar4.getClass();
                ((v3b) obj2).getClass();
                return new v43((d88) qpdVar4.a(null, fwc.a.b(d88.class), null));
            case 21:
                qpd qpdVar5 = (qpd) obj;
                qpdVar5.getClass();
                ((v3b) obj2).getClass();
                return new sz5((f88) qpdVar5.a(null, fwc.a.b(f88.class), null));
            default:
                ((Integer) obj2).getClass();
                bxg.a(ka2.L(1), (b) obj);
                return j6g.a;
        }
    }

    public /* synthetic */ fm0(int i, int i2) {
        this.a = i2;
    }
}
