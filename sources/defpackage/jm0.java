package defpackage;

import androidx.compose.runtime.b;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.backendservices.common.api.ApiError;
import com.indeed.android.jobsearch.JobSearchApplication;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jsmappservices.util.LocationSensor;
import kotlin.jvm.functions.Function2;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jm0 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ jm0(int i) {
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
                return new gka((q66) qpdVar.a(null, iwcVar.b(q66.class), null), (bkd) qpdVar.a(null, iwcVar.b(bkd.class), null), (s0a) qpdVar.a(null, iwcVar.b(s0a.class), null));
            case 1:
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ev6.a(fv6.o0, null, null, null, 0L, ak2.I(R.string.messaging_back, bVar), null, bVar, 6, 94);
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 2:
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    vq6.b(z2b.a(R.drawable.ic_idl_upload_24, 0, bVar2), ak2.I(R.string.upload_resume, bVar2), null, 0L, bVar2, 0, 12);
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 3:
                b bVar3 = (b) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ev6.b(fv6.g3, null, null, null, 0L, null, bVar3, 6, 62);
                } else {
                    bVar3.D();
                }
                return j6g.a;
            case 4:
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new be6(new ae6());
            case 5:
                JobSearchApplication jobSearchApplication = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new aud();
            case 6:
                JobSearchApplication jobSearchApplication2 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new z8f();
            case 7:
                JobSearchApplication jobSearchApplication3 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                epa epaVar = epa.a;
                return (OkHttpClient) epa.d0.getValue();
            case 8:
                JobSearchApplication jobSearchApplication4 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new LocationSensor();
            case DatadogLogGenerator.CRASH /* 9 */:
                return (iw9) ((gme) ((hw9) obj2).c.g).getValue();
            case 10:
                ApiError apiError = (ApiError) obj;
                apiError.getClass();
                ((zk6) zma.b.getValue()).getClass();
                zk6.b(apiError, (Request) obj2);
                return j6g.a;
            case 11:
                ((ps7) obj).getClass();
                return j6g.a;
            case 12:
                ((ps7) obj).getClass();
                return j6g.a;
            case 13:
                ((ps7) obj).getClass();
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 15:
                ooa ooaVar = (ooa) obj2;
                return ooaVar != null ? ooa.c(ooaVar.a, 9205357640488583168L) : false ? Boolean.FALSE : u63.k(Float.valueOf(Float.intBitsToFloat((int) (ooaVar.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (ooaVar.a & 4294967295L))));
            case 16:
                return Integer.valueOf(((pl7) obj).P(((Integer) obj2).intValue()));
            case 17:
                qpd qpdVar2 = (qpd) obj;
                qpdVar2.getClass();
                ((v3b) obj2).getClass();
                iwc iwcVar2 = fwc.a;
                return new fp0((f88) qpdVar2.a(null, iwcVar2.b(f88.class), null), (i88) qpdVar2.a(null, iwcVar2.b(i88.class), null));
            default:
                qpd qpdVar3 = (qpd) obj;
                qpdVar3.getClass();
                ((v3b) obj2).getClass();
                return new bkd((f88) qpdVar3.a(null, fwc.a.b(f88.class), null));
        }
    }
}
