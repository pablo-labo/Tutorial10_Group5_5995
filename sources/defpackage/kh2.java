package defpackage;

import androidx.compose.runtime.b;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.JobSearchApplication;
import com.indeed.android.jobsearch.R;
import com.indeed.android.myjobs.data.remote.api.BrandedAdsApiService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kh2 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ kh2(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    bVar.D();
                }
                return j6g.a;
            case 1:
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ev6.a(fv6.I3, null, null, null, 0L, ak2.I(R.string.messaging_inbox_filters, bVar2), null, bVar2, 6, 94);
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 2:
                b bVar3 = (b) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!bVar3.o(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    bVar3.D();
                }
                return j6g.a;
            case 3:
                qpd qpdVar = (qpd) obj;
                qpdVar.getClass();
                ((v3b) obj2).getClass();
                return (BrandedAdsApiService) ((bad) qpdVar.a(null, fwc.a.b(bad.class), new lve("BrandedAdsRetrofit"))).b(BrandedAdsApiService.class);
            case 4:
                JobSearchApplication jobSearchApplication = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new x02();
            case 5:
                JobSearchApplication jobSearchApplication2 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new wr7();
            case 6:
                JobSearchApplication jobSearchApplication3 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new fed();
            case 7:
                JobSearchApplication jobSearchApplication4 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                epa epaVar = epa.a;
                return new ehg((OkHttpClient) epa.Y.getValue());
            case 8:
                JobSearchApplication jobSearchApplication5 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new z7c();
            case DatadogLogGenerator.CRASH /* 9 */:
                ((Integer) obj2).getClass();
                return new ld6(1L);
            case 10:
                Map<String, List<Object>> mapE = ((gt8) obj2).e();
                if (mapE.isEmpty()) {
                    return null;
                }
                return mapE;
            case 11:
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new dq9();
            case 12:
                ((ps7) obj).getClass();
                return j6g.a;
            case 13:
                ((ps7) obj).getClass();
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                yd8 yd8Var = (yd8) obj;
                List list = (List) obj2;
                yd8Var.getClass();
                list.getClass();
                ArrayList arrayListP = awd.p(i8e.a, list, true);
                arrayListP.getClass();
                return awd.i(yd8Var, arrayListP, new oj(list, 20));
            default:
                qpd qpdVar2 = (qpd) obj;
                qpdVar2.getClass();
                ((v3b) obj2).getClass();
                return new mr4((f88) qpdVar2.a(null, fwc.a.b(f88.class), null));
        }
    }
}
